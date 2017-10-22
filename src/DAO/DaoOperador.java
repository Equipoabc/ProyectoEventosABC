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
}
