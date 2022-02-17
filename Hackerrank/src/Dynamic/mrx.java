package Dynamic;

import java.util.Scanner;
public class mrx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        boolean gr[][]=new boolean[m][n];
        for (int i = 0; i < gr.length; i++) {
            String cl=sc.next();
            for (int j = 0; j < gr[i].length; j++) {
               if(cl.charAt(j)=='x')
                   gr[i][j]=true;
               else
                   gr[i][j]=false;
            }
        }
        int ui=0,li=m-1,lj=0,rj=n-1;
        int i;
        x: for (i = 0; i < gr.length; i++) {
            for (int j = 0; j < gr[i].length; j++) {
                if(gr[i][j])continue x;
            }
            break;
        }
        ui=i;
        x: for (i = gr.length-1; i >= 0; i--) {
            for (int j = 0; j < gr[i].length; j++) {
                if(gr[i][j])continue x;
            }
            break;
        }
        li=i;
        if(ui>=li){System.out.println("impossible");return;}
        x: for (i = 0; i < gr[0].length; i++) {
            for (int j = 0; j < gr.length; j++) {
                if(gr[j][i])continue x;
            }
            break;
        }
        lj=i;
        x: for (i = gr[0].length-1; i >= 0; i--) {
            for (int j = 0; j < gr.length; j++) {
                if(gr[j][i])continue x;
            }
            break;
        }
        rj=i;
        if(lj>=rj){System.out.println("impossible");return;}
        System.out.println(2*(li-ui)+2*(rj-lj));
    }
    
}
