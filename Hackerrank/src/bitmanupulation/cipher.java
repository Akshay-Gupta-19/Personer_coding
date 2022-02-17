/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitmanupulation;

import java.util.Scanner;

/**
 *
 * @author akshay
 */
public class cipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ans="";
        int n=sc.nextInt();
        int k=sc.nextInt();
        int num=sc.nextInt();
        int mul=0;
        for(int i=0;i<n;i++){
            int cn=num%10;
            int nta=cn^mul;
            ans=nta+ans;
            try{
            mul^=(nta^(Integer.parseInt(ans.charAt(k-1)+"")));
            }
            catch(Exception ex){
                mul^=nta;
                }
         num/=10;    
        }
        System.out.println(ans);
        }
    }