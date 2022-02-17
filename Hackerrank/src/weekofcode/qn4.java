package weekofcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class qn4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c[]=new int[n];
        for (int i = 0; i < c.length; i++) {
            c[i]=sc.nextInt();
        }
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for (int i = 0; i < m; i++) {
            int x=sc.nextInt()-1,y=sc.nextInt()-1;
            if(hm.containsKey(x)){
                hm.get(x).add(y);
            }
            else{
                ArrayList<Integer> ar=new ArrayList<>();
                ar.add(y);
                hm.put(x, ar);
            }
            if(hm.containsKey(y)){
                hm.get(y).add(x);
            }
            else{
                ArrayList<Integer> ar=new ArrayList<>();
                ar.add(x);
                hm.put(y, ar);
            }
        }
        int ans=0;
        int ansarr[]=new int[n];
        boolean pion[]=new boolean[n];//pick or not pick
        for (int i = 0; i < n; i++) {
            int profit=c[i];
            ArrayList al=hm.get(i);
            for (int j = 0; j < al.size(); j++) {
                
            }
        }
    }
}