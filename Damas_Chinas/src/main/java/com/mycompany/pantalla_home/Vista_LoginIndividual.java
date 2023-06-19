/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pantalla_home;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author lucho
 */
public class Vista_LoginIndividual extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Home
     */
    public Clip clip;
    public AudioInputStream audioInput;
    Music m;
    Vista_Config config = new Vista_Config();
    Singleton_BD singleton_bd = Singleton_BD.getInstance();
    
    //boolean backReglas
    //this.jLabel1.setVisible(false);
    public Vista_LoginIndividual() {
        
       
        initComponents();
        this.setLocationRelativeTo(null);
        //inicioDeSonido("musicHome.wav");
        
    }
    
    public Vista_LoginIndividual(Music m, Vista_Config c){
        initComponents();
        this.setLocationRelativeTo(null);
        this.m=m;
        this.config=c;
    }
   
    public void sonidoFondoInicial(String dir,boolean a){
        //if 
        if(a == false){
            this.clip.stop();
        }else{
            this.clip.start();
        }
        
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton_back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_signup = new javax.swing.JLabel();
        txt_psw_signup = new javax.swing.JLabel();
        txt_user_user = new javax.swing.JLabel();
        fieldpsw_signup = new javax.swing.JPasswordField();
        fielduser_signup = new javax.swing.JTextField();
        btn_submit_signup = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txt_login = new javax.swing.JLabel();
        txt_psw_login = new javax.swing.JLabel();
        txt_user_login = new javax.swing.JLabel();
        fieldpsw_login = new javax.swing.JPasswordField();
        fielduser_login = new javax.swing.JTextField();
        btn_submit_login = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonBack.png"))); // NOI18N
        boton_back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_backMouseClicked(evt);
            }
        });
        boton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_backActionPerformed(evt);
            }
        });
        jPanel1.add(boton_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\lucho\\Documents\\DAMASCHINASDESIGN\\rayo.gif")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 50, 110));

        jPanel2.setBackground(new java.awt.Color(173, 211, 1));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        txt_signup.setFont(new java.awt.Font("Bebas", 3, 36)); // NOI18N
        txt_signup.setForeground(new java.awt.Color(255, 255, 255));
        txt_signup.setText("SIGN UP");

        txt_psw_signup.setFont(new java.awt.Font("Bebas", 3, 14)); // NOI18N
        txt_psw_signup.setForeground(new java.awt.Color(255, 255, 255));
        txt_psw_signup.setText("PASSWORD");

        txt_user_user.setFont(new java.awt.Font("Bebas", 3, 14)); // NOI18N
        txt_user_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user_user.setText("USER");

        fielduser_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fielduser_signupActionPerformed(evt);
            }
        });

        btn_submit_signup.setFont(new java.awt.Font("Bebas", 3, 12)); // NOI18N
        btn_submit_signup.setText("SUBMIT");
        btn_submit_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submit_signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_user_user, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_psw_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fielduser_signup, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldpsw_signup))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_submit_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(txt_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txt_signup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(txt_user_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fielduser_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_psw_signup)
                .addGap(2, 2, 2)
                .addComponent(fieldpsw_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_submit_signup)
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 230, 250));

        jPanel3.setBackground(new java.awt.Color(202, 25, 45));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        txt_login.setFont(new java.awt.Font("Bebas", 3, 36)); // NOI18N
        txt_login.setForeground(new java.awt.Color(255, 255, 255));
        txt_login.setText("LOGIN");

        txt_psw_login.setFont(new java.awt.Font("Bebas", 3, 14)); // NOI18N
        txt_psw_login.setForeground(new java.awt.Color(255, 255, 255));
        txt_psw_login.setText("PASSWORD");

        txt_user_login.setFont(new java.awt.Font("Bebas", 3, 14)); // NOI18N
        txt_user_login.setForeground(new java.awt.Color(255, 255, 255));
        txt_user_login.setText("USER");

        fieldpsw_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldpsw_loginActionPerformed(evt);
            }
        });

        fielduser_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fielduser_loginActionPerformed(evt);
            }
        });

        btn_submit_login.setFont(new java.awt.Font("Bebas", 3, 12)); // NOI18N
        btn_submit_login.setText("SUBMIT");
        btn_submit_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submit_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_user_login, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_psw_login, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fielduser_login, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldpsw_login))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_submit_login, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txt_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(txt_user_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fielduser_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_psw_login)
                .addGap(2, 2, 2)
                .addComponent(fieldpsw_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_submit_login)
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 230, 250));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonConfig.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 50, 50));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

        label_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo1.jpg"))); // NOI18N
        jPanel1.add(label_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_backActionPerformed
        // TODO add your handling code here:
        Vista_SeleccionDificultad dif = new Vista_SeleccionDificultad(m,config);
        dif.setLocationRelativeTo(null);
        dif.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_boton_backActionPerformed

    private void boton_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_backMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_boton_backMouseClicked

    private void btn_submit_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submit_signupActionPerformed
        
        /* Esta parte del codigo se fija si no existe un usuario identico sino lo agrega al LOG*/
        
        boolean permitido = true;
        String user = fielduser_signup.getText(); // Usuario ingresado
        String psw = ""; // Password ingresado
        char[] psw_field = fieldpsw_signup.getPassword();
        for (int i = 0 ;i<psw_field.length;i++){
            psw+=psw_field[i];
        }
        
        for(int i =0 ;i<singleton_bd.getLista().size();i++){
            if(singleton_bd.getLista().get(i).getUsuario().equals(user)){
                permitido = false;
            }
        }
        if(permitido){
            //JOptionPane.showMessageDialog(null, "Ta bien!");
            //singleton_bd
            //singleton_bd.actualizarLog();
            
            Usuario nuevo = new Usuario(user,psw,"0");
            singleton_bd.agregarUsuario(nuevo);
            singleton_bd.actualizarLog();
        }else{
            JOptionPane.showMessageDialog(null, "yaexiste!");
        }
        /*
        /* Primero me fijo que el usuario no sea repetido 
        try{
            File archivo = new File("log.txt");
            FileReader lector = new FileReader (archivo);
            BufferedReader buffer = new BufferedReader(lector);
            FileWriter escritor = new FileWriter(archivo,true);
            String linea;
            while ((linea=buffer.readLine())!=null){
                if (linea.contains(user+" ")){
                    permitido=false;
                }
            }
            buffer.close();
            lector.close();
            /* Si no esta repetido lo ingreso 
            if(permitido==false){
                JOptionPane.showMessageDialog(null, "El usuario ya existe, ingrese otro.");
            }else{
                escritor.write(user+" "+psw);
                escritor.write("\n");
                JOptionPane.showMessageDialog(null, "¡Registro correcto!");
                escritor.close();
            }
        }catch(Exception e){
            System.out.println("Error con el log");
        }*/
        
        
        
        
        
        
        
    }//GEN-LAST:event_btn_submit_signupActionPerformed

    private void btn_submit_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submit_loginActionPerformed
        // TODO add your handling code here:
        
        boolean permitido = false;
        String user = fielduser_login.getText(); // Usuario ingresado
        String psw = ""; // Password ingresado
        char[] psw_field = fieldpsw_login.getPassword();
        for (int i = 0 ;i<psw_field.length;i++){
            psw+=psw_field[i];
        }
        for(int i =0 ;i<singleton_bd.getLista().size();i++){
            if(singleton_bd.getLista().get(i).getUsuario().equals(user) && 
                    singleton_bd.getLista().get(i).getPassword().equals(psw)){
                permitido = true;
            }
        }
        if(permitido){
            JOptionPane.showMessageDialog(null, "Ingreso correcto!");
        }else{
            JOptionPane.showMessageDialog(null, "Usuario/PSW Incorrecto!");
        }
        /*
        /* Primero me fijo que el usuario no sea repetido 
        try{
            File archivo = new File("log.txt");
            FileReader lector = new FileReader (archivo);
            BufferedReader buffer = new BufferedReader(lector);
            FileWriter escritor = new FileWriter(archivo,true);
            String linea;
            while ((linea=buffer.readLine())!=null){
                if (linea.equals(user+" "+psw)){
                    permitido=true;
                }
            }
            buffer.close();
            lector.close();
            /* Si no esta repetido lo ingreso 
            if(permitido==false){
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta.");
            }else{
                JOptionPane.showMessageDialog(null,"¡Ingreso correcto!");
            }
        }catch(Exception e){
            System.out.println("Error con el log");
        }
        */
        
    }//GEN-LAST:event_btn_submit_loginActionPerformed

    private void fielduser_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fielduser_loginActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fielduser_loginActionPerformed

    private void fielduser_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fielduser_signupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fielduser_signupActionPerformed

    private void fieldpsw_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldpsw_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldpsw_loginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:\
        // this.musicaH.sonar(0);

        this.config.setVisible(true);
        this.config.recibirMusica(m);
        /*this.m.disperformMusic();*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //NewJFrame nw =  new NewJFrame ();
        //nw.setVisible(true);
        //nw.
        //this.dispose();
        GridTeclas a = new GridTeclas();
        a.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_LoginIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_LoginIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_LoginIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_LoginIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_LoginIndividual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_back;
    private javax.swing.JButton btn_submit_login;
    private javax.swing.JButton btn_submit_signup;
    private javax.swing.JPasswordField fieldpsw_login;
    private javax.swing.JPasswordField fieldpsw_signup;
    private javax.swing.JTextField fielduser_login;
    private javax.swing.JTextField fielduser_signup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label_fondo;
    private javax.swing.JLabel txt_login;
    private javax.swing.JLabel txt_psw_login;
    private javax.swing.JLabel txt_psw_signup;
    private javax.swing.JLabel txt_signup;
    private javax.swing.JLabel txt_user_login;
    private javax.swing.JLabel txt_user_user;
    // End of variables declaration//GEN-END:variables
}
