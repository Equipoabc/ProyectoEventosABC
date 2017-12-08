/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Conexion.*;
import Logica.Main;
import Logica.Reportes;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Iván
 */

public class DaoReportesUsuarios {
    
    Conexiones conexion;
    
    public DaoReportesUsuarios(){
            
        conexion = Main.conexion;
    }
    
    public void guardarReporteUsuarios(String nombre){
        
        String[][] data= new String[20][10];
        String[] cabecera = new String[10];
      
        cabecera[0]="Cédula";
        cabecera[1]="Primer nombre";
        cabecera[2]="Segundo nombre";
        cabecera[3]="Primer apellido";
        cabecera[4]="Segundo apellido";
        cabecera[5]="Fecha de nacimiento";
        cabecera[6]="E-mail";
        cabecera[7]="Telefono";
        cabecera[8]="Celular";
        cabecera[9]="Estado";
        
        
        String sql;

        sql = "SELECT cedula_op, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, "
                + "email, telefono, celular, estado FROM Operadores UNION SELECT cedula_ge, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, "
                + "email, telefono, celular, estado FROM Gerentes;";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);

            int j = 0;
            String aux;
            while(consulta.next()){
                
                for (int i = 0; i < 10; i++) {
                   
                    aux =  consulta.getString(i + 1);
                    data[j][i] = aux;
                }
                
                
                //System.out.println("H   " + Arrays.toString(data[j]));
                j++;
            }
            
        Reportes.generarReporte(cabecera, data, nombre);
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
        
        
    }
    
    public void consultarUsuarios(DefaultTableModel modeloTabla, JTable tabla){
        
        String sql;

        sql = "SELECT cedula_op, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, "
                + "email, telefono, celular, estado FROM Operadores UNION SELECT cedula_ge, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, "
                + "email, telefono, celular, estado FROM Gerentes;";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[10];
            
            while(consulta.next()){
                
                for (int i = 0; i < 10; i++) {
                    
                    fila[i] = consulta.getObject(i + 1);
                }
                
                modeloTabla.addRow(fila);
            }
            
            tabla.updateUI();
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
    }  

    public void consultarUsuarios(DefaultTableModel modeloTabla, JTable tabla, String busqueda){
       
        String sql;

        sql = "SELECT cedula_op, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, "
                + "email, telefono, celular, estado FROM Operadores WHERE cedula_op = '" + busqueda + "' UNION "
                + "SELECT cedula_ge, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, "
                + "email, telefono, celular, estado FROM Gerentes WHERE cedula_ge = '" + busqueda + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[10];
            
            while(consulta.next()){
                
                for (int i = 0; i < 10; i++) {
                    
                    fila[i] = consulta.getObject(i + 1);
                }
                
                modeloTabla.addRow(fila);
            }
            
            tabla.updateUI();
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
    }
}