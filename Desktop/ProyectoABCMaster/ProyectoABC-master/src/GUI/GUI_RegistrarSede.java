package GUI;
import Controladores.*;
import javax.swing.*;
import Logica.*;

public class GUI_RegistrarSede extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorSede controladorSede;
    String idGerente;
    
    public GUI_RegistrarSede(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorSede = new ControladorSede();
        validaciones = new Validaciones();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        telefono = new javax.swing.JTextField();
        idSede = new javax.swing.JTextField();
        idSedeLabel = new javax.swing.JLabel();
        direccionLabel = new javax.swing.JLabel();
        registrarSede = new javax.swing.JButton();
        calle = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        telefonoLabel = new javax.swing.JLabel();
        ciudadLabel = new javax.swing.JLabel();
        ciudad = new javax.swing.JTextField();
        calleLabel = new javax.swing.JLabel();
        carrera = new javax.swing.JTextField();
        carreraLabel = new javax.swing.JLabel();
        barrioLabel = new javax.swing.JLabel();
        barrio = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        telefono.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        telefono.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(telefono);
        telefono.setBounds(118, 320, 200, 20);

        idSede.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        idSede.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(idSede);
        idSede.setBounds(118, 110, 200, 20);

        idSedeLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        idSedeLabel.setText("ID Sede:");
        jPanel1.add(idSedeLabel);
        idSedeLabel.setBounds(58, 100, 70, 50);

        direccionLabel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        direccionLabel.setText("Dirección:");
        jPanel1.add(direccionLabel);
        direccionLabel.setBounds(380, 100, 140, 30);

        registrarSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        registrarSede.setBorder(null);
        registrarSede.setBorderPainted(false);
        registrarSede.setContentAreaFilled(false);
        registrarSede.setFocusPainted(false);
        registrarSede.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        registrarSede.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        registrarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarSedeActionPerformed(evt);
            }
        });
        jPanel1.add(registrarSede);
        registrarSede.setBounds(220, 360, 190, 80);

        calle.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        calle.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(calle);
        calle.setBounds(482, 245, 200, 20);

        nombre.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(nombre);
        nombre.setBounds(118, 180, 200, 20);

        nombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombreLabel.setText("Nombre:");
        jPanel1.add(nombreLabel);
        nombreLabel.setBounds(58, 180, 80, 30);

        telefonoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        telefonoLabel.setText("Telefono:");
        jPanel1.add(telefonoLabel);
        telefonoLabel.setBounds(58, 320, 80, 30);

        ciudadLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        ciudadLabel.setText("Ciudad:");
        jPanel1.add(ciudadLabel);
        ciudadLabel.setBounds(58, 250, 70, 30);

        ciudad.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        ciudad.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(ciudad);
        ciudad.setBounds(118, 250, 200, 20);

        calleLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        calleLabel.setText("Calle:");
        jPanel1.add(calleLabel);
        calleLabel.setBounds(380, 230, 130, 50);

        carrera.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        carrera.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(carrera);
        carrera.setBounds(478, 170, 200, 20);

        carreraLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        carreraLabel.setText("Carrera:");
        jPanel1.add(carreraLabel);
        carreraLabel.setBounds(380, 170, 120, 40);

        barrioLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        barrioLabel.setText("Barrio:");
        jPanel1.add(barrioLabel);
        barrioLabel.setBounds(380, 310, 120, 30);

        barrio.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        barrio.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(barrio);
        barrio.setBounds(486, 315, 200, 20);

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
        botonCancelar.setBounds(380, 360, 190, 80);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistrarSedeFondo .png"))); // NOI18N
        fondo.setFocusable(false);
        jPanel1.add(fondo);
        fondo.setBounds(0, 0, 780, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setIdGerente(String idGerente) {
        this.idGerente = idGerente;
    }
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_Gerente gerenteLogin = new GUI_Gerente();
        gerenteLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void registrarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarSedeActionPerformed
        
        String nom, id, ciu, tel, cra, cl, bar;
        nom = nombre.getText();
        id = idSede.getText();
        ciu = ciudad.getText();
        tel = telefono.getText();
        cra = carrera.getText();
        bar = barrio.getText();
        cl = calle.getText();
        
        if (nom.equals("") || id.equals("") || ciu.equals("") || cra.equals("") ||
                bar.equals("") || cl.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        }
        else if(!validaciones.validarLetrasYNumerosEspacios(nom)) {
            JOptionPane.showMessageDialog(null, "El campo nombre tiene caracteres invalidos.");
        }
        else if(!validaciones.validarNumero(id) || !validaciones.validarNumero(tel)) {
            JOptionPane.showMessageDialog(null, "Los campos ID y telefono solo pueden ser números");
        }
        else if(!validaciones.validarLetrasEspacios(ciu) || !validaciones.validarLetrasYNumerosEspacios(bar)) {
            JOptionPane.showMessageDialog(null, "Ha ingresado caracteres invalidos.");
        }
        else if(!validaciones.validarLetrasYNumerosEspaciosSimbolos(cra) || !validaciones.validarLetrasYNumerosEspaciosSimbolos(cl)) {
            JOptionPane.showMessageDialog(null, "Ha ingresado caracteres invalidos, en carrera y calle solo se "
                    + "puede usar los caracteres espaciales '.' y '-' .");
        }
        else {
            
            int numFilas = controladorSede.insertarSede(nom, id, ciu, tel, cra, cl, bar, idGerente);
            switch (numFilas) {
                case 2:
                    JOptionPane.showMessageDialog(null, "La sede ya se encuentra registrada en el sistema.");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Sede creada exitosamente.");
                    nombre.setText(null);
                    idSede.setText(null);
                    ciudad.setText(null);
                    telefono.setText(null);
                    carrera.setText(null);
                    barrio.setText(null);
                    calle.setText(null);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar la sede.");
                    break;
            }
        }
    }//GEN-LAST:event_registrarSedeActionPerformed
    
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_RegistrarSede().setVisible(true);
                
                
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barrio;
    private javax.swing.JLabel barrioLabel;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField calle;
    private javax.swing.JLabel calleLabel;
    private javax.swing.JTextField carrera;
    private javax.swing.JLabel carreraLabel;
    private javax.swing.JTextField ciudad;
    private javax.swing.JLabel ciudadLabel;
    private javax.swing.JLabel direccionLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField idSede;
    private javax.swing.JLabel idSedeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JButton registrarSede;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel telefonoLabel;
    // End of variables declaration//GEN-END:variables
}