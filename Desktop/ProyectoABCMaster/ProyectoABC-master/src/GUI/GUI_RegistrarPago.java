package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI_RegistrarPago extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorParticipante controladorParticipante;
    ControladorEvento controladorEvento;
    Evento evento;
    String id_participante, nombre_participante;
    Participante participante;
    
    public GUI_RegistrarPago(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        dinero.setVisible(false);
        dineroLabel.setVisible(false);
        cambioLabel1.setVisible(false);
        cambioLabel2.setVisible(false);
        continuarBoton.setVisible(false);
        controladorParticipante = new ControladorParticipante();
        controladorEvento = new ControladorEvento();
        evento = new Evento();
        participante = new Participante();
        validaciones = new Validaciones();
        
    }
    
    private static Date GetDateNow() {
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        codEvento = new javax.swing.JTextField();
        codEventoLabel = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        nombreLabelEditar = new javax.swing.JLabel();
        botonConsultar = new javax.swing.JButton();
        pagarEvento1 = new javax.swing.JButton();
        precioNumeroLabel = new javax.swing.JLabel();
        cedulaLabel2 = new javax.swing.JLabel();
        dinero = new javax.swing.JTextField();
        dineroLabel = new javax.swing.JLabel();
        cambioLabel1 = new javax.swing.JLabel();
        cambioLabel2 = new javax.swing.JLabel();
        continuarBoton = new javax.swing.JButton();
        nombreEventoLabel = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();
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
        botonCancelar.setBounds(620, 340, 140, 90);

        codEvento.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        codEvento.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(codEvento);
        codEvento.setBounds(470, 270, 150, 30);

        codEventoLabel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        codEventoLabel.setText("Ingresar código evento:");
        jPanel1.add(codEventoLabel);
        codEventoLabel.setBounds(460, 220, 190, 34);

        cedula.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        cedula.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cedula);
        cedula.setBounds(470, 180, 150, 30);

        nombreLabelEditar.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jPanel1.add(nombreLabelEditar);
        nombreLabelEditar.setBounds(200, 280, 260, 30);

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        botonConsultar.setBorder(null);
        botonConsultar.setBorderPainted(false);
        botonConsultar.setContentAreaFilled(false);
        botonConsultar.setFocusPainted(false);
        botonConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        botonConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(botonConsultar);
        botonConsultar.setBounds(620, 240, 140, 90);

        pagarEvento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PagarMed.png"))); // NOI18N
        pagarEvento1.setBorder(null);
        pagarEvento1.setBorderPainted(false);
        pagarEvento1.setContentAreaFilled(false);
        pagarEvento1.setFocusPainted(false);
        pagarEvento1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PagarPeq.png"))); // NOI18N
        pagarEvento1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pagar.png"))); // NOI18N
        pagarEvento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarEvento1ActionPerformed(evt);
            }
        });
        jPanel1.add(pagarEvento1);
        pagarEvento1.setBounds(470, 340, 140, 90);

        precioNumeroLabel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jPanel1.add(precioNumeroLabel);
        precioNumeroLabel.setBounds(200, 330, 260, 30);

        cedulaLabel2.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        cedulaLabel2.setText("Ingresar cédula:");
        jPanel1.add(cedulaLabel2);
        cedulaLabel2.setBounds(480, 130, 200, 30);
        jPanel1.add(dinero);
        dinero.setBounds(100, 120, 190, 20);

        dineroLabel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        dineroLabel.setText("Dinero:");
        jPanel1.add(dineroLabel);
        dineroLabel.setBounds(30, 110, 70, 30);

        cambioLabel1.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        cambioLabel1.setText("Cambio:");
        jPanel1.add(cambioLabel1);
        cambioLabel1.setBounds(30, 160, 70, 30);
        jPanel1.add(cambioLabel2);
        cambioLabel2.setBounds(110, 160, 180, 30);

        continuarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        continuarBoton.setBorder(null);
        continuarBoton.setBorderPainted(false);
        continuarBoton.setContentAreaFilled(false);
        continuarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(continuarBoton);
        continuarBoton.setBounds(300, 150, 130, 53);

        nombreEventoLabel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        nombreEventoLabel.setText("Nombre Evento:");
        jPanel1.add(nombreEventoLabel);
        nombreEventoLabel.setBounds(60, 280, 130, 30);

        precioLabel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        precioLabel.setText("Precio:");
        jPanel1.add(precioLabel);
        precioLabel.setBounds(120, 330, 90, 30);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRegistrarPago.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondo.setFocusable(false);
        jPanel1.add(fondo);
        fondo.setBounds(0, 0, 760, 450);

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
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_Operador oper = new GUI_Operador();
        oper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        
        String id = cedula.getText();
        String id_evento = codEvento.getText();
        if (id_evento.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios");
        } else if (!validaciones.validarNumero(id_evento) || !validaciones.validarNumero(id)) {
            
            JOptionPane.showMessageDialog(null, "Los campos deben ser numericos.");
        } else {
            
            evento = controladorEvento.consultarDatosEvento(id_evento);
            if(evento != null){
                nombreLabelEditar.setText(evento.getNombre_evento());
                precioNumeroLabel.setText(evento.getPrecio());
            }
            else{
                JOptionPane.showMessageDialog(null, "El evento " + id_evento + " no existe.");
            }
            
        }
        
    }//GEN-LAST:event_botonConsultarActionPerformed
    
    private void pagarEvento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarEvento1ActionPerformed
        
        String id = cedula.getText();
        String id_evento = codEvento.getText();
        if (id_evento.equals("") || id.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios");
        } else if (!validaciones.validarNumero(id_evento) || !validaciones.validarNumero(id)) {
            
            JOptionPane.showMessageDialog(null, "Los campos deben ser numericos.");
        } else {
            
            evento = controladorEvento.consultarDatosEvento(id_evento);
            int numFilas = controladorParticipante.realizarPago(id, id_evento);
            if(evento != null){
                nombreLabelEditar.setText(evento.getNombre_evento());
                precioNumeroLabel.setText(evento.getPrecio());
            }
            else{
                JOptionPane.showMessageDialog(null, "El evento " + id_evento + " no existe.");
            }
            
            switch (numFilas) {
                case 40:
                    JOptionPane.showMessageDialog(null, "El participante ya realizó este pago antes.");
                    break;
                case 33:
                    JOptionPane.showMessageDialog(null, "El participante no existe");
                    break;
                case 3:
                case 2:
                case 1:
                    JOptionPane.showMessageDialog(null, "El pago ha sido realizado.");
                    int opcion = 5;
                    opcion = JOptionPane.showConfirmDialog(null, "Desea imprimir un recibo?",
                            "Imprimir recibo", JOptionPane.OK_CANCEL_OPTION);
                    if(opcion == 0){
                        dinero.setVisible(true);
                        dineroLabel.setVisible(true);
                        cambioLabel1.setVisible(true);
                        cambioLabel2.setVisible(true);
                        continuarBoton.setVisible(true);
                        participante = controladorParticipante.consultarDatosParticipante(id);
                        
                    }
                    else{
                        cedula.setText("");
                        codEvento.setText("");
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "El participante no se encuentra registrado en este evento.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Hubo un error realizando el pago.");
                    break;
            }
            
        }
        
        
    }//GEN-LAST:event_pagarEvento1ActionPerformed
    
    private void continuarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBotonActionPerformed
        
        Reportes recibo = new Reportes();
        String cod_evento = evento.getId_evento();
        String nombre_evento = evento.getNombre_evento();
        Date fechaActual;
        fechaActual = GUI_RegistrarPago.GetDateNow();
        String fecha = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            fecha = new SimpleDateFormat("dd/MM/YYYY").format(fechaActual);
        } catch(Exception e){
            System.out.println(e);
        }
        
        String precio = evento.getPrecio();
        String money = dinero.getText();
        nombre_participante = participante.getPrimer_nombre() + " " + participante.getSegundo_nombre() + " " +
                participante.getPrimer_apellido() + " " +participante.getSegundo_apellido();
        id_participante = participante.getCedula_pa();
        if(money.equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese dinero");
        }
        else if (!validaciones.validarNumero(money)) {
            JOptionPane.showMessageDialog(null, "El dinero debe ser un número");
        }
        else {
            int plata = Integer.parseInt(money);
            int prec = Integer.parseInt(precio);
            int cambio = plata - prec;
            if(plata >= prec){
                try {
                    String cambioS;
                    cambioS = String.valueOf(cambio);
                    cambioLabel2.setText(cambioS);
                    recibo.imprimirRecibo(nombre_participante, id_participante, cod_evento, nombre_evento, precio, fecha, money, cambioS);
                    JOptionPane.showMessageDialog(null, "Recibo impreso");
                    dinero.setVisible(false);
                    dineroLabel.setVisible(false);
                    cambioLabel1.setVisible(false);
                    cambioLabel2.setVisible(false);
                    continuarBoton.setVisible(false);
                    dinero.setText("");
                    cambioLabel2.setText("");
                    cedula.setText("");
                    codEvento.setText("");
                } catch (IOException ex) {
                    Logger.getLogger(GUI_RegistrarPago.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DocumentException ex) {
                    Logger.getLogger(GUI_RegistrarPago.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No es suficiente dinero.");
            }
            
        }
    }//GEN-LAST:event_continuarBotonActionPerformed
    
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_RegistrarPago().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JLabel cambioLabel1;
    private javax.swing.JLabel cambioLabel2;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel cedulaLabel2;
    private javax.swing.JTextField codEvento;
    private javax.swing.JLabel codEventoLabel;
    private javax.swing.JButton continuarBoton;
    private javax.swing.JTextField dinero;
    private javax.swing.JLabel dineroLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreEventoLabel;
    private javax.swing.JLabel nombreLabelEditar;
    private javax.swing.JButton pagarEvento1;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JLabel precioNumeroLabel;
    // End of variables declaration//GEN-END:variables
    
}