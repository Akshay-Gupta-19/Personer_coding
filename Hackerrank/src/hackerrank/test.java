package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger b=new BigInteger("1");
        for (int i = 1; i <=n; i++) {
           b=b.multiply(new BigInteger(i+""));
        }
        System.out.println(b);
    }
}
