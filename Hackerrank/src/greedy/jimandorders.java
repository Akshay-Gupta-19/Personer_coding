/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

import java.util.Scanner;

/**
 *
 * @author Avengers
 */
public class jimandorders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int time[]=new int[n];
        for (int i = 0; i <n; i++) {
            time[i]=sc.nextInt()+sc.nextInt();
        }
       for (int i = 0; i < time.length; i++) {
            int mini=0;
            for (int j = 0; j < time.length; j++) {
               if(time[mini]>time[j]) mini=j;
            }
            System.out.println(mini+1);
            time[mini]=2000003;
        }
    }
}
