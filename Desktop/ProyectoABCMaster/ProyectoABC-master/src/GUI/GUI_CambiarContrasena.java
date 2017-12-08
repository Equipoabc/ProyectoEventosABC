package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GUI_CambiarContrasena extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorOperador controladorOperador;
    ControladorGerente controladorGerente;
    Operador operador;
    Gerente gerente;
    int validaRespuesta;
    
    public GUI_CambiarContrasena(){
        
        initComponents();        
        this.setLocationRelativeTo(null);
        controladorOperador = new ControladorOperador();
        controladorGerente = new ControladorGerente();
        operador = new Operador();
        gerente = new Gerente();
        validaciones = new Validaciones();
        nuevaC.setVisible(false);
        nuevaCon.setVisible(false);
        confirmarC.setVisible(false);
        confirmarCon.setVisible(false);
        validaRespuesta = 0;

    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        respuestaSeguridad = new javax.swing.JTextField();
        respuestaLabel12 = new javax.swing.JLabel();
        confirmarCon = new javax.swing.JPasswordField();
        pregunta = new javax.swing.JLabel();
        confirmarC = new javax.swing.JLabel();
        nuevaCon = new javax.swing.JPasswordField();
        nuevaC = new javax.swing.JLabel();
        cambiarPass = new javax.swing.JButton();
        primerNombreLabel4 = new javax.swing.JLabel();
        consultarLabel = new javax.swing.JTextField();
        botonConsultar = new javax.swing.JButton();
        preguntaLabel12 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarMed.png"))); // NOI18N
        botonCancelar.setBorder(null);
        botonCancelar.setBorderPainted(false);
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setFocusPainted(false);
        botonCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarPeq.png"))); // NOI18N
        botonCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCancelar);
        botonCancelar.setBounds(350, 310, 150, 70);

        respuestaSeguridad.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        respuestaSeguridad.setSelectionColor(new java.awt.Color(102, 102, 255));
        respuestaSeguridad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                respuestaSeguridadKeyPressed(evt);
            }
        });
        jPanel1.add(respuestaSeguridad);
        respuestaSeguridad.setBounds(440, 160, 180, 20);

        respuestaLabel12.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        respuestaLabel12.setText("Respuesta:");
        jPanel1.add(respuestaLabel12);
        respuestaLabel12.setBounds(300, 160, 150, 20);

        confirmarCon.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        confirmarCon.setSelectionColor(new java.awt.Color(102, 102, 255));
        confirmarCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmarConKeyPressed(evt);
            }
        });
        jPanel1.add(confirmarCon);
        confirmarCon.setBounds(440, 250, 180, 20);

        pregunta.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(pregunta);
        pregunta.setBounds(440, 130, 140, 20);

        confirmarC.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        confirmarC.setText("Confirmar Contraseña:");
        jPanel1.add(confirmarC);
        confirmarC.setBounds(300, 250, 150, 20);

        nuevaCon.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nuevaCon.setSelectionColor(new java.awt.Color(102, 102, 255));
        nuevaCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nuevaConKeyPressed(evt);
            }
        });
        jPanel1.add(nuevaCon);
        nuevaCon.setBounds(440, 220, 180, 20);

        nuevaC.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nuevaC.setText("Nueva Contraseña:");
        jPanel1.add(nuevaC);
        nuevaC.setBounds(300, 220, 160, 20);

        cambiarPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        cambiarPass.setBorder(null);
        cambiarPass.setBorderPainted(false);
        cambiarPass.setContentAreaFilled(false);
        cambiarPass.setFocusPainted(false);
        cambiarPass.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        cambiarPass.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        cambiarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPassActionPerformed(evt);
            }
        });
        cambiarPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cambiarPassKeyPressed(evt);
            }
        });
        jPanel1.add(cambiarPass);
        cambiarPass.setBounds(190, 310, 160, 70);

        primerNombreLabel4.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel4.setText("Ingresar Cédula:");
        jPanel1.add(primerNombreLabel4);
        primerNombreLabel4.setBounds(90, 130, 100, 40);

        consultarLabel.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        consultarLabel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(consultarLabel);
        consultarLabel.setBounds(70, 170, 140, 20);

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
        botonConsultar.setBorder(null);
        botonConsultar.setBorderPainted(false);
        botonConsultar.setContentAreaFilled(false);
        botonConsultar.setFocusPainted(false);
        botonConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarPeq.png"))); // NOI18N
        botonConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(botonConsultar);
        botonConsultar.setBounds(60, 200, 160, 70);

        preguntaLabel12.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        preguntaLabel12.setText("Pregunta:");
        jPanel1.add(preguntaLabel12);
        preguntaLabel12.setBounds(300, 130, 140, 20);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoCambiarC.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondo.setFocusable(false);
        jPanel1.add(fondo);
        fondo.setBounds(-10, 0, 710, 384);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_Login login = new GUI_Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
  
    //Inicio escuchas
    private void cambiarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPassActionPerformed
                 
        String respuesta, cedulaBusqueda,nuevaContrasena, confirmar, validar = "";  
        respuesta = respuestaSeguridad.getText();
        cedulaBusqueda = consultarLabel.getText();
        if(validaRespuesta == 0){
            if (operador != null){
                if(respuesta.equals(operador.getRespuesta())){
                    nuevaC.setVisible(true);
                    nuevaCon.setVisible(true);
                    confirmarC.setVisible(true);
                    confirmarCon.setVisible(true); 
                    validaRespuesta = 1;
                }
                else {
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta.");
                }
            }          
            else if (gerente != null){
                    if(respuesta.equals(gerente.getRespuesta())){
                        nuevaC.setVisible(true);
                        nuevaCon.setVisible(true);
                        confirmarC.setVisible(true);
                        confirmarCon.setVisible(true); 
                        validaRespuesta = 1;
                    }
                    else {
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta.");
                    }
            }             
        }
       
        else if(validaRespuesta == 1){
            nuevaContrasena = nuevaCon.getText();
            confirmar = confirmarCon.getText();
            
            if(!validaciones.validarLetrasYNumeros(nuevaContrasena) || nuevaContrasena.length() < 8) {
            JOptionPane.showMessageDialog(null, "El campos contraseña debe tener minimo 8 caracteres validos");
            }
            else if(!nuevaContrasena.equals(confirmar)){
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");   
            }
            else{
                
                if(operador != null){
                    int mensaje = controladorOperador.actualizarContrasena(operador.getCedula_op(),nuevaContrasena);
                    
                    switch (mensaje) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "La contraseña se ha actualizado.");
                            consultarLabel.setText(null);
                            nuevaCon.setText(null);
                            confirmarCon.setText(null);
                            respuestaSeguridad.setText(null);
                            pregunta.setText(null);
                            nuevaC.setVisible(false);
                            nuevaCon.setVisible(false);
                            confirmarC.setVisible(false);
                            confirmarCon.setVisible(false);
                            validaRespuesta = 0; 
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Ocurrio un error al actualizar la contraseña.");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar la contraseña.");
                            break;
                    }
                }
                else if(gerente != null){
                    int mensaje = controladorGerente.actualizarContrasena(gerente.getCedula_ge(),nuevaContrasena);
                    
                    switch (mensaje) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "La contraseña se ha actualizado.");
                            pregunta.setText(null);
                            respuestaSeguridad.setText(null);
                            consultarLabel.setText(null);
                            nuevaCon.setText(null);
                            confirmarCon.setText(null);
                            nuevaC.setVisible(false);
                            nuevaCon.setVisible(false);
                            confirmarC.setVisible(false);
                            confirmarCon.setVisible(false);
                            validaRespuesta = 0; 
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Ocurrio un error al actualizar la contraseña.");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar la contraseña.");
                            break;
                    }                    
                }
                
            }
          
        }
  
    }//GEN-LAST:event_cambiarPassActionPerformed

    private void nuevaConKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevaConKeyPressed
     
    }//GEN-LAST:event_nuevaConKeyPressed

    private void confirmarConKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmarConKeyPressed
       
    }//GEN-LAST:event_confirmarConKeyPressed

    private void respuestaSeguridadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respuestaSeguridadKeyPressed
 
    }//GEN-LAST:event_respuestaSeguridadKeyPressed

    private void cambiarPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cambiarPassKeyPressed
     
    }//GEN-LAST:event_cambiarPassKeyPressed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        operador = new Operador();
        gerente = new Gerente();      
        String cedula = consultarLabel.getText();
        if (cedula.equals("")) {

            JOptionPane.showMessageDialog(null, "El campo cédula de la consulta esta vacio.");
            consultarLabel.setText(null);
        } else if (!validaciones.validarNumero(cedula)) {

            JOptionPane.showMessageDialog(null, "El campo cédula de la consulta debe ser numérico.");
            consultarLabel.setText(null);
        } else {

            operador = controladorOperador.consultarDatosOperador(cedula);
            gerente = controladorGerente.consultarDatosGerente(cedula);      

            if (operador != null ){

                pregunta.setText(operador.getPregunta());

            } else if (gerente != null) {
                pregunta.setText(gerente.getPregunta());
            } else {

                JOptionPane.showMessageDialog(null, "El usuario no existe.");
                consultarLabel.setText(null);
            }
        }
    }//GEN-LAST:event_botonConsultarActionPerformed
    //Fin escuchas
    
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_CrearUsuario().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton cambiarPass;
    private javax.swing.JLabel confirmarC;
    private javax.swing.JPasswordField confirmarCon;
    private javax.swing.JTextField consultarLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nuevaC;
    private javax.swing.JPasswordField nuevaCon;
    private javax.swing.JLabel pregunta;
    private javax.swing.JLabel preguntaLabel12;
    private javax.swing.JLabel primerNombreLabel4;
    private javax.swing.JLabel respuestaLabel12;
    private javax.swing.JTextField respuestaSeguridad;
    // End of variables declaration//GEN-END:variables
}