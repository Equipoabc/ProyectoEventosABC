/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import GUI.GUI_Login;
import Conexion.*;

/**
 *
 * @author Iván
 */
public class Main {
    
    public static Conexiones conexion;
    
    public Main(){
        
    }
    
    public static void main(String[] args) {
        
        conexion = new Conexiones();
        conexion.getConnetion();
        Reportes.crearCarpetas();
        GUI_Login interfaz = new GUI_Login();
        interfaz.setVisible(true);
    }
}
