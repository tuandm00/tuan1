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
import tuandm.dtos.UserDTO;

/**
 *
 * @author ASUS
 */
public class LoginController extends HttpServlet {

    private static final String INVALID = "invalid.jsp";
    private static final String SUCCESS = "HomeController";
    private static final String ADMIN_PAGE = "admin_page.jsp";
    private static final String USER_PAGE = "user_page.jsp";
    private static final String ADMIN = "AD";
    private static final String USER = "US";

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
        String url = INVALID;
        try {
            String userID = request.getParameter("txtUserID");
            String password = request.getParameter("txtPassword");

            UserDAO dao = new UserDAO();
            UserDTO dto = dao.checkLogin(userID, password);

            if (dto != null) {
                HttpSession session = request.getSession();
                session.setAttribute("LOGIN_USER", dto);
                if (ADMIN.equals(dto.getRole())) {
                    url = ADMIN_PAGE;
                } else if (USER.equals(dto.getRole())) {
                    url = SUCCESS;
                }
            }
        } catch (Exception e) {
            log("Error at LoginController: " + e.toString());
        } finally {
            response.sendRedirect(url);
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
