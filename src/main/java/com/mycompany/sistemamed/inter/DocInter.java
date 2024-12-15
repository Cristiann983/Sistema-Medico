/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemamed.inter;

import com.mycompany.sistemamed.modelos.Doctores;
import java.util.List;

/**
 *
 * @author crist
 */
public interface DocInter {
      public void registrar(Doctores doc)throws Exception;
      public void modificar(Doctores doc) throws Exception;
    public void eliminar(int userId)throws Exception;
    public List<Doctores > listar(String nombre) throws Exception;
    public Doctores getDoctorId(int doctorId) throws Exception;
}
