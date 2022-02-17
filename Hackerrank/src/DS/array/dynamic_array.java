/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class dynamic_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al[]=new ArrayList[n];
        for (int i = 0; i < al.length; i++) {
            al[i]=new ArrayList<>();
        }
        int q=sc.nextInt();
        int lastans=0;
        for (int i = 0; i < q; i++) {
            int qt=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
           switch(qt){
               case 1:
                   al[(x^lastans)%n].add(y);
               break;
               case 2:
                       lastans=al[(x^lastans)%n].get(y%n); 
                       System.out.println(lastans);
               break;
           }
        }
        
    }
}
