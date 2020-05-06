/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.view;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import schoolmgtsystem.dbhelper.DBHandler;

/**
 *
 * @author Thomas
 */
public class StudentInformation extends javax.swing.JFrame {

    /**
     * Creates new form StudentInformation
     */
    public StudentInformation() {
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

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        teacherCount = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        studentCount = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFileRecord = new javax.swing.JMenu();
        jMenuItemHome = new javax.swing.JMenuItem();
        jMenuItemViewProfile = new javax.swing.JMenuItem();
        jMenuItemStdList = new javax.swing.JMenuItem();
        jMenuItementerRecord = new javax.swing.JMenuItem();
        jMenuItemcheckResult = new javax.swing.JMenuItem();
        jMenuItemClose = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuItemUpStudent = new javax.swing.JMenuItem();
        jMenuItemUpTeacher = new javax.swing.JMenuItem();
        jMenuItemUpParent = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(808, 561));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        teacherCount.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        teacherCount.setForeground(new java.awt.Color(255, 255, 255));
        teacherCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teacherCount.setText("Teacher Count =");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(teacherCount, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(teacherCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 200, 270, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        studentCount.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        studentCount.setForeground(new java.awt.Color(255, 255, 255));
        studentCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentCount.setText("Student Count =");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(studentCount, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(studentCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        lblName.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 51, 51));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 310, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_School_House.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 120, 100));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Your ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 60, -1));

        lblID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(51, 51, 51));
        lblID.setText("ID");
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, -1));

        jLabel1.setText("jLabel1");

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jMenuFileRecord.setBackground(new java.awt.Color(255, 255, 255));
        jMenuFileRecord.setForeground(new java.awt.Color(51, 51, 51));
        jMenuFileRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Folder.png"))); // NOI18N
        jMenuFileRecord.setText("File");

        jMenuItemHome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemHome.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemHome.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMenuItemHome.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItemHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Home.png"))); // NOI18N
        jMenuItemHome.setText("Home");
        jMenuItemHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHomeActionPerformed(evt);
            }
        });
        jMenuFileRecord.add(jMenuItemHome);

        jMenuItemViewProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemViewProfile.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemViewProfile.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMenuItemViewProfile.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItemViewProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Profile.png"))); // NOI18N
        jMenuItemViewProfile.setText("View Profile");
        jMenuItemViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemViewProfileActionPerformed(evt);
            }
        });
        jMenuFileRecord.add(jMenuItemViewProfile);

        jMenuItemStdList.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemStdList.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemStdList.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMenuItemStdList.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItemStdList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_List1.png"))); // NOI18N
        jMenuItemStdList.setText("Student List");
        jMenuItemStdList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemStdListActionPerformed(evt);
            }
        });
        jMenuFileRecord.add(jMenuItemStdList);

        jMenuItementerRecord.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItementerRecord.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItementerRecord.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMenuItementerRecord.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItementerRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Test_Results.png"))); // NOI18N
        jMenuItementerRecord.setText("Enter Records");
        jMenuItementerRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItementerRecordActionPerformed(evt);
            }
        });
        jMenuFileRecord.add(jMenuItementerRecord);

        jMenuItemcheckResult.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemcheckResult.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemcheckResult.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMenuItemcheckResult.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItemcheckResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Test_Results.png"))); // NOI18N
        jMenuItemcheckResult.setText("Check Result");
        jMenuItemcheckResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemcheckResultActionPerformed(evt);
            }
        });
        jMenuFileRecord.add(jMenuItemcheckResult);

        jMenuItemClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemClose.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemClose.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMenuItemClose.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItemClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Cancel_1.png"))); // NOI18N
        jMenuItemClose.setText("Exit");
        jMenuItemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCloseActionPerformed(evt);
            }
        });
        jMenuFileRecord.add(jMenuItemClose);

        jMenuBar1.add(jMenuFileRecord);

        jMenuEdit.setBackground(new java.awt.Color(255, 255, 255));
        jMenuEdit.setForeground(new java.awt.Color(51, 51, 51));
        jMenuEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Edit_File_1.png"))); // NOI18N
        jMenuEdit.setText("Edit");

        jMenuItemUpStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUpStudent.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemUpStudent.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMenuItemUpStudent.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItemUpStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Student_Male.png"))); // NOI18N
        jMenuItemUpStudent.setText("Manage Students");
        jMenuItemUpStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUpStudentActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemUpStudent);

        jMenuItemUpTeacher.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUpTeacher.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemUpTeacher.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMenuItemUpTeacher.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItemUpTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Classroom.png"))); // NOI18N
        jMenuItemUpTeacher.setText("Manage Teachers");
        jMenuItemUpTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUpTeacherActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemUpTeacher);

        jMenuItemUpParent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUpParent.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemUpParent.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMenuItemUpParent.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItemUpParent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Family.png"))); // NOI18N
        jMenuItemUpParent.setText("Manage Parents");
        jMenuItemUpParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUpParentActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemUpParent);

        jMenuBar1.add(jMenuEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemViewProfileActionPerformed

        DBHandler handler = new DBHandler();
        handler.adminProfile();

    }//GEN-LAST:event_jMenuItemViewProfileActionPerformed

    private JLabel label;
    private void jMenuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCloseActionPerformed

        label = new JLabel("btn_exit");
        if (JOptionPane.showConfirmDialog(label, "Do you want to Exit ?", "Confirm",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            new Home().show();
            this.dispose();
        }

    }//GEN-LAST:event_jMenuItemCloseActionPerformed

    private void jMenuItemStdListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStdListActionPerformed

        new StudentTable().show();

    }//GEN-LAST:event_jMenuItemStdListActionPerformed

    private void jMenuItemUpStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUpStudentActionPerformed

        new StudentMgt().show();

    }//GEN-LAST:event_jMenuItemUpStudentActionPerformed

    private void jMenuItemUpTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUpTeacherActionPerformed

        new StaffMgt().show();

    }//GEN-LAST:event_jMenuItemUpTeacherActionPerformed

    private void jMenuItemUpParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUpParentActionPerformed

        new ParentMgt().show();

    }//GEN-LAST:event_jMenuItemUpParentActionPerformed

    private void jMenuItemHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHomeActionPerformed

        new Home().show();
        this.dispose();

    }//GEN-LAST:event_jMenuItemHomeActionPerformed

    private void jMenuItementerRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItementerRecordActionPerformed
       
        new ResultEntry().show();
        
    }//GEN-LAST:event_jMenuItementerRecordActionPerformed

    private void jMenuItemcheckResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemcheckResultActionPerformed
        
        new ResultView().show();
        
    }//GEN-LAST:event_jMenuItemcheckResultActionPerformed

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
            java.util.logging.Logger.getLogger(StudentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StudentInformation().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFileRecord;
    private javax.swing.JMenuItem jMenuItemClose;
    private javax.swing.JMenuItem jMenuItemHome;
    private javax.swing.JMenuItem jMenuItemStdList;
    private javax.swing.JMenuItem jMenuItemUpParent;
    private javax.swing.JMenuItem jMenuItemUpStudent;
    private javax.swing.JMenuItem jMenuItemUpTeacher;
    private javax.swing.JMenuItem jMenuItemViewProfile;
    private javax.swing.JMenuItem jMenuItemcheckResult;
    private javax.swing.JMenuItem jMenuItementerRecord;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel lblID;
    public static javax.swing.JLabel lblName;
    public static javax.swing.JLabel studentCount;
    public static javax.swing.JLabel teacherCount;
    // End of variables declaration//GEN-END:variables
}
