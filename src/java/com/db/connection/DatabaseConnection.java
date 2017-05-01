package com.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Barry Gray Kapelembe
 */
public  abstract class  DatabaseConnection {

    private String conString;
    private final String dbUserName;
    private final String dbPassWord;
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public DatabaseConnection() {
        this.dbUserName = "onthatileDB";
        this.dbPassWord = "adminServer";
        conString = "jdbc:mysql://localhost:3306/onthatile children's ministries";
    }

    public Connection getConnection() throws ClassNotFoundException {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(conString, dbUserName, dbPassWord);
            con.setAutoCommit(true);
        } catch (SQLException | ClassNotFoundException ex) {
        }
        return con;
    }
    
   abstract boolean recordValidator ();
    
    

}
