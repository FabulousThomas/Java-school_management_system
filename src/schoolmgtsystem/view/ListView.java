/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import schoolmgtsystem.model.dbhelper.DBHandler;

/**
 *
 * @author Thomas
 */
public class ListView extends javax.swing.JFrame {

    /**
     * Creates new form ListView
     */
    DefaultListModel model;
    JList list;
    DBHandler handler = new DBHandler();
    String all;
    String name;

    public ListView() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnParent = new javax.swing.JButton();
        btnStaff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentList.setBackground(new java.awt.Color(255, 255, 255));
        studentList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        studentList.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        studentList.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(studentList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 490));

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 170, 40));

        btnStudent.setBackground(new java.awt.Color(0, 102, 204));
        btnStudent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnStudent.setForeground(new java.awt.Color(51, 51, 51));
        btnStudent.setText("Student");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        jPanel1.add(btnStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 170, 40));

        btnParent.setBackground(new java.awt.Color(0, 102, 204));
        btnParent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnParent.setForeground(new java.awt.Color(51, 51, 51));
        btnParent.setText("Parent");
        jPanel1.add(btnParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 170, 40));

        btnStaff.setBackground(new java.awt.Color(0, 102, 204));
        btnStaff.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnStaff.setForeground(new java.awt.Color(51, 51, 51));
        btnStaff.setText("Staff");
        jPanel1.add(btnStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed

//        handler = new DBHandler();
//        handler.fillStdList();

        handler = new DBHandler();
        model = new DefaultListModel();

        try {
            String str = "SELECT * FROM student_details";
//            model.clear();
            Statement smt = handler.getdbConnection().createStatement();
            ResultSet rs = smt.executeQuery(str);
            int counter = 0;

            while (rs.next()) {
                counter++;
                name = rs.getString("StudentName");
                model.addElement(name);
                
                System.out.println(name);
            }
            if (counter == 1) {
                model.addElement(studentList);
                studentList.add(null, name);
                list = new JList(model);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnStudentActionPerformed

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
            java.util.logging.Logger.getLogger(ListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ListView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnParent;
    private javax.swing.JButton btnStaff;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JList<String> studentList;
    // End of variables declaration//GEN-END:variables
}
