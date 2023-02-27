/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lexidusinterview;
import java.util.*;
/**
 *
 * @author Akshay Gupta
 */
public class Question1 {
    public static void main(String[] args) {
        Question1 q1=new Question1();
        System.out.println(q1.solve(100, 50));
    }
    int solve(int n,int b){
        HashMap<Integer, Integer> primeFactorize2 = primeFactorize2(b);
        Map<Integer, Integer> primeFactorization = new Question1().primeFactorization(100,new ArrayList<>(primeFactorize2.keySet()));
        int minExp=Integer.MAX_VALUE;
        for(Integer factors:primeFactorize2.keySet()){
            int factVal=primeFactorization.getOrDefault(factors ,0);
            minExp=Math.min(minExp,factVal/primeFactorize2.get(factors));
        }
        return minExp;
    }
    
    public static HashMap<Integer, Integer> primeFactorize2(int num) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    for(int i = 2; i <= num; i++) {
        while(num % i == 0) {
            int existing = m.containsKey(i) ? m.get(i) : 0;
            m.put(i, existing + 1);
            num /= i;
        }
    }
    return m;
    }
    
    
   Map<Integer,Integer> primeFactorization(int a,List<Integer> factors){
        Map<Integer,Integer> primeFactorization=new HashMap<>();
       for (Integer factor:factors) {
           int prime=factor;
           int atemp=a,cexp=0;
           while(atemp>prime){
               cexp+=(atemp/=prime);
           }
           primeFactorization.put(prime,cexp);
       }
        return primeFactorization;
    }
   /*
   List<Integer> getFactors(int a){
       Set<Integer> factors=new HashSet<>();
       for (int i = 2; i < a; i++) {
           if(a%i!=0)
               continue;
           factors.add(i);
           while(a%i==0)
               a/=i;
       }
       return new ArrayList(factors);
   }
   List<Integer> getPrimes(int a){
       boolean notPrimes[]=new boolean[a+1];
       for (int i = 2; i < notPrimes.length; i++) {
           if(!notPrimes[i]){
               for (int j = i+i; j < notPrimes.length; j+=i) {
                   notPrimes[j]=true;
               }
           }
       }
       List<Inte
   }*/
}
