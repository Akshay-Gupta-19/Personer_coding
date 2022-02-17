/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Injustice
 */
public class ConnectedCellInGrid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int m=sc.nextInt();
           int n=sc.nextInt();
           int arr[][]=new int[m][n];
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    arr[j][k]=sc.nextInt();
                }
            }
            System.out.println(getans(arr));
        
    }
    static int getans(int arr[][]){
        boolean visited[][]=new boolean[arr.length][arr[0].length];
        //LinkedList<Integer> q=new LinkedList<Integer>();
        int max=0;
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length; j++) {
                int c1s=0;
                if(arr[i][j]==1&&!visited[i][j]){
                    visited[i][j]=true;
                    c1s=dfs(arr,visited,i,j);
                    if(c1s>max)max=c1s;
                }
            }
        }
        return max;
    }
    static int dfs(int arr[][],boolean visited[][],int i,int j){
        LinkedList<loc> ll=new LinkedList<loc>();
        ll.add(new loc(i,j));
        int ans=1;
        while(!ll.isEmpty()){
           loc cloc=ll.pop();
           if(cloc.i-1>=0&&cloc.j-1>=0&&arr[cloc.i-1][cloc.j-1]==1&&!visited[cloc.i-1][cloc.j-1])
           {  ll.add(new loc(cloc.i-1,cloc.j-1));visited[cloc.i-1][cloc.j-1]=true;ans++; }          
           if(cloc.i-1>=0&&cloc.j+1<arr[0].length&&arr[cloc.i-1][cloc.j+1]==1&&!visited[cloc.i-1][cloc.j+1])
           {  ll.add(new loc(cloc.i-1,cloc.j+1));visited[cloc.i-1][cloc.j+1]=true;ans++; }          
           if(cloc.i-1>=0&&arr[cloc.i-1][cloc.j]==1&&!visited[cloc.i-1][cloc.j])
           {  ll.add(new loc(cloc.i-1,cloc.j));visited[cloc.i-1][cloc.j]=true;ans++; }          
           if(cloc.j-1>=0&&arr[cloc.i][cloc.j-1]==1&&!visited[cloc.i][cloc.j-1])
           {  ll.add(new loc(cloc.i,cloc.j-1));visited[cloc.i][cloc.j-1]=true;ans++; }          
           
           if(cloc.j+1<arr[0].length&&arr[cloc.i][cloc.j+1]==1&&!visited[cloc.i][cloc.j+1])
           {ll.add(new loc(cloc.i,cloc.j+1)); visited[cloc.i][cloc.j+1]=true;ans++;}
           if(cloc.i+1<arr.length&&cloc.j-1>=0&&arr[cloc.i+1][cloc.j-1]==1&&!visited[cloc.i+1][cloc.j-1])
           {   ll.add(new loc(cloc.i+1,cloc.j-1));visited[cloc.i+1][cloc.j-1]=true;ans++;}
           if(cloc.i+1<arr.length&&arr[cloc.i+1][cloc.j]==1&&!visited[cloc.i+1][cloc.j])
           {   ll.add(new loc(cloc.i+1,cloc.j));visited[cloc.i+1][cloc.j]=true;ans++;}
           if(cloc.i+1<arr.length&&cloc.j+1<arr[0].length&&arr[cloc.i+1][cloc.j+1]==1&&!visited[cloc.i+1][cloc.j+1])
           {  ll.add(new loc(cloc.i+1,cloc.j+1));visited[cloc.i+1][cloc.j+1]=true;ans++; }          
        }
        return ans;
    }
}
class loc{
    int i,j;

    public loc(int i, int j) {
        this.i = i;
        this.j = j;
    }
    
}