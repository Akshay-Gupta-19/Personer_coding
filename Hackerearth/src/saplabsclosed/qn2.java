/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saplabsclosed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2 {
    static   HashMap<Integer,Integer> graph;;
    static int arr[];
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arr=new int[n];
        for (int i = 0; i < n; i++) 
            arr[i]=sc.nextInt();
        dy=new int[n][n];
        graph=new HashMap<>();
        for (int i = 0; i < n-1; i++) {
           int x=sc.nextInt()-1,y=sc.nextInt()-1;
           if(x<y){int temp=x;x=y;y=temp;}
           graph.put(x,y);
        }
        int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            int ans=0;
            int x=sc.nextInt()-1,y=sc.nextInt()-1;
          if(y<x){int temp=x;x=y;y=temp;}
            System.out.println(solve(x,y));
        }
    }
    //3 1 2 1 1 2 1 3 2 2 3 1 3
    static int dy[][];
    static int solve(int x,int y){
        if(dy[x][y]!=0)return dy[x][y];
        if(x==y)return arr[x];
        dy[x][y]=arr[y]+solve(x,graph.get(y));
        return dy[x][y];
    }
}
