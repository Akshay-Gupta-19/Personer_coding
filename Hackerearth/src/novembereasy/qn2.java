/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novembereasy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,HashSet<String>> hm=new HashMap<>();
        for (int i = 0; i <n; i++) {
            int k=sc.nextInt();
            String cl=sc.next();
            for (int j = 0; j <k; j++) {
                int x=sc.nextInt();
                if(hm.containsKey(x)){
                    hm.get(x).add(cl);
                }
                else{
                    HashSet<String> hs=new HashSet<>();
                    hs.add(cl);
                    hm.put(x, hs);
                }
            }
        }
        for (int i = 1; i <= 5; i++) {
            if(hm.containsKey(i)){
                if(hm.get(i).size()==1)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else{
                System.out.println("UNDEFINED");
            }
        }
    }
    
}
/*
4
2 red 1 4
3 yellow 1 3
1 red 1 4
*/