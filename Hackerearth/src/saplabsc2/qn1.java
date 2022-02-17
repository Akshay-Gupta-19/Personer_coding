/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn1 {
    static int j;
    static ArrayList al;
    static int arr[][];
    static boolean solution[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt(),m=sc.nextInt();
           arr=new int[n][m];
           solution=new boolean[n][m];
           al=new ArrayList();
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                   arr[j][k]=sc.nextInt();
                }
            }
            int ix=sc.nextInt(),iy=sc.nextInt();
            j=sc.nextInt();
            if(solve(ix-1,iy-1)){
                System.out.println("YES");
                System.out.println(al.size()/2);
                for (int k = al.size()-1; k >=0; k-=2) {
                    System.out.println((al.get(k-1))+" "+(al.get(k)));
                }
            }
            else
                System.out.println("NO");
        }
    }
    static boolean solve(int x,int y){
        if(solution[x][y])return false;
        
        if(x==0 || x==arr.length-1 || y==0 || y==arr[0].length-1) {al.add(x+1);al.add(y+1);return true;}
        else if(cgo(x,y,x+1,y) && solve(x+1,y)){al.add(x+1);al.add(y+1);return true;}
        else if(cgo(x,y,x-1,y) && solve(x-1,y)){al.add(x+1);al.add(y+1);return true;}
        else if(cgo(x,y,x,y+1) && solve(x,y+1)){al.add(x+1);al.add(y+1);return true;}
        else if(cgo(x,y,x,y-1) && solve(x,y-1)){al.add(x+1);al.add(y+1);return true;}
       solution[x][y]=true;
       return false;
    }
    static boolean cgo(int x,int y,int x1,int y1){
        if((arr[x][y]==arr[x1][y1])||(arr[x][y]>arr[x1][y1]&&arr[x][y]-j<arr[x1][y1]))return true;
        return false;
       
    }
    
}


