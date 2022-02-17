package worldcodesprint7impforrange;

import java.util.*;

public class qn2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        sc.nextInt();
        int fa=0;
        char c[]=sc.next().toCharArray();
        f1:for (int i = 'a'; i <='z'; i++) {
            f2: for (int j = 'a'; j <= 'z'; j++) {
                if(j!=i){
                boolean ch=true;
                int pa=0;
                f3: for (int k = 0; k < c.length; k++) {
                  if(ch && c[k]==j)continue f2;
                  else if(!ch && c[k]==i)continue f2;
                  else if(c[k]==j){ch=true;pa++;} else if(c[k]==i){ch=false;pa++;}
                }
                if(pa>fa)fa=pa;}
            }
        }
        System.out.println(fa);
    }
    
}
