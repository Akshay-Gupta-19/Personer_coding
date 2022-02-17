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
public class ModPow {
    static long pow(long x,int y,int m){
    long res = 1;     
    x = x % m;
    while (y > 0)
    {
        if ((y & 1)!=0)
            res = (res*x) % m;
        y = y>>1; // y = y/2
        x = (x*x) % m;  
    }
    return res;
    }    
}
