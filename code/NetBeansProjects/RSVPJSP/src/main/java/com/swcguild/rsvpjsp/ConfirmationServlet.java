/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.rsvpjsp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apprentice
 */
public class ConfirmationServlet extends HttpServlet {

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
         String canAttend = request.getParameter("canAttend");
       String comment = request.getParameter("comment");
       String msg = "";
       if(canAttend.equals("yes")){
           msg = "Great! Can't wait to see you!";
       }else{
           if(comment.equals("out of town")){
               msg = "Sorry we're going to miss you.";
           }else if(comment.equals("sick")){
               msg = "Get well soon.";
           }else if(comment.equals("I hate you")){
               msg = "The jerk store called...";
           }else{
               msg = "You inconsiderate buffoon, you could at least give me a reason";
           }
       }
       request.setAttribute("message", msg);
       RequestDispatcher rd = request.getRequestDispatcher("confirmation.jsp");
       rd.forward(request ,response);
        
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
