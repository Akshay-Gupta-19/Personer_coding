/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int ans=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
         arr[i]=sc.nextInt();   
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i]==arr[j]){
                    if(ans>j-i)
                        ans=j-i;
                    break;
                }
            }
        }
        if(ans==Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(ans);
    }
    
}
