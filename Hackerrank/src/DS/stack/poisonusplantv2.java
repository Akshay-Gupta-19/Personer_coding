//import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class poisonusplantv2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
       Scanner sc=new Scanner(System.in);
       int q=sc.nextInt();
        for (int i = 0; i <q; i++) {
            ll.addFirst(sc.nextInt());
        }
        int ans=0;
        Stack st=new Stack();
        while(!ll.isEmpty()){
            int n=ll.pop();
            int cans=0;
           while(!st.isEmpty()&&(int)st.peek()>n){
               st.pop();
                cans++;
            }
        
            st.push(n);
            if(cans>ans)ans=cans;
        }
        System.out.println(ans);
    }
    
}
