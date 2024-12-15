/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemamed.inter;

import com.mycompany.sistemamed.modelos.Pacientes;
import java.util.List;

/**
 *
 * @author crist
 */
public interface PacientesInter {
    
    public void registrar(Pacientes pa)throws Exception;
    public void modificar(Pacientes pa) throws Exception;
    public void eliminar(int userId)throws Exception;
    public List<Pacientes > listar(String nombre) throws Exception;
    public Pacientes getPacienteId(int userId) throws Exception;
}
