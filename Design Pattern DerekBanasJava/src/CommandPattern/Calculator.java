/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommandPattern;

import java.util.List;

/**
 *
 * @author Akshay Gupta
 */
public class Calculator {
    List<Integer> number;

    public Calculator(List<Integer> number) {
        this.number = number;
    }
    
    public int add(){
        int ans=0;
        for (int i = 0; i < number.size(); i++) {
           ans+=number.get(i) ;
        }
        return ans;
    }
    
    public int mul(){
        int ans=1;
        for (int i = 0; i < number.size(); i++) {
           ans*=number.get(i) ;
        }
        return ans;
    }
}
