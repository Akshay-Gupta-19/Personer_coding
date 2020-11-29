/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author akggupta
 */
public class SavaIronMan {

    /**
     * @param args the command line arguments
     */
   	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
                String Waist=sc.nextLine();
	    test:while(t--!=0){
	        String s=sc.nextLine().toLowerCase();
	        ArrayList<Character> al=new ArrayList<>();
	        for(int i=0;i<s.length();i++){
	            if((s.charAt(i)<='z' && s.charAt(i)>='a') || (s.charAt(i)<='Z' && s.charAt(i)>='A')){
	                al.add(s.charAt(i));
	            }
	        }
	      // System.out.println(c);
	        for(int i=0;i<al.size()/2;i++){
	            if(al.get(i) != al.get(al.size()-1-i)){System.out.println("NO");continue test;}
	        }
	        System.out.println("YES");
	    }
	 }
    
}
