
package com.mycompany.sistemamed.vistasAdmin;

import com.mycompany.sistemamed.db.Conexion;
import com.mycompany.sistemamed.inter.CitasInter;
import com.mycompany.sistemamed.modelos.Citas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CitasImpl extends Conexion implements CitasInter {

    @Override
    //Añadir usuaario a la base de datos
    public void registrar(Citas cita) throws Exception {
       try{
           this.Connectar();
           PreparedStatement st=this.conexion.prepareStatement(
                   "INSERT INTO Citas(Fecha, Hora, idPaciente, Motivo) VALUES (?,?,?,?)");
           
               st.setString(1,cita.getFecha());
                st.setString(2,cita.getHora());
                 st.setInt(3,Integer.parseInt(cita.getPaciente()));
                  st.setString(4,cita.getMotivo());
                   
                   
              st.executeUpdate();
              st.close();
                    
       }catch(Exception e){
         throw e;
       }finally{
       this.cerrar();
       }
    }

    @Override
    public void modificar(Citas ci) throws Exception {
        try{
            this.Connectar();
            PreparedStatement st=this.conexion.prepareStatement(""
                    + "UPDATE Citas SET FECHA=?,Hora=?, Paciente=?, Motivo=? WHERE idCita=?;");
            st.setString(1,ci.getFecha());
             st.setString(2,ci.getHora());
              st.setString(3,ci.getPaciente());
               st.setString(4,ci.getMotivo());
                st.setInt(5,ci.getIdCita());
                st.executeUpdate();
                  st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(int idCita) throws Exception {
      try{
           this.Connectar();
            PreparedStatement st=this.conexion.prepareStatement(
            "DELETE FROM CITAS WHERE idCita=?;"
            );
            st.setInt(1,idCita);
                  st.executeUpdate();
                  st.close();
        }catch(Exception e){
            throw e;
        }finally{
           this.cerrar();
        }
    }
    

    @Override
    //Visualizar los usuarios
    public List<Citas> listar() throws Exception {
            List<Citas> lista=null;
            try{
                this.Connectar();
           PreparedStatement st=this.conexion.prepareStatement( 
            "SELECT c.idCita, c.Fecha, c.Hora, CONCAT(p.nombre, ' ', p.apellidos) AS Paciente, " +
            "c.Motivo, c.Estado " +
            "FROM Citas c " +
            "INNER JOIN Pacientes p ON c.idPaciente = p.idPaciente" );
           lista = new ArrayList();
           ResultSet rs = st.executeQuery();
                while(rs.next()){
                  Citas cita=new Citas();
                  cita.setIdCita(rs.getInt("idCita"));
                  cita.setFecha(rs.getString("Fecha"));
                  cita.setHora(rs.getString("Hora"));
                  cita.setPaciente(rs.getString("Paciente"));
                  cita.setMotivo(rs.getString("Motivo"));
                  cita.setEstado(rs.getString("Estado"));
                  lista.add(cita);
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
    public Citas getCitasId(int citaId) throws Exception {
        Citas cita=new Citas();
        try{
            this.Connectar();
            PreparedStatement st=this.conexion.prepareStatement(
            "SELECT * FROM Citas WHERE idCita=? LIMIT 1;");
            st.setInt(1,citaId);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                cita.setIdCita(rs.getInt("idCita"));
                cita.setFecha(rs.getString("Fecha"));
                cita.setHora(rs.getString("Hora"));
                cita.setPaciente(rs.getString("Paciente"));
                cita.setMotivo(rs.getString("Motivo"));
                
            }
            rs.close();
            st.close();
            
        }catch(Exception e){
            throw e;
        }
        return cita;
    }

   

  
    
}
