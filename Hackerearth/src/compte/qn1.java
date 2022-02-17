
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(!al.contains(x))al.add(x);
        }
        String hss=al.toString();
        System.out.println(hss.substring(1,hss.length()-1).replaceAll(",",""));
    }
}
