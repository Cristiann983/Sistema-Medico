/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamed.modelos;

/**
 *
 * @author crist
 */
public class Citas {
    private int idCita;
    private String Fecha;
    private String Hora;
    private String Paciente;
    private String Motivo;
    private String nota;
    private String Estado;

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }
    
    public String getMotivo() {
        return Motivo;
    }
   
    public void setIdCita(int idCita) { 
        this.idCita = idCita;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
   
    
    
    public int getIdCita() {
        return idCita;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public String getPaciente() {
        return Paciente;
    }

    public String getEstado() {
        return Estado;
    }
    
}
