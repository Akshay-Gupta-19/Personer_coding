
import java.util.Scanner;

public class insertionsort1 {
public static void main(String[] args) {
   Scanner  sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for (int i = 0; i < a.length; i++) {
          a[i]=sc.nextInt();
       }
       System.out.println(insertionSort(a));
   
}

public static int insertionSort(int array[]) {

        int n = array.length;
        int ans=0;

        for (int j = 1; j < n; j++) {

            int key = array[j];

            int i = j - 1;

            while ((i > -1) && (array[i] > key)) {

                ans++;
                
                array[i + 1] = array[i];

                i--;

            }

            array[i + 1] = key;
       }
return ans;
    }
}
