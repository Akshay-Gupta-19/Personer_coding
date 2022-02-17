/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashingEasy;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class Qn4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();int x=sc.nextInt();
            HashSet<Integer> hs=new HashSet<>();
            int j;
            for (j = 0; j < n; j++) {
                int inp=sc.nextInt();
                if(hs.contains(x-inp)){System.out.println("Yes");break;}
                hs.add(inp);
            }
            if(j==n)
                System.out.println("No");
            else 
                for (j++;j<n; j++)
                    sc.nextInt();
                    
        }
    }
}
