/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scrap;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author guptaakshay
 */
public class Class4 {
    public static void main(String[] args) {
        Solution4 s=new Solution4();
        System.out.println(s.maximizeWin(new int[]{1,1,2,2,3,3,5}, 0));
    }
}

class Solution4 {
    public int maximizeWin(int[] prizePositions, int k) {
        Map<Integer, Long> collect = Arrays.stream(prizePositions).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        long prize[][]=new long[collect.size()][2];
        int i=0;
        for(Integer loc:collect.keySet()){
            long prizeCnt=collect.get(loc);
            prize[i][0]=loc;
            prize[i++][1]=prizeCnt;
        }
        int l=0,r=0;
        int currPrize=0;
        int maxTill1=0,ans=0;
        int maxTill[]=new int[prizePositions.length];
        for (int j = 0; j < prize.length; j++) {
           while(r<prize.length && prize[r][0]-prize[l][0]<=k){
               currPrize+=prize[r][1];
               r++;
           }
           maxTill1=Math.max(maxTill1,currPrize);
           maxTill[r]=Math.max(maxTill1,currPrize);
           ans=Math.max(ans,l-1>=0?maxTill[l-1]:0+currPrize);
           while(l<r && prize[r][0]-prize[l][0]>k){
               currPrize-=prize[l][1];
               l++;
           }
        }
        return ans;
    }
}

class Solution55 {
    public int maximizeWin(int[] prizePositions, int k) {
        Map<Integer, Long> collect = Arrays.stream(prizePositions).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        long prize[][]=new long[collect.size()][2];
        int i=0;
        for(Integer loc:collect.keySet()){
            long prizeCnt=collect.get(loc);
            prize[i][0]=loc;
            prize[i++][1]=prizeCnt;
        }
        int ans=0;
        for (int j = 0; j < prize.length; j++) {
            
        }
        return ans;
    }
}