package compte;

import java.util.*;

public class qn32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c[]=sc.next().toCharArray();
        int b[]=new int[c.length];
        int ans=0;
        for (int i = c.length-1; i >= 0; i--) {
            if(c[i]=='2'||c[i]=='4'||c[i]=='6'||c[i]=='8')ans++;
            b[i]=ans;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" "); 
        }
        System.out.println();
    }   
}
