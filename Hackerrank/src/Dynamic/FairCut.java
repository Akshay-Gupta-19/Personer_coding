/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class FairCut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt(); 
        }
        Arrays.sort(arr);
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        ArrayList<Integer> al3=new ArrayList<>();
        ArrayList<Integer> al4=new ArrayList<>();
        int i=0;
        for ( i = 0;al1.size()<k; i+=2) {
            al1.add(arr[i]);
            al3.add(arr[i]);
        }
        for (int j = i; j < arr.length; j+=2) {
           al2.add(arr[j]);
           al3.add(arr[j]);
        }
        for ( i = 1;al4.size()<k; i+=2) {
            al4.add(arr[i]);
        }
        for (int j = i; j < arr.length; j+=2) {
            al3.add(arr[j]);
        }
        
        for (int j = 1; j < arr.length; j+=2) {
           al2.add(arr[j]);
        }
        int ans=0,ans2=0;
        for (int j = 0; j < k; j++) {
            int fn=al1.get(j);
            int fn2=al4.get(j);
            for (int l = 0; l < n-k; l++) {
                ans=ans+Math.abs(fn-al2.get(l));
                ans2=ans2+Math.abs(fn2-al3.get(l));
            }
        }
        System.out.println(Math.min(ans, ans2));
      
    }
}
