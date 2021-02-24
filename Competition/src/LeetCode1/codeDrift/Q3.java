/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1.codeDrift;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Comparator;

/**
 *
 * @author AKGGUPTA
 */
class Elem {

    int val;
    int dpf;
    int ind;

    public Elem(int val, int dpf, int ind) {
        this.val = val;
        this.dpf = dpf;
        this.ind = ind;
    }

    @Override
    public String toString() {
        return "Elem{" + "val=" + val + ", dpf=" + dpf + ", ind=" + ind + '}';
    }


}

class Solution {

public int dpf(int n) 
    { 
        int  product= 1; 
        if (n % 2 == 0) { 
            product += 1; 
            while (n % 2 == 0) 
                n = n / 2; 
        } 
  
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) { 
            if (n % i == 0) { 
                product = product +1; 
                while (n % i == 0) 
                    n = n / i; 
            } 
        } 
        if (n > 2) 
            product = product +1; 
  
        return product; 
    }

    public static void main(String[] args) {
        int solve = new Solution().solve(new int[]{477,788,70,819,229,368,572,297,883,392},4);
        System.out.println(solve);
    }

    public int solve(int[] A, int B) {
        Elem arr[] = new Elem[A.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Elem(A[i], dpf(A[i]), i);
        }

        TreeSet<Elem> ts = new TreeSet<>(new Comparator<Elem>() {
            @Override
            public int compare(Elem a, Elem b) {
                if (a.dpf == b.dpf) {
                    return a.ind - b.ind;
                }
                return b.dpf - a.dpf;

            }
        });

        for (int i = 0; i < B; i++) {
            ts.add(arr[i]);
        }
        int mod = 1000000007;
        long ans = 0;
        ans = (ans + ts.first().val) % mod;
        for (int i = B; i < arr.length; i++) {
            ts.remove(arr[i - B]);
            ts.add(arr[i]);
            ans = (ans + ts.first().val) % mod;
           // System.out.println(ts);
        }
        return (int) ans;
    }
}
