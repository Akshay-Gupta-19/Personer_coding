package Graph;

import java.util.Arrays;
import java.util.Scanner;

public class kingdomconnectivity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int path[][]=new int[m][2];
        for (int i = 0; i < m; i++) {
            path[i][0]=sc.nextInt()-1;
            path[i][1]=sc.nextInt()-1;
        }
        System.out.println(ans(path,n,m));
    }
    static String ans(int x[][],int n,int m){
        int que[]=new int[n];
        Arrays.fill(que, -1);
        int qtail=0;
         boolean visited[]=new boolean[n];
         boolean poped[]=new boolean[n];
         int ans=0;
      que[qtail++]=0;
      int nopuh[]=new int[n];//no of possible path upto here
      nopuh[0]=1;
      poped[0]=true;
      while(0!=qtail){
          int cin=que[--qtail];
          visited[cin]=true;
        for (int i = 0; i < x.length; i++) {
            if(x[i][0]==cin&&visited[x[i][1]])return "INFINITE PATHS"; 
            if(x[i][0]==cin&&!poped[x[i][1]]){
                    que[qtail++]=x[i][1];
                    poped[x[i][1]]=true;
                    nopuh[x[i][1]]+=nopuh[cin];
                    if(x[i][1]==n-1)ans+=nopuh[cin];
                }
        }
      }
      return ans+"";
    }
}
