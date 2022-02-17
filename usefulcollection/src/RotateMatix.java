/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akggupta
 */
public class RotateMatix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length/2;i++){
            rotateRow(matrix,i);
        }
    }
    void rotateRow(int m[][],int x){
        int size=m.length-2*x;
        for(int i=x;i<size+x-1;i++){
            int temp=m[x][i];
            m[x][i]=m[2*x+size-1-i][x];
            m[2*x+size-1-i][x]=m[x+size-1][2*x+size-1-i];
            m[x+size-1][2*x+size-1-i]=m[i][x+size-1];
            m[i][x+size-1]=temp;
        }
    }
}