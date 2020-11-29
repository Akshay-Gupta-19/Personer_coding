/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCodeWeekly188;
import java.util.*;
/**
 *
 * @author akggupta
 */
public class CountTriplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public int countTriplets(int[] arr) {
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            int a=0;
            for (int j = i+1; j < arr.length; j++) {
                a=a^arr[j-1];
                int b=0;
                for (int k = j; k < arr.length; k++) {
                    b=arr[k]^b;
                    if(a==b)ans++;
                }
            }
 
        }
        return ans;
    }
}
