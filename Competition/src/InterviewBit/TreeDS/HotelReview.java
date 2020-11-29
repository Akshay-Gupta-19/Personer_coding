/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.TreeDS;

import java.util.*;

/**
 *
 * @author akggupta
 */
public class HotelReview {
    public static void main(String[] args) {
        String A="play_boy";
        String B[]=new String[]{"smart_guy", "girl_and_boy_play", "play_ground"};
        String gwd[]=A.split("_");
        HashSet<String> gwdm=new HashSet<>();
       Integer ans[]=new Integer[B.length];
        for (int i = 0; i < gwd.length; i++) {
           gwdm.add(gwd[i]);
         
        }
        String rw[][]=new String[B.length][];
        for (int i = 0; i < rw.length; i++) {
           rw[i]=B[i].split("_");  ans[i]=i;
        }
        int weight[]=new int[B.length];
        for (int i = 0; i < rw.length; i++) {
            weight[i]=nom(rw[i],gwdm);
        }
        Arrays.sort(ans, (a,b) -> weight[b]-weight[a]);
        System.out.println(Arrays.toString(ans));
    }
static int nom(String arr1[],HashSet<String> gwdm){
    int ans=0;
        for (String arr11 : arr1) {
            if (gwdm.contains(arr11)) {
                ans++;
            }
        }
    return ans;
}
}
