/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author avnegers
 */
public class longestcommonsubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(lcs(s1, s2));
    }

    static String lcs(String s1, String s2) {
        int arr[][] = new int[s1.length() + 1][s2.length() + 1];
        String ans[][] = new String[s1.length() + 1][s2.length() + 1];
        Arrays.fill(ans[0], "");
        for (int i = 0; i < ans.length; i++) {
            ans[i][0] = "";
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                    ans[i][j] = (ans[i - 1][j - 1] + (char) s1.charAt(i - 1));
                } else if (arr[i - 1][j] > arr[i][j - 1]) {
                    arr[i][j] = arr[i - 1][j];
                    ans[i][j] = ans[i - 1][j];
                } else {
                    arr[i][j] = arr[i][j - 1];
                    ans[i][j] = ans[i][j - 1];
                }
            }
        }
        return ans[s1.length()][s2.length()];
    }

    static String reverse(String x) {
        String ans = "";
        for (int i = 0; i < x.length(); i++) {
            ans = (char) x.charAt(i) + ans;
        }
        return ans;
    }
}
