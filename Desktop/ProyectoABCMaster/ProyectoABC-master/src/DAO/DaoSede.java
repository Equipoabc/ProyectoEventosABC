/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import Logica.*;
import Conexion.*;

public class DaoSede {
    
    Conexiones conexion;
    
    public DaoSede(){
        
        conexion = Main.conexion;;
    }

    public int guardarSede(Sede sede) {
        String sql_guardar, validar;
        validar = "SELECT id_sede FROM Sedes WHERE id_sede = '" + sede.getId_sede() + "';";        

        int numFilas; 
        
        sql_guardar = "INSERT INTO Sedes (id_sede, nombre_sede, ciudad, " + 
                "calle, carrera, barrio, telefono, cedula_ge)" + 
                " VALUES ('" + sede.getId_sede()+ "', '" +
                sede.getNombre_sede() +  "', '" + sede.getCiudad() +  "', '" +
                sede.getCalle() +  "', '" + sede.getCarrera() + "', '" + 
                sede.getBarrio() +  "', '" + sede.getTelefono() +  "', '" + sede.getCedula_ge() +  "')" ;
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
            
                validar = consulta.getString(1);
            }
            
            if(validar.equals(sede.getId_sede())){
                
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
    // Nuevo.
    public Sede consultarDatosSede(String codigoConsultar) {
        String sql, validar;
        Sede sede = new Sede();

        validar = "SELECT id_sede FROM Sedes WHERE id_sede = '" + codigoConsultar + "';";
        sql = "SELECT id_sede, nombre_sede, ciudad, calle, carrera, barrio, telefono "
                + "FROM Sedes WHERE id_sede = '" + codigoConsultar + "';";

        try {

            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);

            while (consulta.next()) {

                validar = consulta.getString(1);
            }
            
            if (!validar.equals(codigoConsultar)) {

                return null;
            } 
            else {

                ResultSet consulta2 = sentencia.executeQuery(sql);

                while (consulta2.next()) {

                    sede.setId_sede(consulta2.getString(1));
                    sede.setNombre_sede(consulta2.getString(2));
                    sede.setCiudad(consulta2.getString(3));
                    sede.setCalle(consulta2.getString(4));
                    sede.setCarrera(consulta2.getString(5));
                    sede.setBarrio(consulta2.getString(6));
                    sede.setTelefono(consulta2.getString(7));                    
                }

                return sede;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error" + e);
        }
        return null;       
    }

    public int actualizarSede(String codigoConsulta, String nombreS, String ciudadS, String carreraS, String calleS, String barrioS, String telefonoS) {
       
        String sql_guardar, validar;

        validar = "SELECT id_sede FROM Sedes WHERE id_sede = '" + codigoConsulta + "';";
        sql_guardar = "UPDATE Sedes SET id_sede = '" + codigoConsulta + "', nombre_sede = '"
                + nombreS + "', ciudad = '" + ciudadS + "', calle = '"
                + calleS + "', carrera = '" + carreraS + "', barrio = '"
                + barrioS + "', telefono = '" + telefonoS 
                + "' WHERE id_sede = '" + codigoConsulta + "';";

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
        sql = "SELECT id_sede FROM Sedes WHERE id_sede = '" + id + "';";
        
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
    //
}