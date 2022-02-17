package sabere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class qn1 {
    static HashMap<Integer,ArrayList<Integer>> tr=new HashMap<>();
    static int ans;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextInt();
        tr=new HashMap();
        for (int i = 0; i < n-1; i++) {
           int x=sc.nextInt(),y=sc.nextInt();
           if(x>y){int temp=x;x=y;y=temp;}
           if(tr.containsKey(x)){
               tr.get(x).add(y);
           }else{
               ArrayList al=new ArrayList();
               al.add(y);
               tr.put(x, al);
           }
        }
        solve(0);
        int itr=sc.nextInt();
        if(tr.containsKey(itr)){
            System.out.println("Not Connected");
            return;
        }
        else{
            if(ans==n-1)
                System.out.println("Connected");
            else
                System.out.println("Not Connected");
        }
    }
    static void solve(int x){
       
        if(tr.containsKey(x)){
        ArrayList<Integer> al=tr.get(x);
        for (Integer al1 : al) {
            solve(al1);ans++;
        }
        }
    }
}
