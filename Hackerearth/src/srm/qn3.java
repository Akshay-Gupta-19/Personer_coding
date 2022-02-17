/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srm;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> hs=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            if(!hs.containsKey(x))
                hs.put(x, i+1);
        }
        System.out.println(hs.get(sc.nextInt()));
    }
  
}
