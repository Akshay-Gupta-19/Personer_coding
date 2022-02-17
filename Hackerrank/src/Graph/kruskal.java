package Graph;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author akshay gupta
 */
public class kruskal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int edge[][]=new int[m][3];
        long ans=0;
        for (int i = 0; i < m; i++) {
            edge[i][0]=sc.nextInt()-1;//source of edge
            edge[i][1]=sc.nextInt()-1;//destination of edge
            edge[i][2]=sc.nextInt();//weight of edge
        }
       sort(edge);
       int src=sc.nextInt()-1;
       ans=getans(edge,n,src);
        System.out.println(ans);
    }
    static long getans(int edge[][],int n,int src){
  LinkedList<Integer> nodes=new LinkedList<>();
    long ans=0;
    int noe=0;//no of edges currently
    nodes.add(src);
        while(true){
            for (int i = 0; i < edge.length; i++) {
                if(nodes.contains(edge[i][0])){
                    if(nodes.contains(edge[i][1]))continue;
                ans+=edge[i][2];
                nodes.add(edge[i][1]);
                noe++;
                break;
                }
                else if(nodes.contains(edge[i][1])){
                    if(nodes.contains(edge[i][0]))continue;
                ans+=edge[i][2];
                nodes.add(edge[i][0]);
                noe++;
                break;
                }
            }
            if(noe==n-1)break;
        }
        return ans;
    }
  
  private static int[][] helper;
  private static int number;
  private static int[][] numbers;

  public static void sort(int[][] values) {
    numbers = values;
    number = values.length;
    helper = new int[number][3];
    mergesort(0, number - 1);
  }

  private static void mergesort(int low, int high) {
    // check if low is smaller then high, if not then the array is sorted
    if (low < high) {
      // Get the index of the element which is in the middle
      int middle = low + (high - low) / 2;
      // Sort the left side of the array
      mergesort(low, middle);
      // Sort the right side of the array
      mergesort(middle + 1, high);
      // Combine them both
      merge(low, middle, high);
    }
  }

  private static void merge(int low, int middle, int high) {

    // Copy both parts into the helper array
    for (int i = low; i <= high; i++) {
      helper[i] = numbers[i];
    }

    int i = low;
    int j = middle + 1;
    int k = low;
    // Copy the smallest values from either the left or the right side back
    // to the original array
    while (i <= middle && j <= high) {
      if (helper[i][2] < helper[j][2]) {
        numbers[k] = helper[i];
        i++;
      } else if (helper[i][2]==helper[j][2])
      {
          if(helper[i][0]+helper[i][1]<helper[i][0]+helper[i][1]){
            numbers[k] = helper[i];
            i++;  
          }
          else{
            numbers[k] = helper[j];
            j++;
          }
      }
      else
      {
        numbers[k] = helper[j];
        j++;
      }
      k++;
    }
    // Copy the rest of the left side of the array into the target array
    while (i <= middle) {
      numbers[k] = helper[i];
      k++;
      i++;
    }

  }
  
}
