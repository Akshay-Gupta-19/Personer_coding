/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copynbjavac14;

import java.util.Scanner;

/**
 *
 * @author akggupta
 */
public class Copynbjavac14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
        try{
            System.out.println("cp /d/nb-javac-15-related/nb-java-x/"+s.substring(0,s.length()-5)+" /d/thirdnb-javac15/nb-java-x"+s.substring(0,s.length()-5));
        }catch(Exception ex){
        
        }
        }
    }
    
}
