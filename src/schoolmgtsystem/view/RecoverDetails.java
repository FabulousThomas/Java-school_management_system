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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import schoolmgtsystem.dbhelper.DBHandler;

/**
 *
 * @author FabulousTHO
 */
public class RecoverDetails extends javax.swing.JFrame {

    String conStr = "jdbc:sqlserver://localhost;instanceName=SQLEXPRESS;databaseName=SchoolManagementSystem;user=sa;password=123456789";

    /**
     * Creates new form RecoverDetails
     */
    public RecoverDetails() {
        initComponents();
        //txtError.setVisible(false);
    }

    public RecoverDetails(String value) {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnRecover = new javax.swing.JButton();
        txtError = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Forgot your SignIn Details ?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 340, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Enter your Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 150, 20));

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 240, -1));

        btnRecover.setText("OK");
        btnRecover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecoverActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecover, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 60, -1));

        txtError.setEditable(false);
        txtError.setBackground(new java.awt.Color(255, 102, 0));
        txtError.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtError.setForeground(new java.awt.Color(255, 255, 255));
        txtError.setBorder(null);
        jPanel1.add(txtError, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 270, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecoverActionPerformed
        String a = txtUsername.getText();

        try {

            DBHandler handler = new DBHandler();

            String str = "Select * from Principal";
            PreparedStatement pst = handler.getdbConnection().prepareStatement(str);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                if (a.equals(rs.getString("Username"))) {

//txtError.setText("Details are correct");
                    AdminLogIn pl = new AdminLogIn();
                    AdminLogIn.txtEmail.setText(rs.getString("EmailAddress"));
                    AdminLogIn.txtPassword.setText(rs.getString("Password"));
                    pl.show();
                    JOptionPane.showMessageDialog(this, "Details recovered successfully");
                    this.dispose();
                } else {
                    txtError.setText("Invalid UserName");
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RecoverDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

//        try {
//            String str = "Select * from Principal";
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            try (Connection con = DriverManager.getConnection(conStr);
//                    PreparedStatement smt = con.prepareStatement(str);) {
//                ResultSet rs = smt.executeQuery();
//                while (rs.next()) {
//                    if (a.equals(rs.getString("Username"))) {
//
////txtError.setText("Details are correct");
//                        AdminLogIn pl = new AdminLogIn();
//                        AdminLogIn.txtFirstName.setText(rs.getString("FirstName"));
//                        AdminLogIn.txtEmail.setText(rs.getString("EmailAddress"));
//                        AdminLogIn.txtPassword.setText(rs.getString("Password"));
//                        pl.show();
//                        JOptionPane.showMessageDialog(this, "Details recovered successfully");
//                        this.dispose();
//                    } else {
//                        txtError.setText("Invalid UserName");
//                    }
//                }
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(RecoverDetails.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnRecoverActionPerformed

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
            java.util.logging.Logger.getLogger(RecoverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecoverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecoverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecoverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecoverDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtError;
    static javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
