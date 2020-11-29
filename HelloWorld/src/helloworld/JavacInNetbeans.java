/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author akggupta
 */
public class JavacInNetbeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getFilesRecursively(new File("C:\\netbeans_akshayfork2_03102019\\netbeans"));

    }
    static int cn = 0;

    static void getFilesRecursively(File F) {
        try {
            System.out.println(cn++);
            if (!F.isDirectory()) {
                testNb(F);
            }
            File unFiltered[] = F.listFiles();
            for (int i = 0; i < unFiltered.length; i++) {
                File currentFile = unFiltered[i];
                if (currentFile.isDirectory()) {
                    getFilesRecursively(currentFile);
                } else {
                    testNb(currentFile);
                }
            }
        } catch (Exception ex) {
            System.out.println("For" + F.getAbsolutePath());
        }
    }

    public static void testNb(File F) {
        try {
            Scanner sc = new Scanner(F);
            String fd = "";
            while (sc.hasNextLine()) {
                fd += sc.nextLine();
            }
            if (fd.contains("nb-javac-13")) {
                System.out.println(F.getAbsolutePath());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavacInNetbeans.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
