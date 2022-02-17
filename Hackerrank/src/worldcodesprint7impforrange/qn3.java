package worldcodesprint7impforrange;
import java.util.*;
public class qn3 {
    public static void main(String[] args) {
        HashMap <Integer,HashSet<Integer>> hs=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        long ans=0;
        for (int i = 0; i < k; i++) {
            int r=sc.nextInt();
            int c1=sc.nextInt();
            int c2=sc.nextInt(); 
            if(!hs.containsKey(r)){
                HashSet<Integer> al=new HashSet();
                for (int j = c1; j <= c2; j++) {
                    al.add(j);
                }
                hs.put(r, al);
            }
            else{
                for (int j = c1; j <=c2; j++) {
                    hs.get(r).add(j);
                }
            }
        }
        Set<Integer> s=hs.keySet();
        Iterator iterator = s.iterator();
        while(iterator.hasNext()){
            ans+=(hs.get(iterator.next()).size());
        }
        System.out.println(m*(long)n-ans);
    }
    
}
/*
5 5 10
1 2 3
1 3 6
2 2 3
2 5 6
3 3 5
3 2 4
4 4 5
4 1 2
5 2 5
5 3 4
*/