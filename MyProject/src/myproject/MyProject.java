/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myproject;
import java.io.*;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import javax.tools.FileObject;
/**
 *
 * @author akggupta
 */
public class MyProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        File f=new File("C:\\Users\\akggupta\\Downloads\\48ED54FE24FB512524B322D0AB1A189A30D84779-nb-javac-13-impl.jar");
        System.out.println(computeCrc32(f));
    }
private static long computeCrc32(final File fo) throws IOException {
       final Checksum crc = new CRC32();
       try (final InputStream in = new BufferedInputStream(new FileInputStream(fo))) {
           int last = -1;
           int curr;
           while ((curr = in.read()) != -1) {
               if (curr != '\n' && last == '\r') { //NOI18N
                   crc.update('\n');               //NOI18N
               }
               if (curr != '\r') {                 //NOI18N
                   crc.update(curr);
               }
               last = curr;
           }
           if (last == '\r') {                     //NOI18N
               crc.update('\n');                   //NOI18N
           }
       }
       long val = (long)crc.getValue();
      // String hex = Integer.toHexString(val);
      
       return val;
   }
}

