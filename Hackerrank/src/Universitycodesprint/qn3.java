/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universitycodesprint;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author avnegers
 */
public class qn3 {
    static ArrayList<Integer> st1;
    static ArrayList<Integer> st2;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int g=sc.nextInt();
        for (int i = 0; i < g; i++) {
            int n=sc.nextInt(),m=sc.nextInt(),x=sc.nextInt();
           st1=new ArrayList<>();
           st2=new ArrayList<>();
            for (int j = 0; j < n; j++) {
                st1.add(sc.nextInt());
            }
             for (int j = 0; j < m; j++) {
                st2.add(sc.nextInt());
            }
            System.out.println(solve(0,0,x));
        }
    }
    static int solve(int i,int j,int x){
        if(i>=st1.size()&&j>=st2.size())return 0;
        else if(i>=st1.size()){
            if(st2.get(j)>x)return 0;
             return solve(i,j+1,x-st2.get(j))+st2.get(j);
        }
        else if(j>=st2.size()){
            
            if(st1.get(i)>x)return 0;
            return solve(i+1,j,x-st1.get(i))+st1.get(i);
        }
        else{
            
            if(st1.get(i)>x&& st2.get(j)>x)return 0;
            else if(st1.get(i)>x){
                return solve(i,j+1,x-st2.get(j))+st2.get(j);
            }
            else if(st2.get(j)>x){
                return solve(i+1,j,x-st1.get(i))+st1.get(i);
            }else{
                return Math.max(solve(i,j+1,x-st2.get(j))+st2.get(j),solve(i+1,j,x-st1.get(i))+st1.get(i));
            }
           
        }
    }
}
