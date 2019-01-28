/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Shiyanrox
 */
public class DBConnection {

    Connection conn = null;
    private static DBConnection instance = new DBConnection();

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        return instance;
    }

    public Connection getDbConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/job_seeker_db", "root", "");
                return conn;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return conn;
        }
    }

    public void conClose() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }
}
