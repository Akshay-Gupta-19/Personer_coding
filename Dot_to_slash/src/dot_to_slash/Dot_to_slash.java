/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dot_to_slash;

import java.util.Scanner;

/**
 *
 * @author akggupta
 */
public class Dot_to_slash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            String s=sc.next();
            System.out.println("src/jdk.compiler/share/classes/"+s.replaceAll("\\Q.\\E","/")+".java");
        }
    }
    
}
