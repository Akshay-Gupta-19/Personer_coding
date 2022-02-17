/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author akshay
 */
public class ab0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt(),q=sc.nextInt();
        String num=sc.next();
        for (int i = 0; i <q; i++) {
            int ans=0;
            int b=sc.nextInt(),e=sc.nextInt();
            for (int j =b-1 ; j < e; j++) {
                for (int k = j+1; k <=e ; k++) {
                    if(new BigInteger(num.substring(j,k)).mod(new BigInteger(p+"")).equals(BigInteger.ZERO))ans++;
                }
            }
            System.out.println(ans);
        }
    }
    
}
