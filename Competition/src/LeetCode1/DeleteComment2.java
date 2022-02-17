/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1;

import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public static void main(String[] args) {
        String test[]=new String[]{"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};
        Solution2 solution = new Solution2();
        System.out.println(solution.removeComments(test));
    }
    public  List<String> removeComments(String[] source) {
        boolean state=true;
        boolean spareNL=true;
        List<String> ans=new ArrayList<>();
        for(int i=0;i<source.length;i++){
                int ind=source[i].indexOf("/*");
                int ind2=source[i].indexOf("//");
                int ind3=source[i].lastIndexOf("*/");
                if(ind3==ind+1)ind3=-1;
            if(state){
                String cs=source[i];
                if(ind>ind2){
                    if(ind3>0){
                        cs=source[i].substring(0,ind)+source[i].substring(ind3+2);
                    }else{
                        cs=source[i].substring(0,ind);
                        state=false;
                    }
                }else if(ind2>0){
                    cs=source[i].substring(0,ind2);
                }
                if(!cs.trim().equals(""))
                    ans.add(cs);
            }else{
                if(ind3>0){
                    String cs=source[i].substring(ind3+2);
                    if(!cs.trim().equals(""))
                        ans.add(cs);
                    state=true;
                }
            }
        }
        return ans;
    }
}