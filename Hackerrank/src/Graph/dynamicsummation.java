/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author akshay gupta
 */
public class dynamicsummation {
    static boolean matrix[][];
    static float val[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        matrix=new boolean[n][n];
        val=new float[n];
        for (int i = 0; i < n-1; i++){
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;
           matrix[x][y]=true;
           matrix[y][x]=true;
        }
        
//        for (int i = 0; i <matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }
        int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            if(sc.next().charAt(0)=='U')
                update(sc.nextInt()-1,sc.nextInt()-1,sc.nextFloat(),sc.nextFloat());
            else 
             report(sc.nextInt()-1,sc.nextInt()-1,sc.nextInt());}
            
    }
    static void update(int r,int t,float a,float b){
       int par=0;//parent node of subtrees node
       
       float adder=(float)Math.pow(a, b)+(float)Math.pow(a+1, b)+(float)Math.pow(b+1, a);
        LinkedList<Integer> q=new LinkedList<Integer>();   
        q.add(r);
        boolean visited[]=new boolean[matrix.length];
       if(r==t)par=-1;
       else{
        ow:  while(!q.isEmpty()) {
             int cin=q.pop();
             visited[cin]=true;
             for (int i = 0; i < matrix[cin].length; i++) {
                 if(!visited[i]&&matrix[cin][i])
                 { 
                     q.push(i);
                 if(i==t){par=cin;break ow;}
                 }
             }
            // System.out.println(q);
        }}
        Arrays.fill(visited, false);
        q.clear();
        q.add(t);
          while(!q.isEmpty()) {
             int cin=q.pop();
             visited[cin]=true;
             for (int i = 0; i < matrix[cin].length; i++) {
                 if((cin==t&&i==par)||visited[i])continue;
                 if(matrix[cin][i])
                     q.push(i);
             }
             val[cin]+=adder;
             
        }
        // System.out.println(Arrays.toString(val));
        }
    static void report(int r,int t,int m){
       int par=0;//parent node of subtrees node
       float ans=0; 
       LinkedList<Integer> q=new LinkedList<Integer>();   
        q.add(r);
        boolean visited[]=new boolean[matrix.length];    
        if(r==t)par=-1;
        else{
        ow:  while(!q.isEmpty()) {
             int cin=q.pop();
             visited[cin]=true;
             for (int i = 0; i < matrix[cin].length; i++) {
                 if(matrix[cin][i]&&!visited[i])
                 {    q.push(i);
                 if(i==t){par=cin;break ow;}
                 }
             }
        }}
        Arrays.fill(visited, false);
        q.clear();
        q.add(t);
          while(!q.isEmpty()) {
             int cin=q.pop();
             visited[cin]=true;
             for (int i = 0; i < matrix[cin].length; i++) {
                  if((cin==t&&i==par)||visited[i])continue;
                 if(matrix[cin][i])
                     q.push(i);
             }
             
            ans+=(val[cin]%m);
        }
             
        System.out.println(ans%m);
        }
    
}
