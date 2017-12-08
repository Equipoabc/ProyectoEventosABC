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

public class ControladorGerente {
    
    DaoGerente daoGerente;
    
    public ControladorGerente(){
        
        daoGerente = new DaoGerente();
    }
 
    public int  insertarGerente(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, 
            String cedula, String fechaNacimiento, String telefono, String celular, String email, String contrasena, 
            String confirmar, String pregunta, String respuesta){
        
        if(!contrasena.equals(confirmar)){
        
            return 5;
        }
        Gerente ge = new Gerente();    
        
        ge.setPrimer_nombre(primerNombre);
        ge.setSegundo_nombre(segundoNombre);
        ge.setPrimer_apellido(primerApellido);
        ge.setSegundo_apellido(segundoApellido);
        ge.setCedula_ge(cedula);
        ge.setTelefono(telefono);
        ge.setCelular(celular);
        ge.setEmail(email);
        ge.setFecha_nacimiento(fechaNacimiento);
        ge.setContrasena(contrasena);
        ge.setRespuesta(respuesta);
        ge.setPregunta(pregunta);
        
        int result = daoGerente.guardarGerente(ge);        
        return result;
    }
    
    public Gerente loginGerente(String user){

        Gerente gerente;
        gerente = daoGerente.loginGerente(user);
        return gerente;
    }
    
    public Gerente consultarDatosGerente(String cedula) {
        
        return daoGerente.consultarDatosGerente(cedula);
    }
    
    public int actualizarGerente(String cedulaBusqueda, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String celular, String email, String estado, String tipo) {
        
        return daoGerente.actualizarGerente(cedulaBusqueda, primerNombre, 
               segundoNombre, primerApellido, segundoApellido,
               telefono, celular, email, estado, tipo);
    }

    public int comprobar(String cedula){
        
        return daoGerente.comprobar(cedula);
    }
    public int actualizarContrasena(String cedula, String contrasena) {        
        return daoGerente.actualizarContrasena(cedula,contrasena);
    }     
}
