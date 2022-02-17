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
public class LargeModMul {
    static int mul(int x,int y,int mod){
	    if(!overflow(x,y))return ((x*y)%mod);
	    if(y%2==0)
	        return mul(x*2,y/2,mod);
	    else
	        return (mul(x,y-1,mod)+x)%mod;
	}
	static boolean overflow(int x,int y){
	    if(x==0 || y==0)return false;
	    int result=x*y;
	    if(x==result/y)return false;
	    return true;
	}
}
