/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamAndFilters;

/**
 *
 * @author akggupta
 */
import java.util.*;
import java.util.function.Supplier;
public class TestStream3 {
    public static void main(String[] args) {
        List<Integer> li=List.of(43,65,23,65,34,76,34,634,654,5,76); 
        li.stream().filter(a->a>50).peek(a->System.out.print("between"+a)).filter(a->a%2==0).forEach(a->System.out.print("end"+a+" "));
        
    }
    
}
