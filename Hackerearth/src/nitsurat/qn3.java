package nitsurat;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
    
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	for(int i=0;i<n;i++){
    		int t=sc.nextInt();    		int a=sc.nextInt();
    		int b=sc.nextInt();
    		System.out.println(b-a);

    		for(int j=0;j<t-2;j++){
    		sc.nextInt();
    		}
    	}
    }
}
