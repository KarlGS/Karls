/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contactlistjstl;

import com.swcguild.contactlistjstl.model.Contact;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 *
 * @author apprentice
 */
public class ContactListServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Contact> list = new ArrayList<Contact>();
        
        Contact c1 = new Contact();
        c1.setName("John Doe");
        c1.setPhone("555.1212");
        c1.setEmail("jdoe@oe.com");
        
        list.add(c1);
        
        Contact c2 = new Contact();
        c2.setName("Sally Smith");
        c2.setPhone("555.3365");
        c2.setEmail("ssmith@smith.com");
        
        
        list.add(c2);
        
        Contact c3 = new Contact();
        c3.setName("Jim Johnson");
        c3.setPhone("555.4444");
        c3.setEmail("jjohnson@johnson.com");
        
        list.add(c3);
        
        request.setAttribute("contactList", list);
        RequestDispatcher rd = request.getRequestDispatcher("contactlist.jsp");
        rd.forward(request, response);
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
