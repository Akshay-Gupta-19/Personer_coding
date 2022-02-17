/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedinr2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author avnegers
 */
public class qn2 {
 /*
 * Complete the function below.
 */

    static String[] checkIPs(String[] ip_array) {
          ArrayList<String> al=new ArrayList<String>();
       
        for(int k=0;k<ip_array.length;k++){
           String cs=ip_array[k];
        int fd=cs.indexOf(".");
        int fc=cs.indexOf(":");
        if(fd!=-1){
            String s[]=dotSplit(cs);
            if(s.length==4){
                int i;
            for (i = 0; i < s.length; i++) {
               try{
                int x=Integer.parseInt(s[i]);
                if(x>=0 && x<256)
                    continue;
                else{
                
                    break;
                }
               }catch(NumberFormatException ex){
                   al.add("Neither");
                   break;
               }
            }
            if(i==s.length)
            al.add("IPv4");
            else
            al.add("Neither");
            }
            else
                al.add("neither");
        }
        else if(fc!=-1){
            String s[]=cs.split(":");
            if(s.length==8){
            int i;
                for (i = 0; i < s.length; i++) {
               try{
                Long x=Long.parseLong(s[i],16);
                if(x>=0 &&x<8589934592l)
                    continue;
                else
                    break;
               }catch(NumberFormatException ex){
                   al.add("Neither");
                   break;
               }
            }
            if(i==s.length)
            al.add("IPv6");
            else
            al.add("Neithet");
            }
            
            else
                al.add("Neither");
        }
        else
            al.add("Neither"); 
           
       }
    String ans[]=new String[ip_array.length];
        for(int i=0;i<ans.length;i++)
            ans[i]=al.get(i);
        return ans;
    }

    static String[] dotSplit(String s) {
        ArrayList<String> al = new ArrayList<String>();
        int sti = 0;
        String arr[];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                al.add(s.substring(sti, i));
                sti = i + 1;
            }
        }
        al.add(s.substring(sti, s.length()));
        arr = new String[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=new String[1];
        s[0]=sc.next();
        System.out.println(Arrays.toString(checkIPs(s)));
    }
  
}