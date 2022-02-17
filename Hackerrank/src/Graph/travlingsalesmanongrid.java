import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class travlingsalesmanongrid {
    static int m,n;
    static int weight[][];
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       m=sc.nextInt();n=sc.nextInt();
       if( m==1 || n==1 ){System.out.println(-1);return;}
       weight=new int[m*n][4];
       Arrays.fill(weight[0], 1000000);
       Arrays.fill(weight[1], 1000000);
       Arrays.fill(weight[2], 1000000);
       Arrays.fill(weight[3], 1000000);
        for (int i = 0; i < weight.length; i++) {
            if(i%n!=n-1)
                weight[i][1]=sc.nextInt();
            else if(i%n!=0)
                weight[i][3]=weight[i-1][1];
        }
        for (int i = 0; i < weight.length; i++) {
            if(i<n*(m-1))
                weight[i][2]=sc.nextInt();
            else if(i>=n)
                weight[i][0]=weight[i-n][2];
        }
        
        ArrayList<Integer> nrtv=new ArrayList<>();
        for (int i = 1; i < m*n; i++) 
            nrtv.add(i);
        System.out.println(getans(nrtv,0));
    }
static int getans(ArrayList<Integer> nrtv,int src){
        if(nrtv.isEmpty()){
            if(src==n)
               return weight[src][0]; 
            else if(src==1)
                return weight[src][3];
            else
                return 1000000;
        }
        else {
            int min=1000000;
            if(src-n>0 && nrtv.contains(src-n)){
                nrtv.remove(new Integer(src-n));
                int possibleans=weight[src][0]+getans(nrtv,src-n);
                if(possibleans<min)
                    min=possibleans;
                nrtv.add(src-n);
            }
            if(src+n<m*n && nrtv.contains(src+n)){
                nrtv.remove(new Integer(src+n));
                int possibleans=weight[src][2]+getans(nrtv,src+n);
                if(possibleans<min)
                    min=possibleans;
                nrtv.add(src+n);
            }
            if(src%n!=0 && nrtv.contains(src-1)){
                nrtv.remove(new Integer(src-1));
                int possibleans=weight[src][3]+getans(nrtv,src-1);
                if(possibleans<min)
                    min=possibleans;
                nrtv.add(src-1);
            }
            if(src%n!=n-1 && nrtv.contains(src+1)){
                nrtv.remove(new Integer(src+1));
                int possibleans=weight[src][1]+getans(nrtv,src+1);
                if(possibleans<min)
                    min=possibleans;
                nrtv.add(src+1);
            }
            System.out.println(min);
            return min;
        }
    }
}