import java.util.Arrays;
import java.util.Scanner;

public class decription {
    
    static int sol(String a,String b){
        String ps[]=new String[26];//possible String
        for (int i = 1; i <= 26; i++) {
            String now="";
            for (int j = 0; j < a.length(); j++) {
                now+=(char)(((a.charAt(j)-'a'+i)%26)+'a');
            }
            ps[i-1]=now;
        }
        int minmis=b.length();
        for (int i = 0; i < ps.length; i++) {
            int cmm=0;//current miismatch
            for (int j = 0; j < ps[i].length(); j++) {
                if(b.charAt(j)!=ps[i].charAt(j))
                   cmm++;
                if(cmm>=minmis)break;
            }
            if(cmm<minmis){minmis=cmm;}
        }
    return minmis;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            String p=sc.next();
            String e=sc.next();
            System.out.println(sol(p,e));
        }
    }
}
