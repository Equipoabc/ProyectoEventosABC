
package GUI;
import Controladores.*;
import javax.swing.*;
import Logica.*;
import com.itextpdf.text.DocumentException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI_Certificados extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorParticipante controladorParticipante;
    ControladorEvento controladorEvento;
    Participantes_Eventos participanteEvento;
    Participante participante;
    Evento evento;
    
    public GUI_Certificados(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorParticipante = new ControladorParticipante();
        controladorEvento = new ControladorEvento();
        participanteEvento = new Participantes_Eventos();
        participante = new Participante();
        evento = new Evento();
        validaciones = new Validaciones();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codEvento = new javax.swing.JTextField();
        codEventoLabel = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        descargar = new javax.swing.JButton();
        generar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        cedulaLabel3 = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        eventoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        codEvento.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        codEvento.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(codEvento);
        codEvento.setBounds(530, 260, 150, 30);

        codEventoLabel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        codEventoLabel.setText("Ingresar código evento:");
        jPanel1.add(codEventoLabel);
        codEventoLabel.setBounds(530, 210, 190, 34);

        cedula.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        cedula.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cedula);
        cedula.setBounds(530, 160, 150, 30);

        descargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DescargarMed.png"))); // NOI18N
        descargar.setBorder(null);
        descargar.setBorderPainted(false);
        descargar.setContentAreaFilled(false);
        descargar.setFocusPainted(false);
        descargar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DescargarPeq.png"))); // NOI18N
        descargar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Descargar.png"))); // NOI18N
        descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarActionPerformed(evt);
            }
        });
        descargar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descargarKeyPressed(evt);
            }
        });
        jPanel1.add(descargar);
        descargar.setBounds(480, 350, 140, 90);

        generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GenerarMed.png"))); // NOI18N
        generar.setBorder(null);
        generar.setBorderPainted(false);
        generar.setContentAreaFilled(false);
        generar.setFocusPainted(false);
        generar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GenerarPeq.png"))); // NOI18N
        generar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Generar.png"))); // NOI18N
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        generar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                generarKeyPressed(evt);
            }
        });
        jPanel1.add(generar);
        generar.setBounds(540, 280, 140, 90);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarMed.png"))); // NOI18N
        cancelar.setBorder(null);
        cancelar.setBorderPainted(false);
        cancelar.setContentAreaFilled(false);
        cancelar.setFocusPainted(false);
        cancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarPeq.png"))); // NOI18N
        cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar);
        cancelar.setBounds(610, 350, 140, 90);

        cedulaLabel3.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        cedulaLabel3.setText("Ingresar cédula:");
        jPanel1.add(cedulaLabel3);
        cedulaLabel3.setBounds(530, 120, 200, 30);

        nombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(nombreLabel);
        nombreLabel.setBounds(140, 260, 230, 30);

        fecha.setFont(new java.awt.Font("Cambria", 2, 8)); // NOI18N
        jPanel1.add(fecha);
        fecha.setBounds(350, 300, 80, 20);

        eventoLabel.setFont(new java.awt.Font("Cambria", 2, 8)); // NOI18N
        eventoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(eventoLabel);
        eventoLabel.setBounds(220, 300, 80, 20);

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoCertificados.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setFocusable(false);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 760, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void descargarCertificado(){
        
        String id_participante = cedula.getText();
        String id_evento = codEvento.getText();
        String nombre = "";
        String nombreEvento = "";
        String ced="";
        String fec="";
        Reportes certificado = new Reportes();
        
        if (id_evento.equals("") || id_participante.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        } else if (!validaciones.validarNumero(id_evento) || !validaciones.validarNumero(id_participante)) {
            
            JOptionPane.showMessageDialog(null, "Los campos deben ser númericos.");
        } else {
            
            participanteEvento = controladorParticipante.consultarPreinscripcion(id_participante, id_evento);
            participante = controladorParticipante.consultarDatosParticipante(id_participante);
            evento = controladorEvento.consultarDatosEvento(id_evento);
            
            if (participante == null) {
                JOptionPane.showMessageDialog(null, "El participante no existe.");
            }
            else if (evento == null){
                JOptionPane.showMessageDialog(null, "El evento no existe.");
            }
            else if (participanteEvento.getEstado_pago().equals("Invalido")){
                JOptionPane.showMessageDialog(null, "El participante no ha realizado el pago.");
            }
            else if (participanteEvento == null){
                nombre = participante.getPrimer_nombre()+" "+ participante.getSegundo_nombre()
                        + " "+participante.getPrimer_apellido() + " "+ participante.getSegundo_apellido();
                JOptionPane.showMessageDialog(null, "El participante "+ nombre +" no se"
                        + " encuentra inscrito en el evento "+ evento.getNombre_evento() +".");
            }
            
            else {
                nombre = participante.getPrimer_nombre()+" "+ participante.getSegundo_nombre()
                        + " "+participante.getPrimer_apellido() + " "+ participante.getSegundo_apellido();
                ced = participante.getCedula_pa();
                evento = controladorEvento.consultarDatosEvento(id_evento);
                nombreEvento = evento.getNombre_evento();
                fec = evento.getFecha();
                try {
                    certificado.imprimirCertificado(nombre,ced,nombreEvento,fec);
                    JOptionPane.showMessageDialog(null, "El certificado de "+nombre+" se ha generado correctamente");
                } catch (IOException | DocumentException ex) {
                    Logger.getLogger(GUI_Certificados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
    }
    
    private void descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarActionPerformed
        
        descargarCertificado();        
    }//GEN-LAST:event_descargarActionPerformed
    
    private void generarVistaPrevia(){
        
        String id_participante = cedula.getText();
        String id_evento = codEvento.getText();
        
        if (id_evento.equals("") || id_participante.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        } else if (!validaciones.validarNumero(id_evento) || !validaciones.validarNumero(id_participante)) {
            
            JOptionPane.showMessageDialog(null, "Los campos deben ser númericos.");
        } else {
            
            participanteEvento = controladorParticipante.consultarPreinscripcion(id_participante, id_evento);
            participante = controladorParticipante.consultarDatosParticipante(id_participante);
            evento = controladorEvento.consultarDatosEvento(id_evento);
            
            if (participanteEvento != null) {
                
                nombreLabel.setText(participante.getPrimer_nombre()+ " "+ participante.getSegundo_nombre() + " " +
                        participante.getPrimer_apellido() + " " + participante.getSegundo_apellido());
                fecha.setText(evento.getFecha());
                eventoLabel.setText(evento.getNombre_evento());
                
            } else if (participante != null){
                
                JOptionPane.showMessageDialog(null, "El participante "+ id_participante +" no se"
                        + " encuentra inscrito en el evento "+ id_evento+".");
                
            } else {
                JOptionPane.showMessageDialog(null, "El participante no existe.");
                
                cedula.setText(null);
                codEvento.setText(null);
            }
        }
    }
    
    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        
        generarVistaPrevia();
    }//GEN-LAST:event_generarActionPerformed
    
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        
        GUI_Operador oper = new GUI_Operador();
        oper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed
    
    private void generarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_generarKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            generarVistaPrevia();
        }
    }//GEN-LAST:event_generarKeyPressed
    
    private void descargarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descargarKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            descargarCertificado();
        }
    }//GEN-LAST:event_descargarKeyPressed
    
    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_Certificados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel cedulaLabel3;
    private javax.swing.JTextField codEvento;
    private javax.swing.JLabel codEventoLabel;
    private javax.swing.JButton descargar;
    private javax.swing.JLabel eventoLabel;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton generar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreLabel;
    // End of variables declaration//GEN-END:variables

}