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
import javax.swing.JPanel;
import schoolmgtsystem.dbhelper.DBHandler;

/**
 *
 * @author FabulousTHO
 */
public class ViewProfile extends javax.swing.JFrame {

    DBHandler handler = new DBHandler();

    String conStr = "jdbc:sqlserver://localhost;instanceName=SQLEXPRESS;databaseName=SchoolManagementSystem;user=sa;password=123456789";

    /**
     * Creates new form ViewProfile
     */
    public ViewProfile() {
        initComponents();
//        ImageIcon ic = new ImageIcon("C:\\Users\\Sony\\Pictures\\iCloud Photos\\Downloads\\IMG_1541.JPG");
//        JLabel lbl = new JLabel(ic);
//        StudentProfile.lblImage.add(lbl,new Integer(500));
    }

    //Overloading Constructor
    public ViewProfile(String gettext) {
        initComponents();

        StudentProfile.lblName.setText(gettext);
        StudentProfile.lblSurname.setText(gettext);
        StudentProfile.lblUser.setText(gettext);
        StudentProfile.lblID.setText(gettext);
        StudentProfile.lblCode.setText(gettext);
        StudentProfile.lblEmail.setText(gettext);
        StudentProfile.lblState.setText(gettext);
        StudentProfile.lblPhone.setText(gettext);
        StudentProfile.lblImage.setText(gettext);

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
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        Thom = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Fab = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Dan = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Will = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Lyd = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Adams = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Viv = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Dap = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Kel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Win = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Dav = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_User_Groups_104px_1.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 256, 10));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 232, 10));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 184, 10));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 142, 10));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 116, 10));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Left_30px_1.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 540));

        Thom.setBackground(new java.awt.Color(204, 204, 255));
        Thom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ThomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ThomMouseExited(evt);
            }
        });
        Thom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("  Thomas  Eric");
        Thom.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 140, 20));

        jPanel1.add(Thom, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 370, 20));

        Fab.setBackground(new java.awt.Color(204, 204, 255));
        Fab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FabMouseExited(evt);
            }
        });
        Fab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("  Fabulous   Thomas");
        Fab.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 140, 20));

        jPanel1.add(Fab, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 370, 20));

        Dan.setBackground(new java.awt.Color(204, 204, 255));
        Dan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DanMouseExited(evt);
            }
        });
        Dan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("  Daniel     Scott");
        Dan.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 140, 20));

        jPanel1.add(Dan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 370, 20));

        Will.setBackground(new java.awt.Color(204, 204, 255));
        Will.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WillMouseExited(evt);
            }
        });
        Will.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("   Williams    Wells");
        Will.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 140, 20));

        jPanel1.add(Will, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 370, 20));

        Lyd.setBackground(new java.awt.Color(204, 204, 255));
        Lyd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LydMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LydMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LydMouseExited(evt);
            }
        });
        Lyd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("   Lydia   Scott");
        Lyd.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 140, 20));

        jPanel1.add(Lyd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 370, 20));

        Adams.setBackground(new java.awt.Color(204, 204, 255));
        Adams.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdamsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdamsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdamsMouseExited(evt);
            }
        });
        Adams.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("   Adams Rechard");
        Adams.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 140, 20));

        jPanel1.add(Adams, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 370, 20));

        Viv.setBackground(new java.awt.Color(204, 204, 255));
        Viv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VivMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VivMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VivMouseExited(evt);
            }
        });
        Viv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("   Vivian Raphael");
        Viv.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 140, 20));

        jPanel1.add(Viv, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 370, 20));

        Dap.setBackground(new java.awt.Color(204, 204, 255));
        Dap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DapMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DapMouseExited(evt);
            }
        });
        Dap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("   Daphne  Felix");
        Dap.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 140, 20));

        jPanel1.add(Dap, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 370, 20));

        Kel.setBackground(new java.awt.Color(204, 204, 255));
        Kel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KelMouseExited(evt);
            }
        });
        Kel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("   Kelvin  Chris");
        Kel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 140, 20));

        jPanel1.add(Kel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 370, 20));

        Win.setBackground(new java.awt.Color(204, 204, 255));
        Win.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WinMouseExited(evt);
            }
        });
        Win.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("   Winner Alexander");
        Win.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 140, 20));

        jPanel1.add(Win, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 370, 20));

        Dav.setBackground(new java.awt.Color(204, 204, 255));
        Dav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DavMouseExited(evt);
            }
        });
        Dav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("  David  Samuel");
        Dav.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 140, 20));

        jPanel1.add(Dav, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 370, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     private JPanel panel;
    private void FabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FabMouseEntered
        setColor(Fab);
    }//GEN-LAST:event_FabMouseEntered

    private void FabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FabMouseExited
        resetColor(Fab);
    }//GEN-LAST:event_FabMouseExited

    private void DanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanMouseEntered
        setColor(Dan);
    }//GEN-LAST:event_DanMouseEntered

    private void DanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanMouseExited
        resetColor(Dan);
    }//GEN-LAST:event_DanMouseExited

    private void WillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WillMouseEntered
        setColor(Will);
    }//GEN-LAST:event_WillMouseEntered

    private void WillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WillMouseExited
        resetColor(Will);
    }//GEN-LAST:event_WillMouseExited

    private void LydMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LydMouseEntered
        setColor(Lyd);
    }//GEN-LAST:event_LydMouseEntered

    private void LydMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LydMouseExited
        resetColor(Lyd);
    }//GEN-LAST:event_LydMouseExited

    private void AdamsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdamsMouseEntered
        setColor(Adams);
    }//GEN-LAST:event_AdamsMouseEntered

    private void AdamsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdamsMouseExited
        resetColor(Adams);
    }//GEN-LAST:event_AdamsMouseExited

    private void VivMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VivMouseEntered
        setColor(Viv);
    }//GEN-LAST:event_VivMouseEntered

    private void VivMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VivMouseExited
        resetColor(Viv);
    }//GEN-LAST:event_VivMouseExited

    private void DapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DapMouseEntered
        setColor(Dap);
    }//GEN-LAST:event_DapMouseEntered

    private void DapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DapMouseExited
        resetColor(Dap);
    }//GEN-LAST:event_DapMouseExited

    private void KelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KelMouseEntered
        setColor(Kel);
    }//GEN-LAST:event_KelMouseEntered

    private void KelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KelMouseExited
        resetColor(Kel);
    }//GEN-LAST:event_KelMouseExited

    private void WinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WinMouseEntered
        setColor(Win);
    }//GEN-LAST:event_WinMouseEntered

    private void WinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WinMouseExited
        resetColor(Win);
    }//GEN-LAST:event_WinMouseExited

    private void DavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DavMouseEntered
        setColor(Dav);
    }//GEN-LAST:event_DavMouseEntered

    private void DavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DavMouseExited
        resetColor(Dav);
    }//GEN-LAST:event_DavMouseExited

    private void ThomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThomMouseEntered
        setColor(Thom);
    }//GEN-LAST:event_ThomMouseEntered

    private void ThomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThomMouseExited
        resetColor(Thom);
    }//GEN-LAST:event_ThomMouseExited

    private void FabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FabMouseClicked

        try {

            handler = new DBHandler();

            String str = "Select FirstName, Surname,Username, StudentID, CourseCode, Email, State, Phone from PrincipalView where Email = 'fabulousthomas@gmail.com'";
            PreparedStatement pst = handler.getdbConnection().prepareStatement(str);

            StudentProfile sp = new StudentProfile();
            //smt.setString(1, StudentProfile.lblUser.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                StudentProfile.lblName.setText(rs.getString("FirstName"));
                StudentProfile.lblSurname.setText(rs.getString("Surname"));
                StudentProfile.lblUser.setText(rs.getString("Username"));
                StudentProfile.lblID.setText(rs.getString("StudentID"));
                StudentProfile.lblCode.setText(rs.getString("CourseCode"));
                StudentProfile.lblEmail.setText(rs.getString("Email"));
                StudentProfile.lblState.setText(rs.getString("State"));
                StudentProfile.lblPhone.setText(rs.getString("Phone"));
                //StudentProfile.lblImage.setText(rs.getString("Photo"));
                sp.show();
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();

    }//GEN-LAST:event_FabMouseClicked

    private void DanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanMouseClicked
        try {

            handler = new DBHandler();

            String str = "Select FirstName, Surname,Username, StudentID, CourseCode, Email, State, Phone from PrincipalView where Email = 'dandav@gmail.com'";
            PreparedStatement pst = handler.getdbConnection().prepareStatement(str);

            StudentProfile sp = new StudentProfile();
            //smt.setString(1, StudentProfile.lblUser.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                StudentProfile.lblName.setText(rs.getString("FirstName"));
                StudentProfile.lblSurname.setText(rs.getString("Surname"));
                StudentProfile.lblUser.setText(rs.getString("Username"));
                StudentProfile.lblID.setText(rs.getString("StudentID"));
                StudentProfile.lblCode.setText(rs.getString("CourseCode"));
                StudentProfile.lblEmail.setText(rs.getString("Email"));
                StudentProfile.lblState.setText(rs.getString("State"));
                StudentProfile.lblPhone.setText(rs.getString("Phone"));
                //StudentProfile.lblImage.setText(rs.getString("Photo"));
                sp.show();
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_DanMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new PrincipalView().show();
        setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void WillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WillMouseClicked
        try {

            handler = new DBHandler();

            String str = "Select FirstName, Surname,Username, StudentID, CourseCode, Email, State, Phone from PrincipalView where Email = 'viv@gmail.com'";
            PreparedStatement pst = handler.getdbConnection().prepareStatement(str);

            StudentProfile sp = new StudentProfile();
            //smt.setString(1, StudentProfile.lblUser.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                StudentProfile.lblName.setText(rs.getString("FirstName"));
                StudentProfile.lblSurname.setText(rs.getString("Surname"));
                StudentProfile.lblUser.setText(rs.getString("Username"));
                StudentProfile.lblID.setText(rs.getString("StudentID"));
                StudentProfile.lblCode.setText(rs.getString("CourseCode"));
                StudentProfile.lblEmail.setText(rs.getString("Email"));
                StudentProfile.lblState.setText(rs.getString("State"));
                StudentProfile.lblPhone.setText(rs.getString("Phone"));
                //StudentProfile.lblImage.setText(rs.getString("Photo"));
                sp.show();
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_WillMouseClicked

    private void LydMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LydMouseClicked
        try {

            handler = new DBHandler();

            String str = "Select FirstName, Surname,Username, StudentID, CourseCode, Email, State, Phone from PrincipalView where Email = 'lydiascott@gmail.com'";
            PreparedStatement pst = handler.getdbConnection().prepareStatement(str);

            StudentProfile sp = new StudentProfile();
            //smt.setString(1, StudentProfile.lblUser.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                StudentProfile.lblName.setText(rs.getString("FirstName"));
                StudentProfile.lblSurname.setText(rs.getString("Surname"));
                StudentProfile.lblUser.setText(rs.getString("Username"));
                StudentProfile.lblID.setText(rs.getString("StudentID"));
                StudentProfile.lblCode.setText(rs.getString("CourseCode"));
                StudentProfile.lblEmail.setText(rs.getString("EmailAddress"));
                StudentProfile.lblState.setText(rs.getString("State"));
                StudentProfile.lblPhone.setText(rs.getString("Phone"));
                //StudentProfile.lblImage.setText(rs.getString("Photo"));
                sp.show();
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_LydMouseClicked

    private void AdamsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdamsMouseClicked
        try {

            handler = new DBHandler();

            String str = "Select FirstName, Surname,Username, StudentID, CourseCode, Email, State, Phone from PrincipalView where Email = 'adamswills@gmail.com'";
            PreparedStatement pst = handler.getdbConnection().prepareStatement(str);

            StudentProfile sp = new StudentProfile();
            //smt.setString(1, StudentProfile.lblUser.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                StudentProfile.lblName.setText(rs.getString("FirstName"));
                StudentProfile.lblSurname.setText(rs.getString("Surname"));
                StudentProfile.lblUser.setText(rs.getString("Username"));
                StudentProfile.lblID.setText(rs.getString("StudentID"));
                StudentProfile.lblCode.setText(rs.getString("CourseCode"));
                StudentProfile.lblEmail.setText(rs.getString("Email"));
                StudentProfile.lblState.setText(rs.getString("State"));
                StudentProfile.lblPhone.setText(rs.getString("Phone"));
                //StudentProfile.lblImage.setText(rs.getString("Photo"));
                sp.show();
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_AdamsMouseClicked

    private void VivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VivMouseClicked
        try {

            handler = new DBHandler();

            String str = "Select FirstName, Surname,Username, StudentID, CourseCode, Email, State, Phone from PrincipalView where Email = 'niit@gmail.com'";
            PreparedStatement pst = handler.getdbConnection().prepareStatement(str);

            StudentProfile sp = new StudentProfile();
            //smt.setString(1, StudentProfile.lblUser.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                StudentProfile.lblName.setText(rs.getString("FirstName"));
                StudentProfile.lblSurname.setText(rs.getString("Surname"));
                StudentProfile.lblUser.setText(rs.getString("Username"));
                StudentProfile.lblID.setText(rs.getString("StudentID"));
                StudentProfile.lblCode.setText(rs.getString("CourseCode"));
                StudentProfile.lblEmail.setText(rs.getString("Email"));
                StudentProfile.lblState.setText(rs.getString("State"));
                StudentProfile.lblPhone.setText(rs.getString("Phone"));
                //StudentProfile.lblImage.setText(rs.getString("Photo"));
                sp.show();
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_VivMouseClicked

    private void DapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DapMouseClicked
        try {

            handler = new DBHandler();

            String str = "Select FirstName, Surname,Username, StudentID, CourseCode, Email, State, Phone from PrincipalView where Email = 'niit@gmail.com'";
            PreparedStatement pst = handler.getdbConnection().prepareStatement(str);

            StudentProfile sp = new StudentProfile();
            //smt.setString(1, StudentProfile.lblUser.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                StudentProfile.lblName.setText(rs.getString("FirstName"));
                StudentProfile.lblSurname.setText(rs.getString("Surname"));
                StudentProfile.lblUser.setText(rs.getString("Username"));
                StudentProfile.lblID.setText(rs.getString("StudentID"));
                StudentProfile.lblCode.setText(rs.getString("CourseCode"));
                StudentProfile.lblEmail.setText(rs.getString("Email"));
                StudentProfile.lblState.setText(rs.getString("State"));
                StudentProfile.lblPhone.setText(rs.getString("Phone"));
                //StudentProfile.lblImage.setText(rs.getString("Photo"));
                sp.show();
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_DapMouseClicked

    private void KelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KelMouseClicked
        try {

            handler = new DBHandler();

            String str = "Select FirstName, Surname,Username, StudentID, CourseCode, Email, State, Phone from PrincipalView where Email = 'niit@gmail.com'";
            PreparedStatement pst = handler.getdbConnection().prepareStatement(str);

            StudentProfile sp = new StudentProfile();
            //smt.setString(1, StudentProfile.lblUser.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                StudentProfile.lblName.setText(rs.getString("FirstName"));
                StudentProfile.lblSurname.setText(rs.getString("Surname"));
                StudentProfile.lblUser.setText(rs.getString("Username"));
                StudentProfile.lblID.setText(rs.getString("StudentID"));
                StudentProfile.lblCode.setText(rs.getString("CourseCode"));
                StudentProfile.lblEmail.setText(rs.getString("Email"));
                StudentProfile.lblState.setText(rs.getString("State"));
                StudentProfile.lblPhone.setText(rs.getString("Phone"));
                //StudentProfile.lblImage.setText(rs.getString("Photo"));
                sp.show();
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_KelMouseClicked

    private void ThomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThomMouseClicked
        try {

            handler = new DBHandler();

            String str = "Select FirstName, Surname,Username, StudentID, CourseCode, Email, State, Phone from PrincipalView where Email = 'thomaseric@gmail.com'";
            PreparedStatement pst = handler.getdbConnection().prepareStatement(str);

            StudentProfile sp = new StudentProfile();
            //smt.setString(1, StudentProfile.lblUser.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                StudentProfile.lblName.setText(rs.getString("FirstName"));
                StudentProfile.lblSurname.setText(rs.getString("Surname"));
                StudentProfile.lblUser.setText(rs.getString("Username"));
                StudentProfile.lblID.setText(rs.getString("StudentID"));
                StudentProfile.lblCode.setText(rs.getString("CourseCode"));
                StudentProfile.lblEmail.setText(rs.getString("Email"));
                StudentProfile.lblState.setText(rs.getString("State"));
                StudentProfile.lblPhone.setText(rs.getString("Phone"));
                //StudentProfile.lblImage.setText(rs.getString("Photo"));
                sp.show();
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_ThomMouseClicked
    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(51, 102, 255));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(204, 204, 255));
    }

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
            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Adams;
    private javax.swing.JPanel Dan;
    private javax.swing.JPanel Dap;
    private javax.swing.JPanel Dav;
    private javax.swing.JPanel Fab;
    private javax.swing.JPanel Kel;
    private javax.swing.JPanel Lyd;
    private javax.swing.JPanel Thom;
    private javax.swing.JPanel Viv;
    private javax.swing.JPanel Will;
    private javax.swing.JPanel Win;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
