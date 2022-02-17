package Strings;
import java.util.Scanner;
public class SaveHumanity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte t=sc.nextByte();
        for (int i = 0; i < t; i++) {
            String p=sc.next();
            String v=sc.next();
            int plen=p.length();
            int vlen=v.length();
            boolean m=false;
            for (int j = 0; j <= plen-vlen; j++) {
                if(eq(p.substring(j,j+vlen),v)){
                    System.out.print(j+" ");
                    m=true;
                }
            }
            if(!m){System.out.println("No Match!");continue;}
            System.out.println("");
        }
    }
    static boolean eq(String x,String y){
        int i;
        int xlen=x.length();
        int ylen=y.length();
        for ( i = 0; i<xlen&&x.charAt(i)==y.charAt(i); i++);
        for (i++; i<xlen; i++){if(x.charAt(i)!=y.charAt(i))return false;}
        return true;
    }
}