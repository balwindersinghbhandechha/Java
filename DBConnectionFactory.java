/*
 * This class manages connections to the database and the associated resources.
 */
package deliveryservice.db;

import java.sql.*;

/**
 *
 * @author alertaj
 */
public class DBConnectionFactory {
    // Create static instance of class
    private static DBConnectionFactory factory = new DBConnectionFactory();
    
    /* 
     * Create private constructor (no outside classes can create instances!)
     * which loads the JDBC driver.
     */
    private DBConnectionFactory() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            System.out.println("ERROR: Exception loading driver class");
        }
    }
    
    /*
     * Method that outside classes will use to get a Connection object.
     * Note that if this method causes an SQLException, it is thrown to the
     * class that called getConnection().
     */
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost/storeinventory";
        String username = "root";
        String password = "A1b2c3";
        return DriverManager.getConnection(url, username, password);
    }
    
    /*
     * Overloaded close() method used to close a ResultSet object.
     * Ignore any exceptions that may occur.
     */
    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch(Exception ignored) {
        }
    }
    
    /*
     * Overloaded close() method used to close a Statement object.
     * Ignore any exceptions that may occur.
     */
    public static void close(Statement stmt) {
        try {
            stmt.close();
        } catch(Exception ignored) {
        }
    }
    
    /*
     * Overloaded close() method used to close a Connection object.
     * Ignore any exceptions that may occur.
     */
    public static void close(Connection conn) {
        try {
            conn.close();
        } catch(Exception ignored) {
        }
    }
}
