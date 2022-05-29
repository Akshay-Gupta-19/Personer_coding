/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamtesting;
import java.util.*;
import java.util.stream.*;
/**
 *
 * @author Akshay Gupta
 */
public class StreamTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> myList=Arrays.asList(1,2,3,4);
        myList.stream().collect(Collectors.toList());
       IntStream abc=IntStream.of(1,4,2,1);
       IntStream.generate(myList);
       System.out.println(sum);
    }
   
     public int findKthLargest(int[] nums, int k) {
        int[] toArray = Arrays.stream(nums).sorted().toArray();
        return toArray[toArray.length-k];
    }
}
