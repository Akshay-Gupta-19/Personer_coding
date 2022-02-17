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
public class Qn4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            boolean b=true;
            HashSet<Integer> hs=new HashSet<>();
            for (int j = 0; j < arr.length; j++){
                arr[j]=sc.nextInt();
                for (int k = j-1; k >0 && b; k--) {
                    if(hs.contains(arr[j]+arr[k])){
                        { System.out.println(1);b=false; }
                    }
                    hs.add(arr[j]+arr[k]);
                }
             }
            if(b)
            System.out.println(0);
        }
    }
}
