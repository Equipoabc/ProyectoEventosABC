/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controladores.*;
import static GUI.GUI_ModificarEvento.parseFecha;
import Logica.*;
import Logica.Validaciones;
import java.text.*;
import javax.swing.JOptionPane;

public class GUI_ModificarSede extends javax.swing.JFrame {

    Validaciones validaciones;
    DateFormat df = DateFormat.getDateInstance();
    ControladorOperador controladorOperador;
    ControladorGerente controladorGerente;
    Operador operador;
    Gerente gerente;
    Sede sede;
    ControladorSede controladorSede;

    public GUI_ModificarSede() {

        initComponents();
        this.setLocationRelativeTo(null);
        controladorOperador = new ControladorOperador();
        controladorGerente = new ControladorGerente();
        controladorSede = new ControladorSede();
        validaciones = new Validaciones();
        botonAceptar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        primerNombreLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        ingresarCodigoLabel = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        telefonoLabel = new javax.swing.JLabel();
        carrera = new javax.swing.JTextField();
        barrioLabel = new javax.swing.JLabel();
        ciudad = new javax.swing.JTextField();
        ciudadLabel1 = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        consultarLabel = new javax.swing.JTextField();
        botonConsultar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        calle = new javax.swing.JTextField();
        barrio = new javax.swing.JTextField();
        calleLabel = new javax.swing.JLabel();
        carreraLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        primerNombreLabel5.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel5.setText("Calle:");

        jLabel3.setText("jLabel3");

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
        botonCancelar.setBounds(460, 360, 190, 80);

        ingresarCodigoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        ingresarCodigoLabel.setText("Ingresar Código:");
        jPanel1.add(ingresarCodigoLabel);
        ingresarCodigoLabel.setBounds(100, 180, 100, 40);

        telefono.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        telefono.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(telefono);
        telefono.setBounds(450, 340, 170, 20);

        telefonoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        telefonoLabel.setText("Teléfono:");
        jPanel1.add(telefonoLabel);
        telefonoLabel.setBounds(340, 333, 130, 30);

        carrera.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        carrera.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(carrera);
        carrera.setBounds(450, 260, 170, 20);

        barrioLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        barrioLabel.setText("Barrio:");
        jPanel1.add(barrioLabel);
        barrioLabel.setBounds(340, 295, 100, 30);

        ciudad.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        ciudad.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(ciudad);
        ciudad.setBounds(450, 180, 170, 20);

        ciudadLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        ciudadLabel1.setText("Ciudad:");
        jPanel1.add(ciudadLabel1);
        ciudadLabel1.setBounds(340, 180, 170, 30);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("Nombre:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(340, 100, 170, 30);

        consultarLabel.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        consultarLabel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(consultarLabel);
        consultarLabel.setBounds(80, 220, 140, 20);

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
        botonConsultar.setBounds(70, 250, 160, 70);

        nombre.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        nombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(nombre);
        nombre.setBounds(450, 100, 170, 20);

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
        botonAceptar.setBounds(320, 370, 160, 60);

        calle.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        calle.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(calle);
        calle.setBounds(450, 220, 170, 20);

        barrio.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        barrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barrioActionPerformed(evt);
            }
        });
        jPanel1.add(barrio);
        barrio.setBounds(450, 300, 170, 21);

        calleLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        calleLabel.setText("Calle:");
        jPanel1.add(calleLabel);
        calleLabel.setBounds(340, 220, 100, 30);

        carreraLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        carreraLabel.setText("Carrera:");
        jPanel1.add(carreraLabel);
        carreraLabel.setBounds(340, 255, 100, 30);

        jLabel2.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoModificarSede.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 790, 450);

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

        GUI_Gerente gerenteGUI = new GUI_Gerente();
        gerenteGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed

        botonAceptar.setEnabled(true);
        String codigoConsultar = consultarLabel.getText(), duracion;
        
        if (codigoConsultar.equals("")) {
            
            JOptionPane.showMessageDialog(null, "El campo de la consulta esta vacio.");
        } else if (!validaciones.validarNumero(codigoConsultar)) {
            
            JOptionPane.showMessageDialog(null, "El campo consultar debe ser numerico.");
        } else {
            
            sede = controladorSede.consultarDatosSede(codigoConsultar);
            
            if (sede != null) {

                nombre.setText(sede.getNombre_sede());
                ciudad.setText(sede.getCiudad());
                carrera.setText(sede.getCarrera());
                calle.setText(sede.getCalle());
                barrio.setText(sede.getBarrio()); 
                telefono.setText(sede.getTelefono());
                
                
            } else {
                
                JOptionPane.showMessageDialog(null, "La sede no existe.");
                
                nombre.setText(null);
                ciudad.setText(null);
                carrera.setText(null);
                calle.setText(null);
                barrio.setText(null);
                telefono.setText(null);
                consultarLabel.setText(null);
            }
        }      
    }//GEN-LAST:event_botonConsultarActionPerformed
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed

        String codigoConsulta, codigoS, nombreS, ciudadS, carreraS, calleS, barrioS, telefonoS;
        
        nombreS = nombre.getText();
        ciudadS = ciudad.getText();
        carreraS = carrera.getText();
        calleS = calle.getText();
        barrioS = barrio.getText(); // Si null :v
        telefonoS = telefono.getText();
        codigoConsulta = consultarLabel.getText();
        
        if (nombreS.equals("") || ciudadS.equals("") || carreraS.equals("") || calleS.equals("")
                || telefonoS.equals("") || codigoConsulta.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        }         else if(!validaciones.validarLetrasYNumerosEspacios(nombreS) || !validaciones.validarLetrasYNumerosEspacios(barrioS)) {
            JOptionPane.showMessageDialog(null, "Los campos nombre y barrio deben ser de solo letras, numeros y espacios.");
        }
        else if( !validaciones.validarNumero(telefonoS)) {
            JOptionPane.showMessageDialog(null, "Los campos codigo y telefono solo pueden ser números.");
        }
        else if(!validaciones.validarLetrasEspacios(ciudadS)) {
            JOptionPane.showMessageDialog(null, "El campo ciudad solo pueden ser de solo letras y espacios.");
        }
        else if(!validaciones.validarLetrasYNumerosEspaciosSimbolos(carreraS) || !validaciones.validarLetrasYNumerosEspaciosSimbolos(calleS)) {
            JOptionPane.showMessageDialog(null, "Ha ingresado caracteres invalidos, en carrera y calle solo se puede usar los caracteres espaciales '.' y '-', letras, numeros y espacios.");
        } else {
                       
            if (nombreS.equals(sede.getNombre_sede()) 
                    && ciudadS.equals(sede.getCiudad()) && carreraS.equals(sede.getCarrera())
                    && calleS.equals(sede.getCalle()) && barrioS.equals(sede.getBarrio())
                    && telefonoS.equals(sede.getTelefono())){                
                JOptionPane.showMessageDialog(null, "No se ha modificado ningun campo.");
            } else {                
                if(controladorSede.comprobar(codigoConsulta) == 1){
                    int numFilas = controladorSede.actualizarSede(codigoConsulta, nombreS, ciudadS,
                        carreraS, calleS, barrioS, telefonoS);
                
                switch (numFilas) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Los datos de la sede se han modificado exitosamente.");


                        nombre.setText(null);
                        ciudad.setText(null);
                        carrera.setText(null);
                        calle.setText(null);
                        barrio.setText(null);
                        telefono.setText(null);
                        consultarLabel.setText(null);
                        botonAceptar.setEnabled(false);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "El codigo de la sede ha actualizar ya se encuentra registrado.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar la sede.");
                        break;
                }
            }
                            else{
                JOptionPane.showMessageDialog(null, "La sede que desea modificar no existe.");
            }
            }
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void barrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barrioActionPerformed

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
    private javax.swing.JTextField barrio;
    private javax.swing.JLabel barrioLabel;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JTextField calle;
    private javax.swing.JLabel calleLabel;
    private javax.swing.JTextField carrera;
    private javax.swing.JLabel carreraLabel;
    private javax.swing.JTextField ciudad;
    private javax.swing.JLabel ciudadLabel1;
    private javax.swing.JTextField consultarLabel;
    private javax.swing.JLabel ingresarCodigoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JLabel primerNombreLabel5;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel telefonoLabel;
    // End of variables declaration//GEN-END:variables
}
