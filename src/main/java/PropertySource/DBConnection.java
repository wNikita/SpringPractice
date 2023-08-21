package PropertySource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private String driverClass;
    private String dbURL;
    private String userName;
    private char[] password;
    private Connection con;

    public DBConnection(String driverClass, String dbURL, String userName, char[] password) {
        this.driverClass = driverClass;
        this.dbURL = dbURL;
        this.userName = userName;
        this.password = password;
    }

    public Connection getConnection() {
        if (this.con != null)
            return con;

        Connection con = null;
        try {
            System.out.println("Creating DB Connection");
            Class.forName(driverClass);
            con = DriverManager.getConnection(dbURL, userName, String.valueOf(password));
            System.out.println("Successfully Created DB Connection");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        this.con = con;
        return con;
    }

    public void close() {
        System.out.println("DBConnection close called");
        if (this.con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}