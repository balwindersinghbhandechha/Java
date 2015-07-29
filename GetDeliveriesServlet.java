/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package deliveryservice.servlets;

import deliveryservice.business.Delivery;
import deliveryservice.db.DeliveryDB;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author: Balwinder Singh Bhandechha
 */
public class GetDeliveriesServlet extends HttpServlet {
   
   
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
        
        //Get the parameters from the request
        boolean status = Boolean.parseBoolean(request.getParameter("shipStatus"));
        
        // get the delivery info based on the status
        ArrayList<Delivery> delivery = DeliveryDB.getDeliveries(status);
        
        // store the delivery object in the session
        HttpSession session = request.getSession();
        session.setAttribute("delivery", delivery);
        session.setAttribute("status", status);
        
        //forward the request to deliverylist.jsp
        RequestDispatcher rd = request.getRequestDispatcher("/deliverylist.jsp");
        rd.forward(request, response);
        
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
