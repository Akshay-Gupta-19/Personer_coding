package DS.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class poisionsplant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = -1;
        LinkedList<Integer> ll=new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            ll.add(sc.nextInt());
        }
        int cans=0;
        do{
            ArrayList<Integer> al=new ArrayList<Integer>();
           for (int i = 0; i < ll.size()-1; i++) {
               if((Integer)ll.get(i)<(Integer)ll.get(i+1)){
                   al.add(i+1);
               }
       }   
               for (int j = 0; j < al.size(); j++) {
                   ll.remove((int)al.get(j)-j);
               }
               cans=al.size();
               ans++;
    }while(cans!=0);
        System.out.println(ans);
    }

}
