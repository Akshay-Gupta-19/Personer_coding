
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zenifitcoadsprint;

import java.math.BigInteger;

/**
 *
 * @author akshay gupta
 */
public class prime {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            if(isp(i))
                System.out.print(i+",");
        }
    }
       static boolean isp(double n){
          if (n <= 1) {
                return false;
            }
            if (n == 2) {
                return true;
            }
            if (n % 2 == 0) {
                return false;
            }
            for (int i = 3; i <= Math.sqrt(n) + 1; i = i + 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
    }
}
