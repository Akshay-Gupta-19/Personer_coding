package sabere;
import java.util.Scanner;
public class qn2 {
    static int cnt[][];
    static int arr[][];
    static int k,x;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        k=sc.nextInt();
        x=sc.nextInt();
        cnt=new int[n][m];
        arr=new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==x)cnt[i][j]++;
                try{
                    cnt[i][j]+=cnt[i-1][j];
                }catch(Exception ex){}
                try{
                    cnt[i][j]+=cnt[i][j-1];
                }
                catch(Exception ex){}
                try{
                    cnt[i][j]-=cnt[i-1][j-1];
                }
                catch(Exception ex){}
            }
        }
        long ans=0;
        for (int i = 0; i < arr.length-1; i++) {//starting row index
            for (int j = i+1; j < arr.length; j++) {//ending row index
                for (int l = 0; l < arr[0].length-1; l++) {
                    for (int o = l+1; o < arr[0].length; o++) {
                        if(solve(i,l,j,o))ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
    static boolean solve(int r1,int c1,int r2,int c2){
        if((arr[r1][c1]!=arr[r1][c2])&&(arr[r1][c1]!=arr[r2][c1])&&(arr[r1][c1]!=arr[r2][c2])&&(arr[r1][c2]!=arr[r2][c1])&&(arr[r1][c2]!=arr[r2][c2])&&(arr[r2][c1]!=arr[r2][c2]))
            return false;
        int ans=cnt[r2][c2];
        try{
            ans-=cnt[r2][c1-1];
        }
        catch(Exception ex){}
        try{
            ans+=cnt[r1-1][c1-1];
        }
        catch(Exception ex){}
        try{
            ans-=cnt[r1-1][c2];
        }
        catch(Exception ex){}
        
        if(ans>=k)return true;
        return false;
    }
}