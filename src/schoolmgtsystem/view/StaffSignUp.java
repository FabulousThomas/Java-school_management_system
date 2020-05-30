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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import schoolmgtsystem.model.dbhelper.DBHandler;

/**
 *
 * @author FabulousTHO
 */
public class StaffSignUp extends javax.swing.JFrame {

    String s;
//    String conStr = "jdbc:sqlserver://localhost;instanceName=SQLEXPRESS;databaseName=SchoolManagementSystem;user=sa;password=123456789";

    /**
     * Creates new form TeachersSignUp
     */
    public StaffSignUp() {
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtState = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtTel1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnsignup = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        RMale = new javax.swing.JRadioButton();
        RFemale = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        txtTel2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHome = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        Position = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtJobDes = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        StartDate = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        EndDate = new com.toedter.calendar.JDateChooser();
        lblImage = new javax.swing.JLabel();
        btnPassport = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Classroom_100px_1.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Staff SignUp");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 256, 10));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 232, 10));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 184, 10));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 142, 10));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 116, 10));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, -20, 340, 620);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Full Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Position");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 70, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Phone Number");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 110, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("Email Address");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("Gender");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 60, -1));

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 51));
        txtName.setBorder(null);
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 310, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 204));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 310, -1));

        txtState.setBackground(new java.awt.Color(255, 255, 255));
        txtState.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtState.setForeground(new java.awt.Color(51, 51, 51));
        txtState.setBorder(null);
        jPanel2.add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 310, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 204));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 310, -1));

        txtTel1.setBackground(new java.awt.Color(255, 255, 255));
        txtTel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTel1.setForeground(new java.awt.Color(51, 51, 51));
        txtTel1.setBorder(null);
        jPanel2.add(txtTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 310, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator4.setForeground(new java.awt.Color(0, 102, 204));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 310, -1));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(51, 51, 51));
        txtEmail.setBorder(null);
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 310, 20));

        jSeparator5.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator5.setForeground(new java.awt.Color(0, 102, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 10, 600));

        btnsignup.setBackground(new java.awt.Color(0, 153, 153));
        btnsignup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(255, 255, 255));
        btnsignup.setText("SignUp");
        btnsignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsignupMousePressed(evt);
            }
        });
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel2.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 120, 36));

        btncancel.setBackground(new java.awt.Color(0, 153, 153));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
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
        jPanel2.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 110, 36));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Sign Up ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 30));

        buttonGroup1.add(RMale);
        RMale.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RMale.setText("Male");
        RMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RMaleActionPerformed(evt);
            }
        });
        jPanel2.add(RMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 80, 30));

        buttonGroup1.add(RFemale);
        RFemale.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RFemale.setText("Female");
        jPanel2.add(RFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 100, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 204));
        jLabel12.setText("Mobile Number");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 110, -1));

        jSeparator13.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator13.setForeground(new java.awt.Color(0, 102, 204));
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 310, -1));

        txtTel2.setBackground(new java.awt.Color(255, 255, 255));
        txtTel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTel2.setForeground(new java.awt.Color(51, 51, 51));
        txtTel2.setBorder(null);
        jPanel2.add(txtTel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 310, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("Home Address");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 120, -1));

        txtHome.setBackground(new java.awt.Color(255, 255, 255));
        txtHome.setColumns(20);
        txtHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtHome.setForeground(new java.awt.Color(51, 51, 51));
        txtHome.setRows(5);
        jScrollPane1.setViewportView(txtHome);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 310, 90));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 204));
        jLabel14.setText("State of origin");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, -1));

        Position.setBackground(new java.awt.Color(255, 255, 255));
        Position.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Position.setForeground(new java.awt.Color(51, 51, 51));
        Position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Position", "Head Teacher", "Quiz Master/Mistress", "Sports Master", "Spelling Bee Master/Mistress", "Assembly Cordinator" }));
        jPanel2.add(Position, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 310, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 204));
        jLabel15.setText("Date of joining");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 120, -1));

        txtJobDes.setBackground(new java.awt.Color(255, 255, 255));
        txtJobDes.setColumns(20);
        txtJobDes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtJobDes.setForeground(new java.awt.Color(51, 51, 51));
        txtJobDes.setRows(5);
        jScrollPane2.setViewportView(txtJobDes);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 310, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 204));
        jLabel16.setText("Job Description");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 120, -1));

        StartDate.setBackground(new java.awt.Color(255, 255, 255));
        StartDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StartDate.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(StartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 200, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 204));
        jLabel17.setText("End Date");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 120, -1));

        EndDate.setBackground(new java.awt.Color(255, 255, 255));
        EndDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EndDate.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(EndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 200, 30));

        lblImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 230, 240));

        btnPassport.setBackground(new java.awt.Color(0, 153, 204));
        btnPassport.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnPassport.setForeground(new java.awt.Color(255, 255, 255));
        btnPassport.setText("Add Passport");
        btnPassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassportActionPerformed(evt);
            }
        });
        jPanel2.add(btnPassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 120, 30));

        jSeparator6.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator6.setForeground(new java.awt.Color(0, 102, 204));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 310, -1));

        jSeparator12.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator12.setForeground(new java.awt.Color(0, 102, 204));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 310, -1));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setBorder(null);
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 310, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 204));
        jLabel11.setText("Password");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(340, 0, 990, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1333, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMousePressed
        // TODO add your handling code here:
        new Home().show();
        setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncancelMousePressed

    private void btnsignupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsignupMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsignupMousePressed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        new Home().show();
        setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formMousePressed
    private JFrame jf;
    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        // TODO add your handling code here:
//        Pattern myPattern1 = Pattern.compile("^[a-z]+[a-z.0-9-]+@[a-z]+(\\.[a-z]+[a-z]+)([/?].*)?$");
//        Matcher myMatcher1 = myPattern1.matcher(txtEmail.getText());
//        Boolean myBoolean1 = myMatcher1.matches();
//
//        Pattern myPattern2 = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z]).{8,}");
//        Matcher myMatcher2 = myPattern2.matcher(txtPassword.getText());
//        Boolean myBoolean2 = myMatcher2.matches();
//
//        if ((myBoolean1 == true) && (myBoolean2 == true)) {
//            JOptionPane.showMessageDialog(this, "Email and Password are correct");
//        } else {
//            JOptionPane.showMessageDialog(this, "Email and/or Password are incorrect\nHint:\t \t \t Start your Email with a LowerCase\n "
//                    + "Start your Password with an UpperCase");
//        }
//
////                        setVisible(true);
//        //new StaffLogIn().show();
////        this.dispose();
//        //int sel = JOptionPane.showConfirmDialog(this, "Click Yes to LogIn\n Click No/or Cancel to SignUp");
//        if ((myBoolean1 == true) && (myBoolean2 == true)) {
//            new StaffLogIn().show();
//            //setVisible(true);
//            this.dispose();
//        }
//        if ((myBoolean1 == false) && (myBoolean2 == false)) {
////            new StaffSignUp().show();
//            //setVisible(true);
////            new StaffSignUp().dispose();
//        }
//        if ((myBoolean1 == true) && (myBoolean2 == false)) {
////            new StaffSignUp().show();
//            //setVisible(true);
////            new StaffSignUp().dispose();
//        } else if ((myBoolean1 == false) && (myBoolean2 == true)) {
////            new StaffLogIn().show();
//            //setVisible(true);
////            new StaffLogIn().dispose();
//        }

        DBHandler handler = new DBHandler();
        String str = "Insert into staff_details(StaffName,Passport,Email,Tel1,Tel2,"
                + "JobDescription,Position,HomeAddress,StartDate,EndDate,Gender,Password,State) "
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            InputStream input = new FileInputStream(new File(s));
            try (PreparedStatement pst = handler.getdbConnection().prepareStatement(str)) {
                pst.setString(1, txtName.getText());
                pst.setBlob(2, input);
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

//            txtPassword.setText("");
//            txtSubject.setText("");
            new StaffLogIn().show();
            this.dispose();
//        try {
//            String str = "Insert into Teachers values(?,?,?,?,?,?,?)";
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            try (Connection con = DriverManager.getConnection(conStr);
//                    PreparedStatement smt = con.prepareStatement(str);) {
//                smt.setString(1, txtName.getText());
//                smt.setString(2, txtSurname.getText());
//                smt.setString(3, txtState.getText());
//                smt.setString(4, txtPhone.getText());
//                smt.setString(5, txtEmail.getText());
//                smt.setString(6, txtPassword.getText());
//                smt.setString(7, txtSubject.getText());
//                int count = smt.executeUpdate();
//                JOptionPane.showMessageDialog(this, count + " You have successfully signup");
//                txtName.setText("");
//                txtSurname.setText("");
//                txtState.setText("");
//                txtPhone.setText("");
//                txtEmail.setText("");
//                txtPassword.setText("");
//                txtSubject.setText("");
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(PrincipalSignUp.class.getName()).log(Level.SEVERE, null, ex);
//        }
        } catch (ClassNotFoundException | SQLException | FileNotFoundException ex) {
            Logger.getLogger(StaffSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnsignupActionPerformed

    private void RMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RMaleActionPerformed

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

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:

        new Home().show();
        this.dispose();

    }//GEN-LAST:event_btncancelActionPerformed

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
            java.util.logging.Logger.getLogger(StaffSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StaffSignUp().setVisible(true);
        });
    }

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
    private javax.swing.JButton btnPassport;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsignup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtHome;
    private javax.swing.JTextArea txtJobDes;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTel1;
    private javax.swing.JTextField txtTel2;
    // End of variables declaration//GEN-END:variables
}
