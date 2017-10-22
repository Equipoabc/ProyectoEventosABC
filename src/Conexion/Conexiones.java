/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author Luis
 */

import java.sql.*;

public class Conexiones {
    
    String url, usuario, password;
    Connection conexion = null;
    Statement instruccion;
    ResultSet tabla;
    
    public Conexiones(){
    
        url = "jdbc:postgresql://localhost:5432/ProyectoEventosABC";
        usuario = "postgres";
        password = "123";
    }
    
    public Connection conectar(){
        
        try {
            // Se carga el driver.
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Cargado.");
        } catch(ClassNotFoundException e){
                
            System.out.println("No se pudo cargar el driver.");
        }

        try{
            // Crear el objeto de conexion a la base de datos.
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion Abierta.");
            return conexion;
            // Crear objeto Statement para realizar queries a la base de datos.
        } catch(SQLException e){
        
            System.out.println("No se pudo abrir la bd. Error: " + e);
            return null;
        }
    }

    public Connection getConnetion(){
    
        if (conexion == null) {
        
            return this.conectar();
        }
        
        else{
        
            return conexion;      
        }
    }
        
    public void closeConection(Connection c){
    
        try{

            if (conexion != null){
            
                c.close();
            }
        } catch(SQLException e){
            
                System.out.println("No se pudo cerrar. Error: " + e);
        }
    }
}
