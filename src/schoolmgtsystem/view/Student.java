/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import schoolmgtsystem.model.dbhelper.DBHandler;

/**
 *
 * @author FabulousTHO
 */
public class Student extends javax.swing.JFrame {

    DBHandler handler;
    BufferedImage bufferedImage;
    ImageIcon imageIcon;
    String dbImage;
    Date regdate;
    Date enddate;
    int session;
    String preSch;
    String ID;
    String disability;
    String disType;
    String physDis;
    String preClass;
    String admClass;
    String med;

//    String image = StudentProfileOnly.lblImage.getText();
//    String conStr = "jdbc:sqlserver://localhost;instanceName=SQLEXPRESS;databaseName=Home;user=sa;password=123456789";
    /**
     * Creates new form TeacherLogIn
     */
    public Student() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        btncancel = new javax.swing.JButton();
        btnSignIn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        chkPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_User_Account_100px.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registered Student");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 30));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 256, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 232, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 184, 10));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 142, 10));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 116, 10));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 330, 480);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 0, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Please enter your SignIn details....");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Full Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
        txtFirstName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFirstName.setBorder(null);
        jPanel2.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 280, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 51, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 280, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 260, 20));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 280, 10));

        btncancel.setBackground(new java.awt.Color(255, 255, 255));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Cancel.png"))); // NOI18N
        btncancel.setToolTipText("Cancel");
        btncancel.setBorder(null);
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncancelMousePressed(evt);
            }
        });
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel2.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 50, 40));

        btnSignIn.setBackground(new java.awt.Color(255, 255, 255));
        btnSignIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Login.png"))); // NOI18N
        btnSignIn.setToolTipText("Login");
        btnSignIn.setBorder(null);
        btnSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSignInMousePressed(evt);
            }
        });
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 50, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Sign In ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 26));

        chkPassword.setBackground(new java.awt.Color(255, 255, 255));
        chkPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Show_Password.png"))); // NOI18N
        chkPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(chkPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, 20));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(330, 0, 380, 480);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelMousePressed

    private void btnSignInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignInMousePressed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed

        handler = new DBHandler();
        String name = txtFirstName.getText();
        String pass = txtPassword.getText();

        ResultSet result = null;
        if (!name.equals("") && !pass.equals("")) {
            String query = "SELECT * FROM student_details WHERE StudentName = ? AND Password = ? ";

            try {
                PreparedStatement preparedStatement = handler.getdbConnection().prepareStatement(query);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, pass);
                result = preparedStatement.executeQuery();
                int counter = 0;
                if (result.next()) {
                    counter++;
                    name = result.getString("StudentName");
                    pass = result.getString("Password");
                    regdate = result.getDate("RegDate");
                    enddate = result.getDate("EndDate");
                    session = result.getInt("Session");
                    preSch = result.getString("PreviousSchool");
                    ID = result.getString("StudentID");
                    disability = result.getString("Disability");
                    disType = result.getString("DisabilityType");
                    physDis = result.getString("PhysicalDisability");
                    preClass = result.getString("PreviousClass");
                    admClass = result.getString("AdmissionClass");
                    med = result.getString("MedicalCondition");

                    System.out.println("Welcome " + name + " " + pass + regdate + enddate);
                }
                if (counter == 1) {
//                    JOptionPane.showMessageDialog(this, "Welcome " + name);
                    StudentProfile sp = new StudentProfile();
                    StudentProfile.name.setText(name);
                    StudentProfile.Session.setYear(session);
                    StudentProfile.RegDate.setDate(regdate);
                    StudentProfile.EndDate.setDate(enddate);
                    StudentProfile.preSchool.setText(preSch);
                    StudentProfile.lblID.setText(ID);
                    StudentProfile.lblName.setText(name);
                    StudentProfile.DisabilityType.setSelectedItem(disType);
                    StudentProfile.PhysicalDis.setSelectedItem(physDis);
                    StudentProfile.preClass.setText(preClass);
                    StudentProfile.admClass.setText(admClass);
                    StudentProfile.Medical.setSelectedItem(med);
                    //Alternative: To set image fom the DB to a label without scaled size image
//                    bufferedImage = ImageIO.read(result.getBinaryStream("Passport"));
//                    StudentProfileOnly.lblImage.setIcon(new ImageIcon(bufferedImage));

                    //Alternative: To set image fom the DB to a label with scaled size image
                    bufferedImage = ImageIO.read(result.getBinaryStream("Passport"));
                    imageIcon = new ImageIcon(new ImageIcon(bufferedImage).getImage().getScaledInstance(StudentProfile.lblImage.getWidth(), StudentProfile.lblImage.getHeight(), Image.SCALE_DEFAULT));
                    StudentProfile.lblImage.setIcon(imageIcon);
                    sp.show();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Please re-type\nYour name or password is/are incorrect");
                }

            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Field can't be empty");
            System.out.println("Please enter valid details...");
        }

    }//GEN-LAST:event_btnSignInActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        new Home().show();
        setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncancelActionPerformed

    private void chkPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPasswordActionPerformed

        if (chkPassword.isSelected()) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }

    }//GEN-LAST:event_chkPasswordActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Student().setVisible(true);
        });
    }

//    public ImageIcon resizeImage(String imgPath) {
//        ImageIcon myImage = new ImageIcon(imgPath);
//        Image img = myImage.getImage();
//        Image newImage = img.getScaledInstance(StudentProfileOnly.lblImage.getWidth(), StudentProfileOnly.lblImage.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon image = new ImageIcon(newImage);
//
//        return image;
//
//    }
    public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date) {
        if (date != null) {
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            return sqlDate;
        }

        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btncancel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    static javax.swing.JTextField txtFirstName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

}
