/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuandm.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tuandm.daos.ProductDAO;
import tuandm.dtos.Cart;
import tuandm.dtos.ProductDTO;

/**
 *
 * @author ASUS
 */
public class AddToCartController extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()){
            int productid = Integer.parseInt(request.getParameter("productID"));
            ProductDTO product = new ProductDAO().getProductByID(productid);
            Cart cart = new Cart(productid, 
                    product.getProductName(), 
                    product.getImage(), 
                    product.getPrice(), 
                    product.getQuantity(),// so luong trong database
                    1,//so luong trong gio hang
                    product.getPrice());
            
            List<Cart> listCart = (List<Cart>) request.getSession().getAttribute("listCart");
            if (listCart == null) {//empty cart
                listCart = new ArrayList<>();
                listCart.add(cart);
            }else{
                boolean isProductExist = false;
                for (Cart c : listCart) {
                    if (c.getProductid() == productid) {//san pham da ton tai trong gio hang
                        c.setQuantity(c.getQuantity() + 1);//update lai so luong
                        isProductExist = true;
                    }
                    
                }
                    if (!isProductExist) {
                    listCart.add(cart);// them san pham neu chua co trong gio hang
                }
            }
                    request.getSession().setAttribute("listCart", listCart);//update listCart
                    response.sendRedirect("HomeController");
            
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
