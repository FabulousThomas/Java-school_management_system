/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.view;

import javax.swing.JOptionPane;

/**
 *
 * @author FabulousTHO
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form StudentView
     */
    public PrincipalView() {
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
        btnTeachersPro = new javax.swing.JButton();
        btnParentprofile = new javax.swing.JButton();
        btnStudentPro = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTeachersPro.setBackground(new java.awt.Color(255, 255, 255));
        btnTeachersPro.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnTeachersPro.setText("Teachers Profile");
        btnTeachersPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeachersProActionPerformed(evt);
            }
        });
        jPanel1.add(btnTeachersPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 400, 109));

        btnParentprofile.setBackground(new java.awt.Color(255, 255, 255));
        btnParentprofile.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnParentprofile.setText("Parent Profile");
        btnParentprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentprofileActionPerformed(evt);
            }
        });
        jPanel1.add(btnParentprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 400, 109));

        btnStudentPro.setBackground(new java.awt.Color(255, 255, 255));
        btnStudentPro.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnStudentPro.setText("Student Profile");
        btnStudentPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentProActionPerformed(evt);
            }
        });
        jPanel1.add(btnStudentPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 400, 109));

        btnResult.setBackground(new java.awt.Color(255, 255, 255));
        btnResult.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnResult.setText("Student Result");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });
        jPanel1.add(btnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 400, 109));

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Administrator_Male_96px_1.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Principal Portal");
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 346, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentProActionPerformed

        JOptionPane.showMessageDialog(this, "Still under construction.\nComing soon!");
        
//        new ViewProfile().show();
//        setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btnStudentProActionPerformed

    private void txtBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackMouseClicked
        new Home().show();
        setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtBackMouseClicked

    private void SignUp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp1MouseClicked

    }//GEN-LAST:event_SignUp1MouseClicked

    private void btnTeachersProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeachersProActionPerformed
       
        JOptionPane.showMessageDialog(this, "Still under construction.\nComing soon!");
        
//        new ViewProfileteacher().show();
//        setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btnTeachersProActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        new ResultView().show();
        setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnResultActionPerformed

    private void btnParentprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentprofileActionPerformed

        JOptionPane.showMessageDialog(this, "Still under construction.\nComing soon!");
        
//        new Profileparent().show();
//        setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btnParentprofileActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SignUp1;
    private javax.swing.JButton btnParentprofile;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnStudentPro;
    private javax.swing.JButton btnTeachersPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel txtBack;
    // End of variables declaration//GEN-END:variables
}
