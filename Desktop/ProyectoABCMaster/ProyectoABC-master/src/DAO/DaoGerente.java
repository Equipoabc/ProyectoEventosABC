/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import Logica.*;
import Conexion.*;

public class DaoGerente {

    Conexiones conexion;

    public DaoGerente() {

        conexion = Main.conexion;
    }

    public Gerente loginGerente(String user) {

        String sql;
        Gerente gerente = new Gerente();

        sql = "SELECT cedula_ge, contrasena FROM Gerentes WHERE cedula_ge = '" + user + "';";

        try {

            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);

            while (consulta.next()) {

                gerente.setCedula_ge(consulta.getString(1));
                gerente.setContrasena(consulta.getString(2));
            }

            return gerente;
        } catch (SQLException e) {

            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error: " + e);
        }

        return null;
    }

    public int guardarGerente(Gerente ge) {

        String sql_guardar, validar;
        int numFilas;

        validar = "SELECT cedula_ge FROM Gerentes WHERE cedula_ge = '" + ge.getCedula_ge() + "';";
        sql_guardar = "INSERT INTO Gerentes (cedula_ge, primer_nombre, segundo_nombre, "
                + "primer_apellido, segundo_apellido, fecha_nacimiento, email, telefono, celular, estado, "
                + "contrasena, pregunta, respuesta) VALUES ('" + ge.getCedula_ge() + "', '"
                + ge.getPrimer_nombre() + "', '" + ge.getSegundo_nombre() + "', '"
                + ge.getPrimer_apellido() + "', '" + ge.getSegundo_apellido() + "', '"
                + ge.getFecha_nacimiento() + "', '" + ge.getEmail() + "', '"
                + ge.getTelefono() + "', '" + ge.getCelular() + "', '"
                + "Activo" + "', '" + ge.getContrasena() + "', '"
                + ge.getPregunta() + "', '" + ge.getRespuesta() + "')";

        try {

            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);

            while (consulta.next()) {

                validar = consulta.getString(1);
            }

            if (validar.equals(ge.getCedula_ge())) {

                return 2;
            } else {

                numFilas = sentencia.executeUpdate(sql_guardar);
                return numFilas;
            }

        } catch (SQLException e) {

            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error: " + e);
        }

        return -1;
    }

    public Gerente consultarDatosGerente(String cedula) {

        String sql, validar;
        Gerente gerente = new Gerente();

        validar = "SELECT cedula_ge FROM Gerentes WHERE cedula_ge = '" + cedula + "';";
        sql = "SELECT primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, cedula_ge, fecha_nacimiento, email, telefono, "
                + "celular, estado, pregunta, respuesta FROM Gerentes WHERE cedula_ge = '" + cedula + "';";

        try {

            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);

            while (consulta.next()) {

                validar = consulta.getString(1);
            }

            if (!validar.equals(cedula)) {

                return null;
            } else {

                ResultSet consulta2 = sentencia.executeQuery(sql);

                while (consulta2.next()) {

                    gerente.setPrimer_nombre(consulta2.getString(1));
                    gerente.setSegundo_nombre(consulta2.getString(2));
                    gerente.setPrimer_apellido(consulta2.getString(3));
                    gerente.setSegundo_apellido(consulta2.getString(4));
                    gerente.setCedula_ge(consulta2.getString(5));
                    gerente.setFecha_nacimiento(consulta2.getString(6));
                    gerente.setEmail(consulta2.getString(7));
                    gerente.setTelefono(consulta2.getString(8));
                    gerente.setCelular(consulta2.getString(9));
                    gerente.setEstado(consulta2.getString(10));
                    gerente.setPregunta(consulta2.getString(11));
                    gerente.setRespuesta(consulta2.getString(12));

                    /*tipoUsuario.setSelectedIndex(1);
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
                }

                return gerente;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error" + e);
        }

        return null;
    }
    
     public int actualizarContrasena(String cedula, String contrasena) {
        
        String sql_guardar, validar;
        
        validar = "SELECT cedula_ge FROM Gerentes WHERE cedula_ge = '" + cedula + "';";
        sql_guardar = "UPDATE Gerentes SET contrasena = '" + contrasena +  "' WHERE cedula_ge = '" + cedula + "';";
        
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

    public int actualizarGerente(String cedulaBusqueda, String primerNombre, String segundoNombre,
            String primerApellido, String segundoApellido, String telefono, String celular, String email,
            String estado, String tipo) {

        String sql_guardar, validar, validar2;

        validar = "SELECT cedula_ge FROM Gerentes WHERE cedula_ge = '" + cedulaBusqueda + "';";
        validar2 = "SELECT cedula_op FROM Operadores WHERE cedula_op = '" + cedulaBusqueda + "';";
        sql_guardar = "UPDATE Gerentes SET primer_nombre = '" + primerNombre + "', segundo_nombre = '"
                + segundoNombre + "', primer_apellido = '" + primerApellido + "', segundo_apellido = '"
                + segundoApellido + "', telefono = '"
                + telefono + "', celular = '" + celular + "', email = '" + email + "', estado = '"
                + estado + "' WHERE cedula_ge = '" + cedulaBusqueda + "';";

        try {

            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);

            while (consulta.next()) {

                validar = consulta.getString(1);
            }

            ResultSet consulta2 = sentencia.executeQuery(validar2);

            while (consulta2.next()) {

                validar2 = consulta2.getString(1);
            }

            /*if (validar.equals(cedula) && !cedula.equals(cedulaBusqueda)) {

                return 2;
            } else if (validar2.equals(cedula)) {

                return 3;
            } else */if (!validar2.equals(cedulaBusqueda) && tipo.equals("Operador")) {

                // Crear en operador y elimar de gerente.
                // 1. Traer los datos del gerente y crear el operador.
                String sql;
                Operador operador = new Operador();
                sql = "SELECT * FROM Gerentes WHERE cedula_ge = '" + cedulaBusqueda + "';";
                ResultSet consulta3 = sentencia.executeQuery(sql);
            
                while(consulta3.next()){
            
                    operador.setCedula_op(consulta3.getString(1));
                    operador.setPrimer_nombre(consulta3.getString(2));
                    operador.setSegundo_nombre(consulta3.getString(3));
                    operador.setPrimer_apellido(consulta3.getString(4));
                    operador.setSegundo_apellido(consulta3.getString(5));
                    operador.setFecha_nacimiento(consulta3.getString(6));
                    operador.setEmail(consulta3.getString(7));
                    operador.setTelefono(consulta3.getString(8));
                    operador.setCelular(consulta3.getString(9));
                    operador.setEstado(consulta3.getString(10));
                    operador.setContrasena(consulta3.getString(11));
                    operador.setPregunta(consulta3.getString(12));
                    operador.setRespuesta(consulta3.getString(13));
                }
                
                DaoOperador daoOperador = new DaoOperador();
                daoOperador.guardarOperador(operador);
                
                // 2. Inhabilitar gerente.
                sql = "DELETE FROM Gerentes WHERE cedula_ge = '" + cedulaBusqueda + "';";
                sentencia.executeUpdate(sql);
                return 4;
            } else {

                sentencia.executeQuery(sql_guardar); // Error extraño.
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error" + e);
        }

        return -1;
    }

    public int comprobar(String cedula) {

        String sql;
        sql = "SELECT cedula_ge FROM Gerentes WHERE cedula_ge = '" + cedula + "';";

        try {

            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);

            while (consulta.next()) {

                sql = consulta.getString(1);
            }

            if (sql.equals(cedula)) {

                return 1;
            }
            return 0;

        } catch (SQLException e) {

            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error: " + e);
        }

        return 0;
    }

}
