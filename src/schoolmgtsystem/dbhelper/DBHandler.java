/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import schoolmgtsystem.model.UserResult;
import schoolmgtsystem.view.InsertFirstTest;

/**
 *
 * @author Thomas
 */
public class DBHandler extends Configs {

    Connection dbConnection;

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

}
