/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
class loc{
    int x,y;
    boolean visited;

    public loc(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}
public class qn9 {
    static int a1t;
    static int arr[][];
    static boolean visited[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt(),m=sc.nextInt();
            arr=new int[n][m];
            visited=new boolean[n][m];
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    arr[j][k]=sc.nextInt();
                }
            }
            int a1=0,a2=0;
              for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                   if(!visited[j][k] && arr[j][k]==1){
                       a2++;
                      dfs(j,k); if(a1<a1t)a1=a1t;a1t=0;
                   }
                }
            }
            System.out.println(a2+" "+a1);
        }
    }
    static void dfs(int x,int y){
        a1t++;
        visited[x][y]=true;
        try{
            if(!visited[x+1][y]&&arr[x+1][y]==1)dfs(x+1,y);
        }catch(Exception ex){}  try{
            if(!visited[x+1][y-1]&&arr[x+1][y-1]==1)dfs(x+1,y-1);
        }catch(Exception ex){}  try{
            if(!visited[x+1][y+1]&&arr[x+1][y+1]==1)dfs(x+1,y+1);
        }catch(Exception ex){}  try{
            if(!visited[x][y-1]&&arr[x][y-1]==1)dfs(x,y-1);
        }catch(Exception ex){}  try{
            if(!visited[x][y+1]&&arr[x][y+1]==1)dfs(x,y+1);
        }catch(Exception ex){}  try{
            if(!visited[x-1][y-1]&&arr[x-1][y-1]==1)dfs(x-1,y-1);
        }catch(Exception ex){}  try{
            if(!visited[x-1][y]&&arr[x-1][y]==1)dfs(x-1,y);
        }catch(Exception ex){}  try{
            if(!visited[x-1][y+1]&&arr[x-1][y+1]==1)dfs(x-1,y+1);
        }catch(Exception ex){}
    }
}
