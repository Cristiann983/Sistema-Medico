/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamed.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crist
 */
public class Conexion {
    protected Connection conexion;
    private final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    private final String DB_URL="jdbc:mysql://localhost/clinica?useUnicode=true&characterEncoding=UTF-8";
    
    private final String USER="root";
    private final String PASS="Placido0707.";
    
    public void Connectar() throws ClassNotFoundException {
        try{
         conexion= (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
         Class.forName(JDBC_DRIVER);
        }catch(SQLException ex){
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
    public void cerrar() throws SQLException{
          if(conexion!=null){
              if(!conexion.isClosed()){
                  conexion.close();
              }
          }
          
        }
        
}
