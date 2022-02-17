/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractoHiring;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        char c[]=sc.next().toCharArray();
        int ans=0;
        for(int i=0;i<c.length;i++){
            int ca=0;
            int j;
            for(j=i;j<c.length && c[j]=='1';j++){
                ca++;
            }
            i=j;
            if(ca>ans)ans=ca;
        }
        for (int i = 0; i < k; i++) {
            switch(sc.nextInt()){
                case 1:
                    System.out.println(ans);
                    break;
                case 2:
                    int ind=sc.nextInt()-1;
                    c[ind]='1';
                    int ca=1;
                    for (int j = ind+1;j < c.length && c[j]=='1'; j++)
                        ca++;
                    for (int j = ind-1;j>=0 && c[j]=='1'; j--) 
                        ca++;
                    if(ca>ans)ans=ca;
                    break;
            }
        }
    }
}
