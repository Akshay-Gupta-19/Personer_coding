/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crc32;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;
import javax.tools.FileObject;

/**
 *
 * @author akggupta
 */
 class myClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\netbeans_05092019\\netbeans\\java\\libs.javacimpl\\external\\nb-javac-12-impl.jar");
        System.out.println(computeCrc32(f));
    }
    private static String computeCrc32(final File fo) throws IOException {
       final Checksum crc =  new CRC32();
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
       int val = (int)crc.getValue();
       String hex = Integer.toHexString(val);
     
       return hex;
   }
}

