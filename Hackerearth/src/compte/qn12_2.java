/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
class ateam{
    long x;
    ArrayList<Integer> al;
}
public class qn12_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            ArrayList<ateam> a1=new ArrayList<>();
            int arr[][]=new int[m][2];
            for (int j = 0; j < arr.length; j++) {
               arr[j][0]=sc.nextInt();
               arr[j][1]=sc.nextInt();
            }
            long arr2[]=new long[n];
            for (int j = 0; j < arr2.length; j++) {
                arr2[j]=sc.nextLong();
            }
            for (int j = 0; j < arr.length; j++) {
                boolean find=false;
                for (int k = 0; k < a1.size(); k++) {
                    if(a1.get(k).al.contains(arr[j][0])){a1.get(k).al.add(arr[j][1]); a1.get(k).x+=arr2[arr[j][1]];find=true;}
                    else if(a1.get(k).al.contains(arr[j][1])){a1.get(k).al.add(arr[j][0]); a1.get(k).x+=arr2[arr[j][1]];find=true;}
                    
                }
                if(!find){
                    ateam n1=new ateam();
                    n1.x=arr2[arr[j][0]];
                    n1.x+=arr2[arr[j][1]];
                    ArrayList<Integer> al2=new ArrayList<>();
                    al2.add(arr[j][0]);al2.add(arr[j][1]);
                    n1.al=al2;
                    a1.add(n1);
                }
            }
            long ans=0;
            for (int j = 0; j < a1.size(); j++) {
                if(ans<a1.get(j).x)ans=a1.get(j).x;
            }
            System.out.println(ans);
            
        }
    }
}
