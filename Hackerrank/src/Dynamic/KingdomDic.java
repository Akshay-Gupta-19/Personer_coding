/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<n-1;i++){
            int s=sc.nextInt(),d=sc.nextInt();
            if(!hm.containsKey(s))hm.put(s,new ArrayList());
            if(!hm.containsKey(d))hm.put(d,new ArrayList());
            hm.get(s).add(d);
            hm.get(d).add(s);
        }
        int ans=0;
        ans=(ans+solve(hm,1,-1,true))%m;
        ans=(ans+solve(hm,1,-1,false))%m;
        System.out.println(ans);
    }
    static int solve(HashMap<Integer,ArrayList<Integer>> hm,int cn,int par,boolean pk){
        ArrayList<Integer> childs=hm.get(cn);
        childs.remove(new Integer(par));
        int ans=1;
        int vtd=0;
        for(int i=0;i<childs.size();i++){
            int s1=solve(hm,childs.get(i),cn,pk);
            int s2=solve(hm,childs.get(i),cn,!pk);
            vtd=(vtd+s2)%m;
            int taia=(s1+s2)%m;
            ans=mul(ans,taia);
        }
        ans=(ans-vtd+m)%m;
        return ans;
    }
    static int m=1000000007;
    static int mul(int a,int b){
        if(!overflow(a,b))return (a*b)%m;
        if(b%2==0)return mul((a*2)%m,b/2);
        else return (mul((a*2)%m,b/2)+a)%m;
    }
    static boolean overflow(int a,int b){
        return (a*b)/b!=a;
    }
}
