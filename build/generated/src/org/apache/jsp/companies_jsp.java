package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import com.deepak.connection.DbConnection;
import java.sql.Connection;

public final class companies_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "CheckCookie", out, false);
      out.write('\n');
      out.write('\n');

    String email=(String)session.getAttribute("session_email");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"ISO-8859-1\">\n");
      out.write("        <title>Companies</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" ></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            \n");
      out.write("            ");

                if(email == null ? email == null : email.trim().equals("null"))
                {
            
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            ");

                }
                else
                {
            
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profileheader.jsp", out, false);
      out.write("\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menubar.jsp", out, false);
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li> <a href=\"\"> Smart Programming </a> </li>\n");
      out.write("                            <li> <a href=\"\"> Infosys </a> </li>\n");
      out.write("                            <li> <a href=\"\"> Wipro </a> </li>\n");
      out.write("                            <li> <a href=\"\"> IBM </a> </li>\n");
      out.write("                            <li> <a href=\"\"> Google </a> </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\" style=\"background-color: #f9f8f9; margin-top: 10px\">\n");
      out.write("                        <h2> Our Partners </h2>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                        ");

                            String c_id="", c_name="", c_email="", c_logo="", c_phoneno;
                            try
                            {
                                Connection con=DbConnection.getConnect();
                                
                                PreparedStatement ps=con.prepareStatement("select * from company_reg");
                                ResultSet rs=ps.executeQuery();
                                while(rs.next())
                                {
                                    c_id=rs.getString("id");
                                    c_name=rs.getString("c_name");
                                    c_email=rs.getString("c_email");
                                    c_logo=rs.getString("c_logo");
                                    c_phoneno=rs.getString("c_phoneno");
                                    
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-md-12 display_job_div\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <img src=\"images/smartprogramminglogo.png\" height=\"50\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-10\">\n");
      out.write("                                        <b> ");
      out.print(c_name);
      out.write("</b> <span style=\"font-size: 12px; color: #9f9d9d;\"> (");
      out.print(c_email);
      out.write(")</span> <br> <br>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-phone-alt\"></span> &nbsp; <span style=\"color: #9f9d9d\"> Phone No : </span> ");
      out.print(c_phoneno);
      out.write(" </span> <br>\n");
      out.write("                                    <br><a href=\"company-jobs.jsp?c_email=");
      out.print(c_email);
      out.write("\"> See All Jobs of this company </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        ");

                                }
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                        
      out.write("\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li> <a href=\"\"> Smart Programming </a> </li>\n");
      out.write("                            <li> <a href=\"\"> Infosys </a> </li>\n");
      out.write("                            <li> <a href=\"\"> Wipro </a> </li>\n");
      out.write("                            <li> <a href=\"\"> IBM </a> </li>\n");
      out.write("                            <li> <a href=\"\"> Google </a> </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
