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
public class PaymentDetails extends javax.swing.JFrame {

    /**
     * Creates new form PaymentDetails
     */
    public PaymentDetails() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RegFee = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TuitionFe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ExamFee = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        ExtClass = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        TuitionFee = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(731, 529));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("PAYMENT DETAILS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 230, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Registration Fee");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 120, 20));

        RegFee.setBackground(new java.awt.Color(255, 255, 255));
        RegFee.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RegFee.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(RegFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 130, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Tuition Fee");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 120, 20));

        TuitionFe.setBackground(new java.awt.Color(255, 255, 255));
        TuitionFe.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TuitionFe.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(TuitionFe, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 130, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Exam Fee");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 120, 20));

        ExamFee.setBackground(new java.awt.Color(255, 255, 255));
        ExamFee.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ExamFee.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(ExamFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 130, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Registration Fee");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 120, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 153, 204));
        jSeparator3.setForeground(new java.awt.Color(0, 153, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 730, 10));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Extension Class");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 120, 20));

        ExtClass.setBackground(new java.awt.Color(255, 255, 255));
        ExtClass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ExtClass.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(ExtClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 130, 30));

        btnCancel.setBackground(new java.awt.Color(0, 153, 204));
        btnCancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 100, 30));

        btnSubmit.setBackground(new java.awt.Color(0, 153, 204));
        btnSubmit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 100, 30));

        btnReset.setBackground(new java.awt.Color(0, 153, 204));
        btnReset.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 90, 30));

        TuitionFee.setBackground(new java.awt.Color(255, 255, 255));
        TuitionFee.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TuitionFee.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(TuitionFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PaymentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ExamFee;
    private javax.swing.JTextField ExtClass;
    private javax.swing.JTextField RegFee;
    private javax.swing.JTextField TuitionFe;
    private javax.swing.JTextField TuitionFee;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
