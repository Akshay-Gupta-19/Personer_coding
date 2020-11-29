/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author akggupta
 */
public class JavaCompletionCopier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <  38; i++) {
            String x = sc.next();
            System.out.println("cp "+x+" C:\\netbeans_akshayfork2_03102019\\netbeans\\java\\java.completion\\test\\unit\\data\\goldenfiles\\org\\netbeans\\modules\\java\\completion\\JavaCompletionTaskTest\\15\\");
        }
    }
    
}
