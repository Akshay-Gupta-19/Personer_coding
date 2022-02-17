package Graph;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class dfs {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int edge[][]=new int[m][2];
            for (int j = 0; j < m; j++) {
                edge[j][0]=sc.nextInt()-1;
                edge[j][1]=sc.nextInt()-1;
            }
            int sorce=sc.nextInt()-1;
           int weight2[];
           //weight=dfs(edge,sorce,n);
            weight2=bfs(edge,sorce,n);
            for (int j = 0; j < weight2.length; j++) {
               if(weight2[j]==0)continue;
                  System.out.print(weight2[j]+" ");
            }
        }
        System.out.println();
    }
    
     static int[] bfs(int a[][],int x,int noc){
        LinkedList<Integer> nodein=new LinkedList<Integer>();
        int weight[]=new int[noc];
        Arrays.fill(weight, -1);
        nodein.add(x);
        weight[x]=0;
        boolean visited[]=new boolean[noc];
       // int cwl=0;//current weight level
        visited[x]=true;
        while(!nodein.isEmpty()){
            int cin=nodein.pollLast();
            for (int i = 0; i < a.length; i++) {
                if(!visited[a[i][1]]&&a[i][0]==cin){
                    nodein.push(a[i][1]);
                     visited[a[i][1]]=true;
                    weight[a[i][1]]=weight[cin]+6;
                }
                if(!visited[a[i][0]]&&a[i][1]==cin){
                    nodein.push(a[i][0]);
                    weight[a[i][0]]=weight[cin]+6;
                    visited[a[i][0]]=true;
                    }
                }
            }
            return weight;
        }
}
