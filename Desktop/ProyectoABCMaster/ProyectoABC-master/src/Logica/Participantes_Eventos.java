/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Iván
 */

public class Participantes_Eventos {
    
    private String id_participante;
    private String id_evento;
    private String estado_pago;
    private String cedula_op;

    /**
     * @return the id_participante
     */
    public String getId_participante() {
        return id_participante;
    }

    /**
     * @param id_participante the id_participante to set
     */
    public void setId_participante(String id_participante) {
        this.id_participante = id_participante;
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
    
    public String getEstado_pago() {
        return estado_pago;
    }
    
    public void setEstado_Pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }

    public String getCedula_op() {
        return cedula_op;
    }
    
    public void setCedula_op(String cedula_op) {
        this.cedula_op = cedula_op;
    }      
}