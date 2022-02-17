package sep_circuit;
import java.util.Scanner;
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),q=sc.nextInt();
        boolean arr[]=new boolean[n];
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            if(((int)(Math.log(x)/Math.log(2)))%2==0)arr[i]=true;//true is odd
            else arr[i]=false;
        }
        for (int i = 0; i < q; i++) {
            int l=sc.nextInt(),r=sc.nextInt();
            boolean ans=false;
            for (int j = l-1; j < r; j++) {
              ans=(ans^arr[j]);
            }
            if(ans)System.out.println("Mishki");
            else System.out.println("Hacker");
        }
    }
}