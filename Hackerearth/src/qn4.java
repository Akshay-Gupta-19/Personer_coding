
import java.util.HashSet;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avnegers
 */
public class qn4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c[]=sc.next().toCharArray();
        HashSet<Character> hs=new HashSet<>();
        for (int i = 0; i < c.length; i++) {
            hs.add(c[i]);
        }
        System.out.println(hs.size());
    }
    
}
