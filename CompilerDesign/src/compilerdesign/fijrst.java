/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerdesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author avnegers
 */
public class fijrst {

    public static void main(String[] args) {
        System.out.println("Enter no of productions");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Character, ArrayList<String>> pro = new HashMap<>();//list of produtions
        HashMap<Character, HashSet<Character>> lof = new HashMap<>();//list of firsts
        HashMap<Character, HashSet<Character>> lofo = new HashMap<>();//list of follows
        for (int i = 0; i < n; i++) {
            char ps = sc.next().charAt(0);//production source
            if (pro.containsKey(ps)) {
                String pd = sc.next();//production derivation
                pro.get(ps).add(pd);
                if (pd.charAt(0) <= 'z' && pd.charAt(0) >= 'a' || pd.charAt(0) == '@') {
                    lof.get(ps).add(pd.charAt(0));
                }
            } else {
                String pd = sc.next();
                ArrayList np = new ArrayList();
                np.add(pd);
                pro.put(ps, np);
                lof.put(ps, new HashSet<>());
                lofo.put(ps, new HashSet<>());
                if (pd.charAt(0) <= 'z' && pd.charAt(0) >= 'a' || pd.charAt(0) == '@') {
                    lof.get(ps).add(pd.charAt(0));
                }
            }
        }
        lofo.get('S').add('$');
        Set<Character> s = pro.keySet();
        for(int o=0;o<100;o++) {
            boolean epon=false;//epsilon or not
            Iterator<Character> it = s.iterator();
            while (it.hasNext()) {
                char cc = it.next();//current charater to add firsts
                np:for (int j = 0; j < pro.get(cc).size(); j++) {
                    String cp = pro.get(cc).get(j);//currentt production to analyse
                    if (lof.containsKey(cp.charAt(0))) {
                        lof.get(cc).addAll(lof.get(cp.charAt(0)));
                        lof.get(cc).remove('@');
                    }
                    int loc;
                    for (loc = 0; loc < cp.length() - 1 && lof.containsKey(cp.charAt(loc)) && lof.get(cp.charAt(loc)).contains('@'); loc++) {
                        if (lof.containsKey(cp.charAt(loc + 1))) {
                            lof.get(cc).addAll(lof.get(cp.charAt(loc + 1)));
                            lof.get(cc).remove('@');
                        } else 
                            lof.get(cc).add(cp.charAt(loc + 1));
                    }
                    if (loc == cp.length() - 1 && lof.containsKey(cp.charAt(cp.length() - 1)) && lof.get(cp.charAt(cp.length() - 1)).contains('@')) {
                        epon=true;
                    }
                }
                if(epon)lof.get(cc).add('@');
            }
        }
//calculating follow
        for(int o=1;o<100;o++) {
            Iterator<Character> it = s.iterator();
            while (it.hasNext()) {
                char cc = it.next();//current charater to add firsts
                for (int j = 0; j < pro.get(cc).size(); j++) {
                    String cp = pro.get(cc).get(j);//currentt production to analyse
                    for (int k = 0; k < cp.length() - 1; k++) {
                        if(!lofo.containsKey(cp.charAt(k)))continue;
                        int loc;
                        if (!lofo.containsKey(cp.charAt(k+1))) {
                            lofo.get(cp.charAt(k)).add(cp.charAt(k + 1));
                            continue;
                        }
                        else{
                            lofo.get(cp.charAt(k)).addAll(lof.get(cp.charAt(k + 1)));
                            lofo.get(cp.charAt(k)).remove('@');
                        }
                        for(loc = k + 1; loc < cp.length() - 1 && lof.containsKey(cp.charAt(loc)) && lof.get(cp.charAt(loc)).contains('@'); loc++) {
                            if (lof.containsKey(cp.charAt(loc+1))) {
                                lofo.get(cp.charAt(k)).addAll(lof.get(cp.charAt(loc + 1)));
                                 lofo.get(cp.charAt(k)).remove('@');
                            }
                            else
                                lofo.get(cp.charAt(k)).add(cp.charAt(loc+1));
                            
                        }
                        if (loc == cp.length()-1&& lof.containsKey(cp.charAt(loc)) && lof.get(cp.charAt(loc)).contains('@')) {
                            lofo.get(cp.charAt(k)).addAll(lofo.get(cc));
                        }
                    }
                    if (cp.charAt(cp.length() - 1) >= 'A' && cp.charAt(cp.length() - 1) <= 'Z') {
                        lofo.get(cp.charAt(cp.length() - 1)).addAll(lofo.get(cc));
                    }
                }
            }
            
        }

        System.out.println(lof);
        System.out.println(lofo);
    }

}
/*8
S AB
S akq
A Bgf
A jas
B hka
B Aqa
A @
B @


10
S ABCDE
A a
A @
B b
B @
C c
D d
D @
E e
E @


6
S Bb
S Cd
B aB
B @
C cC
C @

9
S ACB
S CbB
S Ba
A da
A BC
B g
B @
C h
C @

9
S aBDh
B cC
C bC
C @
D EF
E g
E @
F f
F @
 */
