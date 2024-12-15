/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.sistemamed.vistasRecepcionista;

import com.mycompany.sistemamed.inter.PacientesInter;
import com.mycompany.sistemamed.modelos.Pacientes;

import com.mycompany.sistemamed.vistasAdmin.PacientesImpl;
import com.mycompany.sistemamed.vistasAdmin.inicioAdmi;
import java.awt.Color;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author crist
 */
public class PacientesC extends javax.swing.JPanel {
        agregarPaciente paciente;
    /**
     * Creates new form num1
     */
    public PacientesC() {
        initComponents();
        styles();
        cargarPacientes();
    }
    
    private void cargarPacientes(){
        //Cargar los usuarios en la tabla
        try{
               PacientesInter pacien=new PacientesImpl();
               DefaultTableModel model= (DefaultTableModel)Pacientes.getModel();
            
               // List<Citas> lista=cita.listar();
               pacien.listar("").forEach((u) ->   
                 model.addRow(new Object[]{
                     u.getIdPaciente(),u.getNombre(),u.getApellidos(),u.getEdad(),u.getGenero(),u.getDireccion(),u.getTelefono(),u.getCorreo()}));
        }catch(Exception e){
                System.out.println(e.getMessage());
        }
   
      
    }
    
    private void styles(){
       title.putClientProperty( "FlatLaf.style", "font: bold $h1.regular.font" );
        title.setForeground(Color.black);
         txtBuscador.putClientProperty("JTextField.placeholderText","Ingrese el nombre del paciente a buscar");
    }
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        calendario = new javax.swing.JScrollPane();
        Pacientes = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscador = new javax.swing.JTextField();

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        Pacientes.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Pacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellidos", "edad", "Genero", "Direccion", "Telefono", "Correo"
            }
        ));
        Pacientes.setCellSelectionEnabled(true);
        Pacientes.setName(""); // NOI18N
        Pacientes.setShowGrid(true);
        calendario.setViewportView(Pacientes);
        Pacientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Pacientes");
        title.setToolTipText("");

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscador)
                        .addGap(6, 6, 6))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addContainerGap(263, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevo)
                        .addComponent(btnBorrar))
                    .addComponent(btnEditar))
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
           // TODO add your handling code here:
        if(Pacientes.getSelectedRow()> -1){
            try{
             int userId= (int)Pacientes.getValueAt(Pacientes.getSelectedRow(),0);
             PacientesInter pac=new PacientesImpl();
             inicioAdmi.showJpane(new agregarPaciente(pac.getPacienteId(userId)));
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
             
        }else{
            javax.swing.JOptionPane.showMessageDialog(this,"Seleccione un usuario","Aviso",javax.swing.JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        if(Pacientes.getSelectedRows().length<1){
         
        javax.swing.JOptionPane.showMessageDialog(this,"Seleccione un usuario para continuar","Aviso",javax.swing.JOptionPane.ERROR_MESSAGE );
        
        }else{
             int confirmacion=javax.swing.JOptionPane.showConfirmDialog(
            this, 
            "¿Está seguro de que desea eliminar el/los pciente(es) seleccionado(s)?", 
            "Confirmación", 
            javax.swing.JOptionPane.YES_NO_OPTION, 
            javax.swing.JOptionPane.QUESTION_MESSAGE
        );
             if(confirmacion==javax.swing.JOptionPane.YES_NO_OPTION){
                 PacientesInter pac=new PacientesImpl();
          DefaultTableModel model= (DefaultTableModel)Pacientes.getModel();
        for (int i: Pacientes.getSelectedRows()) {
            try{
                pac.eliminar((int)Pacientes.getValueAt(i, 0));
                model.removeRow(i);
            }catch(Exception e){
             System.out.println(e.getMessage());
            }            
        } 
             }
            
         
        }
            
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // llamar al metodo estatico de la clase inicioAdmi para que se pueda mandar a llamar a un panel
        //con un boton que hace referencia a otro panel en la clase de pacientesC
          inicioAdmi.showJpane(new agregarPaciente());
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         try{
             
               String usuarioBuscar=txtBuscador.getText();
              
              
               
               PacientesInter pacien=new PacientesImpl();
               DefaultTableModel model= (DefaultTableModel)Pacientes.getModel();
              model.setRowCount(0);
               // List<Citas> lista=cita.listar();
               pacien.listar(usuarioBuscar).forEach((u) ->   
                 model.addRow(new Object[]{
                     u.getIdPaciente(),u.getNombre(),u.getApellidos(),u.getEdad(),u.getGenero(),u.getDireccion(),u.getTelefono(),u.getCorreo()}));
        }catch(Exception e){
                System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Pacientes;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane calendario;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}