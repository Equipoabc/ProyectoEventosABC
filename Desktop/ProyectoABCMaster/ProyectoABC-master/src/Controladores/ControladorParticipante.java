package Controladores;
import DAO.*;
import Logica.*;

public class ControladorParticipante {
    
    DaoParticipante daoParticipante;
    
    public ControladorParticipante(){
        
        daoParticipante = new DaoParticipante();
    }
    
    public int  insertarParticipante(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String cedula, String fechaNacimiento, String telefono, String email, String idOperador, String codEvento, String estado_pago){
                
        Participante pa = new Participante();
        
        pa.setCedula_pa(cedula);
        pa.setFecha_nacimiento(fechaNacimiento);
        pa.setPrimer_nombre(primerNombre);
        pa.setSegundo_nombre(segundoNombre);
        pa.setPrimer_apellido(primerApellido);
        pa.setSegundo_apellido(segundoApellido);
        pa.setTelefono(telefono);
        pa.setEmail(email);
        pa.setEstado_pago(estado_pago);
        pa.setCedula_op(idOperador);
                
        int result = daoParticipante.guardarParticipante(pa, codEvento);
        return result;
    }
    
    public Participante consultarDatosParticipante(String id_participante) {
        
        return daoParticipante.consultarDatosParticipante(id_participante);
    }
    
    public Participantes_Eventos consultarPreinscripcion(String id_participante, String id_evento) {
        
        return daoParticipante.consultarPreinscripcion(id_participante, id_evento);
    }
    
    public int eliminarPreinscripcion(String id_participante, String id_evento) {
        
        return daoParticipante.eliminarPreinscripcion(id_participante, id_evento);
    }
    
    public int realizarPago(String id, String id_evento) {
        
        return daoParticipante.realizarPago(id, id_evento);
    }
    
    public int actualizarParticipante(String codigoConsulta, String primerNombreS, String segundoNombreS, String primerApellidoS, String segundoApellidoS, String correoS, String telefonoS) {
        
        return daoParticipante.actualizarParticipante(codigoConsulta, primerNombreS, segundoNombreS, primerApellidoS, segundoApellidoS, correoS, telefonoS);
    }
    
    public int comprobar(String codigoConsulta) {
        
        return daoParticipante.comprobar(codigoConsulta);
    }    
}