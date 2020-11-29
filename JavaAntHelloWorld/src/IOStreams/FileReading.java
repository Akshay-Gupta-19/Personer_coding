/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStreams;

/**
 *
 * @author akggupta
 */
import java.io.*;
public class FileReading {
    public static void main(String[] args) {
        File f=new File("D:/test/hello.txt");
        File f2=new File("D:/test/helloCopy.txt");
        try(FileInputStream fin=new FileInputStream(f);
        FileOutputStream fo=new FileOutputStream(f2)
        ){
            int ch;
            while((ch=fin.read())!=-1){fo.write((char)ch);System.out.print((char)ch);}
        }
        catch(IOException ioex){
        
        }
        System.out.println("");
    }
    
}
