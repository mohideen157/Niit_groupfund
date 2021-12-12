package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Banking Queue Management System</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.3.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/arial.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cuf_run.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- START PAGE SOURCE -->\n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <div class=\"logo\">\n");
      out.write("      <h1><a href=\"index.html\">Banking<span>s</span><small>Queue Management System</small></a></h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"menu_nav\">\n");
      out.write("      <ul>\n");
      out.write("        <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("        <li><a href=\"supportn.html\">Support</a></li>\n");
      out.write("        <li><a href=\"aboutusn.html\">About Us</a></li>\n");
      out.write("        <li><a href=\"centraldisplaywelcomen.jsp\">Central Display</a></li>\n");
      out.write("       \n");
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
      out.write("            \n");
      out.write("            \n");
      out.write("          \n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"article\">\n");
      out.write("          <h2><span>Types of Products</span></h2>\n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("        \n");
      out.write("          <p><b>FIXED DEPOSIT:</b>\n");
      out.write("All Banks in India (including SBI, PNB, BoB, BoI, Canara Bank, ICICI Bank, Yes Bank etc.)  offer fixed deposits schemes with a wide range of tenures for periods from 7 days to 10 years.   These are also popularly known as FD accounts.   However, in some other countries these are known as \"Term Deposits\" or even called \"Bond\".    The term \"fixed\" in Fixed Deposits (FD) denotes the period of maturity or tenor. Therefore, the depositors  are supposed to continue such Fixed Deposits for the  length of time for which the depositor decides to keep the money with the bank.  However, in case of need,  the depositor can ask for closing (or breaking) the fixed deposit prematurely by paying paying a penalty (usually of 1%, but some banks either charge less or no penalty).   (Some  banks   introduced variable interest fixed deposits.  The rate of interest on such deposits  keeps on varying with the prevalent market rates i.e. it will go up if market interest rates goes and it will come down if the market rates fall.  However, such type of fixed deposits have not been popular till date).\n");
      out.write("</p> \n");
      out.write("<p><b>CURRENT ACCOUNT:</b>\n");
      out.write("Current Accounts are basically meant for businessmen and are never used for the purpose of investment or savings.  These deposits are the most liquid deposits and there are no limits for number of transactions or the amount of transactions in a day.  Most of the current account are opened in the names of firm / company accounts.   Cheque book facility is provided and the account holder can deposit all types of the cheques and drafts in their name or endorsed in their favour by third parties.  No interest is paid by banks  on these accounts.  On the other hand, banks charges certain  service charges, on such accounts.   \n");
      out.write("</p>\n");
      out.write("<p><b>RECURRING DEPOSIT:</b>\n");
      out.write("These are popularly known as RD accounts and are special kind of Term Deposits and are suitable for people who do not have lump sum amount of savings, but are ready to save a small amount every month.    Normally, such deposits earn interest on the amount already deposited (through monthly installments) at the same rates as are applicable for Fixed Deposits / Term Deposits.   These are best if you wish to create a fund for your child's education or marriage of your daughter or buy a car without loans or save for the future.\n");
      out.write("\n");
      out.write("</p>\n");
      out.write("          \n");
      out.write("       \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write(" \n");
      out.write("            \n");
      out.write("          </div>  \n");
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
      out.write("            \n");
      out.write("            \n");
      out.write("         \n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("          <ul class=\"sb_menu\">\n");
      out.write("            <li class=\"active\"></li>\n");
      out.write("            <li><a href=\"adminintermediate.html\">BackToAdminHome</a></li>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        <div class=\"gadget\">\n");
      out.write("          <h2><span>KeY mEAsuRemenTS</span></h2>\n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("          <ul class=\"ex_menu\">\n");
      out.write("            <li class=\"active\"><a href=\"#\">The number of people entering the Bank</a></li>\n");
      out.write("            <li><a href=\"#\">Queue Length</a></li>\n");
      out.write("            <li><a href=\"#\">Average Waiting Time</a></li>\n");
      out.write("            <li><a href=\"#\">Till Operator or Bank Teller Idle Time</a></li>\n");
      out.write("            <li><a href=\"#\">Total Waiting Time</a></li> \n");
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
      out.write("        <h2><span>QUEUE</span></h2>\n");
      out.write("        <p>The main objective of any queue management system is to achieve a better quality service to customers. The queue management system will issue a queue ticket to a customer and later announce the  ticket number when service is available, eliminating the need to stand in line while waiting....</p>\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("      <div class=\"col c3\">\n");
      out.write("        <h2><span>About</span></h2>\n");
      out.write("        <p>Every customer has to wait for long hours to accomplish his or her transactions in banks. Banking customers face this problem every day in their daily life. By solving this issue, it will eventually speed up customer throughput and increase sales and profitability while improving productivity an operational efficiencies. Moreover, it minimizes prolonged customer waiting and reduces frustrations......</p>\n");
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
