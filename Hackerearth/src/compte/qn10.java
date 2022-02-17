/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn10 {
    static boolean visited[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        visited=new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        char al[][]=new char[n][n];
        for (int i = 0; i < arr.length; i++) {
                al[i]=sc.next().toCharArray();
        }
        ArrayList<HashSet<Integer>> alist=new ArrayList<>();
        for (int i = 0; i < al.length; i++) {
            for (int j = 0; j < al.length; j++) {
               if(al[i][j]=='Y'){
                   boolean find=false;
                   for (int k = 0; k < alist.size(); k++) {
                       if(alist.get(k).contains(i)){alist.get(k).add(j); find=true;}
                       else if(alist.get(k).contains(j)){alist.get(k).add(i);find=true;}
                       
                   }if(!find){
                       HashSet<Integer> hs=new HashSet<>();
                           hs.add(i);
                           hs.add(j);
                           alist.add(hs);
                   }
               }
            }
        }
        int ansarr[]=new int[n];
        for (int i = 0; i < al.length; i++) {
            for (int j = 0; j < alist.size(); j++) {
                if(alist.get(j).contains(i)){
                    ansarr[i]=getsol(alist.get(j),arr);
                    break;
                }
            }
        }
        for (int i = 0; i < ansarr.length; i++) {
            System.out.println(ansarr[i]); 
        }
    }
    static int getsol(HashSet<Integer> hs,int arr[]){
        int arr2[]=new int[hs.size()];
        int x=0;
        Iterator<Integer> i=hs.iterator();
        while(i.hasNext()){
            arr2[x++]=arr[i.next()];
        }
        int min=100000;
        int ans2=0;
        for (int j = 0; j < arr2.length; j++) {
           if(arr2[j]<min && !visited[j]){min=arr2[j];ans2=j;}
        }
        visited[ans2]=true;
        return min;
    }
}
