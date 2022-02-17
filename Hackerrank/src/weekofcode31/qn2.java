/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekofcode31;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        test: for (int i = 0; i <q; i++) {
             int n=sc.nextInt();
             int array[]=new int[n];
             for (int j = 0; j < n; j++) {
                array[j]=sc.nextInt();
            }

        for (int j = 1; j < n; j++) {

            int key = array[j];

            int t = j - 1;

            while ((t > -1) && (array[t] > key)) {

                array[t + 1] = array[t];

                t--;

                if(array[t]!=key+1&&array[t]!=key-1){System.out.println("No");continue test;}
            }

            array[i + 1] = key;
       }

            System.out.println("Yes");
        }
    }
    
}
