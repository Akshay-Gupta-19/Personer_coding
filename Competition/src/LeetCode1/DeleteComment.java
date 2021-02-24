/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class DeleteComment {

    public static void main(String[] args) {
        System.out.println(new DeleteComment().removeComments(new String[]{"    /*/ declare members;/**/"}).toString().replaceAll(",", "\n"));
    }

    public List<String> removeComments(String[] source) {
        List<String> ans = new ArrayList<>();
        int cs = 0;
        for (int i = 0; i < source.length; i++) {
            if (cs == 1) {
                int ei = source[i].indexOf("*/");
                if (ei >= 0) {
                    String s=source[i].substring(ei + 2);
                    if(!s.equals(""))
                    ans.add(s);
                    cs = 0;
                }
                continue;
            }
            int singL = source[i].indexOf("//");
            int blockL = source[i].indexOf("/*");
            if (isSing(singL, blockL)) {
                String s = source[i].substring(0, singL);
                if (!s.equals("")) {
                    ans.add(s);
                }
            } else if (blockL >= 0) {
                String s = source[i].substring(0, blockL);
                if (!s.equals("")) {
                    ans.add(s);
                }
                cs = 1;
                i--;
            } else {
                ans.add(source[i]);
            }
        }
        return ans;
    }

    boolean isSing(int x, int y) {
        return x >= 0 && (y < 0 || y > x);
    }
}
