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
import tuandm.daos.FollowDAO;
import tuandm.daos.ProductDAO;
import tuandm.dtos.ProductDTO;
import tuandm.dtos.UserDTO;

/**
 *
 * @author ASUS
 */
public class AddController extends HttpServlet {

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
        try {
            String foodname = request.getParameter("name");
            String foodprice = request.getParameter("price");
            String fooddescription = request.getParameter("description");
            String foodimage = request.getParameter("image");
            int foodquantity = Integer.parseInt(request.getParameter("quantity"));

            ProductDAO dao = new ProductDAO();
            ProductDTO dto = new ProductDTO();

            dto.setProductName(foodname);
            dto.setPrice(Double.parseDouble(foodprice));
            dto.setDescription(fooddescription);
            dto.setImage(foodimage);
            dto.setStatus(true);
            dto.setQuantity(foodquantity);
            
            boolean add = dao.add(dto);
            if (add==true) {
                FollowDAO dao1 = new FollowDAO();
                UserDTO dto1 = (UserDTO) request.getSession().getAttribute("LOGIN_USER");
                dao1.addFollow(dto1.getUserID(),"add");
                request.getRequestDispatcher("admin_page.jsp").forward(request, response);
            }

        } catch (Exception e) {
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
