/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.*;
/**
 *
 * @author akggupta
 */
public class meld_commands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            String s=sc.next();
            s=s.substring(1,s.length()-5);
            System.out.println("meld "+"/c/openjdk/jdk14-6c954123ee8d"+s+" /c/openjdk/jdk15-e3f940bd3c8f"+s+" /d/nb-javac-15-related/nb-java-x"+s);
        }
    }
    
}
