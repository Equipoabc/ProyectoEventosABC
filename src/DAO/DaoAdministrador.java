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

public class DaoAdministrador {
    
    Conexiones conexion;
    
    public DaoAdministrador(){
        
        conexion = new Conexiones();
    }
    
    public Administrador loginAdministrador(String user){
        
        String sql;
        Administrador administrador = new Administrador();

        sql = "SELECT usuario, contrasena FROM Administradores WHERE usuario = '" + user + "';";
        
        try{
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                administrador.setUsuario(consulta.getString(1));
                administrador.setContrasena(consulta.getString(2));
            }
            
            return administrador;
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
