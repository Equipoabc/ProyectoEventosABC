/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package GUI;

import Controladores.*;
import Logica.*;
import Logica.Validaciones;
import java.text.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class GUI_ModificarUsuario extends javax.swing.JFrame {
    
    Validaciones validaciones;
    DateFormat df = DateFormat.getDateInstance();
    ControladorOperador controladorOperador;
    ControladorGerente controladorGerente;
    Operador operador;
    Gerente gerente;
    
    public GUI_ModificarUsuario() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorOperador = new ControladorOperador();
        controladorGerente = new ControladorGerente();
        validaciones = new Validaciones();
        botonAceptar.setEnabled(false);
    }
    
    private Date GetDateNow() {
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
    }
    
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        correo = new javax.swing.JTextField();
        primerNombreLabel8 = new javax.swing.JLabel();
        cel = new javax.swing.JTextField();
        primerNombreLabel7 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        primerNombreLabel6 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();
        primerNombreLabel4 = new javax.swing.JLabel();
        segundoAp = new javax.swing.JTextField();
        primerNombreLabel2 = new javax.swing.JLabel();
        primerAp = new javax.swing.JTextField();
        primerNombreLabel1 = new javax.swing.JLabel();
        segundoNom = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        consultarLabel = new javax.swing.JTextField();
        botonConsultar = new javax.swing.JButton();
        primerNom = new javax.swing.JTextField();
        primerNombreLabel9 = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        primerNombreLabel10 = new javax.swing.JLabel();
        tipoUsuario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(792, 480));
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
        botonCancelar.setBounds(510, 370, 190, 80);

        correo.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(correo);
        correo.setBounds(630, 140, 140, 20);

        primerNombreLabel8.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel8.setText("Email:");
        jPanel1.add(primerNombreLabel8);
        primerNombreLabel8.setBounds(520, 140, 120, 30);

        cel.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        cel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cel);
        cel.setBounds(630, 240, 140, 20);

        primerNombreLabel7.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel7.setText("Estado:");
        jPanel1.add(primerNombreLabel7);
        primerNombreLabel7.setBounds(520, 290, 130, 30);

        tel.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        tel.setSelectionColor(new java.awt.Color(102, 102, 255));
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        jPanel1.add(tel);
        tel.setBounds(630, 190, 140, 20);

        primerNombreLabel6.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel6.setText("Teléfono:");
        jPanel1.add(primerNombreLabel6);
        primerNombreLabel6.setBounds(520, 190, 140, 30);

        estado.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        estado.setForeground(new java.awt.Color(102, 102, 255));
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        estado.setFocusable(false);
        jPanel1.add(estado);
        estado.setBounds(630, 290, 140, 28);

        primerNombreLabel4.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel4.setText("Ingresar Cédula:");
        jPanel1.add(primerNombreLabel4);
        primerNombreLabel4.setBounds(70, 180, 100, 40);

        segundoAp.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        segundoAp.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoAp);
        segundoAp.setBounds(340, 300, 150, 20);

        primerNombreLabel2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel2.setText("Segundo Apellido:");
        jPanel1.add(primerNombreLabel2);
        primerNombreLabel2.setBounds(230, 300, 180, 30);

        primerAp.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        primerAp.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerAp);
        primerAp.setBounds(340, 250, 150, 20);

        primerNombreLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel1.setText("Primer Apellido:");
        jPanel1.add(primerNombreLabel1);
        primerNombreLabel1.setBounds(230, 250, 170, 30);

        segundoNom.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        segundoNom.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoNom);
        segundoNom.setBounds(340, 200, 150, 20);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Segundo Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(230, 200, 180, 30);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("Primer Nombre:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(230, 150, 170, 30);

        consultarLabel.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        consultarLabel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(consultarLabel);
        consultarLabel.setBounds(50, 220, 140, 20);

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
        botonConsultar.setBounds(40, 250, 160, 70);

        primerNom.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        primerNom.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerNom);
        primerNom.setBounds(340, 150, 150, 20);

        primerNombreLabel9.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel9.setText("Tipo de Usuario:");
        jPanel1.add(primerNombreLabel9);
        primerNombreLabel9.setBounds(230, 100, 170, 30);

        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        botonAceptar.setBorder(null);
        botonAceptar.setBorderPainted(false);
        botonAceptar.setContentAreaFilled(false);
        botonAceptar.setFocusPainted(false);
        botonAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        botonAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAceptar);
        botonAceptar.setBounds(380, 380, 160, 60);

        primerNombreLabel10.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel10.setText("Celular:");
        jPanel1.add(primerNombreLabel10);
        primerNombreLabel10.setBounds(520, 240, 130, 30);

        tipoUsuario.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        tipoUsuario.setForeground(new java.awt.Color(102, 102, 255));
        tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operador", "Gerente" }));
        tipoUsuario.setFocusable(false);
        tipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(tipoUsuario);
        tipoUsuario.setBounds(340, 100, 150, 28);

        jLabel2.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarUsuario.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 792, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_Administrador adminLogin = new GUI_Administrador();
        adminLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed
    
    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        
        botonAceptar.setEnabled(true);
        String cedula = consultarLabel.getText();
        
        if (cedula.equals("")) {
            
            JOptionPane.showMessageDialog(null, "El campo cedula de la consulta esta vacio.");
        } else if (!validaciones.validarNumero(cedula)) {
            
            JOptionPane.showMessageDialog(null, "El campo cedula de la consulta debe ser numerico.");
        } else {
            
            operador = controladorOperador.consultarDatosOperador(cedula);
            gerente = controladorGerente.consultarDatosGerente(cedula);
            Boolean comprobante = true;
            
            if(operador != null && gerente != null){
                
                if(operador.getEstado().equals("Inactivo")){
                    
                    comprobante = false;
                }
            }
            if (operador != null && comprobante){
                
                tipoUsuario.setSelectedIndex(0);
                primerNom.setText(operador.getPrimer_nombre());
                segundoNom.setText(operador.getSegundo_nombre());
                primerAp.setText(operador.getPrimer_apellido());
                segundoAp.setText(operador.getSegundo_apellido());
                correo.setText(operador.getEmail());
                tel.setText(operador.getTelefono());
                cel.setText(operador.getCelular());
                
                if (operador.getEstado().equals("Activo")) {
                    
                    estado.setSelectedIndex(0);
                } else {
                    
                    estado.setSelectedIndex(1);
                }
                
            } else if (gerente != null) {
                
                tipoUsuario.setSelectedIndex(1);
                primerNom.setText(gerente.getPrimer_nombre());
                segundoNom.setText(gerente.getSegundo_nombre());
                primerAp.setText(gerente.getPrimer_apellido());
                segundoAp.setText(gerente.getSegundo_apellido());
                correo.setText(gerente.getEmail());
                tel.setText(gerente.getTelefono());
                cel.setText(gerente.getCelular());
                
                if (gerente.getEstado().equals("Activo")) {
                    
                    estado.setSelectedIndex(0);
                } else {
                    
                    estado.setSelectedIndex(1);
                }
                
                JOptionPane.showMessageDialog(null, "Los datos del gerente se han cargado exitosamente.");
                
            } else {
                
                JOptionPane.showMessageDialog(null, "El usuario no existe.");
                
                primerNom.setText(null);
                segundoNom.setText(null);
                primerAp.setText(null);
                segundoAp.setText(null);
                tel.setText(null);
                cel.setText(null);
                correo.setText(null);
            }
        }
    }//GEN-LAST:event_botonConsultarActionPerformed
    
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        
        botonAceptar.setEnabled(false);
        String primerNombre, segundoNombre, primerApellido, segundoApellido, cedula, tipo,
                telefono, celular, email, estadoStr, cedulaBusqueda,  validar = "";     
        primerNombre = primerNom.getText();
        segundoNombre = segundoNom.getText();
        primerApellido = primerAp.getText();
        segundoApellido = segundoAp.getText();
        tipo = (String) tipoUsuario.getSelectedItem();
        telefono = tel.getText();
        celular = cel.getText();
        email = correo.getText();
        estadoStr = (String) estado.getSelectedItem();
        cedulaBusqueda = consultarLabel.getText();
        
        if (primerNombre.equals("") || primerApellido.equals("") ||  celular.equals("")
                || cedulaBusqueda.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios." + validar);
        } else if (!validaciones.validarLetras(primerNombre) || !validaciones.validarLetras(segundoNombre) || !validaciones.validarLetras(primerApellido)
                || !validaciones.validarLetras(segundoApellido)) {
            JOptionPane.showMessageDialog(null, "Los campos del nombre deben ser de solo letras.");
        } else if ( !validaciones.validarNumero(telefono)
                || !validaciones.validarNumero(cedulaBusqueda) || !validaciones.validarNumero(celular)) {
            JOptionPane.showMessageDialog(null, "Los campos de cedula, telefono y celular deben ser de solo numeros.");
        }
        else {
            
            // Operador
            if (controladorOperador.comprobar(cedulaBusqueda) == 1) {
                
                if (primerNombre.equals(operador.getPrimer_nombre()) && segundoNombre.equals(operador.getSegundo_nombre())
                        && primerApellido.equals(operador.getPrimer_apellido()) && segundoApellido.equals(operador.getSegundo_apellido())
                         && telefono.equals(operador.getTelefono())
                        && celular.equals(operador.getCelular()) && email.equals(operador.getEmail())
                        && tipo.equals("Operador") && estadoStr.equals(operador.getEstado())) {
                    
                  
                    JOptionPane.showMessageDialog(null, "No se ha modificado ningun campo");
                } else {
                    int numFilas = controladorOperador.actualizarOperador(cedulaBusqueda, primerNombre,
                            segundoNombre, primerApellido, segundoApellido,
                            telefono, celular, email, estadoStr, tipo);
                    
                    
                    switch (numFilas) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Los datos se han actualizado.");
                            consultarLabel.setText(null);
                            primerNom.setText(null);
                            segundoNom.setText(null);
                            primerAp.setText(null);
                            segundoAp.setText(null);
                            tel.setText(null);
                            cel.setText(null);
                            correo.setText(null);
                            botonAceptar.setEnabled(false);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "La cedula a actualizar corresponde a un usuario registrado.");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "La cedula a actualizar corresponde a un usuario registrado.");
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Los datos se han actualizado.");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar el operador.");
                            break;
                    }
                }
            } else if (controladorGerente.comprobar(cedulaBusqueda) == 1) {
                
                if (primerNombre.equals(gerente.getPrimer_nombre()) && segundoNombre.equals(gerente.getSegundo_nombre())
                        && primerApellido.equals(gerente.getPrimer_apellido()) && segundoApellido.equals(gerente.getSegundo_apellido())
                        && telefono.equals(gerente.getTelefono())
                        && celular.equals(gerente.getCelular()) && email.equals(gerente.getEmail())
                        && tipo.equals("Gerente") && estadoStr.equals(gerente.getEstado())) {
                    
                    JOptionPane.showMessageDialog(null, "No se ha modificado ningun campo");
                } else {
                    int numFilas = controladorGerente.actualizarGerente(cedulaBusqueda, primerNombre,
                            segundoNombre, primerApellido, segundoApellido,
                             telefono, celular, email, estadoStr, tipo);
                    
                    switch (numFilas) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Los datos se han actualizado.");
                            consultarLabel.setText(null);
                            primerNom.setText(null);
                            segundoNom.setText(null);
                            primerAp.setText(null);
                            segundoAp.setText(null);
                            tel.setText(null);
                            cel.setText(null);
                            correo.setText(null);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "La cedula a actualizar corresponde a un usuario registrado.");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "La cedula a actualizar corresponde a un usuario registrado.");
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Los datos se han actualizado.");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar el gerente.");
                            break;
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "El operador que quiere actualizar no existe.");
            }
            /*else if(tipoUsuario.equals("Gerente")) {
            
            int numFilas = controladorGerente.insertarGerente(primerNombre,
            segundoNombre, primerApellido, segundoApellido,
            cedula, fechaNacimiento, telefono, celular, email,
            contrasena, confirmar, pregunta, respuesta);
            
            switch (numFilas) {
            case 1:
            JOptionPane.showMessageDialog(null, "Gerente creado exitosamente.");
            break;
            case 5:
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            break;
            case 2:
            JOptionPane.showMessageDialog(null, "El gerente ya se encuentra registrado.");
            break;
            default:
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el gerente.");
            break;
            }
            }*/
        }
    }//GEN-LAST:event_botonAceptarActionPerformed
    
    private void tipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoUsuarioActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new GUI_CrearUsuario().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JTextField cel;
    private javax.swing.JTextField consultarLabel;
    private javax.swing.JTextField correo;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField primerAp;
    private javax.swing.JTextField primerNom;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JLabel primerNombreLabel1;
    private javax.swing.JLabel primerNombreLabel10;
    private javax.swing.JLabel primerNombreLabel2;
    private javax.swing.JLabel primerNombreLabel4;
    private javax.swing.JLabel primerNombreLabel6;
    private javax.swing.JLabel primerNombreLabel7;
    private javax.swing.JLabel primerNombreLabel8;
    private javax.swing.JLabel primerNombreLabel9;
    private javax.swing.JTextField segundoAp;
    private javax.swing.JTextField segundoNom;
    private javax.swing.JLabel segundoNombreLabel;
    private javax.swing.JTextField tel;
    private javax.swing.JComboBox<String> tipoUsuario;
    // End of variables declaration//GEN-END:variables
}
