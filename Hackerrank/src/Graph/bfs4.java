package Graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
public class bfs4 {
    static HashMap<Integer,ArrayList<Integer>> hm;
    static HashMap<Integer,Integer> ans;
    static LinkedList<Integer> q;
    static boolean visited[];
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         for (int i = 0; i < t; i++) {
             int n=sc.nextInt(),m=sc.nextInt();
             hm=new HashMap();
             ans=new HashMap();
             q=new LinkedList<>();
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
             q.addFirst(rsrc);
             visited[rsrc-1]=true;
             ans.put(rsrc,0);
             sol(rsrc);
             while(!q.isEmpty()){
                 sol(q.pollFirst());
             }
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
    static void sol(int cn){//parent cost
        q.remove(new Integer(cn));
        for (int i = 0; i < hm.get(cn).size(); i++) {
            int ctg=(Integer) hm.get(cn).get(i);//child to go next
            if(!q.contains(ctg) && !visited[ctg-1]){q.add(ctg);ans.put(ctg,ans.get(cn)+6);}
            visited[ctg-1]=true;
        }
    }
}