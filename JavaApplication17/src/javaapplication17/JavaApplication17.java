/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author akggupta
 */
record point(int x,int y){
            public boolean equals(point p){
               return  p.x!=this.x;
            }
        }
public class JavaApplication17 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("");
        point p=new point(10,20);
        point p2=new point(10,20);
        System.out.println(p.equals(p2));
        Object obj=null;
        for (int f = 0; f < 10; f++) {
            System.out.println(f);
        }
    }
    
}
