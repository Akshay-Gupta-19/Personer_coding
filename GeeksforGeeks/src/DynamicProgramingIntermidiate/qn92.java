/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramingIntermidiate;

/**
 *
 * @author avnegers
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn92 {
    static int arrp[];
    static int arrc[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int k = 0; k< t; k++)
        {   int n=sc.nextInt();
        arrp=new int[n];
        arrc=new int[n];
        Arrays.fill(arrc, -1);
        for (int i = 0; i < arrp.length; i++) {
           arrp[i]=sc.nextInt(); 
        }
        setcan(0);
        long ans=0;
        for (int i = 0; i < arrc.length; i++) {
            ans+=arrc[i];
        }
        System.out.println(ans);
    }
    }
    static void setcan(int i){
       
        if(i-1==-1)arrc[i]=Math.max(arrc[i], 1);
        else{
        if(arrp[i-1]>=arrp[i])
        arrc[i]=1;
        else
        arrc[i]=arrc[i-1]+1;
        }
        if(i==arrp.length-1)arrc[i]=Math.max(arrc[i], 1);
        else{
        if(arrp[i+1]>=arrp[i])
        arrc[i]=Math.max(arrc[i], 1);
        setcan(i+1);
        if(arrp[i+1]<arrp[i])
        arrc[i]=Math.max(arrc[i], arrc[i+1]+1);
        }
    }
}