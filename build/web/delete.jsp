<%-- 
    Document   : delete
    Created on : Nov 29, 2018, 9:36:56 PM
    Author     : Admin
--%>


<%@ page import ="java.sql.*" %>
<%
    try{
        String url = "jdbc:oracle:thin:@129.7.240.3:1521:ORCL";
        String username = request.getParameter("username");   
        
        Class.forName ("oracle.jdbc.driver.OracleDriver"); // MySQL database connection
        Connection conn =DriverManager.getConnection(url, "SUNESARAF", "SUNESARAF1");  
         
         
        PreparedStatement pst = conn.prepareStatement("DELETE FROM LOGIN WHERE username='"+username+"'");
     
     pst.execute();
                
   }
   catch(Exception e){   
        String access=request.getParameter("access");
       out.println("Please Try Again");       
       out.println(access); 
   }      
%>
        <%
            String redirectURL = ("access2.jsp");
            response.sendRedirect(redirectURL);
        %>

        
        