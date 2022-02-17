package worldcodesprint;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h1=0,h2=0,h3=0;
        int n1=sc.nextInt(),n2=sc.nextInt(),n3=sc.nextInt();
        LinkedList<Integer> st1=new LinkedList<Integer>();
        LinkedList<Integer> st2=new LinkedList<Integer>();
        LinkedList<Integer> st3=new LinkedList<Integer>();
        for (int i = 0; i < n1; i++) {
          int hta=sc.nextInt();
            st1.add(hta);
            h1+=hta;
        }
        for (int i = 0; i < n2; i++) {
          int hta=sc.nextInt();
            st2.add(hta);
            h2+=hta;}
        for (int i = 0; i < n3; i++) {
          int hta=sc.nextInt();
            st3.add(hta);
            h3+=hta;
        }
        while(h1!=h2 || h1!=h3){
            if(h1>h2)
                h1-=st1.pollFirst();
            else if(h2>h1)
                h2-=st2.pollFirst();
            if(h1>h3)
                h1-=st1.pollFirst();
            else if(h3>h1)
                h3-=st3.pollFirst();
            if(h2>h3)
                h2-=st2.pollFirst();
            else if(h3>h2)
                h3-=st3.pollFirst();   
        }
        System.out.println(h1);
    }
}