package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import com.itextpdf.text.DocumentException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI_Inscripcion extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorParticipante controladorParticipante;
    ControladorEvento controladorEvento;
    String idOperador;
    String id_participante, nombre_participante;
    Evento evento;
    Participante participante;
    
    public GUI_Inscripcion(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        dineroLabel.setVisible(false);
        dinero.setVisible(false);
        cambioLabelEditar.setVisible(false);
        cambioLabel.setVisible(false);
        continuarBoton.setVisible(false);
        evento = new Evento();
        controladorParticipante = new ControladorParticipante();
        participante = new Participante();
        controladorEvento = new ControladorEvento();
        validaciones = new Validaciones();
        fecha.setMaxSelectableDate(GetDateNow());
        fecha.getDateEditor().setEnabled(false);
    }
    
    private static Date GetDateNow() {
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
    }
    
    void setIdOperador(String cedula) {
        idOperador = cedula;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        correo = new javax.swing.JTextField();
        correoLabel = new javax.swing.JLabel();
        codEvento = new javax.swing.JTextField();
        telefonoLabel = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        codEventoLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        cedulaLabel = new javax.swing.JLabel();
        segundoApellido = new javax.swing.JTextField();
        segundoApellidoLabel = new javax.swing.JLabel();
        primerApellido = new javax.swing.JTextField();
        primerApellidoLabel = new javax.swing.JLabel();
        segundoNombre = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        primerNombre = new javax.swing.JTextField();
        crearParticipante = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        precioLabelEditar = new javax.swing.JLabel();
        nombreEventoEditar = new javax.swing.JLabel();
        precioLabel1 = new javax.swing.JLabel();
        nombreEventoLabel2 = new javax.swing.JLabel();
        dineroLabel = new javax.swing.JLabel();
        cambioLabel = new javax.swing.JLabel();
        dinero = new javax.swing.JTextField();
        cambioLabelEditar = new javax.swing.JLabel();
        consultarBoton = new javax.swing.JButton();
        continuarBoton = new javax.swing.JButton();
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
        botonCancelar.setBounds(620, 350, 140, 90);

        correo.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                correoKeyPressed(evt);
            }
        });
        jPanel1.add(correo);
        correo.setBounds(510, 180, 210, 20);

        correoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        correoLabel.setText("Email:");
        jPanel1.add(correoLabel);
        correoLabel.setBounds(390, 170, 120, 30);

        codEvento.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        codEvento.setSelectionColor(new java.awt.Color(102, 102, 255));
        codEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codEventoKeyPressed(evt);
            }
        });
        jPanel1.add(codEvento);
        codEvento.setBounds(510, 300, 70, 20);

        telefonoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        telefonoLabel.setText("Teléfono:");
        jPanel1.add(telefonoLabel);
        telefonoLabel.setBounds(390, 230, 130, 30);

        telefono.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        telefono.setSelectionColor(new java.awt.Color(102, 102, 255));
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefonoKeyPressed(evt);
            }
        });
        jPanel1.add(telefono);
        telefono.setBounds(510, 240, 210, 20);

        codEventoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        codEventoLabel.setText("Código Evento:");
        jPanel1.add(codEventoLabel);
        codEventoLabel.setBounds(390, 290, 200, 34);

        fechaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        fechaLabel.setText("Fecha Nacimiento:");
        jPanel1.add(fechaLabel);
        fechaLabel.setBounds(390, 110, 220, 40);

        cedula.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        cedula.setSelectionColor(new java.awt.Color(102, 102, 255));
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cedulaKeyPressed(evt);
            }
        });
        jPanel1.add(cedula);
        cedula.setBounds(160, 280, 210, 20);

        cedulaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel.setText("Cédula:");
        jPanel1.add(cedulaLabel);
        cedulaLabel.setBounds(40, 270, 200, 30);

        segundoApellido.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        segundoApellido.setSelectionColor(new java.awt.Color(102, 102, 255));
        segundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                segundoApellidoKeyPressed(evt);
            }
        });
        jPanel1.add(segundoApellido);
        segundoApellido.setBounds(160, 230, 210, 20);

        segundoApellidoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoApellidoLabel.setText("Segundo Apellido:");
        jPanel1.add(segundoApellidoLabel);
        segundoApellidoLabel.setBounds(40, 220, 250, 34);

        primerApellido.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        primerApellido.setSelectionColor(new java.awt.Color(102, 102, 255));
        primerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                primerApellidoKeyPressed(evt);
            }
        });
        jPanel1.add(primerApellido);
        primerApellido.setBounds(160, 190, 210, 20);

        primerApellidoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerApellidoLabel.setText("Primer Apellido:");
        jPanel1.add(primerApellidoLabel);
        primerApellidoLabel.setBounds(40, 180, 230, 34);

        segundoNombre.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        segundoNombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        segundoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                segundoNombreKeyPressed(evt);
            }
        });
        jPanel1.add(segundoNombre);
        segundoNombre.setBounds(160, 150, 210, 20);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Segundo Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(40, 140, 230, 34);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("Primer Nombre:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(40, 110, 220, 30);

        primerNombre.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        primerNombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        primerNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                primerNombreKeyPressed(evt);
            }
        });
        jPanel1.add(primerNombre);
        primerNombre.setBounds(160, 110, 210, 20);

        crearParticipante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        crearParticipante.setBorder(null);
        crearParticipante.setBorderPainted(false);
        crearParticipante.setContentAreaFilled(false);
        crearParticipante.setFocusPainted(false);
        crearParticipante.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        crearParticipante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        crearParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearParticipanteActionPerformed(evt);
            }
        });
        crearParticipante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                crearParticipanteKeyPressed(evt);
            }
        });
        jPanel1.add(crearParticipante);
        crearParticipante.setBounds(500, 350, 140, 90);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setMaxSelectableDate(new java.util.Date(1514786508000L));
        fecha.setMinSelectableDate(new java.util.Date(-1577901492000L));
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaKeyPressed(evt);
            }
        });
        jPanel1.add(fecha);
        fecha.setBounds(510, 120, 210, 20);

        precioLabelEditar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(precioLabelEditar);
        precioLabelEditar.setBounds(140, 350, 110, 20);

        nombreEventoEditar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(nombreEventoEditar);
        nombreEventoEditar.setBounds(140, 320, 110, 20);

        precioLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        precioLabel1.setText("Precio:");
        jPanel1.add(precioLabel1);
        precioLabel1.setBounds(80, 350, 110, 17);

        nombreEventoLabel2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombreEventoLabel2.setText("Nombre Evento:");
        jPanel1.add(nombreEventoLabel2);
        nombreEventoLabel2.setBounds(30, 320, 110, 17);

        dineroLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        dineroLabel.setText("Dinero:");
        jPanel1.add(dineroLabel);
        dineroLabel.setBounds(80, 380, 50, 17);

        cambioLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cambioLabel.setText("Cambio:");
        jPanel1.add(cambioLabel);
        cambioLabel.setBounds(80, 410, 50, 17);

        dinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dineroKeyPressed(evt);
            }
        });
        jPanel1.add(dinero);
        dinero.setBounds(140, 380, 220, 19);

        cambioLabelEditar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(cambioLabelEditar);
        cambioLabelEditar.setBounds(140, 410, 220, 20);

        consultarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        consultarBoton.setBorder(null);
        consultarBoton.setContentAreaFilled(false);
        consultarBoton.setDefaultCapable(false);
        consultarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarBotonActionPerformed(evt);
            }
        });
        consultarBoton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultarBotonKeyPressed(evt);
            }
        });
        jPanel1.add(consultarBoton);
        consultarBoton.setBounds(620, 290, 110, 44);

        continuarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        continuarBoton.setBorder(null);
        continuarBoton.setBorderPainted(false);
        continuarBoton.setContentAreaFilled(false);
        continuarBoton.setDefaultCapable(false);
        continuarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBotonActionPerformed(evt);
            }
        });
        continuarBoton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                continuarBotonKeyPressed(evt);
            }
        });
        jPanel1.add(continuarBoton);
        continuarBoton.setBounds(370, 380, 110, 50);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInscripcion.png"))); // NOI18N
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
    
    private void crearParticipante(){
        String primerNom, segundoNom, primerAp, segundoAp, ced,
                fechaNacimiento, tel, email, codigoEvento, validar = "";
        fechaNacimiento = "";
        LocalDate fechaNac = LocalDate.now();
        
        primerNom = primerNombre.getText();
        segundoNom = segundoNombre.getText();
        primerAp = primerApellido.getText();
        segundoAp = segundoApellido.getText();
        ced = cedula.getText();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try {
            
            fechaNacimiento = new SimpleDateFormat("dd/MM/YYYY").format(fecha.getDate());
            fechaNac = LocalDate.parse(fechaNacimiento, fmt);
        } catch(Exception e){
            validar = "\nDebe ingresar una fecha válida.";
        }
        
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        
        tel = telefono.getText();
        codigoEvento = codEvento.getText();
        email = correo.getText();
        
        if (primerNom.equals("") || primerAp.equals("") || ced.equals("") || tel.equals("") || fechaNacimiento.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios" + validar + ".");
        }
        else if(!validaciones.validarLetras(primerNom) || !validaciones.validarLetras(segundoNom) ||
                !validaciones.validarLetras(primerAp) || !validaciones.validarLetras(segundoAp)) {
            JOptionPane.showMessageDialog(null, "Los campos del nombre deben ser de solo letras");
        }
        else if(!validaciones.validarNumero(ced) || !validaciones.validarNumero(tel) || !validaciones.validarNumero(codigoEvento)) {
            JOptionPane.showMessageDialog(null, "Los campos de cedula, telefono y codigoEvento deben ser de solo numeros");
        }
        else if (periodo.getYears() < 15) {
            JOptionPane.showMessageDialog(null, "El participante debe ser mínimo de 15 años");
        }
        else {
            
            int numFilas = controladorParticipante.insertarParticipante(primerNom,segundoNom,
                    primerAp,segundoAp,ced,fechaNacimiento, tel, email, idOperador, codigoEvento, "Valido");
            
            switch (numFilas) {
                case 3:
                    JOptionPane.showMessageDialog(null, "El evento que ingresó no existe.");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "El participante ya se encuentra pre-inscrito en este evento" + "\n" +
                            "Debe proceder a pagar para quedar inscrito.");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "El participante ya se encuentra inscrito en este evento");
                    break;
                case 2:
                case 5:
                    JOptionPane.showMessageDialog(null, "La inscripción se ha realizado exitosamente.");
                    evento = controladorEvento.consultarDatosEvento(codigoEvento);
                    nombreEventoEditar.setText(evento.getNombre_evento());
                    precioLabelEditar.setText(evento.getPrecio());
                    
                    int opcion = 5;
                    opcion = JOptionPane.showConfirmDialog(null, "Desea imprimir un recibo?",
                            "Imprimir recibo", JOptionPane.OK_CANCEL_OPTION);
                    if(opcion == 0){
                        id_participante = ced;
                        dinero.setVisible(true);
                        dineroLabel.setVisible(true);
                        cambioLabel.setVisible(true);
                        cambioLabelEditar.setVisible(true);
                        continuarBoton.setVisible(true);
                        crearParticipante.setEnabled(false);
                        
                    }
                    else{
                        primerNombre.setText(null);
                        segundoNombre.setText(null);
                        primerApellido.setText(null);
                        segundoApellido.setText(null);
                        cedula.setText(null);
                        telefono.setText(null);
                        codEvento.setText(null);
                        correo.setText(null);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al realizar la inscripción.");
                    break;
            }
        }
    }
    
    private void crearParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearParticipanteActionPerformed
        
        crearParticipante();
    }//GEN-LAST:event_crearParticipanteActionPerformed
    
    private void consultar() {
        String id = cedula.getText();
        String id_evento = codEvento.getText();
        if (id_evento.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios");
        } else if (!validaciones.validarNumero(id_evento) || !validaciones.validarNumero(id)) {
            
            JOptionPane.showMessageDialog(null, "Los campos deben ser numericos.");
        } else {
            //Nuevo
            evento = controladorEvento.consultarDatosEvento(id_evento);
            //Nuevo
            if(evento != null){
                nombreEventoEditar.setText(evento.getNombre_evento());
                precioLabelEditar.setText(evento.getPrecio());
            }
            else{
                JOptionPane.showMessageDialog(null, "El evento " + id_evento + " no existe.");
            }
            
        }
    }
    
    private void consultarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarBotonActionPerformed

        consultar();
    }//GEN-LAST:event_consultarBotonActionPerformed
    
    private void continuar(){
        Reportes recibo = new Reportes();
        String cod_evento = evento.getId_evento();
        String nombre_evento = evento.getNombre_evento();
        Date fechaActual;
        fechaActual = GUI_Inscripcion.GetDateNow();
        String fecha = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            fecha = new SimpleDateFormat("dd/MM/YYYY").format(fechaActual);
        } catch(Exception e){
            System.out.println(e);
        }
        
        String precio = evento.getPrecio();
        String money = dinero.getText();
        participante = controladorParticipante.consultarDatosParticipante(id_participante);
        nombre_participante = participante.getPrimer_nombre() + " " + participante.getSegundo_nombre() + " " +
                participante.getPrimer_apellido() + " " +participante.getSegundo_apellido();
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
                    cambioLabelEditar.setText(cambioS);
                    recibo.imprimirRecibo(nombre_participante, id_participante, cod_evento, nombre_evento, precio, fecha, money, cambioS);
                    JOptionPane.showMessageDialog(null, "Recibo impreso");
                    dinero.setVisible(false);
                    dineroLabel.setVisible(false);
                    cambioLabel.setVisible(false);
                    cambioLabelEditar.setVisible(false);
                    continuarBoton.setVisible(false);
                    dinero.setText("");
                    cambioLabelEditar.setText("");
                    cedula.setText("");
                    codEvento.setText("");
                    crearParticipante.setEnabled(true);
                    
                } catch (IOException ex) {
                    Logger.getLogger(GUI_RegistrarPago.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DocumentException ex) {
                    Logger.getLogger(GUI_RegistrarPago.class.getName()).log(Level.SEVERE, null, ex);
                }
                nombreEventoEditar.setText("");
                precioLabelEditar.setText("");
                primerNombre.setText(null);
                segundoNombre.setText(null);
                primerApellido.setText(null);
                segundoApellido.setText(null);
                cedula.setText(null);
                telefono.setText(null);
                codEvento.setText(null);
                correo.setText(null);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No es suficiente dinero.");
            }
            
        }
    }
    private void continuarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBotonActionPerformed
        continuar();
    }//GEN-LAST:event_continuarBotonActionPerformed

    private void codEventoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codEventoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){consultar();}
    }//GEN-LAST:event_codEventoKeyPressed

    private void primerNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primerNombreKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_primerNombreKeyPressed

    private void continuarBotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_continuarBotonKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){continuar();}
    }//GEN-LAST:event_continuarBotonKeyPressed

    private void dineroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dineroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){continuar();}
    }//GEN-LAST:event_dineroKeyPressed

    private void consultarBotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultarBotonKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){consultar();}
    }//GEN-LAST:event_consultarBotonKeyPressed

    private void segundoNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_segundoNombreKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_segundoNombreKeyPressed

    private void primerApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primerApellidoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_primerApellidoKeyPressed

    private void segundoApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_segundoApellidoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_segundoApellidoKeyPressed

    private void cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_cedulaKeyPressed

    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_fechaKeyPressed

    private void correoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_correoKeyPressed

    private void telefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_telefonoKeyPressed

    private void crearParticipanteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crearParticipanteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_crearParticipanteKeyPressed
    
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_Inscripcion().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JLabel cambioLabel;
    private javax.swing.JLabel cambioLabelEditar;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel cedulaLabel;
    private javax.swing.JTextField codEvento;
    private javax.swing.JLabel codEventoLabel;
    private javax.swing.JButton consultarBoton;
    private javax.swing.JButton continuarBoton;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JButton crearParticipante;
    private javax.swing.JTextField dinero;
    private javax.swing.JLabel dineroLabel;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreEventoEditar;
    private javax.swing.JLabel nombreEventoLabel2;
    private javax.swing.JLabel precioLabel1;
    private javax.swing.JLabel precioLabelEditar;
    private javax.swing.JTextField primerApellido;
    private javax.swing.JLabel primerApellidoLabel;
    private javax.swing.JTextField primerNombre;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JTextField segundoApellido;
    private javax.swing.JLabel segundoApellidoLabel;
    private javax.swing.JTextField segundoNombre;
    private javax.swing.JLabel segundoNombreLabel;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel telefonoLabel;
    // End of variables declaration//GEN-END:variables

    
    
}