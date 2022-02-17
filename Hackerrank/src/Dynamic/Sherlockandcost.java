package Dynamic;
import java.util.Scanner;
public class Sherlockandcost {
    static int arr[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            arr=new int[n];
            sol=new int[2][n];
            for (int j = 0; j < arr.length; j++)
               arr[j]=sc.nextInt(); 
            System.out.println(sol(0,0));
        }
    }
    static int sol[][];
    static int sol(int x,int i){
        if(i==arr.length)return 0;
        if(sol[x][i]!=0)return sol[x][i];
        try{x=x==0?arr[i-1]:1;}catch(Exception ex){}
        int sol1,sol2;
        sol1=sol(0,i+1);
        if(i!=0){sol1+=(Math.abs(arr[i]-x));}
        sol2=sol(1,i+1);
        if(i!=0){sol2+=(Math.abs(1-x));}
        sol[1][i]=sol2;
            sol[0][i]=sol1;
        if(sol1>sol2)
            return sol1;
        else
            return sol2;
    }
}
