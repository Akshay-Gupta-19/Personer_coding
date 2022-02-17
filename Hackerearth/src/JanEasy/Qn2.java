/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JanEasy;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class Qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++)
           arr[i]=sc.nextInt();
        HashSet<HashSet<Integer>> hs=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> hs2=new HashSet<>();
            for (int j = i; j < arr.length; j++) {
                hs2.add(arr[j]);
                hs.add(hs2);
            }
        }
        System.out.println(hs.size());
    }
    
}
