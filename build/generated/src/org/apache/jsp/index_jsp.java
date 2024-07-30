package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import com.deepak.connection.DbConnection;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "CheckCookie", out, false);
      out.write("\r\n");
      out.write("\r\n");

    String email=(String)session.getAttribute("session_email");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"ISO-8859-1\">\r\n");
      out.write("        <title>Job Portal Website</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" ></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            \r\n");
      out.write("            ");

                if(email == null ? email == null : email.trim().equals("null"))
                {
            
      out.write("\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("            ");

                }
                else
                {
            
      out.write("\r\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profileheader.jsp", out, false);
      out.write("\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menubar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\" style=\"border: 2px solid black;\">\r\n");
      out.write("                    <img src=\"images/jobbanner.jpg\" />\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- ==============search job div starts================= -->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-2\"></div>\r\n");
      out.write("                    <div class=\"col-md-8 job_search_div\">\r\n");
      out.write("                        <h3> Find A Job at India's No.1 Job Site </h3>\r\n");
      out.write("                        <form action=\"search-jobs-result.jsp\" method=\"POST\">\r\n");
      out.write("                            <input type=\"text\" name=\"technology1\" placeholder=\"Technology...\" class=\"textfield_design\" />\r\n");
      out.write("                            <input type=\"text\" name=\"location1\" placeholder=\"Location...\" class=\"textfield_design\" />\r\n");
      out.write("                            <input type=\"submit\" value=\"Search\" class=\"btn btn-primary\" />\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-2\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- ==============search job div ends================= -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-3\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li> <a href=\"\"> Smart Programming </a> </li>\r\n");
      out.write("                            <li> <a href=\"\"> Infosys </a> </li>\r\n");
      out.write("                            <li> <a href=\"\"> Wipro </a> </li>\r\n");
      out.write("                            <li> <a href=\"\"> IBM </a> </li>\r\n");
      out.write("                            <li> <a href=\"\"> Google </a> </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6\" style=\"background-color: #f9f8f9; margin-top: 10px\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                        ");

                            String id,job_profile, company, experience, description, date1, time1;
                            try
                            {
                                Connection con=DbConnection.getConnect();
                                
                                PreparedStatement ps=con.prepareStatement("select * from jobs");
                                ResultSet rs=ps.executeQuery();
                                while(rs.next())
                                {
                                    id=rs.getString("id");
                                    job_profile=rs.getString("job_profile");
                                    company=rs.getString("company");
                                    experience=rs.getString("experience");
                                    description=rs.getString("description");
                                    date1=rs.getString("date1");
                                    time1=rs.getString("time1");
                                    
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"col-md-12 display_job_div\">\r\n");
      out.write("                                <b> ");
      out.print(job_profile);
      out.write("</b> <span style=\"font-size: 12px; color: #9f9d9d; float: right\"> (");
      out.print(date1);
      out.write(" & ");
      out.print(time1);
      out.write(")</span> <br>\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-home\"></span> <span style=\"color: #9f9d9d\"> Company : </span> ");
      out.print(company);
      out.write(" </span> <br>\r\n");
      out.write("                                <span> <span class=\"glyphicon glyphicon-book\"></span> <span style=\"color: #9f9d9d\"> Experience : </span> ");
      out.print(experience);
      out.write(" </span> <br>\r\n");
      out.write("                                <span> <span class=\"glyphicon glyphicon-file\"></span>  <span style=\"color: #9f9d9d\"> Job Description : </span> ");
      out.print(description);
      out.write(" </span> <br>\r\n");
      out.write("                                <br><a href=\"job-description.jsp?jid=");
      out.print(id);
      out.write("\"> See Full Details </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                        ");

                                }
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                        
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li> <a href=\"\"> Smart Programming </a> </li>\r\n");
      out.write("                            <li> <a href=\"\"> Infosys </a> </li>\r\n");
      out.write("                            <li> <a href=\"\"> Wipro </a> </li>\r\n");
      out.write("                            <li> <a href=\"\"> IBM </a> </li>\r\n");
      out.write("                            <li> <a href=\"\"> Google </a> </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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
