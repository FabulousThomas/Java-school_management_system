/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.view;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import schoolmgtsystem.dbhelper.DBHandler;

/**
 *
 * @author Thomas
 */
public class StaffMgt extends javax.swing.JFrame {
    
    String s;
    InputStream input;
    BufferedImage bufferedImage;
    ImageIcon imageIcon;

    /**
     * Creates new form StaffMgt
     */
    public StaffMgt() {
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

        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTel1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtTel2 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHome = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        txtState = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Position = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtJobDes = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        StartDate = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        EndDate = new com.toedter.calendar.JDateChooser();
        lblImage = new javax.swing.JLabel();
        btnPassport = new javax.swing.JButton();
        RFemale = new javax.swing.JRadioButton();
        RMale = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnRetrieve = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(970, 627));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 51));
        txtName.setBorder(null);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 310, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Full Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("STAFF MANAGEMENT(Update)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Phone Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 110, -1));

        txtTel1.setBackground(new java.awt.Color(255, 255, 255));
        txtTel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTel1.setForeground(new java.awt.Color(51, 51, 51));
        txtTel1.setBorder(null);
        jPanel1.add(txtTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 310, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator4.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 310, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 310, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("Email Address");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator6.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 310, -1));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(51, 51, 51));
        txtEmail.setBorder(null);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 310, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 204));
        jLabel11.setText("Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, -1));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 310, 20));

        jSeparator12.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator12.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 310, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 204));
        jLabel12.setText("Mobile Number");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 110, -1));

        txtTel2.setBackground(new java.awt.Color(255, 255, 255));
        txtTel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTel2.setForeground(new java.awt.Color(51, 51, 51));
        txtTel2.setBorder(null);
        jPanel1.add(txtTel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 310, 20));

        jSeparator13.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator13.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 310, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("Home Address");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 120, -1));

        txtHome.setBackground(new java.awt.Color(255, 255, 255));
        txtHome.setColumns(20);
        txtHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtHome.setForeground(new java.awt.Color(51, 51, 51));
        txtHome.setRows(5);
        jScrollPane1.setViewportView(txtHome);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 310, 90));

        jSeparator3.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 310, -1));

        txtState.setBackground(new java.awt.Color(255, 255, 255));
        txtState.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtState.setForeground(new java.awt.Color(51, 51, 51));
        txtState.setBorder(null);
        jPanel1.add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 310, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 204));
        jLabel14.setText("State of origin");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Position");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 70, -1));

        Position.setBackground(new java.awt.Color(255, 255, 255));
        Position.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Position.setForeground(new java.awt.Color(51, 51, 51));
        Position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Position", "Head Teacher", "Quiz Master/Mistress", "Sports Master", "Spelling Bee Master/Mistress", "Assembly Cordinator" }));
        jPanel1.add(Position, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 310, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 204));
        jLabel16.setText("Job Description");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 120, -1));

        txtJobDes.setBackground(new java.awt.Color(255, 255, 255));
        txtJobDes.setColumns(20);
        txtJobDes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtJobDes.setForeground(new java.awt.Color(51, 51, 51));
        txtJobDes.setRows(5);
        jScrollPane2.setViewportView(txtJobDes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 310, 50));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 204));
        jLabel15.setText("Date of joining");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 120, -1));

        StartDate.setBackground(new java.awt.Color(255, 255, 255));
        StartDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StartDate.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(StartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 200, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 204));
        jLabel17.setText("End Date");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 120, -1));

        EndDate.setBackground(new java.awt.Color(255, 255, 255));
        EndDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EndDate.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(EndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 200, 30));

        lblImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 230, 240));

        btnPassport.setBackground(new java.awt.Color(0, 153, 204));
        btnPassport.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnPassport.setForeground(new java.awt.Color(255, 255, 255));
        btnPassport.setText("Add Passport");
        btnPassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassportActionPerformed(evt);
            }
        });
        jPanel1.add(btnPassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 120, 30));

        RFemale.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RFemale.setText("Female");
        jPanel1.add(RFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 100, 30));

        RMale.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RMale.setText("Male");
        RMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RMaleActionPerformed(evt);
            }
        });
        jPanel1.add(RMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 80, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("Gender");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 60, -1));

        btnsave.setBackground(new java.awt.Color(255, 255, 255));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(0, 153, 204));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.setBorderPainted(false);
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsaveMousePressed(evt);
            }
        });
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 120, 36));

        btncancel.setBackground(new java.awt.Color(255, 255, 255));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(0, 153, 204));
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Cancel.png"))); // NOI18N
        btncancel.setText("Cancel");
        btncancel.setBorderPainted(false);
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
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 120, 36));

        btnRetrieve.setBackground(new java.awt.Color(255, 255, 255));
        btnRetrieve.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRetrieve.setForeground(new java.awt.Color(0, 153, 204));
        btnRetrieve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Data_Recovery1.png"))); // NOI18N
        btnRetrieve.setText("Retrieve");
        btnRetrieve.setToolTipText("Retrieve");
        btnRetrieve.setBorderPainted(false);
        btnRetrieve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRetrieveMousePressed(evt);
            }
        });
        btnRetrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveActionPerformed(evt);
            }
        });
        jPanel1.add(btnRetrieve, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 130, 36));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Staff ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 95, 70, 20));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(51, 51, 51));
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 89, 120, 30));

        lblError.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 110, 20));

        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Xbox_X.png"))); // NOI18N
        btnClose.setToolTipText("close");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassportActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("*.image", "jpg", "gif", "png");
        chooser.addChoosableFileFilter(extensionFilter);
        int result = chooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lblImage.setIcon(resizeImage(path));
            s = path;
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No Data");
        }
    }//GEN-LAST:event_btnPassportActionPerformed

    private void RMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RMaleActionPerformed

    private void btnsaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveMousePressed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        
        DBHandler handler = new DBHandler();
        String str = "UPDATE staff_details SET StaffName=?,Passport=?,Email=?,Tel1=?,Tel2=?,"
                + "JobDescription=?,Position=?,HomeAddress=?,StartDate=?,EndDate=?,Gender=?,Password=?,State=? "
                + "WHERE StaffID=?";
        try {
            
            try (PreparedStatement pst = handler.getdbConnection().prepareStatement(str)) {
                pst.setString(1, txtName.getText());
//                input = new FileInputStream(new File(s));
                pst.setBlob(2, (Blob) bufferedImage);
                pst.setString(3, txtEmail.getText());
                pst.setString(4, txtTel1.getText());
                pst.setString(5, txtTel2.getText());
                pst.setString(6, txtJobDes.getText());
                pst.setString(7, (String) Position.getSelectedItem());
                pst.setString(8, txtHome.getText());
                pst.setDate(9, convertUtilDateToSqlDate(StartDate.getDate()));
                pst.setDate(10, convertUtilDateToSqlDate(EndDate.getDate()));
                
                String gender;
                if (RMale.isSelected()) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }
                pst.setString(11, gender);
                pst.setString(12, txtPassword.getText());
                pst.setString(13, txtState.getText());
                pst.setString(14, txtID.getText());
                
                int count = pst.executeUpdate();
                JOptionPane.showMessageDialog(this, count + " Successful");
            }
            
            txtName.setText("");
            lblImage.setText("");
            txtState.setText("");
            txtTel1.setText("");
            txtTel2.setText("");
            txtEmail.setText("");
            EndDate.setCalendar(null);
            StartDate.setCalendar(null);
            txtHome.setText("");
            txtJobDes.setText("");
            txtPassword.setText("");
            Position.setSelectedIndex(0);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StaffSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void btncancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMousePressed

    }//GEN-LAST:event_btncancelMousePressed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        
        this.dispose();

    }//GEN-LAST:event_btncancelActionPerformed

    private void btnRetrieveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetrieveMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrieveMousePressed

    private void btnRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveActionPerformed
        
        String id = txtID.getText();
        String name = txtName.getText();
        String email = txtEmail.getText();
        String tel1 = txtTel1.getText();
        String tel2 = txtTel2.getText();
        String home = txtHome.getText();
        String pass = txtPassword.getText();
        String state = txtState.getText();
        String position = (String) Position.getSelectedItem();
        String job = txtJobDes.getText();
        Date start = StartDate.getDate();
        Date end = EndDate.getDate();
        
        DBHandler handler = new DBHandler();
        ResultSet rs = null;
        
        if (!id.isEmpty()) {
            String str = "SELECT * FROM staff_details WHERE StaffID=?";
            try {
                PreparedStatement pst = handler.getdbConnection().prepareStatement(str);
                pst.setString(1, id);
                rs = pst.executeQuery();
                int counter = 0;
                if (rs.next()) {
                    counter++;
                    name = rs.getString("StaffName");
                    email = rs.getString("Email");
                    tel1 = rs.getString("Tel1");
                    tel2 = rs.getString("Tel2");
                    home = rs.getString("HomeAddress");
                    pass = rs.getString("Password");
                    state = rs.getString("State");
                    position = rs.getString("Position");
                    job = rs.getString("JobDescription");
                    start = rs.getDate("StartDate");
                    end = rs.getDate("EndDate");
                    bufferedImage = ImageIO.read(rs.getBinaryStream("Passport"));
                    
                } else {
                    JOptionPane.showMessageDialog(this, "No Staff ID as " + id);
                    JTextField temp = null;
                    for (Component C : jPanel1.getComponents()) {
                        if (C.getClass().toString().contains("javax.swing.JTextField")) {
                            temp = (JTextField) C;
                            temp.setText(null);
                        }
                    }
                    Position.setSelectedIndex(0);
                    txtHome.setText(null);
                    txtJobDes.setText(null);
                    StartDate.setDate(null);
                    EndDate.setDate(null);
                    lblImage.setText("");
                    lblImage.setIcon(null);
                }
                if (counter == 1) {
                    txtName.setText(name);
                    txtEmail.setText(email);
                    txtTel1.setText(tel1);
                    txtTel2.setText(tel2);
                    txtHome.setText(home);
                    txtPassword.setText(pass);
                    txtState.setText(state);
                    Position.setSelectedItem(position);
                    txtJobDes.setText(job);
                    StartDate.setDate(start);
                    EndDate.setDate(end);
                    imageIcon = new ImageIcon(new ImageIcon(bufferedImage).getImage().getScaledInstance(lblImage.getWidth(),
                            lblImage.getHeight(), Image.SCALE_DEFAULT));
                    lblImage.setIcon(imageIcon);
                    lblError.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Can't retrieve data !");
                }
                
            } catch (ClassNotFoundException | SQLException | IOException ex) {
                Logger.getLogger(StaffMgt.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            lblError.setText("ID is needed !");
            JTextField temp = null;
            for (Component C : jPanel1.getComponents()) {
                if (C.getClass().toString().contains("javax.swing.JTextField")) {
                    temp = (JTextField) C;
                    temp.setText(null);
                }
            }
            Position.setSelectedIndex(0);
            txtHome.setText(null);
            txtJobDes.setText(null);
            StartDate.setDate(null);
            EndDate.setDate(null);
            lblImage.setText("");
            lblImage.setIcon(null);
        }

    }//GEN-LAST:event_btnRetrieveActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        
        this.dispose();

    }//GEN-LAST:event_btnCloseMouseClicked

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
            java.util.logging.Logger.getLogger(StaffMgt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StaffMgt().setVisible(true);
        });
    }

    //Getting image size
    public ImageIcon resizeImage(String imgPath) {
        ImageIcon myImage = new ImageIcon(imgPath);
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        
        return image;
        
    }
    
    private java.sql.Date getCurrentDate() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getYear());
    }
    
    private java.sql.Date convertUtilDateToSqlDate(java.util.Date date) {
        if (date != null) {
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            return sqlDate;
        }
        
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser EndDate;
    private javax.swing.JComboBox<String> Position;
    private javax.swing.JRadioButton RFemale;
    private javax.swing.JRadioButton RMale;
    private com.toedter.calendar.JDateChooser StartDate;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnPassport;
    private javax.swing.JButton btnRetrieve;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtHome;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextArea txtJobDes;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTel1;
    private javax.swing.JTextField txtTel2;
    // End of variables declaration//GEN-END:variables

}