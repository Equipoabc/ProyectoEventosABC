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

public class GUI_ModificarEvento extends javax.swing.JFrame {
    
    Validaciones validaciones;
    DateFormat df = DateFormat.getDateInstance();
    ControladorEvento controladorEvento;
    ControladorOperador controladorOperador;
    ControladorGerente controladorGerente;
    Operador operador;
    Gerente gerente;
    Evento evento;
    
    public GUI_ModificarEvento() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorEvento = new ControladorEvento();
        controladorOperador = new ControladorOperador();
        controladorGerente = new ControladorGerente();
        evento = new Evento();
        validaciones = new Validaciones();
        fecha.setMinSelectableDate(GetDateNow());
        fecha.getDateEditor().setEnabled(false);
    }
    
    private Date GetDateNow() {
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
    }
    
    public static Date parseFecha(String fecha){ 
        
        fecha = fecha.replace("-","/") ; 
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd"); 
        Date fechaDate = null; 
        try {
            fechaDate = formato.parse(fecha); 
        } 
        catch (ParseException ex) 
        { 
            System.out.println("Error: " + ex); 
        } 
        return fechaDate; 
    }
    
    public String organizarFecha(String fecha){
        
        String[] arreglo = fecha.split("/");
        return arreglo[2] + "-" + arreglo[1] + "-" + arreglo[0];
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        primerNombreLabel8 = new javax.swing.JLabel();
        lugar = new javax.swing.JTextField();
        primerNombreLabel7 = new javax.swing.JLabel();
        primerNombreLabel6 = new javax.swing.JLabel();
        primerNombreLabel4 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        primerNombreLabel2 = new javax.swing.JLabel();
        tema = new javax.swing.JTextField();
        primerNombreLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        consultarLabel = new javax.swing.JTextField();
        botonConsultar = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        botonAceptar = new javax.swing.JButton();
        primerNombreLabel10 = new javax.swing.JLabel();
        cupos = new javax.swing.JSpinner();
        horas = new javax.swing.JComboBox<>();
        primerNombreLabel9 = new javax.swing.JLabel();
        minutos = new javax.swing.JComboBox<>();
        primerNombreLabel11 = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
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
        botonCancelar.setBounds(460, 360, 190, 80);

        primerNombreLabel8.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel8.setText("Cupos:");
        jPanel1.add(primerNombreLabel8);
        primerNombreLabel8.setBounds(520, 160, 100, 30);

        lugar.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        lugar.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(lugar);
        lugar.setBounds(590, 260, 150, 20);

        primerNombreLabel7.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel7.setText("Tema:");
        jPanel1.add(primerNombreLabel7);
        primerNombreLabel7.setBounds(520, 310, 100, 30);

        primerNombreLabel6.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel6.setText("Duración:");
        jPanel1.add(primerNombreLabel6);
        primerNombreLabel6.setBounds(520, 210, 70, 30);

        primerNombreLabel4.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel4.setText("Ingresar Código:");
        jPanel1.add(primerNombreLabel4);
        primerNombreLabel4.setBounds(70, 180, 100, 40);

        precio.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        precio.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(precio);
        precio.setBounds(320, 270, 150, 20);

        primerNombreLabel2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel2.setText("Precio:");
        jPanel1.add(primerNombreLabel2);
        primerNombreLabel2.setBounds(260, 270, 100, 30);

        tema.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        tema.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(tema);
        tema.setBounds(590, 310, 150, 20);

        primerNombreLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel1.setText("Fecha:");
        jPanel1.add(primerNombreLabel1);
        primerNombreLabel1.setBounds(260, 220, 100, 30);

        nombre.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        nombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(nombre);
        nombre.setBounds(320, 170, 150, 20);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(260, 170, 100, 30);

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

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fecha);
        fecha.setBounds(320, 220, 150, 20);

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
        botonAceptar.setBounds(350, 370, 160, 60);

        primerNombreLabel10.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel10.setText("Lugar:");
        jPanel1.add(primerNombreLabel10);
        primerNombreLabel10.setBounds(520, 260, 100, 30);

        cupos.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        cupos.setAutoscrolls(true);
        cupos.setFocusable(false);
        jPanel1.add(cupos);
        cupos.setBounds(590, 160, 60, 30);

        horas.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        horas.setForeground(new java.awt.Color(102, 102, 255));
        horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        horas.setFocusable(false);
        jPanel1.add(horas);
        horas.setBounds(590, 210, 50, 20);

        primerNombreLabel9.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel9.setText("Horas");
        jPanel1.add(primerNombreLabel9);
        primerNombreLabel9.setBounds(640, 210, 40, 20);

        minutos.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        minutos.setForeground(new java.awt.Color(102, 102, 255));
        minutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "15", "30", "45" }));
        minutos.setFocusable(false);
        minutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutosActionPerformed(evt);
            }
        });
        jPanel1.add(minutos);
        minutos.setBounds(680, 210, 50, 20);

        primerNombreLabel11.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel11.setText("Minutos");
        jPanel1.add(primerNombreLabel11);
        primerNombreLabel11.setBounds(740, 210, 50, 20);

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarMed.png"))); // NOI18N
        botonEliminar.setBorderPainted(false);
        botonEliminar.setContentAreaFilled(false);
        botonEliminar.setFocusPainted(false);
        botonEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarPeq.png"))); // NOI18N
        botonEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminar);
        botonEliminar.setBounds(60, 320, 120, 40);

        fondo.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoModificarEvento.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(fondo);
        fondo.setBounds(0, 0, 790, 450);

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
        String id_evento = consultarLabel.getText(), duracion;
        
        if (id_evento.equals("")) {
            
            JOptionPane.showMessageDialog(null, "El campo de la consulta esta vacio.");
        } else if (!validaciones.validarNumero(id_evento)) {
            
            JOptionPane.showMessageDialog(null, "El campo consultar debe ser numerico.");
        } else {
            
            evento = controladorEvento.consultarDatosEvento(id_evento);
            
            if (evento != null) {
                
                nombre.setText(evento.getNombre_evento());
                fecha.setDate(parseFecha(evento.getFecha()));
                precio.setText(evento.getPrecio());
                cupos.setValue(Integer.parseInt(evento.getCupos()));
                duracion = evento.getDuracion();
                if(duracion != null){
                    String[] arreglo = duracion.split(":");
                    for(int i = 0; i < horas.getItemCount(); i++){
                        String item = (String) horas.getItemAt(i);
                        if (item.equals(arreglo[0])){
                            horas.setSelectedIndex(i);
                            break;
                        }
                    }
                    for(int i = 0; i < minutos.getItemCount(); i++){
                        String item = (String) minutos.getItemAt(i);
                        if (item.equals(arreglo[1])){
                            minutos.setSelectedIndex(i);
                            break;
                        }
                    }
                }
                else {
                    horas.setSelectedIndex(0);
                    minutos.setSelectedIndex(0);
                }
                lugar.setText(evento.getLugar());
                tema.setText(evento.getTema());
                
                JOptionPane.showMessageDialog(null, "Los datos del evento se han cargado exitosamente.");
                
            } else {
                
                JOptionPane.showMessageDialog(null, "El evento no existe.");
                
                nombre.setText(null);
                precio.setText(null);
                cupos.setValue(0);
                horas.setSelectedIndex(0);
                minutos.setSelectedIndex(0);
                lugar.setText(null);
                tema.setText(null);
            }
        }
        
    }//GEN-LAST:event_botonConsultarActionPerformed
    
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        String codigoConsulta, fechaS = "", nombreS, precioS, cuposS, minutosS, duracion, horasS, lugarS, temaS = "", validar = "";
        
        nombreS = nombre.getText();
        precioS = precio.getText();
        cuposS = cupos.getValue().toString();
        horasS = (String)horas.getSelectedItem();
        minutosS = (String)minutos.getSelectedItem();
        duracion = horasS + ":" + minutosS + ":00";
        lugarS = lugar.getText();
        
        try {
            fechaS = new SimpleDateFormat("dd/MM/YYYY").format(fecha.getDate());
        } catch(Exception e){
            validar = "\nDebe ingresar una fecha válida.";
        }
        temaS = tema.getText();
        codigoConsulta = consultarLabel.getText();
        
        if ( nombreS.equals("") || fechaS.equals("") || precioS.equals("") || lugarS.equals("")
                || codigoConsulta.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios." + validar);
        } else if(Integer.parseInt(cuposS) < 0){
            JOptionPane.showMessageDialog(null, "No se pueden asignar cupos negativos a un evento.");
        } else if (!validaciones.validarLetras(temaS)){
            JOptionPane.showMessageDialog(null, "El campo tema deben ser de solo letras.");
        } else if(!validaciones.validarLetrasYNumerosEspacios(nombreS)){
            JOptionPane.showMessageDialog(null, "El campo nombre deben ser de solo letras, numeros y espacios.");
        } else if ( !validaciones.validarNumero(codigoConsulta)
                || !validaciones.validarNumero(precioS) || !validaciones.validarNumero(cuposS)) {
            JOptionPane.showMessageDialog(null, "Los campos de codigo, precio y cupos deben ser de solo numeros.");
        } else {
            
            if(controladorEvento.comprobar(codigoConsulta) == 1){
                fechaS = organizarFecha(fechaS);
                
                if (nombreS.equals(evento.getNombre_evento()) 
                        && precioS.equals(evento.getPrecio()) && cuposS.equals(evento.getCupos())
                        && duracion.equals(evento.getDuracion()) && lugarS.equals(evento.getLugar())
                        && temaS.equals(evento.getTema()) && fechaS.equals(evento.getFecha())){
                    JOptionPane.showMessageDialog(null, "No se ha modificado ningun campo.");
                } else {
                    int numFilas = controladorEvento.actualizarEvento(codigoConsulta, nombreS, precioS, cuposS,
                            duracion, lugarS, temaS, fechaS);
                    
                    switch (numFilas) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Los datos del evento se han modificado exitosamente.");
                            consultarLabel.setText(null);                            
                            nombre.setText(null);
                            precio.setText(null);
                            cupos.setValue(0);
                            horas.setSelectedIndex(0);
                            minutos.setSelectedIndex(0);
                            lugar.setText(null);
                            tema.setText(null);
                            fecha.setDate(null);
                            botonAceptar.setEnabled(false);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar el evento.");
                            break;
                    }
                }
            }
            
            else{
                JOptionPane.showMessageDialog(null, "El evento que desea modificar no existe.");
            }
        }
    }//GEN-LAST:event_botonAceptarActionPerformed
    
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed

        String id_evento = consultarLabel.getText();
        
        if (id_evento.equals("")){
            
            JOptionPane.showMessageDialog(null, "No ha ingresado ningún evento.");
        } else if (!validaciones.validarNumero(id_evento)){
            
            JOptionPane.showMessageDialog(null, "El campo debe ser numerico.");
        } else {
            
            evento = controladorEvento.consultarDatosEvento(id_evento);
            
            if(evento != null){
                
                int opcion = 5;
                opcion = JOptionPane.showConfirmDialog(null, "Está seguro que desea borrar este evento: \n" + evento.getNombre_evento() + "?", "Confirmar eliminación", JOptionPane.OK_CANCEL_OPTION);
                
                if(opcion == 0){
                    
                    int numFilas = controladorEvento.eliminarEvento(id_evento);
                    
                    if (numFilas == 1){
                        
                        JOptionPane.showMessageDialog(null, "El evento "+ evento.getNombre_evento() + " ha sido eliminado.");
                    }
                    else{
                        
                        JOptionPane.showMessageDialog(null, "Hubo un error eliminando el evento.");
                    }
                }
            } else {
                
                JOptionPane.showMessageDialog(null, "El evento " + id_evento + " no existe.");
            }
        }        
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void minutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutosActionPerformed
    
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
                
                new GUI_ModificarEvento().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JTextField consultarLabel;
    private javax.swing.JSpinner cupos;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> horas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lugar;
    private javax.swing.JComboBox<String> minutos;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel primerNombreLabel1;
    private javax.swing.JLabel primerNombreLabel10;
    private javax.swing.JLabel primerNombreLabel11;
    private javax.swing.JLabel primerNombreLabel2;
    private javax.swing.JLabel primerNombreLabel4;
    private javax.swing.JLabel primerNombreLabel6;
    private javax.swing.JLabel primerNombreLabel7;
    private javax.swing.JLabel primerNombreLabel8;
    private javax.swing.JLabel primerNombreLabel9;
    private javax.swing.JLabel segundoNombreLabel;
    private javax.swing.JTextField tema;
    // End of variables declaration//GEN-END:variables
}