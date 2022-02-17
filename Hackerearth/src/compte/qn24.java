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
public class qn24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = sc.next().toCharArray();
        int ns = 0;
        for (int i = 0; i < arr.length; i++) {
            ns += (arr[i] - 'a'+1);
        }
        if (ns % 3 == 0 && arr[arr.length-1] % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
