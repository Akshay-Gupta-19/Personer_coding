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
import java.util.stream.Stream;
public class TestStream {
    public static void main(String[] args) {
        List<Integer> names=List.of(1,2,3,4,5,6,7);
        Stream<Integer> str=names.stream().filter(a->a>3);
        System.out.println(str);
    }
}
