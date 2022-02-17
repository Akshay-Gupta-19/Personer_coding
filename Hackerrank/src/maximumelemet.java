import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solu1 {

    public static void main(String[] args) throws Exception{
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList ll=new LinkedList();
           int max=0;
        for(int i=0;i<n;i++){
            switch(sc.nextInt()){
                case 1:
                    int it1=sc.nextInt();
                    ll.push(it1);
                    if(it1>max)max=it1;
                break;
                case 2:
                    ll.pop();max=0;
                 for(int j=0;j<ll.size();j++){
                        int it=(int)ll.get(j);
                        if(it>max)max=it;
                    }
                break;
                case 3:
                System.out.println(max);
                break;
                
            }
        }
    }
}