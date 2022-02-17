import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class waiterv2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),q=sc.nextInt(),prim=2;
        LinkedList<Stack> al=new LinkedList<>();
        Stack<Integer> fs=new Stack<>();
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            fs.push(x);
        }
        al.addLast(fs);
            Stack<Integer> st=al.pollLast();
            Stack<Integer> nsd=new Stack(); //new stack deviding
            Stack<Integer> nsnd=new Stack(); //new stack not deviding
            while(!st.isEmpty()){
                int x=st.pop();
                if(x%prim==0)
                    nsd.push(x);
                else
                    nsnd.push(x);
         
            }
            al.addLast(nsd);
            al.addLast(nsnd);
            prim=3;
        for (int i = 0; i < q-1; i++) {
            st=al.pollLast();
            nsd=new Stack(); //new stack deviding
            nsnd=new Stack(); //new stack not deviding
            while(!st.isEmpty()){
                int x=st.pop();
                if(x%prim==0)
                    nsd.push(x);
                else
                    nsnd.push(x);
            }
            al.addLast(nsd);
            al.addLast(nsnd);
            prim=getnextprim(prim);
        }
        while(!al.isEmpty()){
            Stack cs=al.pollFirst();
            while(!cs.isEmpty()){
                int t=(int) cs.pop();
                System.out.println(t);
            }
        }
    }
    static int getnextprim(int x){
        while(!isprime(++x)); 
        return x;
    }
    static boolean isprime(int x){
        for (int i = 3; i*i <x ; i+=2) {
            if(x%i==0)
                return false;
        }
        return true;
    }
}
