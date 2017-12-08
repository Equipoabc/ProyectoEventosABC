/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @au
 * thor Luis
 */

public class Evento {
    
    private String id_evento;
    private String nombre_evento;
    private String fecha;
    private String precio;
    private String lugar;
    private String duracion;
    private String tema;
    private String cupos;
    private String cedula_ge;
    private String horas;
    private String minutos;

    public String getHoras() {
        return horas;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }
    
    

    /**
     * @return the id_evento
     */
    public String getId_evento() {
        return id_evento;
    }

    /**
     * @param id_evento the id_evento to set
     */
    public void setId_evento(String id_evento) {
        this.id_evento = id_evento;
    }

    /**
     * @return the nombre_evento
     */
    public String getNombre_evento() {
        return nombre_evento;
    }

    /**
     * @param nombre_evento the nombre_evento to set
     */
    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return the duracion
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return the cupos
     */
    public String getCupos() {
        return cupos;
    }

    /**
     * @param cupos the cupos to set
     */
    public void setCupos(String cupos) {
        this.cupos = cupos;
    }

    /**
     * @return the cedula_ge
     */
    public String getCedula_ge() {
        return cedula_ge;
    }

    /**
     * @param cedula_ge the cedula_ge to set
     */
    public void setCedula_ge(String cedula_ge) {
        this.cedula_ge = cedula_ge;
    }
}