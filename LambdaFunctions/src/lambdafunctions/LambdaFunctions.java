/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdafunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.print.attribute.IntegerSyntax;


/**
 *
 * @author akggupta
 */
public class LambdaFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new Random().nextInt(100));
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        
//get list of unique squares
List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
    Collection c=new ArrayList<>();
    
    }
    
}
