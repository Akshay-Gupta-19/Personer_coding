/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.util.*;

/**
 *
 * @author Akshay Gupta
 */
public class Test2 {
    
}
class Solution132 {
    public long[] handleQuery(int[] nums1, int[] nums2, int[][] queries) {
        Arrays.parallelPrefix(nums2, (a,b)->a+b);
        long ans[]=new long[queries.length];
        int oc=0;
        for (int i = 0; i < nums1.length; i++) {
            oc+=nums1[i];
        }
        List<Long> ansList=new ArrayList<>();
        long sum=Arrays.stream(nums2).sum();
        for (int i = 0; i < queries.length; i++) {
            switch(queries[i][0]){
                case 1:
                    int l=queries[i][1],r=queries[i][2];
                    for (int j = l; j <= r; j++) {
                        if(nums1[j]==0){
                            oc++;
                            nums1[j]=1;
                        }else{
                            oc--;
                            nums1[j]=0;
                        }
                    }
                    break;
                case 2:
                    sum+=(oc*(long)queries[i][1]);
                    break;
                case 3:
                    ansList.add(sum);
                    break;
            }
        }
        return ans;
    }
}