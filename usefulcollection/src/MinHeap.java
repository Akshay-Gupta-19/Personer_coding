
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class MinHeap {

    int arr[];
    int size;

    void heapify(int x) {
        int cr = x;
        while (cr < size) {
            int lc = 2 * cr + 1, rc = 2 * cr + 2;
            int currMin = cr;
            if (lc < size) {
                currMin = arr[currMin]<arr[lc]?currMin:lc;
                if (rc < size) {
                    currMin = (arr[currMin]< arr[rc])?currMin:rc;
                }
            }
            int temp = arr[currMin];
            arr[currMin] = arr[cr];
            arr[cr] = temp;
            if(cr==currMin)break;
            cr=currMin;
        }
    }
    void buildHeap(int arr[],int size){
        this.arr=arr;
        this.size=size;
        for (int i =(int)(0.5+size/2)-1; i >=0; i--) {
            heapify(i);
        }
    }
    int poll(){
        int min=arr[0];
        arr[0]=arr[size];
        heapify(0);
        size--;
        return min;
    }
    void add(int x){
        arr[size]=x;
        int cr=size;
        while(cr>0){
            int par= (int)(cr/2+0.5) - 1;
            if(arr[cr]<arr[par]){
                int temp=arr[cr];
                arr[cr]=arr[par];
                arr[par]=temp;
                cr=par;
            }else{
                break;
            }
        }
        size++;
    }
    public static void main(String[] args) {
        MinHeap mh = new MinHeap();
        int arr[]=new int[1000001];
        Random rand=new Random();
        for (int i = 0; i < 100000; i++) {
            arr[i]=rand.nextInt();
        }
        mh.buildHeap(arr, 100000);
        int sorted[]=new int[100000];
        int i=0;
        while(mh.size>0)
            sorted[i++]=mh.poll();
        System.out.println(isSorted(sorted));
    }
   static boolean isSorted(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1])return false;
        }
        return true;
    }
}
