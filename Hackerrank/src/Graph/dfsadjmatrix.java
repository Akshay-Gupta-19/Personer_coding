package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class dfsadjmatrix {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            boolean adj[][]=new boolean[n][n];
            for (int j = 0; j < m; j++) {
                int x=sc.nextInt()-1;
                int y=sc.nextInt()-1;
                adj[x][y]=true;
                adj[y][x]=true;
            }
            int sorce=sc.nextInt()-1;
           int weight2[];
            weight2=bfs(adj,sorce,n);
            for (int j = 0; j < weight2.length; j++) {
               if(weight2[j]==0)continue;
                  System.out.print(weight2[j]+" ");
            }
        }
        System.out.println();
    }
    
     static int[] bfs(boolean a[][],int x,int noc){
        LinkedList<Integer> nodein=new LinkedList<Integer>();
        int weight[]=new int[noc];
        Arrays.fill(weight,-1);
        nodein.add(x);
        weight[x]=0;
        boolean visited[]=new boolean[noc];
        visited[x]=true;
        while(!nodein.isEmpty()){
            int cin=nodein.pollLast();
            for (int i = 0; i < a[cin].length; i++) {
                if(a[cin][i]&&!visited[i]){
                    nodein.push(i);
                    visited[i]=true;
                    weight[i]=weight[cin]+6;
                }
            }
            }
            return weight;
        }
   
}
