package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/html\">\n");
      out.write("<head>\n");
      out.write("<title>BusinessHighway | Support</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.3.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/arial.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cuf_run.js\"></script>\n");
      out.write("<h1 align=\"center\" style=\"color:red;\"><u> Registration form </u></h1>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function validateForm()\n");
      out.write("{\n");
      out.write("var p=document.forms[\"myForm\"][\"id\"].value;\n");
      out.write("if (p===null || p===\"\")\n");
      out.write("{\n");
      out.write("alert(\"Id must be filled out\");\n");
      out.write("document.myForm.id.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("var x=document.forms[\"myForm\"][\"firstname\"].value;\n");
      out.write("if (x===null || x===\"\")\n");
      out.write("{\n");
      out.write("alert(\"First name must be filled out\");\n");
      out.write("document.myForm.firstname.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("var y=document.forms[\"myForm\"][\"fathersname\"].value;\n");
      out.write("if (y===null || y===\"\")\n");
      out.write("{\n");
      out.write("alert(\"Fathers name must be filled out\");\n");
      out.write("document.myForm.fathersname.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("var a=document.forms[\"myForm\"][\"age\"].value;\n");
      out.write("if (a===null || a===\"\")\n");
      out.write("{\n");
      out.write("alert(\"age must be filled out\");\n");
      out.write("document.myForm.age.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("var c=document.forms[\"myForm\"][\"email\"].value;\n");
      out.write("var atpos=c.indexOf(\"@\");\n");
      out.write("var dotpos=c.lastIndexOf(\".\");\n");
      out.write("\n");
      out.write("if (atpos<1 || dotpos<atpos+2 || dotpos+2>=c.length)\n");
      out.write("{\n");
      out.write("alert(\"Not a valid e-mail address\");\n");
      out.write("document.myForm.email.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("var d=document.forms[\"myForm\"][\"phonenum\"].value;\n");
      out.write("if (d===null || d===\"\")\n");
      out.write("{\n");
      out.write("alert(\"phone number must be filled out\");\n");
      out.write("document.myForm.phonenum.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("var f=document.forms[\"myForm\"][\"account\"].value;\n");
      out.write("if (f===null || f===\"\")\n");
      out.write("{\n");
      out.write("alert(\"Account Type must be Selected\");\n");
      out.write("document.myForm.qualification.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- START PAGE SOURCE -->\n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <div class=\"logo\">\n");
      out.write("      <h1><a href=\"index.html\">busines<span>s</span>highway<small>Simple web template</small></a></h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"menu_nav\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("        <li class=\"active\"><a href=\"support.html\">Support</a></li>\n");
      out.write("        <li><a href=\"about.html\">About Us</a></li>\n");
      out.write("        <li><a href=\"blog.html\">Blog</a></li>\n");
      out.write("        <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clr\"></div>\n");
      out.write("    <div class=\"hbg\"><img src=\"images/header_images.jpg\" width=\"1060\" height=\"238\" alt=\"\" /></div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"content\">\n");
      out.write("    <div class=\"content_bg\">\n");
      out.write("      <div class=\"mainbar\">\n");
      out.write("        <div class=\"article\">\n");
      out.write("       \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <form name=\"myForm\" onsubmit=\"return validateForm()\" action=RegistrationServlet method=\"post\">\n");
      out.write("<table align=\"center\">\n");
      out.write("<tr><td> User Id:</td><td><input type=\"text\" name=\"id\" /><br /></td></tr>\n");
      out.write("<tr><td> First name:</td><td><input type=\"text\" name=\"firstname\" /><br /></td></tr>\n");
      out.write("<tr><td> Fathersname:</td><td> <input type=\"text\" name=\"fathersname\" /><br/></td></tr>\n");
      out.write("<tr><td> Age:</td><td><input type=\"text\" name=\"age\" /></br></td></tr>\n");
      out.write("\n");
      out.write("<tr><td> Gender:</td><td></br>\n");
      out.write("<input type=\"radio\" name=\"sex\" value=\"male\" /> Male<br />\n");
      out.write("<input type=\"radio\" name=\"sex\" value=\"female\" /> Female</br></td></tr>\n");
      out.write("<tr><td> EmailId:</td><td><input type=\"text\" name=\"email\"/><br /></td></tr>\n");
      out.write("<tr><td>\n");
      out.write("Phone Number:</td><td><input type=\"text\" name=\"phonenum\"/><br /></td></tr>\n");
      out.write("<tr><td> Account Type</td><td> <select name=\"account\"/>\n");
      out.write("<option value=\"SavingAcc\">SavingsAcc</option>\n");
      out.write("<option value=\"CurrentAcc\">CurrentAcc</option>\n");
      out.write("<option value=\"FD\">FD</option>\n");
      out.write("<option value=\"Other\">Other</option>\n");
      out.write("</select></br></td></tr>\n");
      out.write("<tr><td> \n");
      out.write("<input type=\"reset\" value=\"reset\" /></td>\n");
      out.write("<td> <input type=\"Submit\" value=\"insert\" name=\"s1\"></td>\n");
      out.write("<td> <input type=\"Submit\" value=\"delete\" name=\"s1\"> </td></tr>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("            \n");
      out.write("         </div>   \n");
      out.write("      </div>\n");
      out.write("      <div class=\"sidebar\">\n");
      out.write("        <div class=\"gadget\">\n");
      out.write("          <div class=\"search\">\n");
      out.write("            <form method=\"get\" id=\"search\" action=\"#\">\n");
      out.write("              <span>\n");
      out.write("              <input type=\"text\" value=\"Search...\" name=\"s\" id=\"s\" />\n");
      out.write("              <input name=\"searchsubmit\" type=\"image\" src=\"images/search.gif\" value=\"Go\" id=\"searchsubmit\" class=\"btn\"  />\n");
      out.write("              </span>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"clr\"></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"gadget\">\n");
      out.write("          <h2><span>Sidebar</span> Menu</h2>\n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("          <ul class=\"sb_menu\">\n");
      out.write("            <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("            <li><a href=\"#\">TemplateInfo</a></li>\n");
      out.write("            <li><a href=\"#\">Style Demo</a></li>\n");
      out.write("            <li><a href=\"#\">Blog</a></li>\n");
      out.write("            <li><a href=\"#\">Archives</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"gadget\">\n");
      out.write("          <h2><span>Sponsors</span></h2>\n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("          <ul class=\"ex_menu\">\n");
      out.write("            <li class=\"active\"><a href=\"#\">Lorem ipsum dolor</a> <span>Donec libero. Suspendisse bibendum</span></li>\n");
      out.write("            <li><a href=\"#\">Dui pede condimentum</a> <span>Phasellus suscipit, leo a pharetra</span></li>\n");
      out.write("            <li><a href=\"#\">Condimentum lorem</a> <span>Tellus eleifend magna eget</span></li>\n");
      out.write("            <li><a href=\"#\">Fringilla velit magna</a> <span>Curabitur vel urna in tristique</span></li>\n");
      out.write("            <li><a href=\"#\">Suspendisse bibendum</a> <span>Cras id urna orbi tincidunt orci ac</span></li>\n");
      out.write("            <li><a href=\"#\">Donec mattis</a> <span>purus nec placerat bibendum</span></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"gadget\">\n");
      out.write("          <h2 class=\"grey\"><span>Wise Words</span></h2>\n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("          <div class=\"testi\">\n");
      out.write("            <p><span class=\"q\"><img src=\"images/quote_1.gif\" width=\"16\" height=\"14\" alt=\"\" /></span> We can let circumstances rule us, or we can take charge and rule our lives from within. <span class=\"q\"><img src=\"images/quote_2.gif\" width=\"16\" height=\"14\" alt=\"\" /></span></p>\n");
      out.write("            <p class=\"title\"><strong>Earl Nightingale</strong></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"fbg\">\n");
      out.write("    <div class=\"fbg_resize\">\n");
      out.write("      <div class=\"col c1\">\n");
      out.write("        <h2><span>Image Gallery</span></h2>\n");
      out.write("        <a href=\"#\"><img src=\"images/pic_1.jpg\" width=\"58\" height=\"58\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/pic_2.jpg\" width=\"58\" height=\"58\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/pic_3.jpg\" width=\"58\" height=\"58\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/pic_4.jpg\" width=\"58\" height=\"58\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/pic_5.jpg\" width=\"58\" height=\"58\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/pic_6.jpg\" width=\"58\" height=\"58\" alt=\"\" /></a> </div>\n");
      out.write("      <div class=\"col c2\">\n");
      out.write("        <h2><span>Lorem Ipsum</span></h2>\n");
      out.write("        <p>Lorem ipsum dolor<br />\n");
      out.write("          Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec libero. Suspendisse bibendum. Cras id urna. <a href=\"#\">Morbi tincidunt, orci ac convallis aliquam</a>, lectus turpis varius lorem, eu posuere nunc justo tempus leo. Donec mattis, purus nec placerat bibendum, dui pede condimentum odio, ac blandit ante orci ut diam.</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col c3\">\n");
      out.write("        <h2><span>About</span></h2>\n");
      out.write("        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec libero. Suspendisse bibendum. Cras id urna. Morbi tincidunt, orci ac convallis aliquam, lectus turpis varius lorem, eu posuere nunc justo tempus leo. llorem, eu posuere nunc justo tempus leo. Donec mattis, purus nec placerat bibendum. <a href=\"#\">Learn more...</a></p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <div class=\"footer_resize\">\n");
      out.write("      <p class=\"lf\">Copyright &copy; 2010 <a href=\"#\">SiteName</a> - All Rights Reserved</p>\n");
      out.write("      <p class=\"rf\"><a href=\"http://all-free-download.com/free-website-templates/\">Free CSS Templates</a> by <a href=\"http://www.atomicwebsitetemplates.com/\">Atomic Website Templates</a></p>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- END PAGE SOURCE -->\n");
      out.write("<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>\n");
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
