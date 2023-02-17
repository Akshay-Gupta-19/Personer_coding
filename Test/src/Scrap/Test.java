/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scrap;

import java.util.*;

/**
 *
 * @author guptaakshay
 */
public class Test {
    public static void main(String[] args) {
        long maxPower = new Solution().maxPower(new int[]{}, 17939, 519080802);
        System.out.println(maxPower);
    }
}
class Solution {
    public long maxPower(int[] stations, int r, int k) {
        long l=Arrays.stream(stations).min().getAsInt();
        long ri=Arrays.stream(stations).sum()+(long)k+1;
        long longStations[]=new long[stations.length];
        for(int i=0;i<stations.length;i++)
            longStations[i]=stations[i];
        while(l<ri){
            long mid=l+(ri-l)/2;
            if(solve(longStations,mid,r,k)){
                l=mid+1;
            }else{
                ri=mid;
            }
        }
        return ri-1;
    }
    boolean solve(long station[],long minAllowed,int r,long k){
        long currPow=0;
        long station2[]=station.clone();
        for(int i=0;i<r;i++){
            currPow+=station2[i];
        }
        for(int i=0;i<station2.length;i++){
            currPow-=i-r-1>=0?station2[i-r-1]:0;
            currPow+=i+r<station2.length?station2[i+r]:0;
            if(currPow<minAllowed){
                long need=minAllowed-currPow;
                station2[Math.min(station2.length-1,i+r)]+=need;
                currPow+=need;
                k-=need;
                if(k<0)
                return false;
            }
        }
        return true;
    }
}