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
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author FabulousTHO
 */
public class StaffOnly extends javax.swing.JFrame {
    
    String conStr = "jdbc:sqlserver://localhost;instanceName=SQLEXPRESS;databaseName=SchoolManagementSystem;user=sa;password=123456789";

    /**
     * Creates new form TeachersOnly
     */
    public StaffOnly() {
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
        jPanel3 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Thom = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Ton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Nel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Emma = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Grace = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Lucy = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Rose = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Eric = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Vic = new javax.swing.JPanel();
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teachers Profile Access ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Classroom_100px_1.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, 112));

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Thomas   Ward");
        Thom.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 140, 20));

        jPanel1.add(Thom, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 400, 20));

        Ton.setBackground(new java.awt.Color(204, 204, 255));
        Ton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TonMouseExited(evt);
            }
        });
        Ton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tonny   Scott");
        Ton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 140, 20));

        jPanel1.add(Ton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 400, 20));

        Nel.setBackground(new java.awt.Color(204, 204, 255));
        Nel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NelMouseExited(evt);
            }
        });
        Nel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nelson  Mandela");
        Nel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 140, 20));

        jPanel1.add(Nel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 400, 20));

        Emma.setBackground(new java.awt.Color(204, 204, 255));
        Emma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmmaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EmmaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmmaMouseExited(evt);
            }
        });
        Emma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Emmanuel  Lee");
        Emma.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 140, 20));

        jPanel1.add(Emma, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 400, 20));

        Grace.setBackground(new java.awt.Color(204, 204, 255));
        Grace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GraceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GraceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GraceMouseExited(evt);
            }
        });
        Grace.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Grace   Williams");
        Grace.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 140, 20));

        jPanel1.add(Grace, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 400, 20));

        Lucy.setBackground(new java.awt.Color(204, 204, 255));
        Lucy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LucyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LucyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LucyMouseExited(evt);
            }
        });
        Lucy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Lucy   Scott");
        Lucy.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 140, 20));

        jPanel1.add(Lucy, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 400, 20));

        Rose.setBackground(new java.awt.Color(204, 204, 255));
        Rose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RoseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RoseMouseExited(evt);
            }
        });
        Rose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("RoseMary  Eric");
        Rose.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 140, 20));

        jPanel1.add(Rose, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 400, 20));

        Eric.setBackground(new java.awt.Color(204, 204, 255));
        Eric.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EricMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EricMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EricMouseExited(evt);
            }
        });
        Eric.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Eric   Scott");
        Eric.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 140, 20));

        jPanel1.add(Eric, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 400, 20));

        Vic.setBackground(new java.awt.Color(204, 204, 255));
        Vic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VicMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VicMouseExited(evt);
            }
        });
        Vic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Victorial  Paul");
        Vic.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 140, 20));

        jPanel1.add(Vic, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 400, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new Home().show();
        setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void ThomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThomMouseClicked
  String a = StaffLogIn.txtFirstName.getText();
        try{
            String str = "Select FirstName, Surname, State_of_Origin, PhoneNumber, EmailAddress, Password, Subject from Teachers where EmailAddress = 'thomasward@gmail.com'";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try(Connection con = DriverManager.getConnection(conStr);
                PreparedStatement smt = con.prepareStatement(str);)

            {
                StaffProfileOnly tp = new StaffProfileOnly();
                //smt.setString(1, StudentProfile.lblUser.getText());
                ResultSet rs = smt.executeQuery();
                while(rs.next())
                {
                    if (a.equals(rs.getString("FirstName"))) {
                        JOptionPane.showMessageDialog(tp,"Access granted\nYou are Thomas  Ward");
                    StaffProfileOnly.lblName.setText(rs.getString("FirstName"));
                    StaffProfileOnly.lblSurname.setText(rs.getString("Surname"));
                    StaffProfileOnly.lblState.setText(rs.getString("State_of_Origin"));
                    StaffProfileOnly.lblPhone.setText(rs.getString("PhoneNumber"));
                    StaffProfileOnly.lblEmail.setText(rs.getString("EmailAddress"));
                    StaffProfileOnly.lblPassword.setText(rs.getString("Password"));
                    StaffProfileOnly.lblSubject.setText(rs.getString("Subject"));
                    tp.setVisible(true);
                    tp.show();
                    }
                    else{
                        JOptionPane.showMessageDialog(tp,"Access denied\nYou are not Thomas  Ward");
                        new StaffOnly().show();
                        setVisible(true);
                        this.dispose();
                    }
                    
                }
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
        this.dispose();
    }//GEN-LAST:event_ThomMouseClicked

    private void ThomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThomMouseEntered
        setColor(Thom);
    }//GEN-LAST:event_ThomMouseEntered

    private void ThomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThomMouseExited
        resetColor(Thom);
    }//GEN-LAST:event_ThomMouseExited

    private void TonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TonMouseClicked
     String j = StaffLogIn.txtFirstName.getText();
        try{
            String str = "Select FirstName, Surname, State_of_Origin, PhoneNumber, EmailAddress, Password, Subject from Teachers where EmailAddress = 'tonnyscott@gmail.com'";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try(Connection con = DriverManager.getConnection(conStr);
                PreparedStatement smt = con.prepareStatement(str);)

            {
                StaffProfileOnly tp = new StaffProfileOnly();
                //smt.setString(1, StudentProfile.lblUser.getText());
                ResultSet rs = smt.executeQuery();
                while(rs.next())
                {
                    if (j.equals(rs.getString("FirstName"))) {
                        JOptionPane.showMessageDialog(tp,"Access granted\nYou are Tonny  Scott");
                    StaffProfileOnly.lblName.setText(rs.getString("FirstName"));
                    StaffProfileOnly.lblSurname.setText(rs.getString("Surname"));
                    StaffProfileOnly.lblState.setText(rs.getString("State_of_Origin"));
                    StaffProfileOnly.lblPhone.setText(rs.getString("PhoneNumber"));
                    StaffProfileOnly.lblEmail.setText(rs.getString("EmailAddress"));
                    StaffProfileOnly.lblPassword.setText(rs.getString("Password"));
                    StaffProfileOnly.lblSubject.setText(rs.getString("Subject"));
                    tp.setVisible(true);
                    tp.show();
                    }
                    else{
                        JOptionPane.showMessageDialog(tp,"Access denied\nYou are not Tonny  Scott");
                        new StaffOnly().show();
                        setVisible(true);
                        this.dispose();
                    }
                }
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
        this.dispose();
    }//GEN-LAST:event_TonMouseClicked

    private void TonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TonMouseEntered
        setColor(Ton);
    }//GEN-LAST:event_TonMouseEntered

    private void TonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TonMouseExited
        resetColor(Ton);
    }//GEN-LAST:event_TonMouseExited

    private void NelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NelMouseClicked
    String b = StaffLogIn.txtFirstName.getText();
        try{
            String str = "Select FirstName, Surname, State_of_Origin, PhoneNumber, EmailAddress, Password, Subject from Teachers where EmailAddress = 'nelsonmandela@gmail.com'";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try(Connection con = DriverManager.getConnection(conStr);
                PreparedStatement smt = con.prepareStatement(str);)

            {
                StaffProfileOnly tp = new StaffProfileOnly();
                //smt.setString(1, StudentProfile.lblUser.getText());
                ResultSet rs = smt.executeQuery();
                while(rs.next())
                {
                   if (b.equals(rs.getString("FirstName"))) {
                        JOptionPane.showMessageDialog(tp,"Access granted\nYou are Nelson  Mandela");
                    StaffProfileOnly.lblName.setText(rs.getString("FirstName"));
                    StaffProfileOnly.lblSurname.setText(rs.getString("Surname"));
                    StaffProfileOnly.lblState.setText(rs.getString("State_of_Origin"));
                    StaffProfileOnly.lblPhone.setText(rs.getString("PhoneNumber"));
                    StaffProfileOnly.lblEmail.setText(rs.getString("EmailAddress"));
                    StaffProfileOnly.lblPassword.setText(rs.getString("Password"));
                    StaffProfileOnly.lblSubject.setText(rs.getString("Subject"));
                    tp.setVisible(true);
                    tp.show();
                    }
                    else{
                        JOptionPane.showMessageDialog(tp,"Access denied\nYou are not Nelson  Mandela");
                        new StaffOnly().show();
                        setVisible(true);
                        this.dispose();
                    }
                }
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
        this.dispose();
    }//GEN-LAST:event_NelMouseClicked

    private void NelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NelMouseEntered
        setColor(Nel);
    }//GEN-LAST:event_NelMouseEntered

    private void NelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NelMouseExited
        resetColor(Nel);
    }//GEN-LAST:event_NelMouseExited

    private void EmmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmmaMouseClicked
    String c = StaffLogIn.txtFirstName.getText();
        try{
            String str = "Select FirstName, Surname, State_of_Origin, PhoneNumber, EmailAddress, Password, Subject from Teachers where EmailAddress = 'emmanuellee@gmail.com'";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try(Connection con = DriverManager.getConnection(conStr);
                PreparedStatement smt = con.prepareStatement(str);)

            {
                StaffProfileOnly tp = new StaffProfileOnly();
                //smt.setString(1, StudentProfile.lblUser.getText());
                ResultSet rs = smt.executeQuery();
                while(rs.next())
                {
                    if (c.equals(rs.getString("FirstName"))) {
                        JOptionPane.showMessageDialog(tp,"Access granted\nYou are Emmanuel  Lee");
                    StaffProfileOnly.lblName.setText(rs.getString("FirstName"));
                    StaffProfileOnly.lblSurname.setText(rs.getString("Surname"));
                    StaffProfileOnly.lblState.setText(rs.getString("State_of_Origin"));
                    StaffProfileOnly.lblPhone.setText(rs.getString("PhoneNumber"));
                    StaffProfileOnly.lblEmail.setText(rs.getString("EmailAddress"));
                    StaffProfileOnly.lblPassword.setText(rs.getString("Password"));
                    StaffProfileOnly.lblSubject.setText(rs.getString("Subject"));
                    tp.setVisible(true);
                    tp.show();
                    }
                    else{
                        JOptionPane.showMessageDialog(tp,"Access denied\nYou are not Emmanuel  Lee");
                        new StaffOnly().show();
                        setVisible(true);
                        this.dispose();
                    }
                }
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
        this.dispose();
    }//GEN-LAST:event_EmmaMouseClicked

    private void EmmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmmaMouseEntered
        setColor(Emma);
    }//GEN-LAST:event_EmmaMouseEntered

    private void EmmaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmmaMouseExited
        resetColor(Emma);
    }//GEN-LAST:event_EmmaMouseExited

    private void GraceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraceMouseClicked
    String d = StaffLogIn.txtFirstName.getText();
        try{
            String str = "Select FirstName, Surname, State_of_Origin, PhoneNumber, EmailAddress, Password, Subject from Teachers where EmailAddress = 'gracewilliams@gmail.com'";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try(Connection con = DriverManager.getConnection(conStr);
                PreparedStatement smt = con.prepareStatement(str);)

            {
                StaffProfileOnly tp = new StaffProfileOnly();
                //smt.setString(1, StudentProfile.lblUser.getText());
                ResultSet rs = smt.executeQuery();
                while(rs.next())
                {
                    if (d.equals(rs.getString("FirstName"))) {
                        JOptionPane.showMessageDialog(tp,"Access granted\nYou are Grace  Williams");
                    StaffProfileOnly.lblName.setText(rs.getString("FirstName"));
                    StaffProfileOnly.lblSurname.setText(rs.getString("Surname"));
                    StaffProfileOnly.lblState.setText(rs.getString("State_of_Origin"));
                    StaffProfileOnly.lblPhone.setText(rs.getString("PhoneNumber"));
                    StaffProfileOnly.lblEmail.setText(rs.getString("EmailAddress"));
                    StaffProfileOnly.lblPassword.setText(rs.getString("Password"));
                    StaffProfileOnly.lblSubject.setText(rs.getString("Subject"));
                    tp.setVisible(true);
                    tp.show();
                    }
                    else{
                        JOptionPane.showMessageDialog(tp,"Access denied\nYou are not Grace  Williams");
                        new StaffOnly().show();
                        setVisible(true);
                        this.dispose();
                    }
                }
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
        this.dispose();
    }//GEN-LAST:event_GraceMouseClicked

    private void GraceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraceMouseEntered
        setColor(Grace);
    }//GEN-LAST:event_GraceMouseEntered

    private void GraceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraceMouseExited
        resetColor(Grace);
    }//GEN-LAST:event_GraceMouseExited

    private void LucyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LucyMouseClicked
    String f = StaffLogIn.txtFirstName.getText();
        try{
            String str = "Select FirstName, Surname, State_of_Origin, PhoneNumber, EmailAddress, Password, Subject from Teachers where EmailAddress = 'lucyscott@gmail.com'";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try(Connection con = DriverManager.getConnection(conStr);
                PreparedStatement smt = con.prepareStatement(str);)

            {
                StaffProfileOnly tp = new StaffProfileOnly();
                //smt.setString(1, StudentProfile.lblUser.getText());
                ResultSet rs = smt.executeQuery();
                while(rs.next())
                {
                    if (f.equals(rs.getString("FirstName"))) {
                        JOptionPane.showMessageDialog(tp,"Access granted\nYou are Lucy  Scott");
                    StaffProfileOnly.lblName.setText(rs.getString("FirstName"));
                    StaffProfileOnly.lblSurname.setText(rs.getString("Surname"));
                    StaffProfileOnly.lblState.setText(rs.getString("State_of_Origin"));
                    StaffProfileOnly.lblPhone.setText(rs.getString("PhoneNumber"));
                    StaffProfileOnly.lblEmail.setText(rs.getString("EmailAddress"));
                    StaffProfileOnly.lblPassword.setText(rs.getString("Password"));
                    StaffProfileOnly.lblSubject.setText(rs.getString("Subject"));
                    tp.setVisible(true);
                    tp.show();
                    }
                    else{
                        JOptionPane.showMessageDialog(tp,"Access denied\nYou are not Lucy  Scott");
                        new StaffOnly().show();
                        setVisible(true);
                        this.dispose();
                    }
                }
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
        this.dispose();
    }//GEN-LAST:event_LucyMouseClicked

    private void LucyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LucyMouseEntered
        setColor(Lucy);
    }//GEN-LAST:event_LucyMouseEntered

    private void LucyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LucyMouseExited
        resetColor(Lucy);
    }//GEN-LAST:event_LucyMouseExited

    private void RoseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoseMouseClicked
     String g = StaffLogIn.txtFirstName.getText();
        try{
            String str = "Select FirstName, Surname, State_of_Origin, PhoneNumber, EmailAddress, Password, Subject from Teachers where EmailAddress = 'rosemaryeric@gmail.com'";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try(Connection con = DriverManager.getConnection(conStr);
                PreparedStatement smt = con.prepareStatement(str);)

            {
                StaffProfileOnly tp = new StaffProfileOnly();
                //smt.setString(1, StudentProfile.lblUser.getText());
                ResultSet rs = smt.executeQuery();
                while(rs.next())
                {
                     if (g.equals(rs.getString("FirstName"))) {
                        JOptionPane.showMessageDialog(tp,"Access granted\nYou are RoseMary  Eric");
                    StaffProfileOnly.lblName.setText(rs.getString("FirstName"));
                    StaffProfileOnly.lblSurname.setText(rs.getString("Surname"));
                    StaffProfileOnly.lblState.setText(rs.getString("State_of_Origin"));
                    StaffProfileOnly.lblPhone.setText(rs.getString("PhoneNumber"));
                    StaffProfileOnly.lblEmail.setText(rs.getString("EmailAddress"));
                    StaffProfileOnly.lblPassword.setText(rs.getString("Password"));
                    StaffProfileOnly.lblSubject.setText(rs.getString("Subject"));
                    tp.setVisible(true);
                    tp.show();
                    }
                    else{
                        JOptionPane.showMessageDialog(tp,"Access denied\nYou are not RoseMary Eric");
                        new StaffOnly().show();
                        setVisible(true);
                        this.dispose();
                    }
                }
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
        this.dispose();
    }//GEN-LAST:event_RoseMouseClicked

    private void RoseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoseMouseEntered
        setColor(Rose);
    }//GEN-LAST:event_RoseMouseEntered

    private void RoseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoseMouseExited
        resetColor(Rose);
    }//GEN-LAST:event_RoseMouseExited

    private void EricMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EricMouseClicked
     String h = StaffLogIn.txtFirstName.getText();
        try{
            String str = "Select FirstName, Surname, State_of_Origin, PhoneNumber, EmailAddress, Password, Subject from Teachers where EmailAddress = 'ericscott@gmail.com'";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try(Connection con = DriverManager.getConnection(conStr);
                PreparedStatement smt = con.prepareStatement(str);)

            {
                StaffProfileOnly tp = new StaffProfileOnly();
                //smt.setString(1, StudentProfile.lblUser.getText());
                ResultSet rs = smt.executeQuery();
                while(rs.next())
                {
                    if (h.equals(rs.getString("FirstName"))) {
                        JOptionPane.showMessageDialog(tp,"Access granted\nYou are Eric  Scott");
                    StaffProfileOnly.lblName.setText(rs.getString("FirstName"));
                    StaffProfileOnly.lblSurname.setText(rs.getString("Surname"));
                    StaffProfileOnly.lblState.setText(rs.getString("State_of_Origin"));
                    StaffProfileOnly.lblPhone.setText(rs.getString("PhoneNumber"));
                    StaffProfileOnly.lblEmail.setText(rs.getString("EmailAddress"));
                    StaffProfileOnly.lblPassword.setText(rs.getString("Password"));
                    StaffProfileOnly.lblSubject.setText(rs.getString("Subject"));
                    tp.setVisible(true);
                    tp.show();
                    }
                    else{
                        JOptionPane.showMessageDialog(tp,"Access denied\nYou are not Eric  Scott");
                        new StaffOnly().show();
                        setVisible(true);
                        this.dispose();
                    }
                }
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
        this.dispose();
    }//GEN-LAST:event_EricMouseClicked

    private void EricMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EricMouseEntered
        setColor(Eric);
    }//GEN-LAST:event_EricMouseEntered

    private void EricMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EricMouseExited
        resetColor(Eric);
    }//GEN-LAST:event_EricMouseExited

    private void VicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VicMouseClicked
       String i = StaffLogIn.txtFirstName.getText();
        try{
            String str = "Select FirstName, Surname, State_of_Origin, PhoneNumber, EmailAddress, Password, Subject from Teachers where EmailAddress = 'victoriapaul@gmail.com'";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try(Connection con = DriverManager.getConnection(conStr);
                PreparedStatement smt = con.prepareStatement(str);)

            {
                StaffProfileOnly tp = new StaffProfileOnly();
                //smt.setString(1, StudentProfile.lblUser.getText());
                ResultSet rs = smt.executeQuery();
                while(rs.next())
                {
                    if (i.equals(rs.getString("FirstName"))) {
                        JOptionPane.showMessageDialog(tp,"Access granted\nYou are Victoria Paul");
                    StaffProfileOnly.lblName.setText(rs.getString("FirstName"));
                    StaffProfileOnly.lblSurname.setText(rs.getString("Surname"));
                    StaffProfileOnly.lblState.setText(rs.getString("State_of_Origin"));
                    StaffProfileOnly.lblPhone.setText(rs.getString("PhoneNumber"));
                    StaffProfileOnly.lblEmail.setText(rs.getString("EmailAddress"));
                    StaffProfileOnly.lblPassword.setText(rs.getString("Password"));
                    StaffProfileOnly.lblSubject.setText(rs.getString("Subject"));
                    tp.setVisible(true);
                    tp.show();
                    }
                    else{
                        JOptionPane.showMessageDialog(tp,"Access denied\nYou are not Victoria Paul");
                        new StaffOnly().show();
                        setVisible(true);
                        this.dispose();
                    }
                }
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
        this.dispose();
    }//GEN-LAST:event_VicMouseClicked

    private void VicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VicMouseEntered
        setColor(Vic);
    }//GEN-LAST:event_VicMouseEntered

    private void VicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VicMouseExited
        resetColor(Vic);
    }//GEN-LAST:event_VicMouseExited
        public void setColor(JPanel panel) {
           panel.setBackground(new java.awt.Color(51,102,255));
       }
        public void resetColor(JPanel panel) {
           panel.setBackground(new java.awt.Color(204,204,255));
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
            java.util.logging.Logger.getLogger(StaffOnly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffOnly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffOnly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffOnly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffOnly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Emma;
    private javax.swing.JPanel Eric;
    private javax.swing.JPanel Grace;
    private javax.swing.JPanel Lucy;
    private javax.swing.JPanel Nel;
    private javax.swing.JPanel Rose;
    private javax.swing.JPanel Thom;
    private javax.swing.JPanel Ton;
    private javax.swing.JPanel Vic;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
