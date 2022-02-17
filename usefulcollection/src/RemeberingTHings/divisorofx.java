package RemeberingTHings;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avnegers
 */
public class divisorofx {
    public static void main(String[] args) {
        printDivisors(504);
    }
   static void printDivisors(int n)

    {
        int sum=1;
    // Note that this loop runs till square root
    for (int i=2; i<=Math.sqrt(n)+1; i++)
    {
        if (n%i==0)
        {
            // If divisors are equal, print only one
            if (n/i == i)
            { System.out.println( i);sum+=i;}
 
            else // Otherwise print both
            {System.out.println(i+(n/i));sum+=(i+(n/i));}
        }
    }
        System.out.println(sum);
}
}
