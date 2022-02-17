/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class JimandSkyscreaper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        int arr[]=new int[n];
        int ans[]=new int[n];
        int fans=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            while(!st.isEmpty() && arr[st.peek()]<arr[i])
                st.pop();
            if(!st.isEmpty()&&arr[st.peek()]==arr[i])
                ans[i]=ans[st.peek()]+1;
            st.push(i);
            fans+=ans[i];
        }
        System.out.println(fans*2);
    }
}
