/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.view;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import schoolmgtsystem.model.dbhelper.DBHandler;

/**
 *
 * @author FabulousTHO
 */
public class StudentProfile extends javax.swing.JFrame {

    /**
     * Creates new form StudentProfile
     */
    String s;
    DBHandler handler = new DBHandler();
    InputStream input;

    public StudentProfile() {
        initComponents();
        btnPassport.setVisible(false);

        //jPanel1.setBackground(new java.awt.Color(51,102,255,100));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        CYes = new javax.swing.JCheckBox();
        CNo = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        Medical = new javax.swing.JComboBox<>();
        DisabilityType = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        PhysicalDis = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CMale = new javax.swing.JCheckBox();
        CFemale = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        RegDate = new com.toedter.calendar.JDateChooser();
        EndDate = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblImage = new javax.swing.JLabel();
        btnPassport = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        admClass = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        preSchool = new javax.swing.JTextField();
        preClass = new javax.swing.JTextField();
        Session = new com.toedter.calendar.JYearChooser();
        btnResult = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("STUDENT INFORMATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 23));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Left_30px_1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, 40, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Personal Details", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Student ID");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, -1));

        lblID.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblID.setForeground(new java.awt.Color(51, 51, 51));
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID.setText("ID");
        lblID.setEnabled(false);
        jPanel3.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, 20));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Full Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, -1));

        Name.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("Name");
        jPanel3.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 250, 20));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 250, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Password");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, -1));

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 250, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("previous School");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 250, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Previous Class");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 250, 10));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Disability ?");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        buttonGroup2.add(CYes);
        CYes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CYes.setText("Yes");
        CYes.setBorderPainted(true);
        jPanel3.add(CYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        buttonGroup2.add(CNo);
        CNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CNo.setSelected(true);
        CNo.setText("No");
        CNo.setBorderPainted(true);
        CNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(CNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Medical Condition");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 130, -1));

        Medical.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        Medical.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Anxiety", "Obesity", "Diabetes", "Back pain", "Allergic rhinitis", "Hypertention", "Reflux esophagitis", "Hyperlipidemia", "Others" }));
        jPanel3.add(Medical, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 230, 30));

        DisabilityType.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        DisabilityType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Vision", "Hearing", "Thinking", "Learning", "Movement", "Mental health", "Communicating", "Social relationships", "Others" }));
        jPanel3.add(DisabilityType, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 230, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Disability Type");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 100, -1));

        PhysicalDis.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        PhysicalDis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Arthritis", "Back injury", "Amputation", "Spina bifida", "Cerebral palsy", "Multiple sclerosis", "Spinal cord injury", "Muscular dystrophy", "Others" }));
        jPanel3.add(PhysicalDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 230, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Physical Disabilities");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Gender");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        buttonGroup1.add(CMale);
        CMale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CMale.setSelected(true);
        CMale.setText("Male");
        CMale.setBorderPainted(true);
        jPanel3.add(CMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        buttonGroup1.add(CFemale);
        CFemale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CFemale.setText("Female");
        CFemale.setBorderPainted(true);
        CFemale.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(CFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Admission Class");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 110, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Session");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Registration Date");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        RegDate.setBackground(new java.awt.Color(255, 255, 255));
        RegDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RegDate.setForeground(new java.awt.Color(51, 51, 51));
        RegDate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel3.add(RegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 140, 30));

        EndDate.setBackground(new java.awt.Color(255, 255, 255));
        EndDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EndDate.setForeground(new java.awt.Color(51, 51, 51));
        EndDate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel3.add(EndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 140, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("End Date");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 140, 10));

        lblImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 220, 200));

        btnPassport.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnPassport.setForeground(new java.awt.Color(0, 102, 204));
        btnPassport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Add.png"))); // NOI18N
        btnPassport.setText("Edit Passport");
        btnPassport.setToolTipText("Edit Passport");
        btnPassport.setBorder(null);
        btnPassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassportActionPerformed(evt);
            }
        });
        jPanel3.add(btnPassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 130, 36));

        btnEdit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 102, 204));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Edit1.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setToolTipText("Edit");
        btnEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEdit.setBorderPainted(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel3.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 110, 36));

        btnSave.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 102, 204));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setToolTipText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSave.setBorderPainted(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 110, 36));

        admClass.setEditable(false);
        admClass.setBackground(new java.awt.Color(255, 255, 255));
        admClass.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        admClass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        admClass.setText("Admission Class");
        admClass.setBorder(null);
        jPanel3.add(admClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 140, 20));

        name.setEditable(false);
        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setText("Full Name");
        name.setBorder(null);
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 250, 20));

        password.setEditable(false);
        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setText("Password");
        password.setBorder(null);
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 250, 20));

        preSchool.setEditable(false);
        preSchool.setBackground(new java.awt.Color(255, 255, 255));
        preSchool.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        preSchool.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        preSchool.setText("Previous School");
        preSchool.setBorder(null);
        jPanel3.add(preSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 250, 20));

        preClass.setEditable(false);
        preClass.setBackground(new java.awt.Color(255, 255, 255));
        preClass.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        preClass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        preClass.setText("Previous Class");
        preClass.setBorder(null);
        jPanel3.add(preClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 250, 20));

        Session.setBackground(new java.awt.Color(255, 255, 255));
        Session.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(Session, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 140, 30));

        btnResult.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnResult.setForeground(new java.awt.Color(0, 102, 204));
        btnResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Report_Card.png"))); // NOI18N
        btnResult.setText("Result");
        btnResult.setToolTipText("Check Result");
        btnResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnResult.setBorderPainted(false);
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });
        jPanel3.add(btnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 110, 36));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 910, 530));

        lblName.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Logged in as");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 200, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Logged in as:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        new Home().show();
        this.dispose();

    }//GEN-LAST:event_jLabel3MouseClicked

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

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        name.setEditable(true);
        preSchool.setEditable(true);
        preClass.setEditable(true);
        password.setEditable(true);
        admClass.setEditable(true);
        Medical.setEditable(true);
        PhysicalDis.setEditable(true);
        DisabilityType.setEditable(true);
        btnPassport.setVisible(true);

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        handler = new DBHandler();
        String update = "UPDATE student_details SET StudentName=?,Gender=?,PreviousSchool=?,PreviousClass=?,AdmissionClass=?,"
                + "Session=?,PhysicalDisability=?,DisabilityType=?,MedicalCondition=?,Passport=?,Disability=?,RegDate=?,EndDate=?,Password=?"
                + "WHERE StudentID=?";

        try (PreparedStatement pst = handler.getdbConnection().prepareStatement(update)) {

            pst.setString(1, name.getText());

            String gender;
            if (CMale.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            pst.setString(2, gender);
            pst.setString(3, preSchool.getText());
            pst.setString(4, preClass.getText());
            pst.setString(5, admClass.getText());
            pst.setInt(6, Session.getYear());
            pst.setString(7, (String) PhysicalDis.getSelectedItem());
            pst.setString(8, (String) DisabilityType.getSelectedItem());
            pst.setString(9, (String) Medical.getSelectedItem());

            input = new FileInputStream(new File(s));
            pst.setBlob(10, input);

            String disability;
            if (CYes.isSelected()) {
                disability = "Yes";
            } else {
                disability = "No";
            }

            pst.setString(11, disability);
            pst.setDate(12, convertUtilDateToSqlDate(RegDate.getDate()));
            pst.setDate(13, convertUtilDateToSqlDate(EndDate.getDate()));
            pst.setString(14, password.getText());
            pst.setString(15, lblID.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Saved");
            pst.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentSignup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentProfile.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed

        handler = new DBHandler();
        StudentResult_SSS sr = new StudentResult_SSS();
        StudentResult_JSS rj = new StudentResult_JSS();
        StudentResult_Nursery rn = new StudentResult_Nursery();
        StudentResult_Primary rp = new StudentResult_Primary();
        String sname = name.getText();
        String sid = lblID.getText();
        String adm = admClass.getText();

        try {
            String query = "SELECT * FROM student_details WHERE StudentID=?";
            PreparedStatement pst = handler.getdbConnection().prepareStatement(query);
            pst.setString(1, sid);
            ResultSet rs = pst.executeQuery();
            int counter = 0;
            while (rs.next()) {
                counter++;
                sid = rs.getString("StudentID");
                sname = rs.getString("StudentName");
                adm = rs.getString("AdmissionClass");
                System.out.println(sid);
            }
            if (counter == 1) {
                if (adm.startsWith("S")) {
                    StudentResult_SSS.txtStudentID.setText(sid);
                    StudentResult_SSS.txtFullName.setText(sname);
                    StudentResult_SSS.txtClass.setText(adm);
                    StudentResult_SSS.txtStudentID.setEditable(false);
                    sr.show();
                } else if (adm.startsWith("J")) {
                    StudentResult_JSS.txtStudentID.setText(sid);
                    StudentResult_JSS.txtFullName.setText(sname);
                    StudentResult_JSS.txtClass.setText(adm);
                    StudentResult_JSS.txtStudentID.setEditable(false);
                    rj.show();
                } else if (adm.startsWith("P")) {
                    StudentResult_Primary.txtStudentID.setText(sid);
                    StudentResult_Primary.txtFullName.setText(sname);
                    StudentResult_Primary.txtClass.setText(adm);
                    StudentResult_Primary.txtStudentID.setEditable(false);
                    rp.show();
                } else if (adm.startsWith("N")) {
                    StudentResult_Nursery.txtStudentID.setText(sid);
                    StudentResult_Nursery.txtFullName.setText(sname);
                    StudentResult_Nursery.txtClass.setText(adm);
                    StudentResult_Nursery.txtStudentID.setEditable(false);
                    rn.show();
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentProfile.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnResultActionPerformed

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
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StudentProfile().setVisible(true);
        });
    }

    public ImageIcon resizeImage(String imgPath) {
        ImageIcon myImage = new ImageIcon(imgPath);
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);

        return image;

    }

    private java.sql.Date convertUtilDateToSqlDate(java.util.Date date) {
        if (date != null) {
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            return sqlDate;
        }

        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CFemale;
    private javax.swing.JCheckBox CMale;
    private javax.swing.JCheckBox CNo;
    private javax.swing.JCheckBox CYes;
    public static javax.swing.JComboBox<String> DisabilityType;
    public static com.toedter.calendar.JDateChooser EndDate;
    public static javax.swing.JComboBox<String> Medical;
    static javax.swing.JLabel Name;
    public static javax.swing.JComboBox<String> PhysicalDis;
    public static com.toedter.calendar.JDateChooser RegDate;
    public static com.toedter.calendar.JYearChooser Session;
    public static javax.swing.JTextField admClass;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPassport;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    static javax.swing.JLabel lblID;
    public static javax.swing.JLabel lblImage;
    public static javax.swing.JLabel lblName;
    public static javax.swing.JTextField name;
    public static javax.swing.JTextField password;
    public static javax.swing.JTextField preClass;
    public static javax.swing.JTextField preSchool;
    // End of variables declaration//GEN-END:variables
}
