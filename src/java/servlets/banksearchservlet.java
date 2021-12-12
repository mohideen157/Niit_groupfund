/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rosheinee
 */
public class banksearchservlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            try {
PrintWriter out = response.getWriter();
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(banksearchservlet.class.getName()).log(Level.SEVERE, null, ex);
            }
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","root");
ResultSet rs;
        String id = request.getParameter("search1");
        
        
        out.println("<html>");
out.println("<head>");
out.println("<title>UserInfo</title>");
out.println("</head>");
out.println("<body bgcolor=lightsteelblue>");
//ResultSet rs;
//out.println("<form>");
//out.println("<table border='1' cellspacing='3' cellpadding='2'>");
//out.println("<tr><td> ID </td> <td>FIRSTNAME</td> <td>FATHERSNAME</td><td>AGE</td><td>GENDER</td><td>EMAILID</td><td>PHONENUM</td><td>ACCOUNT TYPE</td></tr>");
//PreparedStatement pstmt = con.prepareStatement("select * from register");
//ResultSet rs1 = pstmt.executeQuery();
//while (rs1.next()) {
//out.println("<tr><td>" + rs1.getString(1) + "</td><td>" + rs1.getString(2) + "</td><td>" + rs1.getString(3) + "</td><td>" + rs1.getString(4) + "</td><td>" + rs1.getString(5) + "</td><td>" + rs1.getString(6) + "</td><td>" + rs1.getString(7) + "</td><td>" + rs1.getString(8) + "</td></tr>");
//}
//out.println("</table>");
//out.println("</form>");
out.println("<form name='f2' method='post' action=banksearchservlet >");
out.println("<br><br><br>");
out.println("<br><br><br>");
out.println("<br><br>");
out.println("<form name='s' action='banksearchservlet' method=post>");
out.println("<br>Enter ID : <input type='text' value=''name='search1'/> ");
out.println("<input type='hidden' value='" + id + "'name='id'/> ");
//out.println("<input type='hidden' value='" + age + "'name='age'/> ");
out.println("<br><br>");
String s3 = request.getParameter("search1");
//out.println("Click Here For Delete: <input type ='submit' value='Delete' name='s1'/>");
//out.println("Click Here For Update: <input type ='submit' value='Update' name='s1'/>");
out.println("<br>");
out.println("Click Here For Search Details :<input type ='submit' value='Search Details' name='s1'/>");
out.println("</form>");
out.println("<a href=\"bankintermediate.html\">BackToBankersHome</a>");
 


          out.println("<table border='1' >");
                    
                    out.println("<tr><td> ID </td> <td>FIRSTNAME</td> <td>FATHERSNAME</td><td>AGE</td><td>GENDER</td><td>EMAILID</td><td>PHONENUM</td><td>ACCOUNT TYPE</td></tr>");
                    PreparedStatement pst1 = con.prepareStatement("select * from registern where ID=? ");
                    pst1.setString(1, id);
                    //System.out.println("hello");
                    rs = pst1.executeQuery();
                    while (rs.next()) {
                       // out.println("<table border='2' cellspacing='3' cellpadding='2'>");
                        out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4) + "</td><td>" + rs.getString(5) + "</td><td>" + rs.getString(6) + "</td><td>" + rs.getString(7) + "</td><td>" + rs.getString(8) + "</td></tr>");
           
            
            }
    }   catch (SQLException ex) {
            Logger.getLogger(banksearchservlet.class.getName()).log(Level.SEVERE, null, ex);
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
