/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author akshay gupta
 */
public class intro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(sc.nextInt()==v)System.out.println(i);
        }
    }
    
}
