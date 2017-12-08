/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Luis
 */

public class Operador {
    
    private String cedula_op;
    private String primer_nombre;
    private String segundo_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String fecha_nacimiento;
    private String email;
    private String telefono;
    private String celular;
    private String estado;
    private String contrasena;
    private String pregunta;
    private String respuesta;
      
    public Operador(){
            
        cedula_op = "";
        primer_nombre = "";
        segundo_nombre = "";
        primer_apellido = "";
        segundo_apellido = "";
        fecha_nacimiento = "";
        email = "";
        telefono = "";
        celular = "";
        estado = "Activo";
        contrasena = "";
        pregunta = "";
        respuesta = "";
    }
    
    /**
     * @return the cedula_op
     */
    public String getCedula_op() {
        return cedula_op;
    }

    /**
     * @param cedula_op the cedula_op to set
     */
    public void setCedula_op(String cedula_op) {
        this.cedula_op = cedula_op;
    }

    /**
     * @return the primer_nombre
     */
    public String getPrimer_nombre() {
        return primer_nombre;
    }

    /**
     * @param primer_nombre the primer_nombre to set
     */
    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    /**
     * @return the segundo_nombre
     */
    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    /**
     * @param segundo_nombre the segundo_nombre to set
     */
    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    /**
     * @return the primer_apellido
     */
    public String getPrimer_apellido() {
        return primer_apellido;
    }

    /**
     * @param primer_apellido the primer_apellido to set
     */
    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    /**
     * @return the segundo_apellido
     */
    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    /**
     * @param segundo_apellido the segundo_apellido to set
     */
    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

}
