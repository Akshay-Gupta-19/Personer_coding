package Dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class node{
    ArrayList al;
    int nmr;//no of moves remaining
    int pm;//possible moves means answer
}
public class gridwalking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt(),m=sc.nextInt();
            int cor[]=new int[n];
            for (int j = 0; j < cor.length; j++) {
               cor[j]=sc.nextInt(); 
            }
            int d[]=new int[n];
            int dmax=0;
            for (int j = 0; j < cor.length; j++) {
                d[j]=sc.nextInt();
                if(dmax<d[j])dmax=d[j];
            }
            node arr[][]=new node[m][];
            
        }
    }
    
}
