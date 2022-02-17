/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Avengers
 */
public class helix {
    static String arr[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         arr=new String[sc.nextInt()];
        int q=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1+"";
        }
        for (int i = 0; i <q; i++) {
            switch(sc.nextInt()){
                case 1:
                    swap(sc.nextInt()-1,sc.nextInt()-1);
                    //System.out.println(Arrays.toString(arr));
                    break;
                case 2:
                    getl(sc.nextInt());
                    break;
                case 3:
                    int x=sc.nextInt();
                    System.out.println("element at position "+x+" is "+arr[x-1]);
                    break;
            }
        }
    }
    static void swap(int x,int y){
        for (int i = x,j=y; i!=j && i-1!=j; i++,j--) {
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    static void getl(int x){
        int i;
        for (i = 0; !arr[i].equals(x+""); i++);
        System.out.println("element "+x+" is at position "+(i+1));
    }
}
