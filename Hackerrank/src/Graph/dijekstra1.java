package Graph;

import java.util.Arrays;
import java.util.Scanner;

public class dijekstra1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int e= 0; e < t; e++) {
        int way=0;
        int size=sc.nextInt();
        int weight[][]=new int[size][size];
        boolean visited[]=new boolean[size];//stores that this node is taken
        //as intermidiate or not
        for (int i = 0; i < weight.length; i++) {
            Arrays.fill(weight[i],10000000);
        }
        int noe=sc.nextInt();
        for (int i = 0; i < noe; i++) {
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;
            int m;
            if((m=sc.nextInt())<weight[x][y]){weight[x][y]=m;weight[y][x]=m;}
        }
      int src=sc.nextInt()-1;
       int maxindex=src;//setting initial intermidiate node as 1
       visited[src]=true;
      //applying dijektras
            
        for(int k=0;k<size;k++){
        //geting index of largest weight from 1    
        int l;
            for (l = 0; l < weight[k].length; l++) {
                if (visited[l]) {
                    continue;
                }
                int minway=Integer.MAX_VALUE;
                if (weight[src][l] < minway) {
                    way = k;
                    break;
                }
            }
            for (; l < weight[k].length; l++) {
                if (visited[l]) {
                    continue;
                }
                if (weight[0][l] < weight[0][way]) {
                    way = l;
                }
            }
            
                //getting the next intermidiate node
            visited[way]=true;
            //cheking old weight vs new wight
            for (int j = 0; j <size; j++) {
                if(weight[src][j]>weight[src][way]+weight[way][j])
                    weight[src][j]=weight[src][way]+weight[way][j];
            }
        }
        //printing final weight and path from 0
            for (int i = 0; i < weight[src].length; i++) {
               if(weight[src][i]==10000000)System.out.print("-1 ");
               else if(i!=src) System.out.print(weight[src][i]+" ");
            }
            System.out.println("");
    }
        
    }
  
    
}
