package Graph;
import java.util.LinkedList;
import java.util.Scanner;
public class prims {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int edge[][]=new int[m][3];
        long ans;
        for (int i = 0; i < m; i++) {
            edge[i][0]=sc.nextInt()-1;//source of edge
            edge[i][1]=sc.nextInt()-1;//destination of edge
            edge[i][2]=sc.nextInt();//weight of edge
        }
       quickSort(edge,0,edge.length-1);
       int src=sc.nextInt()-1;
       ans=getWeight(edge,n,src); 
        System.out.println(ans);
    }
    static long getWeight(int edge[][],int n,int src){
    LinkedList<Integer> nodes=new LinkedList<Integer>();
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
                if(nodes.contains(edge[i][1])){
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
    static void quickSort(int[][] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle][2];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i][2] < pivot) {
				i++;
			}
 
			while (arr[j][2] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp[] = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
}
