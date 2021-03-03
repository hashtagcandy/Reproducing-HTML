
import java.util.ArrayList;
import java.io.*;
public class serialize2
{
   public static void main(String [] args)
   {
       //String[] sectag = {"valorant","csgo","beral"};
       ArrayList<String> al=new ArrayList<String>();
       al.add("Hello");
       al.add("2k6");
       al.add("lovely");

       try{
         FileOutputStream fos= new FileOutputStream("buro");
         ObjectOutputStream oos= new ObjectOutputStream(fos);
         oos.writeObject(al);
         oos.close();
         fos.close();
       }catch(IOException ioe){
            ioe.printStackTrace();
        }
   }
}
 