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
public class RecursionForBrowsing {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\akggupta\\Documents\\NetBeansProjects\\JavaAntHelloWorld");
        System.out.println("Is folder"+f1.isDirectory());
        File fileList[]=f1.listFiles();
        System.out.println("There are "+fileList.length+" Files in "+f1.getName());
        System.out.println("Files are");
        printFile(f1);
        
    }
    static void printFile(File f){
        if(f.isDirectory()){
        System.out.println("Inside"+f.getName());
        File fileList[]=f.listFiles();
         for (File fileList1 : fileList) {
            if(fileList1.isDirectory())printFile(fileList1);
            else
             System.out.println(fileList1.getName() + ", size is-" + fileList1.length()+", Last modified -"+new Date(fileList1.lastModified()));
        }   
        }
        else
             System.out.println(f.getName() + ", size is-" + f.length()+", Last modified -"+new Date(f.lastModified()));
    }
}
