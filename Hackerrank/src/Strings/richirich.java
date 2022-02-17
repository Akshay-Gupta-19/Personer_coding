package Strings;
import java.util.ArrayList;
import java.util.Scanner;
public class richirich {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.nextInt();
        int k=sc.nextInt();
        char c[]=sc.next().toCharArray();
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0,j=c.length-1; i < j; i++,j--) {
            if(c[i]!=c[j])al.add(i);
        }
        for (int i = 0; i < al.size(); i++,k--) {
           if(c[al.get(i)]<c[c.length-1-al.get(i)]){
               c[al.get(i)]=c[c.length-1-al.get(i)];
           }
           else{
               c[c.length-1-al.get(i)]=c[al.get(i)];
           }
           if(k<1){
               System.out.println(-1);
               return;
           }
        }
        for (int i = 0; i < c.length && k>1; i++) {
            if(c[i]!='9'){
             k-=2;
            c[i]='9';
            c[c.length-1-i]='9';
            }
        }
        for (int i = 0; i < al.size() && k>0; i++) {
            if(c[al.get(i)]!='9'){      
                k--;
                c[al.get(i)]='9';
               c[c.length-1-al.get(i)]='9';
        }
        }
        if(c.length%2==1 && k==1){
            c[c.length/2]='9';
        }
        System.out.println(new String(c));
    }
}
