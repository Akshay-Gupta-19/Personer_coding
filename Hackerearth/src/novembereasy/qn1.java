/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novembereasy;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    static int m;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int p=sc.nextInt(),q=sc.nextInt(),r=sc.nextInt();
        m=sc.nextInt();
        int ans=0;
        if(a<=b && b<=c ){
            ans+=sol(a,p);
            ans+=sol(b,q);
            ans+=sol(c,r);
        }
        else if(c<=a && a<=b ){
            ans+=sol(c,r);
            ans+=sol(a,p);
            ans+=sol(b,q);}
        else if(b<=c && c<=a ){
            ans+=sol(b,q);
            ans+=sol(c,r);
            ans+=sol(a,p);}
        else if(a<=c && c<=b ){
            ans+=sol(a,p);
            ans+=sol(c,r);
            ans+=sol(b,q);}
        else if(c<=b && b<=a  ){
            ans+=sol(c,r);
            ans+=sol(b,q);
            ans+=sol(a,p);}
        else if(b<=a && a<=c){
            ans+=sol(b,q);
            ans+=sol(a,p);
            ans+=sol(c,r);}
        System.out.println(ans);
    }
    static int sol(int x,int y){//x no of fruits y is price
        if(m>=x*y){
            m-=x*y;
            return y;
        }
        else{
            int vtr=m/x;
            m=m%x;
            return vtr;
        }
    }
}
