/**
 * Yusef Islaih
 * 991515277
 * Multi-Tier Programming 1
 * Prof. Sun
 * January 30 2020
 * Assignment 1
 * 
 * The DecisionMaker servlet is reached through the “About Me” page. 
 * It then calls the writeToFile() method in ApplicantFileIOclass to write the order data into the textfile. 
 * It also set attributes and forwards the request to the “Thank you!” JSPpage
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Applicant;
import model.ApplicantFileIO;

/**
 *
 * @author yusefislaih
 */
public class DecisionMaker extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        //getting values inputed by user from request
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String iq = request.getParameter("iq");
        String beverage = request.getParameter("beverage");
        String superPower[] = request.getParameterValues("superPower");
        
        //initializing array list for Applicant object
        ArrayList<String> superPowerList;
        superPowerList = new ArrayList<>();

        if (superPower == null) { //if no super powers are selected
            superPowerList.add("N/A");
        } else { //insert supperpowers selcted into array list
            superPowerList.addAll(Arrays.asList(superPower));
        }

        //creating applicant object
        Applicant applicant = new Applicant(name, email, iq, beverage, superPowerList, 0);
        
        //string to hold the result message
        String message = "";
        
        //string to hold wether applicant passed or failed
        String passOrFail = "";
        
        if (applicant.getScore() >= 60) {//applicant has passed
            message = "Congratulations! Welcome to the Marvel Agency!";
            passOrFail = "PASS";
        } else { //applicant has failed
            message = "Thank you for your interest. Goodluck!";
            passOrFail = "FAIL";
        }
        
        //getting file path fron servlet params to write to
        String filepath = getServletContext().getRealPath(
                getServletConfig().getInitParameter("filepath"));
        
        //writting applicant and wether they passed or failed to givien file
        ApplicantFileIO.writeToFile(applicant, passOrFail, filepath);
        
        //send message to nest jsp to show results
        request.setAttribute("message", message);
        
        //send applicant to nest jsp to show results
        request.setAttribute("applicant", applicant);
        
        //get the next page as the response
        getServletContext().getRequestDispatcher("/ThankYou.jsp").forward(request, response);

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
