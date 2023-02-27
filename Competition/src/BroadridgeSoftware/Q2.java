/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BroadridgeSoftware;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Akshay Gupta
 */
public class Q2 {
      public static String getSquares(List<Integer> lengths) {
          int n=lengths.stream().max((a,b)->a-b).get();
          char c[][]=new char[n][n];
          for (int i = 0; i < c.length; i++) {
             Arrays.fill(c[i],' '); 
          }
          for (int i = 0; i < lengths.size(); i++) {
              int currSize=lengths.get(i)-1;
              for (int j = 0; j < currSize+1; j++) {
                  c[j][0]='#';
                  c[0][j]='#';
                  c[currSize][j]='#';
                  c[j][currSize]='#';
              }
          }
          StringBuffer ans=new StringBuffer();
          for (int i = 0; i < c.length; i++) {
             ans.append(new String(c[i]));
             if(i!=c.length-1)
                 ans.append("\n");
          }
          return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(getSquares(List.of(3,5)));
    }
}
