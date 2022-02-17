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
public class qn16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t; i++) {
            char c[]=sc.next().toCharArray();
            long clen=c.length;
            long ats=0;
            for (int j = 0; j < c.length; j++) {
                if(c[j]!='a'&&c[j]!='z'){
                    long ca=1;
                    while(++j<c.length && (c[j]!='a'&&c[j]!='z'))ca++;
                    ats+=((ca*(ca+1))/2);
                }
            }
            System.out.println(((clen*(clen+1))/2)-ats);
        }
    }
}
