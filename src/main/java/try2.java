import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.text.EditorKit;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class try2 {
  public static void main(String[] argv) throws Exception {
    //URL url = new URI("http://www.google.com").toURL();
   // URLConnection conn = url.openConnection();
    //Reader rd = new InputStreamReader(conn.getInputStream());
    FileReader xyz = new FileReader("D:\\final year project\\New folder\\basic.html");

    EditorKit kit = new HTMLEditorKit();
    HTMLDocument doc = (HTMLDocument) kit.createDefaultDocument();
    kit.read(xyz, doc, 0);

    HTMLDocument.Iterator it = doc.getIterator(HTML.Tag.A);
    while (it.isValid()) {
      SimpleAttributeSet s = (SimpleAttributeSet) it.getAttributes();

      String link = (String) s.getAttribute(HTML.Attribute.HREF);
      if (link != null) {
        System.out.println(link);
      }
      try {                           
                  RandomAccessFile f = new RandomAccessFile(new File("D:\\final year project\\New folder\\new.html"), "rw");
                
            f.writeUTF(link);
            f.close();
               } catch (IOException e) {       
            e.printStackTrace();
               }
      
      it.next();
    }
  }
}