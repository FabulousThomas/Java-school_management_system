/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static schoolmgtsystem.view.ListView.studentList;
import schoolmgtsystem.view.StudentProfileOnly;
import schoolmgtsystem.view.StudentTable;

/**
 *
 * @author Thomas
 */
public class DBHandler extends Configs {

    Connection dbConnection;
    DefaultListModel listModel;
    JList list;
    String name;

    public Connection getdbConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        String connectionIfo = ("jdbc:mysql://" + dbHost + dbPort + dbName);
        dbConnection = DriverManager.getConnection(connectionIfo, dbUser, dbPass);

        return dbConnection;
    }

    //Insert into STUDENT RESULT DB;
//    public void insertDB(UserResult userResult) {
//
//        String str = "INSERT INTO student_result" + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//
//        try {
//            PreparedStatement preparedStatement = getdbConnection().prepareStatement(str);
//
//            preparedStatement.setString(1, userResult.getEmail());
//            preparedStatement.setString(2, userResult.getStudentID());
//            preparedStatement.setString(3, userResult.getFirstName());
//            preparedStatement.setString(4, userResult.getSurname());
//            preparedStatement.setInt(5, userResult.getCourseCode());
//            preparedStatement.setString(6, userResult.getMaths());
//            preparedStatement.setString(7, userResult.getEnglish());
//            preparedStatement.setString(8, userResult.getAccounting());
//            preparedStatement.setString(9, userResult.getCommerce());
//            preparedStatement.setString(10, userResult.getChemistry());
//            preparedStatement.setString(11, userResult.getGovernment());
//            preparedStatement.setString(12, userResult.getBiology());
//            preparedStatement.setString(13, userResult.getGeography());
//            preparedStatement.setString(14, userResult.getPhysics());
//
//            int count = preparedStatement.executeUpdate();
//            System.out.println(count + " Record added");
//            preparedStatement.close();
//
//        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    public void insertFirstTest() {
//        
//        
//        
//    }
    public void fillTable(JTable table, String value) {
        String str = "SELECT * FROM `student_details` WHERE CONCAT(`StudentID`,`ParentID`,"
                + "`StudentName`,`Gender`,`PreviousSchool`,`PreviousClass`,`AdmissionClass`,"
                + "`Session`,`PhysicalDisability`,`DisabilityType`,`MedicalCondition`,"
                + "`Disability`,`RegDate`,`EndDate`,`Password`)LIKE ?";
        try {
            PreparedStatement pst = getdbConnection().prepareStatement(str);
            pst.setString(1, "%" + value + "%");

            ResultSet rs = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

            Object[] row;

            while (rs.next()) {
                row = new Object[15];

                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                row[9] = rs.getString(10);
                row[10] = rs.getString(11);
                row[11] = rs.getString(12);
                row[12] = rs.getString(13);
                row[13] = rs.getString(14);
                row[14] = rs.getString(15);

                tableModel.addRow(row);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fillStdList() {
        try {
            String str = "SELECT * FROM student_details";
//            model.clear();
            Statement smt = getdbConnection().createStatement();
            ResultSet rs = smt.executeQuery(str);
            int counter = 0;

            while (rs.next()) {
//                counter++;
                name = rs.getString("StudentName");
                System.out.println(name);
            }
            if (counter == 1) {
                listModel.addElement(studentList);
                studentList.add(null, name);
                list = new JList(listModel);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tableFunction() {
        DBHandler handler = new DBHandler();
        StudentTable st = new StudentTable();

        if (StudentTable.jTable1.isRowSelected(0)) {
            String query = "SELECT * FROM student_details WHERE StudentID = ?";
            try {
                PreparedStatement pst = handler.getdbConnection().prepareStatement(query);
                pst.setString(1, StudentTable.jTable1.getColumnName(3));
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    StudentProfileOnly sp = new StudentProfileOnly();
                    StudentProfileOnly.lblName.setText(rs.getString("StudentName"));
                    sp.show();
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
