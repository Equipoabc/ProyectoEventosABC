/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/**
 *
 * @author Luis
 */
import DAO.*;
import Logica.*;

public class ControladorOperador {
  
    DaoOperador daoOperador;
    
    public ControladorOperador(){
        
        daoOperador = new DaoOperador();
    }
    
    public Operador loginOperador(String user){

        Operador operador;
        operador = daoOperador.loginOperador(user);
        return operador;
    }
}
