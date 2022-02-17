/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novembereasy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2_2 {
    public static void main(String[] args) {
        HashMap<String,HashSet<Integer>> hs=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
           int k=sc.nextInt();
           String col=sc.next();
           if(hs.containsKey(col)){
               for (int j = 0; j < k; j++) {
                   sc.nextInt();
               }
               continue;
           }
           else{
               HashSet<Integer> hs2=new HashSet<>();
               for (int j = 0; j < k; j++) {
                   hs2.add(sc.nextInt());
               }
               hs.put(col, hs2);
           }
        }
        if(hs.size()==1 || hs.size()==0){
            for (int i = 0; i <=5; i++) {
                System.out.println("UNDEFINED");
            }
        }
        else{
            boolean b[]=new boolean[5];
            for (int i = 0; i < b.length; i++) {
                for (int j = 0;j<=5 ; j++) {
                    if(hs.get("red").contains(j) ){}
                }
            }
            for (int i = 0; i <5; i++) {
                
            }
        }
    }
    
}
