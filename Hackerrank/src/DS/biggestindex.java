package DS;

import java.util.Scanner;

public class biggestindex {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n+1];
        long mpro=0;
        for (int i = 1; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 2; i < arr.length-1; i++) {
            int li,ri;
            for (li = i-1; li>0&&arr[li]<=arr[i]; li--);
            for (ri = i+1; ri<arr.length&&arr[ri]<=arr[i]; ri++);
            if(ri==arr.length)ri=0;
            if(mpro<li*ri)mpro=li*ri;
        }
        System.out.println(mpro);
    }
}
