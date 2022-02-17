/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcodesprint7impforrange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn6 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    sc.nextInt();
    int q=sc.nextInt();
    char[] s=sc.next().toCharArray();
    char k='a';
      for (int j = 0; j < s.length; j++)if(s[j]=='a')s[j]='0';         
    for (int i = 0; i < s.length; k++) {
            for (int j = i+1; j < s.length; j++) {
                if(s[i]==s[j]){
                    s[j]=k;
                }
            }
            s[i]=k;
            while(++i<s.length&&s[i]<=k);
        }
        String s3=new String(s);
        int b[][]=new int[s.length][];
        for (int i = 0; i < s.length; i++) {
            b[i]=new int[s.length-i];
            for (int j =i; j < s.length; j++) {
                for (int l = 0; l <= b.length-(j-i+1); l++) {
                    if(s3.substring(i, j).equals(s3.substring(l, l+(j-i)))){
                        b[i][j-i]++;
                    }
                }
            }
        }
        for (int i = 0; i <q; i++) {
            int x=sc.nextInt()-1,y=sc.nextInt()-1;
            System.out.println(b[x][y-x]);
        }
    }
}

/*8 4
giggabaj
1 1
1 2
1 3
2 4
*/