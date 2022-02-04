package mysql_connector_demo;

import java.sql.*;

public class MysqlConnectorDemo {
    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/demo";
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
            Statement statement;
            try {
                statement = conn.createStatement();
                statement.execute("CREATE TABLE IF NOT EXISTS person(id INT PRIMARY KEY AUTO_INCREMENT," +
                                                            "first_name VARCHAR(250), " +
                                                            "last_name VARCHAR(250)," +
                                                            "gender VARCHAR(250))");
//                statement.execute(
//                        "INSERT INTO person(first_name, last_name, gender)" +
//                                "VALUES('Ange Belard', 'RUTAYISIRE', 'Male')"
//                );
                ResultSet rs = statement.executeQuery(
                        "SELECT * FROM person"
                );
                while(rs.next()){
                    System.out.println(rs.getInt(1) + " " + rs.getString("first_name") + " " + rs.getString(3) + " " + rs.getString(4));
                }
                String tableName = rs.getMetaData().getTableName(1);
                String db = rs.getMetaData().getCatalogName(1);
                for(int i = 1; i < rs.getMetaData().getColumnCount(); i++){
                    System.out.println(rs.getMetaData().getColumnName(i));
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection failed!");
            System.exit(0);
        }
    }
}
