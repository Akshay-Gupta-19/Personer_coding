/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
           int n=sc.nextInt(),m=sc.nextInt();
         
        ArrayList<HashSet<Integer>> alist=new ArrayList<>();
        for(int l=0;l<m;l++){ 
            boolean find=false;
            int x=sc.nextInt(),y=sc.nextInt();
                   for (int k = 0; k < alist.size(); k++) {
                       if(alist.get(k).contains(x)){alist.get(k).add(y); find=true;}
                       else if(alist.get(k).contains(y)){alist.get(k).add(x);find=true;}
                       
                   }if(!find){
                       HashSet<Integer> hs=new HashSet<>();
                           hs.add(x);
                           hs.add(y);
                           alist.add(hs);
                   }
        
        }
        
            long arr1[]=new long[n];
               long ans=0;
         
            for (int j = 0; j < n; j++) {
                arr1[j]=sc.nextLong();
                if(arr1[j]>ans)ans=arr1[j];
            }
            for (int j = 0; j < alist.size(); j++) {
                Iterator<Integer> it2=alist.get(j).iterator();
                long ca=0;
                while(it2.hasNext()){
                    ca+=arr1[it2.next()-1];
                }
                if(ca>ans)ans=ca;
            }
            System.out.println(ans);
        }
    }
}
