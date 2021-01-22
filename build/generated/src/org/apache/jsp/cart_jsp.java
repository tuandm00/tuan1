package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<link href=\"css/cart.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<script src=\"https://use.fontawesome.com/c560c025cf.js\"></script>\n");
      out.write("<div class=\"container\">\n");
      out.write("   <div class=\"card shopping-cart\">\n");
      out.write("            <div class=\"card-header bg-dark text-light\">\n");
      out.write("                <i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i>\n");
      out.write("                Shopping cart\n");
      out.write("                <a href=\"\" class=\"btn btn-outline-info btn-sm pull-right\">Continue shopping</a>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                    <!-- PRODUCT -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12 col-sm-12 col-md-2 text-center\">\n");
      out.write("                                <img class=\"img-responsive\" src=\"http://placehold.it/120x80\" alt=\"prewiew\" width=\"120\" height=\"80\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-12 text-sm-center col-sm-12 text-md-left col-md-6\">\n");
      out.write("                            <h4 class=\"product-name\"><strong>Product Name</strong></h4>\n");
      out.write("                            <h4>\n");
      out.write("                                <small>Product description</small>\n");
      out.write("                            </h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12 col-sm-12 text-sm-center col-md-4 text-md-right row\">\n");
      out.write("                            <div class=\"col-3 col-sm-3 col-md-6 text-md-right\" style=\"padding-top: 5px\">\n");
      out.write("                                <h6><strong>25.00 <span class=\"text-muted\">x</span></strong></h6>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4 col-sm-4 col-md-4\">\n");
      out.write("                                <div class=\"quantity\">\n");
      out.write("                                    <input type=\"button\" value=\"+\" class=\"plus\">\n");
      out.write("                                    <input type=\"number\" step=\"1\" max=\"99\" min=\"1\" value=\"1\" title=\"Qty\" class=\"qty\"\n");
      out.write("                                           size=\"4\">\n");
      out.write("                                    <input type=\"button\" value=\"-\" class=\"minus\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-2 col-sm-2 col-md-2 text-right\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-outline-danger btn-xs\">\n");
      out.write("                                    <i class=\"fa fa-trash\" aria-hidden=\"true\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <!-- END PRODUCT -->\n");
      out.write("                    <!-- PRODUCT -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12 col-sm-12 col-md-2 text-center\">\n");
      out.write("                                <img class=\"img-responsive\" src=\"http://placehold.it/120x80\" alt=\"prewiew\" width=\"120\" height=\"80\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12 text-sm-center col-sm-12 text-md-left col-md-6\">\n");
      out.write("                            <h4 class=\"product-name\"><strong>Product Name</strong></h4>\n");
      out.write("                            <h4>\n");
      out.write("                                <small>Product description</small>\n");
      out.write("                            </h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12 col-sm-12 text-sm-center col-md-4 text-md-right row\">\n");
      out.write("                            <div class=\"col-3 col-sm-3 col-md-6 text-md-right\" style=\"padding-top: 5px\">\n");
      out.write("                                <h6><strong>25.00 <span class=\"text-muted\">x</span></strong></h6>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4 col-sm-4 col-md-4\">\n");
      out.write("                                <div class=\"quantity\">\n");
      out.write("                                    <input type=\"button\" value=\"+\" class=\"plus\">\n");
      out.write("                                    <input type=\"number\" step=\"1\" max=\"99\" min=\"1\" value=\"1\" title=\"Qty\" class=\"qty\"\n");
      out.write("                                           size=\"4\">\n");
      out.write("                                    <input type=\"button\" value=\"-\" class=\"minus\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-2 col-sm-2 col-md-2 text-right\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-outline-danger btn-xs\">\n");
      out.write("                                    <i class=\"fa fa-trash\" aria-hidden=\"true\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <!-- END PRODUCT -->\n");
      out.write("                <div class=\"pull-right\">\n");
      out.write("                    <a href=\"\" class=\"btn btn-outline-secondary pull-right\">\n");
      out.write("                        Update shopping cart\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-footer\">\n");
      out.write("                \n");
      out.write("                <div class=\"pull-right\" style=\"margin: 10px\">\n");
      out.write("                    <a href=\"\" class=\"btn btn-success pull-right\">Checkout</a>\n");
      out.write("                    <div class=\"pull-right\" style=\"margin: 5px\">\n");
      out.write("                        Total price: <b>50.00€</b>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
