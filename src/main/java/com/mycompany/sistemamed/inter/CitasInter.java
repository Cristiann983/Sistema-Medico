

package com.mycompany.sistemamed.inter;

import com.mycompany.sistemamed.modelos.Citas;
import java.util.List;


public interface CitasInter {
    
    public void registrar(Citas ci)throws Exception;
    public void modificar(Citas ci)throws Exception;
    public void eliminar(int idCita)throws Exception;
    public  List<Citas> listar()throws Exception;
    public Citas getCitasId(int citaId) throws Exception;
}
