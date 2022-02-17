package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class bfs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt(),m=sc.nextInt();
            int src=sc.nextInt()-1;
            int edges[][]=new int[m][2];
            for (int j = 0; j < edges.length; j++) {
               edges[j][0]=sc.nextInt()-1;
               edges[j][1]=sc.nextInt()-1;
            }
            sol(edges,src,n);
        }
    }
    static void sol(int ed[][],int src,int non){//edges,source,no of nodes
        int ans[]=new int[non];
        Arrays.fill(ans, 1000000);
        ans[src]=0;
        LinkedList<Integer> ll=new LinkedList<>();
        ll.push(src);
        while(!ll.isEmpty()){
            int cn=ll.pollLast();
            for (int i = 0; i < ed.length; i++) {
                if(ed[i][0]==cn && ans[cn]+6<ans[ed[i][1]]){
                    ans[ed[i][1]]=ans[cn]+6;
                    ll.push(ed[i][1]);
                }
                else if(ed[i][1]==cn && ans[cn]+6<ans[ed[i][0]]){
                    ans[ed[i][0]]=ans[cn]+6;
                    ll.push(ed[i][0]);  
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            if(ans[i]==0)
                continue;
            if(ans[i]==1000000){
                System.out.print(-1+" ");
                continue;
            }
            System.out.print(ans[i]+" "); 
        }
        System.out.println();
    }
    
}
