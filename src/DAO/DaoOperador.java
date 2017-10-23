/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Luis
 */
import java.sql.*;
import Logica.*;
import Conexion.*;

public class DaoOperador {
    
    Conexiones conexion;
    
    public DaoOperador(){
        
        conexion = new Conexiones();
    }
    
    public Operador loginOperador(String user){
        
        String sql;
        Operador operador = new Operador();

        sql = "SELECT cedula_op, contrasena FROM Operadores WHERE cedula_op = '" + user + "';";
        
        try{
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                operador.setCedula_op(consulta.getString(1));
                operador.setContrasena(consulta.getString(2));
            }
            
            return operador;
        }
        catch(SQLException e){
            
            System.out.println("Error: " + e); 
        }
        catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
        
        return null;
    }

    public void cerrarConexionBD(){
        
        conexion.closeConection(conexion.getConnetion());
    }

    public int guardarOperador(Operador op) {
        String sql_guardar;
        int numFilas=0;
        
        /*INSERT INTO Operadores (cedula_op, primer_nombre, segundo_nombre, 
        primer_apellido, segundo_apellido, 
	fecha_nacimiento, email, telefono, celular, estado, contrasena, pregunta, respuesta)
VALUES ('1010059777', 'Ivan', 'Mauricio', 'Toro', 'Cifuentes', '1998-03-16',
        'ivan.toro@hotmail.com', '568402', '3164875865',
 'Activo', '54321', '¿Scorpion?', 'Hanzo Hasashi');*/
        
        sql_guardar = "INSERT INTO Operadores (cedula_op, primer_nombre, segundo_nombre, " + 
        "primer_apellido, segundo_apellido, " /*fecha_nacimiento*/ + "email, telefono, celular, estado, " + 
        "contrasena, pregunta, respuesta) VALUES ('" + op.getCedula_op() + "', '" +
        op.getPrimer_nombre() +  "', '" + op.getSegundo_nombre() +  "', '" +
        op.getPrimer_apellido() +  "', '" + op.getSegundo_apellido() + "', '" + 
        /*op.getFecha_nacimiento() + "', '" + */op.getEmail() +  "', '" + 
        op.getTelefono() +  "', '" + op.getCelular() +  "', '" +        
        "Activo" +  "', '" + op.getContrasena() +  "', '" +
        op.getPregunta() +  "', '" + op.getRespuesta() +  "')" ;
        
        try{
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_guardar);            
            System.out.println("up " + numFilas);
            return numFilas;
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
        return -1;
        
        
    }
}
