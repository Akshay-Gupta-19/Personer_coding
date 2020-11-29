/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createfunction;

import java.util.Arrays;

/**
 *
 * @author akggupta
 */
public class CreateFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int A[]=new int[]{10, 5, 1, 0, 2};
        int B=6,C=8;
        int cs[]=new int[A.length];
        cs[0]=A[0];
        for (int i = 1; i < A.length; i++) {
            cs[i]=cs[i-1]+A[i];
        }
        int ans=0;
        for (int i = 0; i < cs.length; i++) {
           if(cs[i]<B)continue; 
           if(cs[i]<C){
               int ind=Arrays.binarySearch(cs,0,i,cs[i]-B);
               if(ind<0){ind+=2;ind=-ind;}
               try{
               while(ind<cs.length&&cs[ind]==cs[ind+1])ind++;
               }catch(Exception ex){}ans+=(ind+1);
           }
           else{
               int ind=Arrays.binarySearch(cs,0,i,cs[i]-B);
               if(ind<0){ind+=2;ind=-ind;}
               try{
               while(ind<cs.length&&cs[ind]==cs[ind+1])ind++;
               }
               catch(Exception ex){}
               int ind2= Arrays.binarySearch(cs,0,i,cs[i]-C);
               if(ind2<0){ind2++;ind2=-ind2;}
               while(ind2>0 && cs[ind2]==cs[ind2-1])ind2--;
               
               ans+=(ind-ind2+1);
           }
        }
        System.out.println(ans);
    }
    
}
