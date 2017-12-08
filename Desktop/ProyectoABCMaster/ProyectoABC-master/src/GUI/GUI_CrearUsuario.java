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

public class GUI_CrearUsuario extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorOperador controladorOperador;
    ControladorGerente controladorGerente;
    
    public GUI_CrearUsuario(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorOperador = new ControladorOperador();
        controladorGerente = new ControladorGerente();
        validaciones = new Validaciones();
        fecha.setMaxSelectableDate(GetDateNow());
        //fecha.getDateEditor().setEnabled(false);
        ((JTextField) fecha.getDateEditor()).setEditable(false);
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
        respuestaSeguridad = new javax.swing.JTextField();
        respuestaLabel12 = new javax.swing.JLabel();
        preguntaSeguridad = new javax.swing.JTextField();
        confirmarpass = new javax.swing.JPasswordField();
        preguntaLabel11 = new javax.swing.JLabel();
        confirmarLabel10 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        passLabel9 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        emailLabel8 = new javax.swing.JLabel();
        cel = new javax.swing.JTextField();
        celLabel7 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        telefonoLabel6 = new javax.swing.JLabel();
        fechaLabel5 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        tipoLabel = new javax.swing.JLabel();
        ced = new javax.swing.JTextField();
        cedulaLabel3 = new javax.swing.JLabel();
        segundoAp = new javax.swing.JTextField();
        segundoApellidoLabel2 = new javax.swing.JLabel();
        primerAp = new javax.swing.JTextField();
        primerApellidoLabel = new javax.swing.JLabel();
        segundoNom = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        primerNom = new javax.swing.JTextField();
        crearUsuario = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
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
        respuestaSeguridad.setBounds(450, 240, 180, 20);

        respuestaLabel12.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        respuestaLabel12.setText("Respuesta:");
        jPanel1.add(respuestaLabel12);
        respuestaLabel12.setBounds(370, 240, 150, 20);

        preguntaSeguridad.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        preguntaSeguridad.setSelectionColor(new java.awt.Color(102, 102, 255));
        preguntaSeguridad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                preguntaSeguridadKeyPressed(evt);
            }
        });
        jPanel1.add(preguntaSeguridad);
        preguntaSeguridad.setBounds(450, 210, 180, 20);

        confirmarpass.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        confirmarpass.setSelectionColor(new java.awt.Color(102, 102, 255));
        confirmarpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmarpassKeyPressed(evt);
            }
        });
        jPanel1.add(confirmarpass);
        confirmarpass.setBounds(450, 180, 180, 20);

        preguntaLabel11.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        preguntaLabel11.setText("Pregunta:");
        jPanel1.add(preguntaLabel11);
        preguntaLabel11.setBounds(370, 210, 140, 20);

        confirmarLabel10.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        confirmarLabel10.setText("Confirmar:");
        jPanel1.add(confirmarLabel10);
        confirmarLabel10.setBounds(370, 180, 150, 20);

        pass.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        pass.setSelectionColor(new java.awt.Color(102, 102, 255));
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });
        jPanel1.add(pass);
        pass.setBounds(450, 150, 180, 20);

        passLabel9.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        passLabel9.setText("Contraseña:");
        jPanel1.add(passLabel9);
        passLabel9.setBounds(370, 150, 160, 20);

        correo.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                correoKeyPressed(evt);
            }
        });
        jPanel1.add(correo);
        correo.setBounds(450, 270, 180, 20);

        emailLabel8.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        emailLabel8.setText("Email:");
        jPanel1.add(emailLabel8);
        emailLabel8.setBounds(370, 270, 120, 20);

        cel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cel.setSelectionColor(new java.awt.Color(102, 102, 255));
        cel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                celKeyPressed(evt);
            }
        });
        jPanel1.add(cel);
        cel.setBounds(450, 120, 180, 20);

        celLabel7.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        celLabel7.setText("Celular:");
        jPanel1.add(celLabel7);
        celLabel7.setBounds(370, 120, 130, 20);

        tel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        tel.setSelectionColor(new java.awt.Color(102, 102, 255));
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telKeyPressed(evt);
            }
        });
        jPanel1.add(tel);
        tel.setBounds(450, 90, 180, 20);

        telefonoLabel6.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        telefonoLabel6.setText("Teléfono:");
        jPanel1.add(telefonoLabel6);
        telefonoLabel6.setBounds(370, 90, 140, 20);

        fechaLabel5.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        fechaLabel5.setText("Fecha Nacimiento:");
        jPanel1.add(fechaLabel5);
        fechaLabel5.setBounds(60, 270, 220, 40);

        tipo.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        tipo.setForeground(new java.awt.Color(102, 102, 255));
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operador", "Gerente" }));
        tipo.setFocusable(false);
        jPanel1.add(tipo);
        tipo.setBounds(170, 85, 130, 20);

        tipoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        tipoLabel.setText("Tipo de Usuario:");
        jPanel1.add(tipoLabel);
        tipoLabel.setBounds(60, 80, 170, 30);

        ced.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        ced.setSelectionColor(new java.awt.Color(102, 102, 255));
        ced.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cedKeyPressed(evt);
            }
        });
        jPanel1.add(ced);
        ced.setBounds(170, 240, 180, 20);

        cedulaLabel3.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel3.setText("Cédula:");
        jPanel1.add(cedulaLabel3);
        cedulaLabel3.setBounds(60, 240, 130, 30);

        segundoAp.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoAp.setSelectionColor(new java.awt.Color(102, 102, 255));
        segundoAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                segundoApKeyPressed(evt);
            }
        });
        jPanel1.add(segundoAp);
        segundoAp.setBounds(170, 210, 180, 20);

        segundoApellidoLabel2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoApellidoLabel2.setText("Segundo Apellido:");
        jPanel1.add(segundoApellidoLabel2);
        segundoApellidoLabel2.setBounds(60, 210, 180, 30);

        primerAp.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerAp.setSelectionColor(new java.awt.Color(102, 102, 255));
        primerAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                primerApKeyPressed(evt);
            }
        });
        jPanel1.add(primerAp);
        primerAp.setBounds(170, 180, 180, 20);

        primerApellidoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerApellidoLabel.setText("Primer Apellido:");
        jPanel1.add(primerApellidoLabel);
        primerApellidoLabel.setBounds(60, 180, 170, 30);

        segundoNom.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNom.setSelectionColor(new java.awt.Color(102, 102, 255));
        segundoNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                segundoNomKeyPressed(evt);
            }
        });
        jPanel1.add(segundoNom);
        segundoNom.setBounds(170, 150, 180, 20);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Segundo Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(60, 150, 180, 30);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("Primer Nombre:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(60, 120, 170, 30);

        primerNom.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNom.setSelectionColor(new java.awt.Color(102, 102, 255));
        primerNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                primerNomKeyPressed(evt);
            }
        });
        jPanel1.add(primerNom);
        primerNom.setBounds(170, 120, 180, 20);

        crearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        crearUsuario.setBorder(null);
        crearUsuario.setBorderPainted(false);
        crearUsuario.setContentAreaFilled(false);
        crearUsuario.setFocusPainted(false);
        crearUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        crearUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });
        crearUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                crearUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(crearUsuario);
        crearUsuario.setBounds(190, 310, 160, 70);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setMaxSelectableDate(new java.util.Date(1514786511000L));
        fecha.setMinSelectableDate(new java.util.Date(-1577901489000L));
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaKeyPressed(evt);
            }
        });
        jPanel1.add(fecha);
        fecha.setBounds(170, 280, 180, 20);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearUsuario.png"))); // NOI18N
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
        
        GUI_Administrador adminLogin = new GUI_Administrador();
        adminLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void crearUsuario(){
        String primerNombre, segundoNombre, primerApellido, segundoApellido, cedula, tipoUsuario,
                fechaNacimiento, telefono, celular, email, contrasena, confirmar, pregunta, respuesta, validar = "";
        LocalDate fechaNac = LocalDate.now();
        fechaNacimiento = "";
        primerNombre = primerNom.getText();
        segundoNombre = segundoNom.getText();
        primerApellido = primerAp.getText();
        segundoApellido = segundoAp.getText();
        cedula = ced.getText();
        tipoUsuario = (String) tipo.getSelectedItem();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try {
            
            fechaNacimiento = new SimpleDateFormat("dd/MM/YYYY").format(fecha.getDate());
            fechaNac = LocalDate.parse(fechaNacimiento, fmt);
        } catch(Exception e){
            validar = "\nDebe ingresar una fecha válida.";
        }
        
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        
        telefono = tel.getText();
        celular = cel.getText();
        email = correo.getText();
        contrasena = pass.getText();
        confirmar = confirmarpass.getText();
        pregunta = preguntaSeguridad.getText();
        respuesta = respuestaSeguridad.getText();
        
        if (primerNombre.equals("") || primerApellido.equals("") || cedula.equals("") || fechaNacimiento.equals("") ||
                celular.equals("") || contrasena.equals("") || pregunta.equals("") ||  respuesta.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios." + validar);
        }
        else if(!validaciones.validarLetras(primerNombre) || !validaciones.validarLetras(segundoNombre) || !validaciones.validarLetras(primerApellido) ||
                !validaciones.validarLetras(segundoApellido)) {
            JOptionPane.showMessageDialog(null, "Los campos del nombre deben ser de solo letras");
        }
        else if(!validaciones.validarNumero(cedula) || !validaciones.validarNumero(telefono) || !validaciones.validarNumero(celular)) {
            JOptionPane.showMessageDialog(null, "Los campos de cedula, telefono y celular deben ser de solo numeros");
        }
        else if(!validaciones.validarLetrasYNumeros(contrasena) || contrasena.length() < 8) {
            JOptionPane.showMessageDialog(null, "El campos contraseña debe tener minimo 8 caracteres validos");
        }
        else if (periodo.getYears() < 18) {
            JOptionPane.showMessageDialog(null, "El usuario tiene que ser mayor de edad.");
        }
        
        else {
            if(tipoUsuario.equals("Operador")) {
                
                int numFilas = controladorOperador.insertarOperador(primerNombre,
                        segundoNombre, primerApellido, segundoApellido,
                        cedula, fechaNacimiento, telefono, celular, email,
                        contrasena, confirmar, pregunta, respuesta);
                
                switch (numFilas) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Operador creado exitosamente.");
                        primerNom.setText(null);
                        segundoNom.setText(null);
                        primerAp.setText(null);
                        segundoAp.setText(null);
                        ced.setText(null);
                        tel.setText(null);
                        cel.setText(null);
                        correo.setText(null);
                        pass.setText(null);
                        confirmarpass.setText(null);
                        preguntaSeguridad.setText(null);
                        respuestaSeguridad.setText(null);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "El operador ya se encuentra registrado.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el operador.");
                        break;
                }
            }
            else if(tipoUsuario.equals("Gerente")) {
                
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
            }
        }
    }
    //Inicio escuchas
    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        crearUsuario();
        
    }//GEN-LAST:event_crearUsuarioActionPerformed

    private void primerNomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primerNomKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearUsuario();
        }
    }//GEN-LAST:event_primerNomKeyPressed

    private void segundoNomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_segundoNomKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearUsuario();
        }
    }//GEN-LAST:event_segundoNomKeyPressed

    private void primerApKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primerApKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearUsuario();
        }
    }//GEN-LAST:event_primerApKeyPressed

    private void segundoApKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_segundoApKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearUsuario();
        }
    }//GEN-LAST:event_segundoApKeyPressed

    private void cedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearUsuario();
        }
    }//GEN-LAST:event_cedKeyPressed

    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearUsuario();}
    }//GEN-LAST:event_fechaKeyPressed

    private void telKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearUsuario();}
    }//GEN-LAST:event_telKeyPressed

    private void celKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearUsuario();}
    }//GEN-LAST:event_celKeyPressed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearUsuario();}
    }//GEN-LAST:event_passKeyPressed

    private void confirmarpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmarpassKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearUsuario();}
    }//GEN-LAST:event_confirmarpassKeyPressed

    private void preguntaSeguridadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_preguntaSeguridadKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearUsuario();}
    }//GEN-LAST:event_preguntaSeguridadKeyPressed

    private void respuestaSeguridadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respuestaSeguridadKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearUsuario();}
    }//GEN-LAST:event_respuestaSeguridadKeyPressed

    private void correoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearUsuario();}
    }//GEN-LAST:event_correoKeyPressed

    private void crearUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crearUsuarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearUsuario();}
    }//GEN-LAST:event_crearUsuarioKeyPressed
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
    private javax.swing.JTextField ced;
    private javax.swing.JLabel cedulaLabel3;
    private javax.swing.JTextField cel;
    private javax.swing.JLabel celLabel7;
    private javax.swing.JLabel confirmarLabel10;
    private javax.swing.JPasswordField confirmarpass;
    private javax.swing.JTextField correo;
    private javax.swing.JButton crearUsuario;
    private javax.swing.JLabel emailLabel8;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fechaLabel5;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passLabel9;
    private javax.swing.JLabel preguntaLabel11;
    private javax.swing.JTextField preguntaSeguridad;
    private javax.swing.JTextField primerAp;
    private javax.swing.JLabel primerApellidoLabel;
    private javax.swing.JTextField primerNom;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JLabel respuestaLabel12;
    private javax.swing.JTextField respuestaSeguridad;
    private javax.swing.JTextField segundoAp;
    private javax.swing.JLabel segundoApellidoLabel2;
    private javax.swing.JTextField segundoNom;
    private javax.swing.JLabel segundoNombreLabel;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel telefonoLabel6;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JLabel tipoLabel;
    // End of variables declaration//GEN-END:variables
}