/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

/**
 *
 * @author Akshay Gupta
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Solution111().minMaxDifference(11891));
    }
}
class Solution111 {
    public int minMaxDifference(int num) {
        char c[]=(num+"").toCharArray();
        char c2[]=(num+"").toCharArray();
        char repm=c[0];
        for(int i=0;i<c.length;i++){
            if(c[i]!='9'){
                char rep=c[i];
                for(int j=i;j<c.length;j++){
                    if(c[j]==rep){
                        c[j]='9';
                    }
                }
            }
        }
        for(int j=0;j<c2.length;j++){
            if(c2[j]==repm){
                 c2[j]='0';
            }
        }
        System.out.println(new String(c)+" "+new String(c2));
        return Integer.parseInt(new String(c))-Integer.parseInt(new String(c2));
    }
}