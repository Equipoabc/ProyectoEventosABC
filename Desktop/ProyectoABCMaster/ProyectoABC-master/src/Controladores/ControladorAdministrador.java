/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import DAO.*;
import Logica.*;

/**
 *
 * @author Luis
 */

public class ControladorAdministrador {
    
    DaoAdministrador daoAdministrador;
    
    public ControladorAdministrador(){
        
        daoAdministrador = new DaoAdministrador();
    }
    
    public Administrador loginAdministrador(String user){

        Administrador administrador;
        administrador = daoAdministrador.loginAdministrador(user);
        return administrador;
    }
}
