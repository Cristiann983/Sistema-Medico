/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamed.vistasAdmin;

import com.mycompany.sistemamed.db.Conexion;
import com.mycompany.sistemamed.inter.PacientesInter;
import com.mycompany.sistemamed.modelos.Pacientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author crist
 */
public class PacientesImpl extends Conexion implements PacientesInter{

    @Override
    public void registrar(Pacientes pacient) throws Exception {
        try{
           this.Connectar();
            PreparedStatement st=this.conexion.prepareStatement(
            "INSERT INTO pacientes(nombre,apellidos,edad,genero,direccion,telefono,correo) VALUES "
                    + "(?,?,?,?,?,?,?)"
            );
            st.setString(1,pacient.getNombre());
             st.setString(2,pacient.getApellidos());
               st.setInt(3,pacient.getEdad());
               st.setString(4,pacient.getGenero());
                st.setString(5,pacient.getDireccion());
                 st.setString(6,pacient.getTelefono());
                  st.setString(7,pacient.getCorreo());
                  st.executeUpdate();
                  st.close();
        }catch(Exception e){
            throw e;
        }finally{
           this.cerrar();
        }
    
    }

    @Override
    public void modificar(Pacientes pacient) throws Exception {
               try{
           this.Connectar();
            PreparedStatement st=this.conexion.prepareStatement(
            "UPDATE pacientes SET nombre=?, apellidos=?,edad=?,genero=?,direccion=?,telefono=?,correo=? WHERE idPaciente=?;"
            );
            st.setString(1,pacient.getNombre());
             st.setString(2,pacient.getApellidos());
               st.setInt(3,pacient.getEdad());
               st.setString(4,pacient.getGenero());
                st.setString(5,pacient.getDireccion());
                 st.setString(6,pacient.getTelefono());
                  st.setString(7,pacient.getCorreo());
                   st.setInt(8,pacient.getIdPaciente());
                  st.executeUpdate();
                  st.close();
        }catch(Exception e){
            throw e;
        }finally{
           this.cerrar();
        }
    }

    @Override
    public void eliminar(int userId) throws Exception {
        try{
           this.Connectar();
            PreparedStatement st=this.conexion.prepareStatement(
            "DELETE FROM PACIENTES WHERE idPaciente=?;"
            );
            st.setInt(1,userId);
            
                  st.executeUpdate();
                  st.close();
        }catch(Exception e){
            throw e;
        }finally{
           this.cerrar();
        }
    }

    @Override
    public List<Pacientes> listar(String nombre) throws Exception {
          List<Pacientes> lista=null;
            try{
                this.Connectar();
             String query=nombre.isEmpty() ? "SELECT * FROM Pacientes ;":"SELECT * FROM Pacientes WHERE nombre LIKE '%"+nombre+"%';";
           PreparedStatement st=this.conexion.prepareStatement(query);
                   
           lista = new ArrayList();
           ResultSet rs = st.executeQuery();
                while(rs.next()){
                  Pacientes paciente=new Pacientes();
                  paciente.setIdPaciente(rs.getInt("idPaciente"));
                  paciente.setNombre(rs.getString("nombre"));
                  paciente.setApellidos(rs.getString("apellidos"));
                  paciente.setEdad(rs.getInt("edad"));
                  paciente.setGenero(rs.getString("genero"));
                  paciente.setDireccion(rs.getString("direccion"));
                  paciente.setTelefono(rs.getString("telefono"));
                  paciente.setCorreo(rs.getString("correo"));
                  
                  lista.add(paciente);
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
    public Pacientes getPacienteId(int userId) throws Exception {
     Pacientes paciente=new Pacientes();
          try{
              this.Connectar();
              PreparedStatement st=this.conexion.prepareStatement(
              "SELECT * FROM Pacientes WHERE idPaciente=? LIMIT 1;"
              );
              st.setInt(1,userId);
              ResultSet rs=st.executeQuery();
              while(rs.next()){
                  paciente.setIdPaciente(rs.getInt("idPaciente"));
                  paciente.setNombre(rs.getString("nombre"));
                  paciente.setApellidos(rs.getString("apellidos"));
                  paciente.setEdad(rs.getInt("edad"));
                  paciente.setGenero(rs.getString("genero"));
                  paciente.setDireccion(rs.getString("direccion"));
                  paciente.setTelefono(rs.getString("telefono"));
                  paciente.setCorreo(rs.getString("Correo"));
                  
                          
              }
              rs.close();
                st.close();
              
          }catch(Exception e){
              throw e;
          }finally {
          this.cerrar();
          }
          return paciente;
         
    }
        
    }
    

