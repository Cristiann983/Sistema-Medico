/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamed.vistasAdmin;

import com.mycompany.sistemamed.db.Conexion;
import com.mycompany.sistemamed.inter.DocInter;
import com.mycompany.sistemamed.modelos.Doctores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class DoctoresImp extends Conexion implements DocInter {

    @Override
    public void registrar(Doctores doc) throws Exception {
        try{
           this.Connectar();
            PreparedStatement st=this.conexion.prepareStatement(
            "INSERT INTO Profesionales(nombre,apellidos,edad,genero,especialidad,experiencia,horaEntrada,horaSalida) VALUES "
                    + "(?,?,?,?,?,?,?,?)"
            );
            st.setString(1,doc.getNombre());
             st.setString(2,doc.getApellidos());
               st.setInt(3,doc.getEdad());
               st.setString(4,doc.getGenero());
                st.setString(5,doc.getEspecialidad());
                 st.setString(6,doc.getExperiencia());
                  st.setString(7,doc.getHoraEntrada());
                  st.setString(8,doc.getHoraSalida());
                  st.executeUpdate();
                  st.close();
        }catch(Exception e){
            throw e;
        }finally{
           this.cerrar();
        }
    }

    @Override
    public void modificar(Doctores doc) throws Exception {
        try{
            this.Connectar();
            PreparedStatement st=this.conexion.prepareStatement(
            "UPDATE Profesionales SET nombre=?,apellidos=?, edad=?, genero=?,especialidad=?,experiencia=?,horaEntrada=?,horaSalida=?"
                    + "WHERE idProfesional=?;");
            st.setString(1,doc.getNombre());
            st.setString(2,doc.getApellidos());
            st.setInt(3,doc.getEdad());
            st.setString(4,doc.getGenero());
            st.setString(5,doc.getEspecialidad());
            st.setString(6,doc.getExperiencia());
            st.setString(7,doc.getHoraEntrada());
            st.setString(8,doc.getHoraSalida());
            st.setInt(9,doc.getIdDoctor());
            
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(int docId) throws Exception {
    try{
        this.Connectar();
        PreparedStatement st=this.conexion.prepareStatement(
        "DELETE FROM profesionales WHERE idProfesional=?;");
        st.setInt(1,docId);
            st.executeUpdate();
            st.close();
        
    }catch(Exception e){
        throw e;
    }finally{
        this.cerrar();
    }
    
    }

    @Override
    public List<Doctores> listar(String nombre) throws Exception {
        List<Doctores> lista=null;
        try{
            this.Connectar();
            String query=nombre.isEmpty() ? "SELECT * FROM profesionales ;":"SELECT * FROM profesionales WHERE nombre LIKE '%"+nombre+"%'";
            PreparedStatement st=this.conexion.prepareStatement(query);
            lista = new ArrayList<>();
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Doctores doctor=new Doctores();
                doctor.setIdDoctor(rs.getInt("idProfesional"));
                doctor.setNombre(rs.getString("nombre"));
                doctor.setApellidos(rs.getString("apellidos"));
                doctor.setEdad(rs.getInt("edad"));
                doctor.setGenero(rs.getString("genero"));
                doctor.setEspecialidad(rs.getString("especialidad"));
                doctor.setExperiencia(rs.getString("experiencia"));
                doctor.setHoraEntrada(rs.getString("horaEntrada"));
                doctor.setHoraSalida(rs.getString("horaSalida"));
                lista.add(doctor);
            }
            rs.close();
            st.close();
            
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return lista;
    }

    @Override
    public Doctores getDoctorId(int doctorId) throws Exception {
           Doctores doc=new  Doctores();
           try{
            this.Connectar();
            PreparedStatement st=this.conexion.prepareStatement(
            "SELECT * FROM profesionales WHERE idProfesional=? LIMIT 1;");
            st.setInt(1,doctorId);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                doc.setIdDoctor(rs.getInt("idProfesional"));
                doc.setNombre(rs.getString("nombre"));
                doc.setApellidos(rs.getString("apellidos"));
                doc.setEdad(rs.getInt("edad"));
                doc.setGenero(rs.getString("genero"));
                doc.setEspecialidad(rs.getString("especialidad"));
                doc.setExperiencia(rs.getString("experiencia"));
                doc.setHoraEntrada(rs.getString("horaEntrada"));
                doc.setHoraSalida(rs.getString("horaSalida"));
                
            }
            rs.close();
            st.close();
           }catch(Exception e){
             throw e;
           }finally{
             this.cerrar();
           }
           return doc;
    }
    
}
