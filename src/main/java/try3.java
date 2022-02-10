/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 
import java.sql.*;
public class try3 {

   public static void main(String[] args) throws Exception 
   {
       String url = "jdbc:mysql://localhost:3306/htmldata";
       String uname = "VALHALLA";
       String pass = "alpha";
       String sectag = "<gg>";
       String query = " insert into tag (tagname) values (?)";
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,uname,pass);
      //Statement st = con.createStatement();
      PreparedStatement st = con.prepareStatement(query);
      st.setString(1,sectag);
      int count = st.executeUpdate();
      System.out.println(count );
      
      
      
      
      
      
      /*
      rs.next();
      String tagname = rs.getString("tagname");
      System.out.println(tagname); */
      st.close();
      con.close();
   }
    
    
}
