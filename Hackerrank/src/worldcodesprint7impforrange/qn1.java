/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcodesprint7impforrange;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        HashSet hs;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();  
        hs=new HashSet();
        int ans=0;
        for (int i = 0; i < t; i++) {
          int soco=sc.nextInt();
            if(hs.contains(soco)){
                hs.remove(soco);
                ans++;
            }
            else
                hs.add(soco);
        }
        System.out.println(ans);
    }
    
}
