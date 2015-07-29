/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package deliveryservice.servlets;

import deliveryservice.db.DeliveryDB;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author: Balwinder Singh Bhandechha
 */
public class SetStatusServlet extends HttpServlet {
   
   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
     
        //Get parameters from the request        
        int deliveryId = Integer.parseInt(request.getParameter("deliveryId"));
        boolean status = Boolean.parseBoolean(request.getParameter("status"));
    
        
        // update the delivery in the database        
        boolean success = DeliveryDB.updateStatus(deliveryId, status);
        
        
        if(success){
            //delivery updated in database
            RequestDispatcher rd = request.getRequestDispatcher("/GetDeliveries");
            rd.forward(request,response);       
            
        }else {
                //delivery not updated in database
             RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
             rd.forward(request,response);
        }
        
        
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
