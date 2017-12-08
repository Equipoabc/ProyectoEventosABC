/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import DAO.*;
import Logica.*;

/**
 *
 * @author Luis
 */

public class ControladorEvento {
    
    DaoEvento daoEvento;
    
    public ControladorEvento(){
        
        daoEvento = new DaoEvento();
    }

    public int insertarEvento(String cod, String nom, String date, String prec, String cupo, String hora, String min, String dur, String lug, String tem, String idGerente){
        
        Evento evento = new Evento();
        
        evento.setNombre_evento(nom);
        evento.setId_evento(cod);
        evento.setFecha(date);
        evento.setPrecio(prec);
        evento.setCupos(cupo);
        evento.setHoras(hora);
        evento.setMinutos(min);
        evento.setDuracion(dur);
        evento.setLugar(lug);
        evento.setTema(tem);
        evento.setCedula_ge(idGerente);
        
        int result = daoEvento.guardarEvento(evento);
        return result;
    }

    public Evento consultarDatosEvento(String id_evento) {
        return daoEvento.consultarDatosEvento(id_evento);
    }

    public int eliminarEvento(String id_evento) {
       return daoEvento.eliminarEvento(id_evento);        
    }

    public int actualizarEvento(String codigoConsulta, String nombreS, String precioS, String cuposS, 
            String duracion, String lugarS, String temaS, String fechaS) {
        return daoEvento.actualizarEvento(codigoConsulta, nombreS, precioS, cuposS, duracion, lugarS, temaS, fechaS);
    }

    public int comprobar(String codigoConsulta) {
        return daoEvento.comprobar(codigoConsulta);
    }
}