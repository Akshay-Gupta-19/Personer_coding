/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekofcode20;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int arr[]=new int[n];
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            for (int j = 0; j < i; j++) {
                if((arr[i]+arr[j])%k==0)
                    ans++;
            }
        }
        System.out.println(ans);
    }
    
}
