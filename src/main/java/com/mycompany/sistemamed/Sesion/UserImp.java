/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamed.Sesion;

import com.mycompany.sistemamed.db.Conexion;
import com.mycompany.sistemamed.inter.UsuariosInter;
import com.mycompany.sistemamed.modelos.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author crist
 */
public class UserImp extends Conexion implements UsuariosInter{

    @Override
    public Usuarios verificarUser(Usuarios user) throws Exception {
        Usuarios usuarioValidado = new Usuarios();
        try{
            
        this.Connectar();
        PreparedStatement st=this.conexion.prepareStatement("SELECT * FROM Usuarios WHERE username=? AND password=?");
            st.setString(1,user.getUser());
             st.setString(2,user.getPasss());
             
              ResultSet rs = st.executeQuery();

        if (rs.next()) {
            
            usuarioValidado.setUser(rs.getString("username"));
            usuarioValidado.setPasss(rs.getString("password"));
            usuarioValidado.setRole(rs.getString("role"));
        }
         rs.close();
        st.close();      
              
        }catch(Exception e){
            
            throw e;
            }finally{
            this.cerrar();
            }
       return usuarioValidado;
    }
    
}
