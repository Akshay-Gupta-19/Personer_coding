/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep_circuit;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.nextInt();
        String s=sc.next();
        int ans[]=new int[7];//h1 2 a2 2 c3 k4 e5 2 r6 2 t7
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='h'||s.charAt(i)!='a'||s.charAt(i)!='c'||s.charAt(i)!='k'||s.charAt(i)!='e'||s.charAt(i)!='r'||s.charAt(i)!='t'){
                switch(s.charAt(i)){
                    case 'h':
                        ans[0]++;
                        break;
                    case 'a':
                        ans[1]++;
                        break;
                    case 'c':
                        ans[2]++;
                        break;
                    case 'k':
                        ans[3]++;
                        break;
                    case 'e':
                        ans[4]++;
                        break;
                    case 'r':
                        ans[5]++;
                        break;
                    case 't':
                        ans[6]++;
                        break;
                }
                ans[0]/=2;
                ans[1]/=2;
                ans[4]/=2;
                ans[5]/=2;
                System.out.println(min(ans));
            }
        }
    }
    static int min(int[] x){
        int min=1000002;
        for (int i = 0; i < x.length; i++) {
            if(x[i]<min)min=x[i];
        }
        return min;
    }
}
