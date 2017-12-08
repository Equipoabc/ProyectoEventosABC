/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import Logica.*;
import Conexion.*;

/**
 *
 * @author Luis
 */

public class DaoOperador {
    
    Conexiones conexion;
    
    public DaoOperador(){
        
        conexion = Main.conexion;
    }
    
    public Operador loginOperador(String user){
        
        String sql;
        Operador operador = new Operador();
        
        sql = "SELECT cedula_op, contrasena FROM Operadores WHERE cedula_op = '" + user + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                operador.setCedula_op(consulta.getString(1));
                operador.setContrasena(consulta.getString(2));
            }
            
            return operador;
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
        
        return null;
    }

    public int guardarOperador(Operador op){
        
        String sql_guardar, validar;
        int numFilas;
        
        validar = "SELECT cedula_op FROM Operadores WHERE cedula_op = '" + op.getCedula_op() + "';";        
        sql_guardar = "INSERT INTO Operadores (cedula_op, primer_nombre, segundo_nombre, " + 
            "primer_apellido, segundo_apellido, fecha_nacimiento, email, telefono, celular, estado, " + 
            "contrasena, pregunta, respuesta) VALUES ('" + op.getCedula_op() + "', '" +
            op.getPrimer_nombre() +  "', '" + op.getSegundo_nombre() +  "', '" +
            op.getPrimer_apellido() +  "', '" + op.getSegundo_apellido() + "', '" + 
            op.getFecha_nacimiento() + "', '" + op.getEmail() +  "', '" + 
            op.getTelefono() +  "', '" + op.getCelular() +  "', '" +        
            "Activo" +  "', '" + op.getContrasena() +  "', '" +
            op.getPregunta() +  "', '" + op.getRespuesta() +  "')" ;
        
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
            
                validar = consulta.getString(1);
            }
            
            if(validar.equals(op.getCedula_op())){
                
                return 2;
            }
            
            else {
            
                numFilas = sentencia.executeUpdate(sql_guardar);
                return numFilas;
            }
        } catch(SQLException e){
            e.printStackTrace();
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }
    
    public Operador consultarDatosOperador(String cedula){
        
        String sql, validar;
        Operador operador = new Operador();
        
        validar = "SELECT cedula_op FROM Operadores WHERE cedula_op = '" + cedula + "';";
        sql = "SELECT primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, cedula_op, fecha_nacimiento, email, telefono, "
                + "celular, estado, pregunta, respuesta, contrasena FROM Operadores WHERE cedula_op = '" + cedula + "';";
        
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
            
                validar = consulta.getString(1);
            }
            
            if(!validar.equals(cedula)){
                
                return null;
            }
            
            else {
            
                ResultSet consulta2 = sentencia.executeQuery(sql);
                
                while(consulta2.next()){
            
                    /*tipoUsuario.setSelectedIndex(0);
                    primerNom.setText(consulta2.getString(1));
                    segundoNom.setText(consulta2.getString(2));
                    primerAp.setText(consulta2.getString(3));
                    segundoAp.setText(consulta2.getString(4));
                    ced.setText(consulta2.getString(5));
                    // fecha.setDate(format.parse(consulta2.getString(6))); Validar esta vaina. :'v
                    correo.setText(consulta2.getString(7));
                    tel.setText(consulta2.getString(8));
                    cel.setText(consulta2.getString(9));
                    
                    if(consulta2.getString(10).equals("Activo")){
                        
                        estado.setSelectedIndex(0);
                    }
                    else {
                        
                       estado.setSelectedIndex(1); 
                    }*/
                    
                    operador.setPrimer_nombre(consulta2.getString(1));
                    operador.setSegundo_nombre(consulta2.getString(2));
                    operador.setPrimer_apellido(consulta2.getString(3));
                    operador.setSegundo_apellido(consulta2.getString(4));
                    operador.setCedula_op(consulta2.getString(5));
                    operador.setFecha_nacimiento(consulta2.getString(6));
                    operador.setEmail(consulta2.getString(7));
                    operador.setTelefono(consulta2.getString(8));
                    operador.setCelular(consulta2.getString(9));
                    operador.setEstado(consulta2.getString(10));
                    operador.setPregunta(consulta2.getString(11));
                    operador.setRespuesta(consulta2.getString(12));
                    operador.setContrasena(consulta2.getString(13));
                }
                
                return operador;
            }
        } catch(SQLException e){
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error" + e);
        }
        
        return null;
    }

    public int actualizarOperador(String cedulaBusqueda, String primerNombre, String segundoNombre, 
            String primerApellido, String segundoApellido, String telefono, String celular, String email,
            String estado, String tipo) {
        
        String sql_guardar, validar, validar2;
        int numFilas;
        
        // Validar en la tabla de gerentes tambien si existe la nueva cedula,
        // Si cedulaBusqueda == cedula no hacer comprobacion, solo actualizacion
        // Si se modifica el tipo de usuario eliminar y meter en nueva tabla
        
        validar = "SELECT cedula_op FROM Operadores WHERE cedula_op = '" + cedulaBusqueda + "';";
        validar2 = "SELECT cedula_ge FROM Gerentes WHERE cedula_ge = '" + cedulaBusqueda + "';";
        sql_guardar = "UPDATE Operadores SET primer_nombre = '" + primerNombre + "', segundo_nombre = '"
                + segundoNombre + "', primer_apellido = '" + primerApellido + "', segundo_apellido = '"
                + segundoApellido + "', telefono = '"
                + telefono + "', celular = '" + celular + "', email = '" + email + "', estado = '"
                + estado + "' WHERE cedula_op = '" + cedulaBusqueda + "';";
        
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            
            while(consulta.next()){
            
                validar = consulta.getString(1);
            }
            
            ResultSet consulta2 = sentencia.executeQuery(validar2);
            
            while(consulta2.next()){
            
                validar2 = consulta2.getString(1);
            }
            
            /*if(validar.equals(cedula) && !cedula.equals(cedulaBusqueda)){
                
                return 2;
            }
            
            else if(validar2.equals(cedula)){
               
                return 3;
            }
            
            else*/ if(!validar2.equals(cedulaBusqueda) && tipo.equals("Gerente")){
                
                // Crear en gerente y elimar de operador.
                // 1. Traer los datos del operador y crear el gerente.
                String sql;
                Gerente gerente = new Gerente();
                sql = "SELECT * FROM Operadores WHERE cedula_op = '" + cedulaBusqueda + "';";
                ResultSet consulta3 = sentencia.executeQuery(sql);
            
                while(consulta3.next()){
            
                    gerente.setCedula_ge(consulta3.getString(1));
                    gerente.setPrimer_nombre(consulta3.getString(2));
                    gerente.setSegundo_nombre(consulta3.getString(3));
                    gerente.setPrimer_apellido(consulta3.getString(4));
                    gerente.setSegundo_apellido(consulta3.getString(5));
                    gerente.setFecha_nacimiento(consulta3.getString(6));
                    gerente.setEmail(consulta3.getString(7));
                    gerente.setTelefono(consulta3.getString(8));
                    gerente.setCelular(consulta3.getString(9));
                    gerente.setEstado(consulta3.getString(10));
                    gerente.setContrasena(consulta3.getString(11));
                    gerente.setPregunta(consulta3.getString(12));
                    gerente.setRespuesta(consulta3.getString(13));
                }
                
                DaoGerente daoGerente = new DaoGerente();
                daoGerente.guardarGerente(gerente);
                
                // 2. Inavilitar operador.
                sql = "DELETE FROM Operadores WHERE cedula_op = '" + cedulaBusqueda + "';";
                sentencia.executeUpdate(sql);
                return 4;
            }
            
            else {
            
                sentencia.executeUpdate(sql_guardar);
                return 1;
            }
        } catch(SQLException e){
            e.printStackTrace();
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }
    
        public int comprobar(String cedula){
        
        String sql;        
        sql = "SELECT cedula_op FROM Operadores WHERE cedula_op = '" + cedula + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                sql = consulta.getString(1);
            }
            
            if(sql.equals(cedula)){
                
                return 1;
            }
            return 0;
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
        
        return 0;
    }
    public int actualizarContrasena(String cedula, String contrasena) {
        
        String sql_guardar, validar;
        
        validar = "SELECT cedula_op FROM Operadores WHERE cedula_op = '" + cedula + "';";
        sql_guardar = "UPDATE Operadores SET contrasena = '" + contrasena +  "' WHERE cedula_op = '" + cedula + "';";
        
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            
            while(consulta.next()){
            
                validar = consulta.getString(1);
            }  
            
            if(validar.equals(cedula)){
                sentencia.executeUpdate(sql_guardar);                
                return 1;
            }            
            else {                 
                return 2;
            }

        } catch(SQLException e){
            e.printStackTrace();
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }    
}