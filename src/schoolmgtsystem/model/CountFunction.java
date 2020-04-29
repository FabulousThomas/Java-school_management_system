/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import schoolmgtsystem.dbhelper.DBHandler;

/**
 *
 * @author Thomas
 */
public class CountFunction {

    public static int CountData(String tableName) {

        DBHandler handler = new DBHandler();
        Statement smt;
        int total = 0;

        try {
            smt = handler.getdbConnection().createStatement();
            ResultSet rs = smt.executeQuery("SELECT COUNT(*) AS Total FROM " + tableName);
            while (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CountFunction.class.getName()).log(Level.SEVERE, null, ex);
        }

        return total;
    }

}
