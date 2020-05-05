/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.view;

import schoolmgtsystem.model.CountFunction;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import schoolmgtsystem.dbhelper.DBHandler;

/**
 *
 * @author FabulousTHO
 */
public class AdminLogIn extends javax.swing.JFrame {

    String name;
    String sName;
    StudentInformation si = new StudentInformation();

    //String conStr = "jdbc:sqlserver://localhost;instanceName=SQLEXPRESS;databaseName=Home;user=sa;password=123456789";
    /**
     * Creates new form TeacherLogIn
     */
    public AdminLogIn() {
        initComponents();
        setLocationRelativeTo(null);
    }
    //OverLoading Constructor

    public AdminLogIn(String getValue) {
        initComponents();
        RecoverDetails rd = new RecoverDetails();
        RecoverDetails.txtEmail.setText(getValue);
        txtEmail.setText(getValue);
        txtPassword.setText(getValue);

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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        txtBack = new javax.swing.JLabel();
        SignUp1 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        btnSignin = new javax.swing.JButton();
        Recover = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Administrator_Male_96px_1.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Principal SignIn");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 256, 10));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 232, 10));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 184, 10));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 142, 10));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 116, 10));

        txtBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Left_30px_1.png"))); // NOI18N
        txtBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBackMouseClicked(evt);
            }
        });
        jPanel3.add(txtBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        SignUp1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SignUp1.setForeground(new java.awt.Color(255, 255, 255));
        SignUp1.setText("Sign Up instead");
        SignUp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUp1MouseClicked(evt);
            }
        });
        jPanel3.add(SignUp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, 20));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 255));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 100, -1));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 300, 530);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 4));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Sign In ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(160, 30, 93, 26);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Email Address");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(70, 180, 125, 26);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Password");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(70, 260, 87, 26);

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmail.setBorder(null);
        jPanel2.add(txtEmail);
        txtEmail.setBounds(70, 210, 330, 20);

        jSeparator2.setBackground(new java.awt.Color(0, 51, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 51, 255));
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(70, 310, 330, 10);

        jSeparator3.setBackground(new java.awt.Color(0, 51, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 51, 255));
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(70, 230, 330, 10);

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.setBorder(null);
        jPanel2.add(txtPassword);
        txtPassword.setBounds(70, 290, 330, 20);

        btnSignin.setBackground(new java.awt.Color(255, 255, 255));
        btnSignin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignin.setForeground(new java.awt.Color(255, 255, 255));
        btnSignin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Login.png"))); // NOI18N
        btnSignin.setBorder(null);
        btnSignin.setBorderPainted(false);
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignin);
        btnSignin.setBounds(110, 350, 40, 40);

        Recover.setBackground(new java.awt.Color(255, 255, 255));
        Recover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Recover.setForeground(new java.awt.Color(0, 102, 204));
        Recover.setText("Forgot Details ?");
        Recover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecoverMouseClicked(evt);
            }
        });
        jPanel2.add(Recover);
        Recover.setBounds(340, 470, 100, 20);

        btnSignup.setBackground(new java.awt.Color(255, 255, 255));
        btnSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Add_User.png"))); // NOI18N
        btnSignup.setToolTipText("Sign Up");
        btnSignup.setBorder(null);
        btnSignup.setBorderPainted(false);
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignup);
        btnSignup.setBounds(400, 20, 40, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(300, 0, 460, 530);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed

        String email = txtEmail.getText();
        String pass = txtPassword.getText();
        DBHandler handler = new DBHandler();

        ResultSet result = null;
        if (!email.equals("") && !pass.equals("")) {
            String query = "SELECT * FROM admin WHERE Email = ? AND Password = ?";
            try {
                PreparedStatement preparedStatement = handler.getdbConnection().prepareStatement(query);
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, pass);
                result = preparedStatement.executeQuery();
                int counter = 0;

                while (result.next()) {
                    counter++;
                    email = result.getString("Email");
                    pass = result.getString("Password");
                    name = result.getString("FirstName");
                    sName = result.getString("Surname");
                    System.out.println("Email-> " + email + ", Password-> " + pass);
                }

                if (counter == 1) {
                    JOptionPane.showMessageDialog(this, "Welcome Admin " + "(" + name + ")");
                    StudentInformation.lblName.setText("Welcome  < " + sName + " " + name + " >");
                    StudentInformation.studentCount.setText("Student Count = " + Integer.toString(CountFunction.CountData("student_details")));
                    StudentInformation.teacherCount.setText("Staff Count = " + Integer.toString(CountFunction.CountData("staff_details")));
                    si.show();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Please re-type\nYour email or password is/are incorrect");
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AdminLogIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Field can't be empty");
        }


    }//GEN-LAST:event_btnSigninActionPerformed

    private void txtBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackMouseClicked
        new Home().show();
        setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtBackMouseClicked

    private void SignUp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp1MouseClicked

    }//GEN-LAST:event_SignUp1MouseClicked

    private void RecoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecoverMouseClicked

        int sel = JOptionPane.showConfirmDialog(this, "Do you want to recover your details ?");
        if (sel == 0) {
            new RecoverDetails().show();
            this.dispose();
        }
        if (sel == 1) {
            this.show();
        }
        if (sel == 2) {
            this.show();
        }
    }//GEN-LAST:event_RecoverMouseClicked

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed

        new AdminSignUp().show();
        this.dispose();

    }//GEN-LAST:event_btnSignupActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
            new AdminLogIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Recover;
    private javax.swing.JLabel SignUp1;
    private javax.swing.JButton btnSignin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel txtBack;
    public static javax.swing.JTextField txtEmail;
    static javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
