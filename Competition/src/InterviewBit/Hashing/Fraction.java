/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.Hashing;

/**
 *
 * @author akggupta
 */
import java.util.*;
class line{
    double sloap;
    double inter;

    public line() {
    }

    public line(double sloap, double inter) {
        this.sloap = sloap;
        this.inter = inter;
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(sloap,inter);
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
        final line other = (line) obj;
        if(this.sloap==Double.NaN && other.sloap==Double.NaN){
            
        }
        if (Double.doubleToLongBits(this.sloap) != Double.doubleToLongBits(other.sloap)) {
            return false;
        }
        if (this.inter != other.inter) {
            return false;
        }
        return true;
    }
    
    
}
public class Fraction {
    public static void main(String[] args) {
       ArrayList<Integer> a=new ArrayList<>();
       ArrayList<Integer> b=new ArrayList<>();
       a.add(1);a.add(1);a.add(1);
       b.add(1);b.add(1);b.add(1);
       HashMap<line,Integer> hs=new HashMap<>();
       int ans=0;
        for (int i = 0; i < b.size(); i++) {
            for (int j = i+1; j < b.size(); j++) {
                double sloap=(b.get(j)-(double)b.get(i))/(a.get(j)-a.get(i));
                double inter=(b.get(i)-sloap*a.get(i));
                if(sloap==Double.NEGATIVE_INFINITY)sloap=Double.POSITIVE_INFINITY;
                if(inter==Double.NEGATIVE_INFINITY)inter=a.get(i);
                line Nl=new line(sloap,inter);
                if(!hs.containsKey(Nl))hs.put(Nl,0);
            }
        }
        Iterator<line> it=hs.keySet().iterator();
        while(it.hasNext()){
            line cl=it.next();
            for (int i = 0; i < b.size(); i++) {
                int on= hs.get(cl);
               if(onLine(cl,a.get(i),b.get(i)))
                   hs.put(cl,on+1);
               ans=Math.max(ans,on+1);
            }
        }
        System.out.println(ans);
    }
    static boolean onLine(line l,int a,int b){
        if(l.sloap==Double.POSITIVE_INFINITY)return a==l.inter;
        return b==l.sloap*a+l.inter;
    }
}
