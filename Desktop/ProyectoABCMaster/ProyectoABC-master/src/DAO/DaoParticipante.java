/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import Logica.*;
import Conexion.*;

public class DaoParticipante {
    
    Conexiones conexion;
    
    public DaoParticipante(){
        
        conexion = Main.conexion;
    }
    
    
    public int actualizarParticipante(String codigoConsulta, String primerNombreS,
            String segundoNombreS, String primerApellidoS, String segundoApellidoS, String correoS,
            String telefonoS) {
        
        String sql_guardar, validar;
        
        validar = "SELECT cedula_pa FROM Participantes WHERE cedula_pa = '" + codigoConsulta + "';";
        sql_guardar = "UPDATE Participantes SET primer_nombre = '"
                + primerNombreS + "', segundo_nombre = '" + segundoNombreS + "', primer_apellido = '"
                + primerApellidoS + "', segundo_apellido = '" + segundoApellidoS +  "', telefono = '" + telefonoS + "', email = '"
                + correoS + "' WHERE cedula_pa = '" + codigoConsulta + "';";
        
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
    
    public int guardarParticipante(Participante pa, String codEvento){
        
        //Variables y definición consultas.
        String sql_guardar, validar, validarEvento, validarPago;
        validar = "SELECT cedula_pa FROM Participantes WHERE cedula_pa = '" + pa.getCedula_pa() + "';";
        validarEvento = "SELECT id_evento FROM Eventos WHERE id_evento = '" + codEvento + "';";
        validarPago = "SELECT estado_pago FROM Participantes_Eventos WHERE id_participante = '" + pa.getCedula_pa() + "' and "
                + "id_evento = '" + codEvento + "';";
        String sql_guardarPar_Ev;
        int numFilas, numFilas2;
        numFilas2 = 0;
        
        // instrucción sql para ingresar una tupla en participantes
        sql_guardar = "INSERT INTO Participantes (cedula_pa, primer_nombre, segundo_nombre, " +
                "primer_apellido, segundo_apellido, email, telefono)  " +
                " VALUES ('" + pa.getCedula_pa() + "', '" +
                pa.getPrimer_nombre() +  "', '" + pa.getSegundo_nombre() +  "', '" +
                pa.getPrimer_apellido() +  "', '" + pa.getSegundo_apellido() + "', '" 
                + "', '" + pa.getEmail() +  "', '" +
                pa.getTelefono() +   "')" ;
        
        // instrucción sql para ingresar una tupla en Participantes_eventos
        sql_guardarPar_Ev = "INSERT INTO Participantes_eventos (id_participante, id_evento, estado_pago, " +
                "cedula_op)  " +
                " VALUES ('" + pa.getCedula_pa() + "', '" +
                codEvento +  "', '" + pa.getEstado_pago() +  "', '" +
                pa.getCedula_op() +   "')" ;
        
        //ejecución de las consultas
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            Statement sentencia2 = conn.createStatement();
            Statement sentencia3 = conn.createStatement();
            
            ResultSet consulta = sentencia.executeQuery(validar);
            ResultSet consultaEvento = sentencia2.executeQuery(validarEvento);
            ResultSet consultaPago = sentencia3.executeQuery(validarPago);
            
            //sacar respuestas de las consultas
            while(consulta.next()){
                validar = consulta.getString(1);
            }
            while(consultaEvento.next()){
                validarEvento = consultaEvento.getString(1);
            }
            
            while(consultaPago.next()){
                validarPago = consultaPago.getString(1);
            }
            if(! (validarPago.equals("Valido") || validarPago.equals("Invalido"))){
                validarPago = "";
            }
            
            
            
            //validaciones y resultado de acuerdo al caso.
            if (validarEvento.equals(codEvento) && validar.equals(pa.getCedula_pa())){
                if (validarPago.equals("Valido")){
                    return 8;
                }
                else if (validarPago.equals("Invalido")){
                    return 7;
                }
            }
            
            if(!validarEvento.equals(codEvento)) {
                return 3;
            }
            else {
                if(!validar.equals(pa.getCedula_pa())){
                    
                    numFilas = sentencia.executeUpdate(sql_guardar);
                    
                    numFilas2 = sentencia.executeUpdate(sql_guardarPar_Ev);
                    
                    return numFilas + numFilas2;
                }
                else if (validar.equals(pa.getCedula_pa())){
                    sentencia.executeUpdate(sql_guardarPar_Ev);
                    return 5;
                }
                
            }
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }
    
    public Participante consultarDatosParticipante(String id_participante) {
        String sql, validar;
        Participante participante = new Participante();
        
        validar = "SELECT cedula_pa FROM participantes WHERE cedula_pa = '" + id_participante + "';";
        sql = "SELECT primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,"
                + " fecha_nacimiento, telefono , email "
                + "FROM participantes WHERE cedula_pa = '" + id_participante + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            
            if (!validar.equals(id_participante)) {
                
                return null;
            }
            else {
                
                ResultSet consulta2 = sentencia.executeQuery(sql);
                
                while (consulta2.next()) {
                    
                    participante.setPrimer_nombre(consulta2.getString(1));
                    participante.setSegundo_nombre(consulta2.getString(2));
                    participante.setPrimer_apellido(consulta2.getString(3));
                    participante.setSegundo_apellido(consulta2.getString(4));
                    participante.setFecha_nacimiento(consulta2.getString(5));
                    participante.setTelefono(consulta2.getString(6));
                    participante.setEmail(consulta2.getString(7));
                    
                }
                if(participante.getSegundo_nombre() == null){
                    participante.setSegundo_nombre("");
                }
                if(participante.getSegundo_apellido() == null){
                    participante.setSegundo_apellido("");
                }
                participante.setCedula_pa(validar);
                
                return participante;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        return null;
    }
    
    public int eliminarPreinscripcion(String id_participante, String id_evento) {
        String sql;
        sql = "DELETE FROM participantes_eventos WHERE id_participante = '" + id_participante + "' AND id_evento = '" + id_evento + "';";
        
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
    public Participantes_Eventos consultarPreinscripcion(String id_participante, String id_evento) {
        String sql, validar;
        Participantes_Eventos preInscripcion = new Participantes_Eventos();
        
        validar = "SELECT id_participante FROM participantes_eventos WHERE id_participante = '" + id_participante + "' AND "
                + "id_evento = '" + id_evento + "' ;";
        sql = "SELECT id_participante, id_evento, estado_pago, cedula_op "
                + "FROM Participantes_eventos WHERE id_participante = '" + id_participante + "' AND "
                + "id_evento = '" + id_evento + "';";
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            
            if (!validar.equals(id_participante)) {
                
                return null;
            }
            else {
                ResultSet consulta2 = sentencia.executeQuery(sql);
                
                while (consulta2.next()) {
                    
                    preInscripcion.setId_participante(consulta2.getString(1));
                    preInscripcion.setId_evento(consulta2.getString(2));
                    preInscripcion.setEstado_Pago(consulta2.getString(3));                    
                    preInscripcion.setCedula_op(consulta2.getString(4));
                }               
                return preInscripcion;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        return null;
    }
    
    public int realizarPago(String id, String id_evento) {
        String sql, validar, validarPago;
        int numFilas;
        
        sql = "UPDATE participantes_eventos SET estado_pago = 'Valido' WHERE id_participante = '"+ id + "' and id_evento = '"+ id_evento + "';";
        validar = "SELECT cedula_pa FROM Participantes WHERE cedula_pa = '" + id + "';";
        validarPago = "SELECT estado_pago FROM Participantes_Eventos WHERE id_participante = '" + id + "' and "
                + "id_evento = '" + id_evento + "';";
        
        try {
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            Statement sentencia2 = conn.createStatement();
            
            ResultSet consulta = sentencia.executeQuery(validar);
            ResultSet consultaPago = sentencia2.executeQuery(validarPago);
            
            //sacar respuestas de las consultas
            while(consultaPago.next()){
                validarPago = consultaPago.getString(1);
            }
            while(consulta.next()){
                validar = consulta.getString(1);
            }
            if (!validar.equals(id)){
                return 33;
            }
            else if(! (validarPago.equals("Valido") || validarPago.equals("Invalido"))){
                return 6;
            }
            else if (validarPago.equals("Valido")){
                return 40;
            }
            else if(validar.equals(id) && validarPago.equals("Invalido")){
                numFilas = sentencia.executeUpdate(sql);
                return numFilas;
            }
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error" + e);
        }
        
        return -1;
        
    }
    
    public int comprobar(String id){
        
        String sql;
        sql = "SELECT cedula_pa FROM Participantes WHERE cedula_pa = '" + id + "';";
        
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