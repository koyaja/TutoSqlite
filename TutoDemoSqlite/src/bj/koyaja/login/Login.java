/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.koyaja.login;

import bj.koyaja.controleur.logincontroleur;
import java.awt.Color;

/**
 *
 * @author M. KOMACLO
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        labbuton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setText("username");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 134, 180, -1));

        password.setText("jPasswordField1");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 180, 30));

        labbuton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labbutonMouseClicked(evt);
            }
        });
        getContentPane().add(labbuton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\M. KOMACLO\\Pictures\\Image projet\\login-template_1017-6719.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labbutonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labbutonMouseClicked
        // TODO add your handling code here:
        System.out.println("username "+username.getText()+"passeword"+password.getText());
        logincontroleur l=new logincontroleur();
     boolean rep=   l.login(username.getText(), password.getText());
      System.err.println("rep"+rep);
        labbuton.setBackground(Color.GREEN);
        if (rep==true) {
            System.out.println("succe");
        }else{
            System.err.println("    email ou mot de passe incorrect");
        }
    }//GEN-LAST:event_labbutonMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labbuton;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
