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

public class ControladorGerente {
    
    DaoGerente daoGerente;
    
    public ControladorGerente(){
        
        daoGerente = new DaoGerente();
    }
    
    public Gerente loginGerente(String user){

        Gerente gerente;
        gerente = daoGerente.loginGerente(user);
        return gerente;
    }
}
