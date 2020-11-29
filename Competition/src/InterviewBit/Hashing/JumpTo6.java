/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.Hashing;

import java.util.*;

/**
 *
 * @author akggupta
 */

class twoE{
    int x,y;

    public twoE(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public twoE() {
    }

    @Override
    public int hashCode() {
       return Objects.hash(x,y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final twoE other = (twoE) obj;
        return this.x == other.x
                 || this.y == other.y;
        
    }
    
}
public class JumpTo6 {
    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
   
        HashMap<twoE,Integer> hs=new HashMap<>();
        for (Integer A1 : A) {
            twoE ne=new twoE(A1-1,A1+1);
            if(hs.containsKey(ne)){
              
            }
            else{
                
            }
        }
    }
}
