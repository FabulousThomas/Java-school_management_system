/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.dbhelper;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import schoolmgtsystem.view.AdminMgt;
import static schoolmgtsystem.view.ListView.studentList;
import schoolmgtsystem.view.PaymentDetails;
import schoolmgtsystem.view.StaffProfile;
import static schoolmgtsystem.view.StaffProfile.lblImage;
import schoolmgtsystem.view.StudentInformation;
import schoolmgtsystem.view.StudentInformation1;

/**
 *
 * @author Thomas
 */
public class DBHandler extends Configs {

    Connection dbConnection;
    DefaultListModel listModel;
    BufferedImage bufferedImage;
    ImageIcon imageIcon;
    JList list;
    String name;
    String ID;

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

    public void staffProfile() {
//        DBHandler handler = new DBHandler();
//        StudentInformation1 st = new StudentInformation1();

        String query = "SELECT * FROM staff_details WHERE StaffID = ?";
        try {
            PreparedStatement pst = getdbConnection().prepareStatement(query);
            pst.setString(1, StudentInformation1.lblID.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                StaffProfile sp = new StaffProfile();
                StaffProfile.txtID.setText(rs.getString("StaffID"));
                StaffProfile.txtName.setText(rs.getString("StaffName"));
                StaffProfile.txtEmail.setText(rs.getString("Email"));
                StaffProfile.txtHome.setText(rs.getString("HomeAddress"));
                StaffProfile.txtTel1.setText(rs.getString("Tel1"));
                StaffProfile.txtTel2.setText(rs.getString("Tel2"));
                StaffProfile.txtState.setText(rs.getString("State"));
                StaffProfile.txtJobDes.setText(rs.getString("JobDescription"));
                StaffProfile.txtPassword.setText(rs.getString("Password"));
                StaffProfile.Position.setSelectedItem(rs.getString("Position"));
                bufferedImage = ImageIO.read(rs.getBinaryStream("Passport"));
                imageIcon = new ImageIcon(new ImageIcon(bufferedImage).getImage().getScaledInstance(StaffProfile.lblImage.getWidth(),
                        StaffProfile.lblImage.getHeight(), Image.SCALE_DEFAULT));
                StaffProfile.lblImage.setIcon(imageIcon);
                StaffProfile.StartDate.setDate(rs.getDate("StartDate"));
                StaffProfile.EndDate.setDate(rs.getDate("EndDate"));
                sp.show();
            }

        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void adminProfile() {
//        DBHandler handler = new DBHandler();
//        StudentInformation1 st = new StudentInformation1();

        String query = "SELECT * FROM admin WHERE AdminID = ?";
        try {
            PreparedStatement pst = getdbConnection().prepareStatement(query);
            pst.setString(1, StudentInformation.lblID.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                AdminMgt am = new AdminMgt();
                AdminMgt.lblID.setText(rs.getString("AdminID"));
                AdminMgt.txtFirstName.setText(rs.getString("FirstName"));
                AdminMgt.txtEmail.setText(rs.getString("Email"));
                AdminMgt.txtUsername.setText(rs.getString("username"));
                AdminMgt.txtSurname.setText(rs.getString("Surname"));
//                AdminMgt.txtTel2.setText(rs.getString("Tel2"));

                AdminMgt.txtPassword.setText(rs.getString("Password"));
                am.show();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ImageIcon resizeImage(String imgPath) {
        ImageIcon myImage = new ImageIcon(imgPath);
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);

        return image;

    }

    public void getUserID() {

        try {
            String query = "SELECT StudentID FROM student_details";
            PreparedStatement pst = getdbConnection().prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            int counter = 0;
            if (rs.next()) {
                counter++;
                ID = rs.getString("StudentID");
                System.out.println(ID);
                PaymentDetails pd = new PaymentDetails();
                PaymentDetails.StudentID.setText(ID);
                pd.show();
            }
            if (counter == 1) {

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
