/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rosheinee
 */
public class LoginDaon1 {
    public static boolean validate(String tno,String s2) {        
        PrintWriter out = null ;
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean status=true;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "form";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "root";
        try {
            Class.forName(driver).newInstance();
            con = DriverManager
                    .getConnection(url + dbName, userName, password);

           // pst = conn
              //      .prepareStatement("select * from adminlogin where user=? and password=?");
           pst.setString(1, tno);
            //pst.setString(2, pass);
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
                    PreparedStatement pst2 = con.prepareStatement("delete from ticketn where tno=?");
                    pst2.setString(1,tno);
                    pst2.executeUpdate();
                    //out.println(" <form name=myForm1 method=post action=centraldisplayServlet>");
                    //out.println("<table bgcolor=purple align=center cellspacing=1 cellpadding=0 >");
                    out.println("<body bgcolor=lightsteelblue><h3>process completed    " + tno + "</h3></body></html>");
                    break;
                
                    
                default:
                    out.println("<body bgcolor=lightsteelblue><h3>process Queued " + "</h3></body></html>");
                    break;
            }

            rs = pst.executeQuery();
            status = rs.next();

            
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

    
 }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return status;
    }
            }
