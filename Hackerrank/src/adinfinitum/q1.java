/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adinfinitum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Injustice
 */
public class q1 {
    public static void main(String[] args) {
        System.out.println(-3.0/-4);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int xmax=Integer.MIN_VALUE,ymax=Integer.MIN_VALUE,xmin=Integer.MAX_VALUE,ymin=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            
            if(x>xmax)
                xmax=x;
             if(x<xmin)
                xmin=x;
             
             if(y>ymax)
                ymin=y;
             if(y<ymin)
                ymax=y;
        }
        if(xmax==Integer.MIN_VALUE)
        {  System.out.println(ymax-ymin); return;}
        else if(ymax==Integer.MIN_VALUE)
        { System.out.println(xmax-xmin);return;}
     LinkedList<Double> ll=new LinkedList<Double>();
        ll.add(dis(xmax,ymax));
        ll.add(dis(xmax,ymin));
        ll.add(dis(xmin,ymax));
       ll.add(dis(xmin,ymin));
        double ans=Double.MIN_VALUE;
        for (int i = 0; i < ll.size(); i++) {
            if(ans<ll.get(i))
                ans=ll.get(i);
        }
        System.out.println(ans);
    }
    static double dis(int x,int y){
        return  Math.sqrt(x*x+y*y);
    }
}
