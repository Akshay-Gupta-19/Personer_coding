/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author USER
 */
public class inputConversion {
    public static void main(String[] args) {
       java.util.Scanner sc=new java.util.Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String arg = sc.nextLine();
            if(arg.length()>15)
            System.out.println(arg.substring(3,arg.length()-1).replaceAll(",", ""));
        }
    }
}
