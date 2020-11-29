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
public class FileTest2 {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\akggupta\\Documents\\NetBeansProjects\\JavaAntHelloWorld\\src\\javaanthelloworld");
        System.out.println("Is folder"+f1.isDirectory());
        File fileList[]=f1.listFiles();
        System.out.println("There are "+fileList.length+" Files in "+f1.getName());
        System.out.println("Files are");
        for (File fileList1 : fileList) {
            System.out.println(fileList1.getName() + ", size is-" + fileList1.length()+", Last modified -"+new Date(fileList1.lastModified()));
        }
        
    }
    
}
