package compte;
import java.util.Scanner;
public class qn28 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t; i++) {
            char c[]=sc.next().toCharArray();
            long clen=c.length;
            long ats=0;
            for (int j = 0; j < c.length; j++) {
                if(c[j]=='a'||c[j]=='A'||c[j]=='b'||c[j]=='B'||c[j]=='c'||c[j]=='C'){
                    long ca=1;
                    while(++j<c.length && (c[j]=='a'||c[j]=='A'||c[j]=='b'||c[j]=='B'||c[j]=='c'||c[j]=='C'))ca++;
                    ats+=((ca*(ca+1))/2);
                }
            }
            System.out.println(ats);
        }
    }
}
