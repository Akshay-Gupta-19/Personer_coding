package Dynamic;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class TwoRobets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m=sc.nextInt(),n=sc.nextInt();
            int arr[][]=new int[n][2];
            int ans=0;
            for (int j = 0; j < n; j++) {
                int a=sc.nextInt(),b=sc.nextInt();
                arr[j][0]=a;
                arr[j][1]=b;
                ans+=Math.abs(a-b);
            }
            int ans2=Integer.MAX_VALUE;
            int dy[][][]=new int[m+2][m+2][n+1];
            for (int j = 0; j < arr.length; j++) {
                int pa=solve(arr,arr[0][0],arr[j][0],0,dy);
                if(pa<ans2)ans2=pa;
            }
            System.out.println(ans+ans2);
        }
    }
    static int solve(int arr[][],int frl,int srl,int qn,int dy[][][]){
        if(qn==arr.length)return 0;
        if(dy[frl][srl][qn]!=0)return dy[frl][srl][qn];
        int ans=Math.min(solve(arr,arr[qn][1],srl,qn+1,dy)+Math.abs(frl-arr[qn][0]),solve(arr,frl,arr[qn][1],qn+1,dy)+Math.abs(srl-arr[qn][0]));
        dy[frl][srl][qn]=ans;
        return ans;
        
    }
    
}
