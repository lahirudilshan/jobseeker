/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shiyanrox
 */
public class SQLExecutor {

    Connection con;
    Statement stmt;
    ResultSet resultSet;

    public boolean excuteNonReturnQry(String qry) {
        DBConnection obj = DBConnection.getInstance();
        con = obj.getDbConnection();
        boolean flag = false;
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(qry);
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            flag = false;
        }
        obj.conClose();
        return flag;

    }

    public ResultSet excuteReturnQry(String qry) {
        DBConnection obj = DBConnection.getInstance();
        con = obj.getDbConnection();
        try {
            stmt = con.createStatement();
            resultSet = stmt.executeQuery(qry);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        //obj.conClose();
        return resultSet;
    }
}
