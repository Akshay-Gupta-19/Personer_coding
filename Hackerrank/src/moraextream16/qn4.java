/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moraextream16;

import java.util.ArrayList;
import java.util.Scanner;

public class qn4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        ArrayList<String> al=new ArrayList<>();
        for (int i = 0; i < a; i++) {
            al.add(sc.next());
        }
        int maxa=0;
        String ansst="";
        sc.nextLine();
        for (int i = 0; i <b; i++) {
            String os=sc.nextLine();
            String s[]=os.split(" ");
            int ca=0;
            for (int j = 0; j < s.length; j++) {
               if(al.contains(s[j])) 
                   ca++;
            }
            if(ca>maxa){
                maxa=ca;
                ansst=os;
            }
        }
        System.out.println(ansst);
    }
}
