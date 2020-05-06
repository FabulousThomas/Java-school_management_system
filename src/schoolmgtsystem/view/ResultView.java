/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.view;

/**
 *
 * @author Thomas
 */
public class ResultView extends javax.swing.JFrame {

    /**
     * Creates new form ResultView
     */
    public ResultView() {
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
        btnCheckSSS = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        btnCheckNursery = new javax.swing.JButton();
        btnCheckPrimary = new javax.swing.JButton();
        btnCheckJSS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(703, 437));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCheckSSS.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCheckSSS.setText("SENIOR SECONDARY");
        btnCheckSSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckSSSActionPerformed(evt);
            }
        });
        jPanel1.add(btnCheckSSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, 50));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHECK RESULT");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 30));

        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmgtsystem/IconImages/icons8_Xbox_X.png"))); // NOI18N
        btnClose.setToolTipText("close");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 40, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        btnCheckNursery.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCheckNursery.setText("NURSERY");
        btnCheckNursery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckNurseryActionPerformed(evt);
            }
        });
        jPanel1.add(btnCheckNursery, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 140, 50));

        btnCheckPrimary.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCheckPrimary.setText("PRIMARY");
        btnCheckPrimary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckPrimaryActionPerformed(evt);
            }
        });
        jPanel1.add(btnCheckPrimary, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 140, 50));

        btnCheckJSS.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCheckJSS.setText("JUNIOR SECONDARY");
        btnCheckJSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckJSSActionPerformed(evt);
            }
        });
        jPanel1.add(btnCheckJSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 230, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckNurseryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckNurseryActionPerformed
        
        new ResultNursery().show();
        this.dispose();
        
    }//GEN-LAST:event_btnCheckNurseryActionPerformed

    private void btnCheckPrimaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckPrimaryActionPerformed
       
        new ResultPrimary().show();
        this.dispose();
        
    }//GEN-LAST:event_btnCheckPrimaryActionPerformed

    private void btnCheckJSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckJSSActionPerformed
        
        new ResultJSS().show();
        this.dispose();
        
    }//GEN-LAST:event_btnCheckJSSActionPerformed

    private void btnCheckSSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckSSSActionPerformed
       
        new ExamResult().show();
        this.dispose();
        
    }//GEN-LAST:event_btnCheckSSSActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResultView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ResultView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckJSS;
    private javax.swing.JButton btnCheckNursery;
    private javax.swing.JButton btnCheckPrimary;
    private javax.swing.JButton btnCheckSSS;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
