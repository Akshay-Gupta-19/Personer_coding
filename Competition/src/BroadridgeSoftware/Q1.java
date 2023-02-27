/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BroadridgeSoftware;
import java.util.*;
/**
 *
 * @author Akshay Gupta
 */
public class Q1 {
    public static int computeSpeed(List<Integer> lights) {
        out:for (int i = 100; i >=1; i--) {
            double speed = (i*(double)5 )/18;
            for (int j = 0; j < lights.size(); j+=2) {
                int distence = lights.get(j);
                int cycle = lights.get(j+1);
                double time = distence/speed;
                System.out.println(distence+" "+i+" "+speed+" "+time+" "+cycle+" "+time/cycle);
                if(((int)(time/cycle))%2==1){
                    continue out;
                }
            }
            return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(computeSpeed(List.of(100,10,200,15,300,10)));
    }
}
