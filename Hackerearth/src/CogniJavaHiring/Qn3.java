/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CogniJavaHiring;

import java.util.*;

/**
 *
 * @author avnegers
 */
public class Qn3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            ArrayList<Integer> al=new ArrayList<>();
            int ans=0;
            for (int j = 0; j < n; j++) {
                int inc=sc.nextInt();
                for (int k = 0; k < al.size(); k++) {
                    if(al.get(k)>inc){
                        al.add(k, inc);
                        if(k==0)
                            ans--;
                        else
                            ans+=al.get(k-1);
                        break;
                    }
                }
                if(al.size()==0){al.add(inc);ans-=1;}
                else if(al.get(al.size()-1)<inc){ans+=al.get(al.size()-1);al.add(inc);}
            }
            System.out.println(ans);
        }
    }    
}

