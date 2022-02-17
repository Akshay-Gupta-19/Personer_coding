/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VMWarChallange;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Injustice
 */
public class q1 {
    /*
 * Complete the function below.
 */

    static int maxDifference(int[] a) {
        int maxi=0,mini=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<a[mini])mini=i;
            if(a[i]>a[maxi])maxi=i;
        }
        int ans1=Integer.MAX_VALUE,ans2=Integer.MIN_VALUE;
        for (int i = 0; i <maxi ; i++) {
            if(a[i]<ans1)ans1=a[i];
        }
        for (int i = mini; i <a.length ; i++) {
            if(a[i]>ans2)ans2=a[i];
        }
        if(ans2-a[mini]>a[maxi]-ans1)
            return ans2-a[mini];
        else
            return a[maxi]-ans1;
    }

    static long kSub(int k, int[] nums) {
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sum=0;
                for (int l = i; l < j; l++) {
                    sum+=nums[l];
                }
                if(sum%k==0)ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n;
        
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<String> al=new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String s=sc.nextLine();
            int j=s.indexOf("http://"),k=s.indexOf(".com");
            while(j!=-1){
                al.add(s.substring(j,s.indexOf(".com",k++)));
                j=s.indexOf("http://",j+1);
            }
        }
    }

}
