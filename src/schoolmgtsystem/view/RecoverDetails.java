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
import schoolmgtsystem.model.dbhelper.DBHandler;

/**
 *
 * @author FabulousTHO
 */
public class RecoverDetails extends javax.swing.JFrame {

//    String conStr = "jdbc:sqlserver://localhost;instanceName=SQLEXPRESS;databaseName=SchoolManagementSystem;user=sa;password=123456789";
//    AdminLogIn pl = new AdminLogIn();
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
        txtEmail = new javax.swing.JTextField();
        btnRecover = new javax.swing.JButton();
        txtError = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Forgot your SignIn Details ?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 340, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Enter Email-Address");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 230, 20));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 300, 40));

        btnRecover.setBackground(new java.awt.Color(255, 255, 255));
        btnRecover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Ok.png"))); // NOI18N
        btnRecover.setBorder(null);
        btnRecover.setBorderPainted(false);
        btnRecover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecoverActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecover, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 40, 40));

        txtError.setEditable(false);
        txtError.setBackground(new java.awt.Color(255, 255, 255));
        txtError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtError.setForeground(new java.awt.Color(255, 0, 0));
        txtError.setBorder(null);
        jPanel1.add(txtError, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 310, 50));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Cancel.png"))); // NOI18N
        btnCancel.setBorder(null);
        btnCancel.setBorderPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecoverActionPerformed

//        String email = txtEmail.getText();
//
//        DBHandler handler = new DBHandler();
//
//        if (!email.equals("")) {
//            String str = "Select * from staff_details where Email = ?";
//            PreparedStatement pst;
//            try {
//                pst = handler.getdbConnection().prepareStatement(str);
//                pst.setString(1, email);
//                ResultSet rs = pst.executeQuery();
////                int counter = 0;
//                while (rs.next()) {
////                    counter++;
//                    email = rs.getString("Email");
//                    System.out.println(email);
//
//                }
//                if (email.equals(rs.getString("Email"))) {
//                    txtError.setText("Successful");
//                    AdminLogIn.email = rs.getString("Email");
//                    AdminLogIn.pass = rs.getString("Password");
//                    pl.show();
//                    JOptionPane.showMessageDialog(this, "Details recovered successfully");
//                    this.dispose();
//                } else {
//                    txtError.setText("Invalid email\nPlease re-type");
//                }
//
//            } catch (ClassNotFoundException | SQLException ex) {
//                Logger.getLogger(RecoverDetails.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "Field is empty");
//        }
        String email = txtEmail.getText();

        DBHandler handler = new DBHandler();

        if (!email.equals("")) {
            String str = "Select * from admin where Email = ?";
            try {
                PreparedStatement pst = handler.getdbConnection().prepareStatement(str);
                pst.setString(1, email);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    email = rs.getString("Email");
                    System.out.println(email);

                    if (email.equals(rs.getString("Email"))) {

                        txtError.setText("Successful");
                        AdminLogIn pl = new AdminLogIn();
                        AdminLogIn.txtEmail.setText(rs.getString("Email"));
                        AdminLogIn.txtPassword.setText(rs.getString("Password"));
                        pl.show();
                        this.dispose();
                        JOptionPane.showMessageDialog(this, "Details recovered successfully");

                    } else {
                        txtError.setText("Failed to retrieve");
                    }
                } else {
                    txtError.setText("Email does not exist, Please re-type");
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(RecoverDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            txtError.setText("Field can't be empty");
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

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        int sel = JOptionPane.showConfirmDialog(this, "Are you sure?");
        switch (sel) {
            case 0:
                new AdminLogIn().show();
                this.dispose();
                break;
            case 1:
                this.show();
                break;
            case 2:
                this.show();
                break;
            default:
                this.show();
                break;
        }


    }//GEN-LAST:event_btnCancelActionPerformed

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
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRecover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    static javax.swing.JTextField txtEmail;
    public static javax.swing.JTextField txtError;
    // End of variables declaration//GEN-END:variables
}
