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
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PrintStreamTest {
    public static void main(String[] args) {
        File file1=new File("D:/test/fruits.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrintStreamTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintStream out=new PrintStream(fos);
        out.println("mango");
        out.println("orange");
        out.println("banana");
        System.out.println("Written");
    }
    
}
