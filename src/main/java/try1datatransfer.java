import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.EditorKit;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.net.URLConnection;
import java.net.URI;
import java.net.URL;
import java.sql.*;
import java.util.Arrays;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTML.Tag;
import javax.swing.text.html.HTMLEditorKit.ParserCallback;
import javax.swing.text.html.parser.ParserDelegator;

public class try1datatransfer {
    public static void main(String[] args) throws Exception {
         String url = "jdbc:mysql://localhost:3306/htmldata";
         String uname = "VALHALLA";
         String pass = "alpha";
         Class.forName("com.mysql.jdbc.Driver");
         ArrayList<String> data =new ArrayList<String>();
    HTMLDocument doc = new HTMLDocument() {
      public HTMLEditorKit.ParserCallback getReader(int pos) {
        return new HTMLEditorKit.ParserCallback() {
          public void handleText(char[] data, int pos){
             // int i;
             // for(i=0;i<pos;i++){
            // System.out.println(pos);
          //  System.out.println(popDepth);
           // System.out.println( data);
            /* for (int i = 0; i < data.length; i++) {
               System.out.print(data[i] + " ");
           }*/
             String str2 = String.valueOf(data);
                System.out.println(str2);
                
            for(int i = 0;i<data.length;i++){
       
        
                
      
          }
                
       
            
         
            
        
            
            
           
          
         // }
        };
      }
    };
  
    
      FileReader xyz = new FileReader("D:\\final year project\\New folder\\basic.html");
      EditorKit kit = new HTMLEditorKit();
      kit.read(xyz,doc,0);
      
     
     

}
}

/*

      
      String url = "jdbc:mysql://localhost:3306/htmldata";
       String uname = "VALHALLA";
       String pass = "alpha";
      //String sectag = "<gg>";
      //String[] arr2 = null;
       //String[] arr = {"valorant","csgo","ball"};
      for(int i = 0;i<data.size();i++){
       
       String str3 = String.valueOf(data.get(i));
       String query = " insert into tag (tagname) values (?)";
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,uname,pass);
      //Statement st = con.createStatement();
      PreparedStatement st = con.prepareStatement(query);
      st.setString(1,str3);
      int count = st.executeUpdate();
      System.out.println(count );
      st.close();
      con.close();
   }

*/

