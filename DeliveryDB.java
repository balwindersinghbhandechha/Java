/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deliveryservice.db;

import deliveryservice.business.Delivery;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Balwinder Singh Bhandechha
 */
public class DeliveryDB {
    
    public static ArrayList<Delivery> getDeliveries(boolean status){
    
        String stat = Boolean.toString(status);
            
        ArrayList<Delivery> deliveries = new ArrayList();
        
        //declare jdbc objects        
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
        
            //Strp 1: Load the JDBC driver
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver).newInstance();
            
        // step 2: Establish connection to database
            String connURL = "jdbc:mysql://localhost/storeinventory";
            String username = "root";
            String password = "p@ssword";
            
            conn = DriverManager.getConnection(connURL,username, password);
            
            
            //Step 3: Execute an SQL statement
            String sql = "SELECT * FROM delivery "
                    + "WHERE Sent = ? "
                    + "ORDER BY ShippingCost;";
            
            ps = conn.prepareStatement(sql);
            
            //Set values for placeHolders (?)
            ps.setString(1, stat);
            
            rs = ps.executeQuery();            
            
            //Step 4: Process the results
            while(rs.next()){
        
            int deliveryId = Integer.parseInt(rs.getString("DeliveryId"));
            String description = rs.getString("Description");
            double shippingCost = rs.getDouble("ShippingCost");
            int sent = rs.getInt("Sent");
            
            Delivery delivery = new Delivery(description , deliveryId, shippingCost, sent);             
            
            deliveries.add(delivery);
        
        }            
            
        }catch(ClassNotFoundException e){
            System.err.println(e.getMessage());
            
        }catch(InstantiationException e){
            System.err.println(e.getMessage());
            
            
        }catch(IllegalAccessException e){
        System.err.println(e.getMessage());
        
        }catch(SQLException e){
        
             System.err.println("Message: " + e.getMessage());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error code: " + e.getErrorCode());
        
        
        }finally{       
        
        //Step 5: close Jdbc objects        
        try{
        
            if(rs != null){
            rs.close();            
            }
            
            if(ps != null){            
                ps.close();            
            }
            
            if(conn !=null){
                conn.close();            
            }     
        
        }catch (Exception e){      

            }
        return deliveries;
        }   
          
    }
    
    public static boolean updateStatus(int id, boolean status){
           
        String iD = Integer.toString(id);
        String stat = Boolean.toString(status);
        
        boolean success = false;
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
        
            conn = DBConnectionFactory.getConnection();
            String sql = "UPDATE delivery " +
                        "SET Sent=? " + // mistake space
                        "WHERE DeliveryId=?; ";
            
            ps = conn.prepareStatement(sql);
        
            ps.setString(1, iD);//reverse order sent first and sent is boolean
            ps.setString(2, stat);            
            
            int count = ps.executeUpdate();
            if(count > 0){
            
                success = true;
            }
            
            }catch(SQLException e){
            
                System.err.println("Message: " + e.getMessage());
            System.err.println("SQl state: " + e.getSQLState());
            System.err.println("Error code: " + e.getErrorCode());     
            
            }finally{
        
                DBConnectionFactory.close(ps);
                DBConnectionFactory.close(conn);
                return success;
                
        }
        
    }
    
}
