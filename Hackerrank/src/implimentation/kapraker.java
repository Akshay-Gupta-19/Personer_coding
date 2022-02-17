/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implimentation;

import java.util.Scanner;

/**
 *
 * @author Injustice
 */
public class kapraker {
    public static void main(String[] args) {
        int p,q;
        System.out.println(check(77778));
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        q=sc.nextInt();
        boolean eo=false;
        p=n(p,q);
        for (int i = p; i <= q; i++) {
            if(check(i)){System.out.print(i+" ");eo=true;}
        }
        if(!eo)System.out.println("INVALID RANGE");
    }
    static boolean check(int x){
        long y=(long)x*x;
        int ylen=(y+"").length();
        int l=Integer.parseInt((y+"").substring(0, ylen/2));
        int r=Integer.parseInt((y+"").substring(ylen/2, ylen));
        if(l+r==x)return true;
        return false;
    }
    static int n(int x,int y){
        if(x<=1&&y>=1)System.out.print("1 ");
        if(x<=9&&y>=9)System.out.print("9 ");
        if(x<10)return 44;
        else return x;
    }
}
