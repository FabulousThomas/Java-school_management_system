/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.view;

/**
 *
 * @author FabulousTHO
 */
public class AddSubject extends javax.swing.JFrame {

    /**
     * Creates new form AddSubject
     */
    public AddSubject() {
        initComponents();
   }
    
// Overloading Constructor
    
     public AddSubject(String parse)
             {
                 initComponents();
                 txtName.setText(parse);
                 txtteacher0.setText(parse);
                 txtperiod.setText(parse);
                 txttime.setText(parse);
             }
     
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtName = new javax.swing.JTextField();
        txtteacher0 = new javax.swing.JTextField();
        txtperiod = new javax.swing.JTextField();
        txttime = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtname1 = new javax.swing.JTextField();
        txtteacher1 = new javax.swing.JTextField();
        txtperiod1 = new javax.swing.JTextField();
        txttime1 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtname2 = new javax.swing.JTextField();
        txtteacher2 = new javax.swing.JTextField();
        txtperiod2 = new javax.swing.JTextField();
        txttime2 = new javax.swing.JTextField();
        btnAddInfo = new javax.swing.JButton();
        txtname3 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtteacher3 = new javax.swing.JTextField();
        txtperiod3 = new javax.swing.JTextField();
        txttime3 = new javax.swing.JTextField();
        txtname4 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        txtteacher4 = new javax.swing.JTextField();
        txtperiod4 = new javax.swing.JTextField();
        txttime4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 4));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Subject Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 90, 113, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Subject Teacher");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 90, 132, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Subject Period");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, 90, 119, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Subject Time");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(640, 90, 107, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Subject ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 30, 66, 20);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 50, 60, 2);

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtName.setBorder(null);
        jPanel1.add(txtName);
        txtName.setBounds(30, 130, 100, 20);

        txtteacher0.setEditable(false);
        txtteacher0.setBackground(new java.awt.Color(255, 255, 255));
        txtteacher0.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtteacher0.setBorder(null);
        jPanel1.add(txtteacher0);
        txtteacher0.setBounds(200, 130, 140, 20);

        txtperiod.setEditable(false);
        txtperiod.setBackground(new java.awt.Color(255, 255, 255));
        txtperiod.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtperiod.setBorder(null);
        jPanel1.add(txtperiod);
        txtperiod.setBounds(450, 130, 90, 20);

        txttime.setEditable(false);
        txttime.setBackground(new java.awt.Color(255, 255, 255));
        txttime.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txttime.setBorder(null);
        jPanel1.add(txttime);
        txttime.setBounds(650, 130, 90, 20);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(20, 120, 750, 2);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(20, 160, 750, 10);

        jSeparator7.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(20, 200, 750, 10);

        txtname1.setEditable(false);
        txtname1.setBackground(new java.awt.Color(255, 255, 255));
        txtname1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtname1.setBorder(null);
        jPanel1.add(txtname1);
        txtname1.setBounds(20, 170, 120, 20);

        txtteacher1.setEditable(false);
        txtteacher1.setBackground(new java.awt.Color(255, 255, 255));
        txtteacher1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtteacher1.setBorder(null);
        jPanel1.add(txtteacher1);
        txtteacher1.setBounds(180, 170, 170, 20);

        txtperiod1.setEditable(false);
        txtperiod1.setBackground(new java.awt.Color(255, 255, 255));
        txtperiod1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtperiod1.setBorder(null);
        jPanel1.add(txtperiod1);
        txtperiod1.setBounds(430, 170, 120, 20);

        txttime1.setEditable(false);
        txttime1.setBackground(new java.awt.Color(255, 255, 255));
        txttime1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txttime1.setBorder(null);
        jPanel1.add(txttime1);
        txttime1.setBounds(640, 170, 110, 20);

        jSeparator9.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(20, 240, 750, 10);

        txtname2.setEditable(false);
        txtname2.setBackground(new java.awt.Color(255, 255, 255));
        txtname2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtname2.setBorder(null);
        jPanel1.add(txtname2);
        txtname2.setBounds(20, 210, 120, 20);

        txtteacher2.setEditable(false);
        txtteacher2.setBackground(new java.awt.Color(255, 255, 255));
        txtteacher2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtteacher2.setBorder(null);
        jPanel1.add(txtteacher2);
        txtteacher2.setBounds(180, 210, 170, 20);

        txtperiod2.setEditable(false);
        txtperiod2.setBackground(new java.awt.Color(255, 255, 255));
        txtperiod2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtperiod2.setBorder(null);
        jPanel1.add(txtperiod2);
        txtperiod2.setBounds(430, 210, 120, 20);

        txttime2.setEditable(false);
        txttime2.setBackground(new java.awt.Color(255, 255, 255));
        txttime2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txttime2.setBorder(null);
        jPanel1.add(txttime2);
        txttime2.setBounds(640, 210, 110, 20);

        btnAddInfo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnAddInfo.setForeground(new java.awt.Color(102, 102, 102));
        btnAddInfo.setText("Add Stubject");
        btnAddInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInfoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddInfo);
        btnAddInfo.setBounds(620, 30, 140, 29);

        txtname3.setEditable(false);
        txtname3.setBackground(new java.awt.Color(255, 255, 255));
        txtname3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtname3.setBorder(null);
        jPanel1.add(txtname3);
        txtname3.setBounds(20, 250, 120, 20);

        jSeparator11.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator11);
        jSeparator11.setBounds(20, 280, 750, 10);

        txtteacher3.setEditable(false);
        txtteacher3.setBackground(new java.awt.Color(255, 255, 255));
        txtteacher3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtteacher3.setBorder(null);
        jPanel1.add(txtteacher3);
        txtteacher3.setBounds(180, 250, 170, 20);

        txtperiod3.setEditable(false);
        txtperiod3.setBackground(new java.awt.Color(255, 255, 255));
        txtperiod3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtperiod3.setBorder(null);
        jPanel1.add(txtperiod3);
        txtperiod3.setBounds(430, 250, 120, 20);

        txttime3.setEditable(false);
        txttime3.setBackground(new java.awt.Color(255, 255, 255));
        txttime3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txttime3.setBorder(null);
        jPanel1.add(txttime3);
        txttime3.setBounds(630, 250, 110, 20);

        txtname4.setEditable(false);
        txtname4.setBackground(new java.awt.Color(255, 255, 255));
        txtname4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtname4.setBorder(null);
        jPanel1.add(txtname4);
        txtname4.setBounds(20, 290, 120, 20);

        jSeparator13.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator13);
        jSeparator13.setBounds(20, 320, 750, 10);

        txtteacher4.setEditable(false);
        txtteacher4.setBackground(new java.awt.Color(255, 255, 255));
        txtteacher4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtteacher4.setBorder(null);
        jPanel1.add(txtteacher4);
        txtteacher4.setBounds(180, 290, 170, 20);

        txtperiod4.setEditable(false);
        txtperiod4.setBackground(new java.awt.Color(255, 255, 255));
        txtperiod4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtperiod4.setBorder(null);
        jPanel1.add(txtperiod4);
        txtperiod4.setBounds(430, 290, 120, 20);

        txttime4.setEditable(false);
        txttime4.setBackground(new java.awt.Color(255, 255, 255));
        txttime4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txttime4.setBorder(null);
        jPanel1.add(txttime4);
        txttime4.setBounds(640, 290, 110, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInfoActionPerformed
       new Form().show();
       this.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAddInfoActionPerformed

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
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSubject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    static javax.swing.JTextField txtName;
    static javax.swing.JTextField txtname1;
    static javax.swing.JTextField txtname2;
    static javax.swing.JTextField txtname3;
    static javax.swing.JTextField txtname4;
    static javax.swing.JTextField txtperiod;
    static javax.swing.JTextField txtperiod1;
    static javax.swing.JTextField txtperiod2;
    static javax.swing.JTextField txtperiod3;
    static javax.swing.JTextField txtperiod4;
    static javax.swing.JTextField txtteacher0;
    static javax.swing.JTextField txtteacher1;
    static javax.swing.JTextField txtteacher2;
    static javax.swing.JTextField txtteacher3;
    static javax.swing.JTextField txtteacher4;
    static javax.swing.JTextField txttime;
    static javax.swing.JTextField txttime1;
    static javax.swing.JTextField txttime2;
    static javax.swing.JTextField txttime3;
    static javax.swing.JTextField txttime4;
    // End of variables declaration//GEN-END:variables
}
