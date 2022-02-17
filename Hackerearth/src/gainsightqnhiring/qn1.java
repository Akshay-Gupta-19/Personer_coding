/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gainsightqnhiring;

import java.util.Arrays;
import java.util.Scanner;
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s=sc.next();
            int dy[][]=new int[s.length()][3];
            for (int j = 0; j < dy.length; j++) {
               Arrays.fill(dy[j],-1);
            }
            System.out.println(solve(dy,s.toCharArray(),0,'c'));
        }
    }
    static int solve(int dy[][],char s[],int i,char prev){
        if(i==s.length)return 0;
        if(dy[i][prev-'a']!=-1)return dy[i][prev-'a'];
        if(prev=='c'){
            if(s[i]=='a')
            dy[i][prev-'a']=solve(dy,s,i+1,'a');
            else
            dy[i][prev-'a']=Math.min(solve(dy,s,i+1,'a')+1, solve(dy,s,i+1,prev)+1);
        }
        if((prev=='a')){
            if(s[i]=='b')
             dy[i][prev-'a']=solve(dy,s,i+1,'b');
            else
            dy[i][prev-'a']=Math.min(solve(dy,s,i+1,'b')+1, solve(dy,s,i+1,prev)+1);
        }
        if((prev=='b')){
            if(s[i]=='c')
            dy[i][prev-'a']=solve(dy,s,i+1,'c');
            else
            dy[i][prev-'a']=Math.min(solve(dy,s,i+1,'c')+1, solve(dy,s,i+1,prev)+1);
        }
        return dy[i][prev-'a'];
    }
}