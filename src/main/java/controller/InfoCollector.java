/**
 * Yusef Islaih
 * 991515277
 * Multi-Tier Programming 1
 * Prof. Sun
 * January 30 2020
 * Assignment 1
 * 
 * The InfoCollector servlet is reached through the “Marvel Recruiter” page. 
 * It then checks the full name and forwards the request to the “About Me” JSP page if the full name is not “Thanos”.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yusefislaih
 */
public class InfoCollector extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //getting values inputed by user from request
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        
        //sending values to next jsp for when they need to be printed in final jsp
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        
        if (!name.equals("Thanos")) { //user gave valid inputs -> go to next page
            getServletContext().getRequestDispatcher("/AboutMe.jsp").forward(request, response);
        } else { //thanos tried applying, NOT ALLOWED
            getServletContext().getRequestDispatcher("/Declined.html").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
