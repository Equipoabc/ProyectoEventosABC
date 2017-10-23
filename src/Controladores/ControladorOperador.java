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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorOperador {
  
    DaoOperador daoOperador;
    
    public ControladorOperador(){
        
        daoOperador = new DaoOperador();
    }
    
      public int  insertarOperador(String primerNombre, 
               String segundoNombre, String primerApellido, String segundoApellido,
               String cedula, String fechaNacimiento, String telefono, 
               String celular, String email, String contrasena, String confirmar, String pregunta, 
               String respuesta){
        
          if(!contrasena.equals(confirmar)){
              return 5;
          }
          
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        
       Operador op = new Operador();     
        
       
      /* try {
             Date date = formatter.parse(fechaNacimiento);
             op.setFecha_nacimiento(date);
        } catch (ParseException ex) {
            Logger.getLogger(ControladorOperador.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       
        
        op.setPrimer_nombre(primerNombre);
        op.setSegundo_nombre(segundoNombre);
        op.setPrimer_apellido(primerApellido);
        op.setSegundo_apellido(segundoApellido);
        op.setCedula_op(cedula);
        op.setTelefono(telefono);
        op.setCelular(celular);
        op.setEmail(email);
        op.setContrasena(contrasena);
        op.setRespuesta(respuesta);
        op.setPregunta(pregunta);
        
        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un Operador");
        
        int result =daoOperador.guardarOperador(op);

        System.out.println("Se  insertó  un  nuevo programa");
        
        return result;

    }//end
    
    public Operador loginOperador(String user){

        Operador operador;
        operador = daoOperador.loginOperador(user);
        return operador;
    }

}
