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
public class adminbankdetailsServlet extends HttpServlet {

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
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","root");
String id=request.getParameter("id");
String firstname=request.getParameter("firstname");
String lname=request.getParameter("lname");
String dob=request.getParameter("dob");
String sex=request.getParameter("sex");
String email=request.getParameter("email");
String phonenum=request.getParameter("phonenum");
String bcode=request.getParameter("bcode");
String blocation=request.getParameter("blocation");
String uname=request.getParameter("uname");
String pass=request.getParameter("pass");
String cpass=request.getParameter("cpass");
String s2=request.getParameter("s1");
            switch (s2) {
                case "insert":
                    PreparedStatement pstmt = con.prepareStatement("insert into adminbankdetail values(?,?,?,?,?,?,?,?,?,?,?,?)");
                    pstmt.setString(1,id);
                    pstmt.setString(2,firstname);
                    pstmt.setString(3,lname);
                    pstmt.setString(4,dob);
                    pstmt.setString(5,sex);
                    pstmt.setString(6,email);
                    pstmt.setString(7,phonenum);
                    pstmt.setString(8,bcode);
                    pstmt.setString(9,blocation);
                    pstmt.setString(10,uname);
                    pstmt.setString(11,pass);
                    pstmt.setString(12,cpass);
                    int a=pstmt.executeUpdate();
                    if(a>0) {
                        out.println("Values Are Inserted");
                    } else {
                        out.println("Values Are not Inserted");
                    }                   break;
                case "delete":
                    PreparedStatement pst = con.prepareStatement("delete from adminbankdetail where id =?");
                    pst.setString(1,id);
                    pst.executeUpdate();
        
                    out.println("<body><h3>deleted with id " + id + "</h3></body></html>");
                    break;
                case "update":
                     String query = "update adminbankdetail set id='"+id+"',firstname='"+firstname+"',lname='"+lname+"',dob='"+dob+"',sex='"+sex+"',email='"+email+"',phonenum='"+phonenum+"',bcode='"+bcode+"' where id="+id;
                    //String query = "update adminbankdetail set id='"+id+"',firstname='"+firstname+"',lname='"+lname+"',dob='"+dob+"',sex='"+sex+"',email='"+email+"',phonenum='"+phonenum+"',bcode='"+bcode+"',blocation='"+blocation+"' where id="+id;
                    Statement stmt = con.createStatement();
                    int i = stmt.executeUpdate(query);
               //     out.println("i" +i);
                    out.println("update successfully");
                    break;
                default:
                    break;
            }
out.println("<html>");
out.println("<head>");
out.println("<title>UserInfo</title>");
out.println("</head>");
out.println("<body bgcolor=lightsteelblue>");
ResultSet rs;
out.println("<form>");
out.println("<table border='1' cellspacing='3' cellpadding='2'>");
out.println("<tr><td> ID </td> <td>FIRSTNAME</td> <td>LASTNAME</td><td>DOB</td><td>GENDER</td><td>EMAILID</td><td>PHONENUM</td><td>BRANCH CODE</td><td>BRANCH LOCATION</td><td>USER NAME</td><td>PASSWORD</td><td>CONFIRM PASSWORD</td></tr>");
PreparedStatement pstmt = con.prepareStatement("select * from adminbankdetail");
ResultSet rs1 = pstmt.executeQuery();
while (rs1.next()) {
out.println("<tr><td>" + rs1.getString(1) + "</td><td>" + rs1.getString(2) + "</td><td>" + rs1.getString(3) + "</td><td>" + rs1.getString(4) + "</td><td>" + rs1.getString(5) + "</td><td>" + rs1.getString(6) + "</td><td>" + rs1.getString(7) + "</td><td>" + rs1.getString(8) +"</td><td>" + rs1.getString(9) +"</td><td>" + rs1.getString(10) +"</td><td>"+ rs1.getString(11) +"</td><td>" + rs1.getString(12) + "</td></tr>");
}
out.println("</table>");
out.println("</form>");
out.println("<form name='f2' method='post' action=adminbankdetailsServlet >");
out.println("<br><br><br>");
out.println("<br><br><br>");
out.println("<br><br>");
out.println("<form name='s' action='adminbankdetailsServlet' method=post>");
out.println("<br>Enter ID : <input type='text' value=''name='search1'/> ");
out.println("<input type='hidden' value='" + id + "'name='id'/> ");
out.println("<input type='hidden' value='" + dob+ "'name='dob'/> ");
out.println("<br><br>");
String s3 = request.getParameter("search1");
out.println("Click Here For Delete: <input type ='submit' value='Delete' name='s1'/>");
out.println("Click Here For Update: <input type ='submit' value='Update' name='s1'/>");
out.println("<br>");
out.println("Click Here For Search Details :<input type ='submit' value='Search Details' name='s1'/>");
out.println("</form>");
out.println("<a href=\"adminintermediate.html\">BackToAdminHome</a>");
            switch (s2) {
                case "Delete":
                    {
                        PreparedStatement pst2 = con.prepareStatement("delete from adminbankdetail where ID =?");
                        pst2.setString(1, s3);
                        pst2.executeUpdate();
                        break;
                    } // out.println("Click Here For Search Details :<input type ='submit' value='Search Details' name='search'/>");
                case "Search Details":
                    //out.println("Click Here For Search Details :<input type ='submit' value='Search Details' name='search'/>");
                    out.println("<table border='1' cellspacing='3' cellpadding='2'>");
                    String s23 = request.getParameter("search1");
                    out.println("<tr><td> ID </td> <td>FIRSTNAME</td> <td>LASTNAME</td><td>DOB</td><td>GENDER</td><td>EMAILID</td><td>PHONENUM</td><td>BRANCH CODE</td><td>BRANCH LOCATION</td><td>USER NAME</td><td>PASSWORD</td><td>CONFIRM PASSWORD</td></tr>");
                    PreparedStatement pst1 = con.prepareStatement("select * from adminbankdetail where ID=? ");
                    pst1.setString(1, s23);
                    //System.out.println("hello");
                    rs = pst1.executeQuery();
                    while (rs.next()) { 
                        out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4) + "</td><td>" + rs.getString(5) + "</td><td>" + rs.getString(6) + "</td><td>" + rs.getString(7) + "</td><td>" + rs.getString(8) +"</td><td>" + rs.getString(9) +"</td><td>" + rs.getString(10) +"</td><td>" + rs.getString(11) +"</td><td>" + rs.getString(12) + "</td></tr>");
                    }                   break;
                case "Update":
                    {
                        PreparedStatement pst2 = con.prepareStatement("select * from adminbankdetail where ID =?");
                        pst2.setString(1, s3);
                        rs1 = pst2.executeQuery();
                        if (rs1.next()) {
                            out.println(" <form name=myForm1 method=post action=adminbankdetailsServlet>");
                            out.println("<table bgcolor=purple align=center cellspacing=1 cellpadding=0 >");
                            out.println(" <tr><td> ID </td><td><input type=text name=id value='" + rs1.getString(1) + "' readonly /><br /></td></tr>");
                            out.println("<tr><td> First name:</td><td> <input type=text name=firstname value='" + rs1.getString(2) + "'/><br /></td></tr>");
                            out.println("<tr><td> Last name:</td><td> <input type=text name=lname value='" + rs1.getString(3) + "'/><br/></td></tr>");
                            out.println("<tr><td> DOB:</td><td> <input type=text name=dob value='" + rs1.getString(4) + "'/></br></td></tr>");
                            out.println("<tr><td> Gender:</td><td>");
                            if(rs1.getString(5).equals("male")) {
                                out.println("<input type=radio name=sex value='male' checked /> Male");
                                out.println(" <input type=radio name=sex value='female' /> Female</td></tr>");
                            } else{
                                out.println("<input type=radio name=sex value='male' /> Male");
                                out.println(" <input type=radio name=sex value='female' checked/> Female</td></tr>");
                            }
                            out.println("<tr><td> Emailid: </td><td><input type=text name=email value='" + rs1.getString(6) + "'/><br /></td></tr>");
                            out.println(" <tr><td>Phone Number:</td><td> <input type=text name=phonenum value='" + rs1.getString(7) + "'/><br /></td></tr>");
                                                        out.println("<tr><td> Branch Code: </td><td><input type=text name=bcode value='" + rs1.getString(8) + "'/><br /></td></tr>");
                                    out.println("<tr><td> Branch Location: </td><td><input type=text name=blocation value='" + rs1.getString(9) + "'/><br /></td></tr>");
        

 out.println("<tr><td> UserName: </td><td><input type=text name=uname value='" + rs1.getString(10) + "'/><br /></td></tr>"); 
 out.println("<tr><td> Password: </td><td><input type=text name=pass value='" + rs1.getString(11) + "'/><br /></td></tr>"); 
 out.println("<tr><td> ConfirmPassword: </td><td>"+ "<input type=text name=cpass value='" + rs1.getString(12) + "'/><br /></td></tr>");
out.println("<tr><td><br></td><td<br></td></tr>");
out.println("<tr><td></td><td>");
out.println("<input type=reset value=Reset />");
//out.println(" <input type=Submit value=insert name=s1>");
out.println("<input type=Submit value=update name=s1>");
//out.println("<input type=Submit value=delete name=s1> </td></tr></table>");
                        }                       break;
                    }
                default:
                    break;
            }
out.println("</table>");
out.println("</form>");
out.println("</body>");
out.println("</html>");
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
