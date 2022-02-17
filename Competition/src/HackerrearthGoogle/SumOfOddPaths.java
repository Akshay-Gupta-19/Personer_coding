/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerrearthGoogle;

/**
 *
 * @author USER
 */
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,HashMap<Integer,Integer>> hm=new HashMap<>();
        for(int i=0;i<n-1;i++){
            int s=sc.nextInt(),d=sc.nextInt(),w=sc.nextInt();
            hm.putIfAbsent(s, new HashMap<>());
            hm.putIfAbsent(d, new HashMap<>());
            hm.get(s).put(d,w);
            hm.get(d).put(s,w);
        }
        
    }
    static int ans=0;
    int[] solve(HashMap<Integer,HashMap<Integer,Integer>> hm,int cn,int par){
        int eo[][]=new int[hm.get(cn).size()][2];
        int i=0;
        for(Integer nei:hm.get(cn).keySet()){
            int fromC[]=solve(hm,nei,cn);
            if(hm.get(cn).get(nei)%2==0){
                eo[i][0]=fromC[0];
                eo[i++][1]=fromC[1];
            }else{
                eo[i][1]=fromC[1];
                eo[i++][0]=fromC[0];
            }
        }
        for (int j = 0; j < eo.length; j++) {
            
        }
        return myOff;
    }
}
