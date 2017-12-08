package GUI;

public class GUI_Gerente extends javax.swing.JFrame {
    
    String id;
    
    public GUI_Gerente(){
        
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        modificarSede = new javax.swing.JButton();
        reportes = new javax.swing.JButton();
        registrarSede = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JLabel();
        crearEvento = new javax.swing.JButton();
        modificarEvento = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        modificarSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarSedeMed.png"))); // NOI18N
        modificarSede.setBorder(null);
        modificarSede.setBorderPainted(false);
        modificarSede.setContentAreaFilled(false);
        modificarSede.setFocusPainted(false);
        modificarSede.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarSedePeq.png"))); // NOI18N
        modificarSede.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarSede.png"))); // NOI18N
        modificarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarSedeActionPerformed(evt);
            }
        });
        jPanel1.add(modificarSede);
        modificarSede.setBounds(430, 280, 180, 110);

        reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonRepMed.png"))); // NOI18N
        reportes.setBorder(null);
        reportes.setBorderPainted(false);
        reportes.setContentAreaFilled(false);
        reportes.setFocusPainted(false);
        reportes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonRepPeq.png"))); // NOI18N
        reportes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonRepl.png"))); // NOI18N
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });
        jPanel1.add(reportes);
        reportes.setBounds(550, 150, 180, 110);
        reportes.getAccessibleContext().setAccessibleName("Reportes y Consultas");

        registrarSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistrarSedeMed.png"))); // NOI18N
        registrarSede.setBorder(null);
        registrarSede.setBorderPainted(false);
        registrarSede.setContentAreaFilled(false);
        registrarSede.setFocusPainted(false);
        registrarSede.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistrarSedePeq.png"))); // NOI18N
        registrarSede.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistrarSede.png"))); // NOI18N
        registrarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarSedeActionPerformed(evt);
            }
        });
        jPanel1.add(registrarSede);
        registrarSede.setBounds(170, 280, 180, 110);

        CerrarSesion.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(CerrarSesion);
        CerrarSesion.setBounds(660, 380, 110, 50);

        crearEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearEventoMed.png"))); // NOI18N
        crearEvento.setBorder(null);
        crearEvento.setBorderPainted(false);
        crearEvento.setContentAreaFilled(false);
        crearEvento.setFocusPainted(false);
        crearEvento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearEventoPeq.png"))); // NOI18N
        crearEvento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearEvento.png"))); // NOI18N
        crearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEventoActionPerformed(evt);
            }
        });
        jPanel1.add(crearEvento);
        crearEvento.setBounds(40, 150, 180, 110);

        modificarEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarEventoMed.png"))); // NOI18N
        modificarEvento.setBorder(null);
        modificarEvento.setBorderPainted(false);
        modificarEvento.setContentAreaFilled(false);
        modificarEvento.setFocusPainted(false);
        modificarEvento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarEventoPeq.png"))); // NOI18N
        modificarEvento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarEvento.png"))); // NOI18N
        modificarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEventoActionPerformed(evt);
            }
        });
        jPanel1.add(modificarEvento);
        modificarEvento.setBounds(290, 150, 180, 110);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoGerente.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 791, 446);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setId(String id) {
        this.id = id;
    }
    
    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportesActionPerformed
    
    private void registrarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarSedeActionPerformed
        // TODO add your handling code here:
        GUI_RegistrarSede interfazSede = new GUI_RegistrarSede();
        interfazSede.setIdGerente(id);
        interfazSede.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrarSedeActionPerformed
    
    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        
        GUI_Login interfazLogin = new GUI_Login();
        interfazLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionMouseClicked
    
    private void modificarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarSedeActionPerformed
        // TODO add your handling code here:
        GUI_ModificarSede interfazModificarSede = new GUI_ModificarSede();
        interfazModificarSede.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_modificarSedeActionPerformed
    
    private void crearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEventoActionPerformed
        
        GUI_CrearEvento interfazCrearEvento = new GUI_CrearEvento();
        interfazCrearEvento.setId(id);
        interfazCrearEvento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_crearEventoActionPerformed
    
    private void modificarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEventoActionPerformed
        // TODO add your handling code here:
        GUI_ModificarEvento interfazModificarEvento = new GUI_ModificarEvento();
        interfazModificarEvento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modificarEventoActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(GUI_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_Gerente().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JButton crearEvento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificarEvento;
    private javax.swing.JButton modificarSede;
    private javax.swing.JButton registrarSede;
    private javax.swing.JButton reportes;
    // End of variables declaration//GEN-END:variables
}