package weakofcode23;
import java.util.Scanner;
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char b[][]=new char[n][n];
        for (int i = 0; i <b.length; i++) {
            b[i]=sc.next().toCharArray();
        }
        int ans=0;
        for (int i = 1; i < b.length-1; i++) {
            for (int j = 1; j < b.length-1; j++) {
                if(b[i][j]=='*')continue;
                int pa=check(b,i,j);//possible answer
                if(pa>ans)ans=pa;
            }
        }
        System.out.println(ans);
    }
    static int check(char b[][],int cx,int cy){//c be the center
        int maxr=Math.min(Math.min(cx, b.length-cx-1),Math.min(cy, b.length-cy-1));     
        int i;
        for (i = 1; i <=maxr; i++) {
            if(!fit(b,cx,cy,i))return i-1;
        }
        return i-1;
    }
    static boolean fit(char b[][],int cx,int cy,int r){
        boolean xdir=true,ydir=true;
        int xcor=cx,ycor=cy-r;
        for (int i = 0; i <4*r; i++) {
            if(ycor-cy==r)ydir=false;
            if(xcor-cx==r)xdir=false;
            if(cx-xcor==r)xdir=true;
            if(b[xcor][ycor]=='*')return false;
            if(xdir)
                xcor++;
            else
                xcor--; 
            if(ydir)
                ycor++;
            else
                ycor--;
            //if(b[xcor][ycor]=='*')return false;
        }
        return true;
    }
}
/*
9
*********
****.****
**.....**
**.....**
*.......*
**.....**
**.....**
****.****
*********
op:3
5
.*.*.
*...*
.....
*...*
.*.*.
op:2

*/