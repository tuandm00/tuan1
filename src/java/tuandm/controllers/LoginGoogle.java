/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuandm.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tuandm.daos.UserDAO;
import tuandm.dtos.GoogleDTO;
import tuandm.dtos.UserDTO;
import tuandm.utils.GoogleUtils;

/**
 *
 * @author ASUS
 */
public class LoginGoogle extends HttpServlet {

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
        String url = "";
        try {
            String code = request.getParameter("code");
            if (code != null || !code.isEmpty()) {
                HttpSession session = request.getSession();
                String accessToken = GoogleUtils.getToken(code);
                GoogleDTO gPojo = GoogleUtils.getUserInfo(accessToken);
                String userID = gPojo.getId();
                UserDAO dao = new UserDAO();
                String email = gPojo.getEmail();
                UserDTO user = dao.loginGooogle(userID);
                if (user == null) {
                    user = new UserDTO();
                    user.setUserID(userID);
                    user.setFullname(email);
                    user.setEmail(email);
                    user.setRole("");
                    dao.createGoogle(user);
                    
                }
                session.setAttribute("LOGIN_USER", user);
                url = "HomeController";
            }
        } catch (Exception e) {
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
