package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    String name = (String) session.getAttribute("session_name");
    String gender = (String) session.getAttribute("session_gender");
    String city = (String) session.getAttribute("session_city");
    String fields = (String) session.getAttribute("session_fields");

      out.write('\n');
      out.write('\n');

    if (name == null || name.equals("")) {
        response.sendRedirect("login.jsp");
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Smart Programming - Profile </title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" ></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profileheader.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menubar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-2\"> </div>\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <img src=\"images/smartprogramminglogo.png\" height=\"100\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("                        <h3 style=\"color: blue\"> ");
      out.print( name.toUpperCase());
      out.write(" </h3>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td> <span style=\"color: #acaaaa\"> Gender : </span> </td>\n");
      out.write("                                <td> <input type=\"text\" value=\"");
      out.print( gender);
      out.write("\" class=\"textfield_design\" /> <br> <br> </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td> <span style=\"color: #acaaaa\"> City : </span> </td>\n");
      out.write("                                <td> <input type=\"text\" value=\"");
      out.print( city);
      out.write("\" class=\"textfield_design\" /> <br> <br> </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td> <span style=\"color: #acaaaa\"> Fields : </span> </td>\n");
      out.write("                                <td> <input type=\"text\" value=\"");
      out.print( fields);
      out.write("\" class=\"textfield_design\" /> <br> <br> </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td> <input type=\"submit\" value=\"Update\" class=\"btn btn-danger\" /> </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                         \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-2\"> </div>\n");
      out.write("                            <div class=\"col-md-10\">\n");
      out.write("                                <h5> Education Details </h5>\n");
      out.write("                                <table>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td> School : </td>\n");
      out.write("                                        <td> <input type=\"text\" value=\"\" class=\"textfield_design\" /> <br> <br> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td> Year : </td>\n");
      out.write("                                        <td> <input type=\"text\" value=\"\" class=\"textfield_design\" /> <br> <br> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td> College : </td>\n");
      out.write("                                        <td> <input type=\"text\" value=\"\" class=\"textfield_design\" /> <br> <br> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td> Passing Year : </td>\n");
      out.write("                                        <td> <input type=\"text\" value=\"\" class=\"textfield_design\" /> <br> <br> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td> Experience : </td>\n");
      out.write("                                        <td> <input type=\"text\" value=\"\" class=\"textfield_design\" /> <br> <br> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td></td>\n");
      out.write("                                        <td> <input type=\"submit\" value=\"Update\" class=\"btn btn-danger\" /> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\"> </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
