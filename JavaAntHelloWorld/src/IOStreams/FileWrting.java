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
import java.util.*;
import java.io.*;
public class FileWrting {
    public static void main(String[] args) {
        File f=new File("D:/test/hello.txt");
        try (FileOutputStream fo=new FileOutputStream(f)){//opend in try resource statement
           fo.write('A');
           fo.write('B');
           fo.write('C');
           String msg="Hello All";
           fo.write(msg.getBytes());
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
