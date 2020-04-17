/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author FabulousTHO
 */
public class ForgotPassword extends javax.swing.JFrame {
    
    String conStr = "jdbc:sqlserver://localhost;instanceName=SQLEXPRESS;databaseName=SchoolManagementSystem;user=sa;password=123456789";

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtShowpassword = new javax.swing.JTextField();
        btnRetrieve = new javax.swing.JButton();
        txtEnterEmail = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Forgot your Password ?");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 10, 290, 29);

        txtShowpassword.setBackground(new java.awt.Color(240, 240, 240));
        txtShowpassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtShowpassword.setText("Show Password");
        txtShowpassword.setBorder(null);
        txtShowpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtShowpasswordMouseClicked(evt);
            }
        });
        jPanel1.add(txtShowpassword);
        txtShowpassword.setBounds(50, 200, 310, 30);

        btnRetrieve.setText("Retrieve");
        btnRetrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveActionPerformed(evt);
            }
        });
        jPanel1.add(btnRetrieve);
        btnRetrieve.setBounds(140, 140, 90, 25);

        txtEnterEmail.setBackground(new java.awt.Color(240, 240, 240));
        txtEnterEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEnterEmail.setText("Enter Email Address Here");
        txtEnterEmail.setBorder(null);
        txtEnterEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEnterEmailMouseClicked(evt);
            }
        });
        jPanel1.add(txtEnterEmail);
        txtEnterEmail.setBounds(50, 90, 310, 30);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        jPanel1.add(btnOK);
        btnOK.setBounds(160, 250, 60, 25);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(50, 230, 310, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(50, 120, 310, 10);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtShowpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtShowpasswordMouseClicked
        txtShowpassword.setText("");
    }//GEN-LAST:event_txtShowpasswordMouseClicked

    private void btnRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveActionPerformed
        try{
            String str = "Select * from Teachers where EmailAddress = ?";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");            
            try(Connection con = DriverManager.getConnection(conStr);
                    PreparedStatement smt = con.prepareStatement(str);)
            {  
               //TeacherLogIn tl = new StaffLogIn();
               smt.setString(1, txtEnterEmail.getText());
               ResultSet rs = smt.executeQuery();
               while(rs.next())
               {
                   ForgotPassword.txtShowpassword.setText(rs.getString("Password"));  
               }
            }
            catch(Exception e){
                    System.out.println(e);
                    }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnRetrieveActionPerformed

    private void txtEnterEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnterEmailMouseClicked
        txtEnterEmail.setText("");
    }//GEN-LAST:event_txtEnterEmailMouseClicked

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        new StaffLogIn().show();
        setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOKActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnRetrieve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTextField txtEnterEmail;
    public static javax.swing.JTextField txtShowpassword;
    // End of variables declaration//GEN-END:variables
}
