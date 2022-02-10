   /* for basic tag and new html */

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.HTML.Attribute;
import javax.swing.text.html.HTML.Tag;
import javax.swing.text.html.HTMLEditorKit.ParserCallback;
import javax.swing.text.html.parser.ParserDelegator;

public class reproduction2 {
  public final static void main(String[] args) throws Exception {
    final ArrayList<String> list = new ArrayList<String>();
    
    ParserDelegator parserDelegator = new ParserDelegator();
    ParserCallback parserCallback = new ParserCallback() {
      public void handleText(final char[] data, final int pos) {
         // System.out.println(data);
      }

     /* public void handleStartTag(Tag tag, MutableAttributeSet attribute, int pos) {
        if (tag == Tag.A) {
          String address = (String) attribute.getAttribute(Attribute.HREF);
          list.add(address);
        //  System.out.println(tag);
        } 
      }*/
      
      public void handleStartTag(Tag tag, MutableAttributeSet attribute,final int pos){
         
          System.out.println(tag +" "+"opening" + "-----"+ pos);
          //System.out.println(tag.toString());
          System.out.println(pos);
         // System.out.println(arr); 
          String arr = tag.toString();
          
          byte data1[] = arr.getBytes();       
         try {                           
                  RandomAccessFile f = new RandomAccessFile(new File("D:\\final year project\\New folder\\new.html"), "rw");
            f.seek(pos);     
            f.writeUTF("<"+arr+">\n");
            f.close();
               } catch (IOException e) {       
            e.printStackTrace();
               }
          
          
       
          }
       
	  
       
          
      
      public void handleEndTag(Tag t, final int pos) {
          System.out.println(t +" "+"closing "+"-----"+ pos);
       //  System.out.println(pos);
          String arr2 = t.toString();
          byte data1[] = arr2.getBytes();       

              try {                           
                  RandomAccessFile f = new RandomAccessFile(new File("D:\\final year project\\New folder\\new.html"), "rw");
            f.seek(pos);        
            f.writeUTF("<"+arr2+">\n");
            f.close();
               } catch (IOException e) {       
            e.printStackTrace();
               }
          
            
      }

      public void handleSimpleTag(Tag t, MutableAttributeSet a, final int pos) {
      }

      public void handleComment(final char[] data, final int pos) {
      }

      public void handleError(final java.lang.String errMsg, final int pos) {
      }
    };
    parserDelegator.parse(new FileReader("D:\\final year project\\New folder\\basic.html"), parserCallback, false);
    //System.out.println(list);
   
    System.out.println("DATA ADDED");
    
  }
}

