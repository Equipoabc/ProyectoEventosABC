/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.*;

/**
 *
 * @author Luis
 */

public class Conexiones {
    
    String url, usuario, password;
    Connection conexion;
    
    public Conexiones(){
    
        url = "jdbc:postgresql://localhost:5432/postgres";
        usuario = "postgres";
        password = "324577";
        
    //    url = "jdbc:postgresql://pgsql2:5432/1533597";
     //   usuario = "1533597";
      //  password = "1533597";
    }
    
    public Connection conectar(){
        
        try {
            
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver cargado...");
        } catch(ClassNotFoundException e){
                
            System.out.println("No se pudo cargar el driver: " + e);
        }

        try {
            
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion abierta.");
            return conexion;
        } catch(SQLException e){
        
            System.out.println("Error en la conexion: " + e);
            return null;
        }
    }

    public Connection getConnetion(){
    
        if (conexion == null){
        
            return this.conectar();
        }
        else {
        
            return conexion;      
        }
    }
        
    public void closeConection(Connection c){
    
        try {

            if (conexion != null){
            
                c.close();
            }
        } catch(SQLException e){
            
            System.out.println("Error cerrardo la conexion: " + e);
        }
    }
}