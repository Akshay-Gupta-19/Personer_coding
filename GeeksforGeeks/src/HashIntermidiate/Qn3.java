/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashIntermidiate;

import java.util.*;
/**
 *
 * @author avnegers
 */
public class Qn3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        test: for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            HashMap<Integer,Integer> hm=new HashMap<>();
            for (int j = 0; j < arr.length; j++) {
               arr[j]=sc.nextInt();
            }
            int k=sc.nextInt();
            for (int j = 0; j < arr.length; j++) {
                  if(!hm.containsKey(arr[j]%k))
                   hm.put(arr[j]%k, 0);
                 hm.put(arr[j]%k, hm.get(arr[j]%k)+1); 
            }
            Set<Integer> s=hm.keySet();
            for (int keyI:s) {
                int valueI=hm.get(keyI);
                if(keyI==0 || keyI==k/2){
                    if(valueI%2!=0){
                        System.out.println("False");continue test;}
                }
                else{
                    if(hm.get(k-keyI)!=valueI){
                        System.out.println("False");continue test;}
                }
            }
            System.out.println("True");
        }
    }
}
