/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author akggupta
 */
public class nb_javac_files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\nb-java-x2\\nb-java-x\\make");
        File dirs[]=f.listFiles();
        for (int i = 0; i < dirs.length; i++) {
            System.out.println("make/"+dirs[i].getName()); 
        }
    }
    
}
