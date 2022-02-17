package Graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
public class bfs3 {
    static boolean visited[];
    static HashMap<Integer,ArrayList<Integer>> hm;
    static HashMap<Integer,Integer> ans;
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         for (int i = 0; i < t; i++) {
             int n=sc.nextInt(),m=sc.nextInt();
             hm=new HashMap();
             ans=new HashMap();
             visited=new boolean[n];
             for (int j = 1; j <= n; j++) {
                 ArrayList al=new ArrayList();
                 hm.put(j, al);
             }
             for (int j = 0; j < m; j++) {
                 int src=sc.nextInt(),des=sc.nextInt();
                 hm.get(src).add(des); hm.get(des).add(src);
             }
             int rsrc=sc.nextInt();
             ans.put(rsrc,0);
             sol(rsrc);
             for (int j = 1; j <= n ; j++) {
                 if(j==rsrc)continue;
                 if(ans.containsKey(j) )
                 System.out.print(ans.get(j)+" ");
                 else
                 System.out.print(-1+" ");
             }
             System.out.println();
        }
    }
    static void sol(int cn){
     if(visited[cn-1])return;
        for (int i = 0; i < hm.get(cn).size(); i++) {
            int ctg=(Integer) hm.get(cn).get(i);//child to go next
            if(!ans.containsKey(ctg)) ans.put(ctg,ans.get(cn)+6);
        }
        visited[cn-1]=true;
        for (int i = 0; i < hm.get(cn).size(); i++) {
            int ctg=(Integer) hm.get(cn).get(i);//child to go next
            sol(ctg);
        }
    }
}
//
//6 6 6 6 12 6 12 6 12 12 6 6 6 6 6 12 18 6 6 6 6 12 6 12 6 12 6 12 12 12 12 6 12 12 6 12 12 6 12 6 12 6 12 12 6 6 12 6 6 6 6 12 12 12 12 6 6 6 12 6 6 12 12 12 12 12 12 6 6
//6 6 6 6 12 6 12 6 12 12 6 6 6 6 6 12 12 6 6 6 6 12 6 12 6 12 6 12 12 12 12 6 12 12 6 12 12 6 12 6 12 6 12 12 6 6 12 6 6 6 6 12 12 12 12 6 6 6 12 6 6 12 12 12 12 12 12 6 6