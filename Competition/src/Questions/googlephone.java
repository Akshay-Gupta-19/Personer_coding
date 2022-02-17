/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.Arrays;

/**
 *
 * @author USER
 */
public class googlephone {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(500,180)));
    }
    static int[] solve(int data,int maxSize){
        int numPack=(data/maxSize)+(data%maxSize!=0?1:0);
        int cz=maxSize;
        while(cz*numPack>=data){
            if(data%cz==0){
                return new int[]{numPack,0};
            }
            cz--;
        }
        return new int[]{numPack,1};
    }
}
