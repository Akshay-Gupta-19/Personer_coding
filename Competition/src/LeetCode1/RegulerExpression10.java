/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1;

/**
 *
 * @author akggupta
 */
public class RegulerExpression10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public boolean isMatch(String s, String p) {
        char s1[] = s.toCharArray();
        char p1[] = p.toCharArray();
        if (p.indexOf(".*") > 0) {
            return isMatchNoLimit(s.substring(0, p.indexOf(p.indexOf(".*"))), p.substring(0, p.indexOf(".*")));
        }
        for (int i = 0, j = 0; i < p1.length && j < s1.length; i++, j++) {
            switch (p1[i]) {
                case '.':
                    break;
                case '*':
                    int ni = i + 1;
                    while (ni < p1.length && (p1[i - 1] == p1[ni] || p1[ni]=='*')) {
                        ni++;
                    }
                    int nj = j - 1;
                    while (s1[j] == p1[i - 1]) {
                        j++;
                    }
                    i=ni;j=nj;
                    break;
                default:
                    if (p1[i] != s1[j]) {
                        if (i + 1 < p1.length && p1[i + 1] == '*') {
                            i++;
                        } else {
                            return false;
                        }
                    }
            }
        }

    }

    public boolean isMatchNoLimit(String s, String p) {

    }
}
