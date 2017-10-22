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

public class DaoGerente {
   
    Conexiones conexion;
    
    public DaoGerente(){
        
        conexion = new Conexiones();
    }
    
    public Gerente loginGerenete(){
        
        String sql;
        Gerente gerente = new Gerente();

        sql = "SELECT cedula_ge, contrasena FROM Gerente";
        
        try{
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                gerente.setCedula_ge(consulta.getString(1));
                gerente.setContrasena(consulta.getString(2));
            }
            
            return gerente;
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
