                                        // for basic tagtext and new html
import java.io.BufferedWriter;
import java.awt.*; 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
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
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URI;
import java.net.URL;
import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTML.Tag;
import javax.swing.text.html.HTMLEditorKit.ParserCallback;
import javax.swing.text.html.parser.ParserDelegator;

public class try1 {
    public static void main(String[] argv) throws Exception {
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
              //  System.out.println(str2+" "+pos);
                //String str2 = data.toString();
               
              String str3 = new String(data);
              System.out.println(str3+"----"+pos);
             //String str3 = new String(data);
             System.out.println(str3);
              String str4 = ("the title");
              byte data1[] = str3.getBytes(); 
              try {                           
                  RandomAccessFile f = new RandomAccessFile(new File("D:\\final year project\\New folder\\new.html"), "rw");
            
              f.seek(pos+2);   
        //    f.writeUTF(str4);
              f.write(data1);
              f.close();
               } catch (IOException e) {       
            e.printStackTrace();
               }
			   
           
           
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


