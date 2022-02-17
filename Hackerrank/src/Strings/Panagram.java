
import java.util.Scanner;

public class Panagram {
public static void main(String[] args) {
   String s;
   int t=0,i,len;
   boolean b[]=new boolean[26];
   s=new Scanner(System.in).nextLine();
   len=s.length();
    for (i = 0; i < len; i++) {
        char c=s.charAt(i);
        for (int j = 0; j < 26; j++) {  
        if((c==j+'a'||c==j+'A')&&!b[j]){
            b[j]=true;
        t++;}
//            System.out.println(j+'a'+" "+t+" "+c);
            }
        if(t==26){System.out.println("panagram");return;}
    }
        System.out.println("not panagram");
}
    
}
