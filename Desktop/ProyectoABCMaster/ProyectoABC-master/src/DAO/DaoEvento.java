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

public class DaoEvento {
    
    Conexiones conexion;
    
    public DaoEvento(){
        
        conexion = Main.conexion;
    }

    public int guardarEvento(Evento evento) {
        String sql_guardar, validar;
        validar = "SELECT id_evento FROM Eventos WHERE id_evento = '" + evento.getId_evento() + "';";
        int numFilas;  
        
        sql_guardar = "INSERT INTO Eventos (id_evento, nombre_evento, fecha, precio, lugar, duracion, tema, cupos, cedula_ge) " + 
                "VALUES ('" + evento.getId_evento() + "', '" + evento.getNombre_evento() +  "', '" + evento.getFecha() +  "', " + 
                evento.getPrecio() +  ", '" + evento.getLugar() +  "', '" + evento.getDuracion() + "', '" +  evento.getTema() +  "', " 
                + evento.getCupos() +  ", '" + evento.getCedula_ge() +  "')" ;
     
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
            
                validar = consulta.getString(1);
            }
            
            if(validar.equals(evento.getId_evento())){
                
                return 2;
            }
            
            else {
            
                numFilas = sentencia.executeUpdate(sql_guardar);
                return numFilas;
            }
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
        
        return -1;  
    }

    public Evento consultarDatosEvento(String id_evento) {
        String sql, validar;
        Evento evento = new Evento();

        validar = "SELECT id_evento FROM eventos WHERE id_evento = '" + id_evento + "';";
        sql = "SELECT nombre_evento, fecha, precio, lugar, duracion, tema, cupos, cedula_ge "
                + "FROM Eventos WHERE id_evento = '" + id_evento + "';";

        try {

            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);

            while (consulta.next()) {

                validar = consulta.getString(1);
            }
            
            if (!validar.equals(id_evento)) {

                return null;
            } 
            else {

                ResultSet consulta2 = sentencia.executeQuery(sql);

                while (consulta2.next()) {

                    evento.setNombre_evento(consulta2.getString(1));
                    evento.setFecha(consulta2.getString(2));
                    evento.setPrecio(consulta2.getString(3));
                    evento.setLugar(consulta2.getString(4));
                    evento.setDuracion(consulta2.getString(5));
                    evento.setTema(consulta2.getString(6));
                    evento.setCupos(consulta2.getString(7));
                    evento.setCedula_ge(consulta2.getString(8));
                    
                }
                evento.setId_evento(validar);

                return evento;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error" + e);
        }
        return null;
    }


    public int eliminarEvento(String id_evento) {
        String sql;
        sql = "DELETE FROM eventos WHERE id_evento = '" + id_evento + "';";
        
        try {
            int numFilas;
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql);
            return numFilas;
        }
            catch (SQLException e) {
            System.out.println("SQL error: " + e);
            } 
            catch (Exception e) {
            System.out.println("Error" + e);
        }
        return -1;
    }

    public int actualizarEvento(String codigoConsulta,String nombreS, String precioS, String cuposS, 
            String duracion, String lugarS, String temaS, String fechaS) {

        String sql_guardar, validar;

        validar = "SELECT id_evento FROM Eventos WHERE id_evento = '" + codigoConsulta + "';";
        sql_guardar = "UPDATE Eventos SET nombre_evento = '"
                + nombreS + "', precio = '" + precioS + "', lugar = '"
                + lugarS + "', duracion = '" + duracion + "', tema = '"
                + temaS + "', cupos = '" + cuposS + "', fecha = '"
                + fechaS + "' WHERE id_evento = '" + codigoConsulta + "';";

        try {

            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);

            while (consulta.next()) {

                validar = consulta.getString(1);
            }
            
            int numFilas = sentencia.executeUpdate(sql_guardar);
            return numFilas;
            
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error" + e);
        }

        return -1;
    }
    
    public int comprobar(String id){
        
        String sql;        
        sql = "SELECT id_evento FROM Eventos WHERE id_evento = '" + id + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                sql = consulta.getString(1);
            }
            
            if(sql.equals(id)){
                
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
    
}