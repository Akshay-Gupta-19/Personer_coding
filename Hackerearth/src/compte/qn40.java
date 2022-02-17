/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;
import java.util.*;
class TestClass1 {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
            {
                int ans=0;
                int n=sc.nextInt();
                while(n!=1){
                    ans+=n/2;
                    n=(int)(Math.ceil(n/2.0));
                }
                System.out.println(ans);
            }
    }
}
