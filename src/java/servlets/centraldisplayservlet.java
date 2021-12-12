package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rosheinee
 */
public class centraldisplayservlet extends HttpServlet {

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
PrintWriter out = response.getWriter();

String tno=request.getParameter("tno");

String s2=request.getParameter("s1");
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","root");

            switch (s2) {
                
                             case "process":
                    
                        PreparedStatement pst1 = con.prepareStatement("select tno,cno from ticketn where tno =?");
                        pst1.setString(1, tno);
                       ResultSet rs1 = pst1.executeQuery();
                        if (rs1.next()) {
                            out.println(" <form name=myForm method=post action=centraldisplayServlet>");
                            out.println("<table bgcolor=purple align=center cellspacing=1 cellpadding=0 >");
                            out.println(" <tr><td> TICKET NO: </td><td><input type=text name=tno value='" + rs1.getString(1) + "' readonly /><br /></td></tr>");
                            out.println("<tr><td> COUNTER NO:</td><td> <input type=text name=cno value='" + rs1.getString(2) + "'/><br /></td></tr>");
out.println("</table>");
out.println("</form>");
out.println("</body>");
out.println("</html>");

//out.println(" <input type=Submit value=insert name=s1>");
//out.println("<input type=Submit value=update name=s1>");
//out.println("<input type=Submit value=delete name=s1> </td></tr></table>");
                        }                       break;
                             case "End process":
                    PreparedStatement pst = con.prepareStatement("delete from ticketn where tno=?");
                    pst.setString(1,tno);
                    pst.executeUpdate();
                    //out.println(" <form name=myForm1 method=post action=centraldisplayServlet>");
                    //out.println("<table bgcolor=purple align=center cellspacing=1 cellpadding=0 >");
                    out.println("<body bgcolor=lightsteelblue><h3>process completed    " + tno + "</h3></body></html>");
                    break;
                
                    
                default:
                    out.println("<body bgcolor=lightsteelblue><h3>process Queued " + "</h3></body></html>");
                    break;
            }
} catch (IOException | ClassNotFoundException | SQLException | NumberFormatException ex) {
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
