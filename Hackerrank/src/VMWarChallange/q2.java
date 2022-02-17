/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VMWarChallange;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Injustice
 */
public class q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            int indexofst = s.indexOf("/*");
            if (indexofst != -1) {
                if (s.indexOf("*/") != -1) {
                    System.out.println(s.substring(indexofst, s.indexOf("*/")+2));
                } else {
                    while (s.indexOf("*/") == -1) {
                        System.out.println(s);
                        s=sc.nextLine();
                    }
                    System.out.println(s.substring(0, s.indexOf("*/")+2));
                }
            }
            int indofs = s.indexOf("//");
            if (indofs != -1) {
                System.out.println(s.substring(indofs));
            }
        }
    }

}
