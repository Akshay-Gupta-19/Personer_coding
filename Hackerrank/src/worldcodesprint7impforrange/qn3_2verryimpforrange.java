package worldcodesprint7impforrange;
import java.util.*;
public class qn3_2verryimpforrange {
    static HashMap <Integer,ArrayList<Integer>> hs;
    public static void main(String[] args) {
        hs=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        long ans=0;
        for (int i = 0; i < k; i++) {
            int r=sc.nextInt();
            int c1=sc.nextInt();
            int c2=sc.nextInt(); 
            if(c2<c1){int temp=c2;c2=c1;c1=temp;}
            if(!hs.containsKey(r)){
                ArrayList<Integer> al=new ArrayList<>();
                al.add(c1);
                al.add(c2);
                ans+=(c2-c1+1);
                hs.put(r, al);
            }
            else{ 
                ans+=(solve(r,c1,c2));
                hs.get(r).add(c1);
                hs.get(r).add(c2);
            }
        }
        
        System.out.println(m*(long)n-ans);
    }
    static long solve(int r,int x,int y){
        if(x>y)return 0;
        long ans=-1;
            ArrayList<Integer> ra = hs.get(r);
            for (int i = 0; i < ra.size(); i+=2) {
                if(y==ra.get(i)) ans=solve(r,x,y-1);
                else if(x==ra.get(i+1))ans=solve(r,x+1,y);
                else if(y<ra.get(i)){//1122 xy are 1 and rai and rai+1 is 2
                    continue;
                }else if(x>ra.get(i+1)){//2211
                    continue;
                }else if(y>ra.get(i)&&y<=ra.get(i+1)&&x<ra.get(i)){//1212
                    ans=solve(r,x,ra.get(i)-1);
                }else if(y>ra.get(i)&&y<=ra.get(i+1)&&x>=ra.get(i)){//2112
                    ans=0;
                }else if(y>=ra.get(i+1)&&x<=ra.get(i)){//1221
                    ans=solve(r,x,ra.get(i)-1)+solve(r,ra.get(i+1)+1,y);
                }else if(y>=ra.get(i+1)&&x>ra.get(i)&&x<=ra.get(i+1)){//2121
                    ans=solve(r,ra.get(i+1)+1,y);
                }
            }
        if(ans==-1)ans=y-x+1;
        return ans;
    }
}
/*
6 6 10
1 2 3
1 3 6
2 2 3
2 5 6
3 3 5
3 2 4
4 4 5
4 1 2
5 2 5
5 3 4

6 6 10
1 2 3
1 3 4
4 3 4
4 2 3
2 2 4
2 3 4
3 2 4
3 2 3
6 3 5
6 3 5

*/