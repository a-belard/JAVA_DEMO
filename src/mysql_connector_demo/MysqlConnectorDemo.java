package mysql_connector_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnectorDemo {
    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:1306/demo";
    static String username = "root";
    static String password = "";
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            if(conn==null){
                System.out.println("Connection failed");
                System.exit(0);
            }
            System.out.println("Successfully connected..");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection failed!");
            System.exit(0);
        }
    }
}
