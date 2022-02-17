/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt(),m=sc.nextInt();
            int edge[][]=new int[m][3];
            for (int j = 0; j < edge.length; j++) {
               edge[j][0]=sc.nextInt();
               edge[j][1]=sc.nextInt();
               edge[j][2]=sc.nextInt();
            }
            HashSet<Integer> hs=new HashSet<>();
            int maxw=0;
            while(hs.size()!=n){
                int j;
                 int cmaxi=0;for (j = 0; j < edge.length; j++) {
                    if(hs.contains(edge[j][0]) && hs.contains(edge[j][1]))continue;
                    if(edge[j][2]>0){cmaxi=j;break;}
                    
                }for (; j < edge.length; j++) {
                    if(hs.contains(edge[j][0]) && hs.contains(edge[j][1]))continue;
                    if(edge[j][2]>edge[cmaxi][2]){cmaxi=j;}
                }
                hs.add(edge[cmaxi][0]);
                hs.add(edge[cmaxi][1]);
                maxw+=edge[cmaxi][2];
            }
            System.out.println(maxw);
        }
    }
    
}
