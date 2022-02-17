/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcodesprint6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn5 {
    static long k;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n=sc.nextLong();
            k=sc.nextLong();
            int b=sc.nextInt();
            ArrayList al=(ArrayList)solve(n,b,1);
            if(al==null || al.isEmpty())
                System.out.println(-1);
            else{
      //          System.out.println(al);
                for (int j = al.size()-1; j >0; j--) {
                    System.out.print(al.get(j)+" ");
                }
                System.out.println(al.get(0));
            }
            }
    }
static Object solve(long n,int b,int i){
            if(n==0 && b==0)return new ArrayList();
            if(i>k || b==0 ||n==0)return null;
            ArrayList wu=(ArrayList)solve(n-i,b-1,i+1);
            if(wu!=null){
                wu.add(i);
                return wu;
            }
            ArrayList wou=(ArrayList)solve(n,b,i+1);
            if(wou!=null){
             return wou;
            }
            else
                return null;
        }
}