/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int p=sc.nextInt();
            int arrx[]=new int[n];
            int arry[]=new int[n];
            int arrp[]=new int[n];//profit
            
            for (int j = 0; j < arrx.length; j++) {
                arrx[j]=sc.nextInt();
                arry[j]=sc.nextInt();
                arrp[j]=arrx[j]-arry[j];
            }
            int cmin=p;//current money in hand
            int fp=0;
            boolean mila=true;
            while(mila) {
                mila=false;
                int maxp=0;
                for (int k = 0; k < arrp.length; k++) {
                    if(arry[k]<=cmin && arrp[k]>arrp[maxp]){
                        maxp=k;
                    } else if(arry[k]<=cmin && arrp[k]==arrp[maxp] && arry[k]<arry[maxp]){
                        maxp=k;
                    }
                }
                if(arry[maxp]<=cmin&&arrp[maxp]>0){
                    mila=true;
                fp+=arrp[maxp];
                cmin-=arry[maxp];
                arrp[maxp]=-1;}
            }
            System.out.print(p-cmin+" ");
            System.out.println(p+fp);
        }
    }
}
