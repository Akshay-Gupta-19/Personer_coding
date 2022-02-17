package greedy;

import java.util.Scanner;

public class boardcutting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt(), n = sc.nextInt();
            cut x[] = new cut[m + n - 2];
            int j;
            for (j = 0; j < m - 1; j++) {
                x[j] = new cut();
                x[j].cv = sc.nextInt();
            }
            for (; j < m + n - 2; j++) {
                x[j] = new cut();
                x[j].cv = sc.nextInt();
                x[j].ct = true;
            }
     quickSort(x, 0, m + n - 3);
            long ans = 0;
            int hc = 1, vc = 1;
            for (int k = 0; k < x.length; k++) {
                if (x[k].ct) {
                    ans += x[k].cv * hc;
                    vc++;
                } else {
                    ans += x[k].cv * vc;
                    hc++;
                }
            }
            System.out.println(ans % 1000000007);
        }
    }

    static void quickSort(cut[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle].cv;

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i].cv > pivot) {
                i++;
            }

            while (arr[j].cv < pivot) {
                j--;
            }

            if (i <= j) {
                cut temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j) {
            quickSort(arr, low, j);
        }

        if (high > i) {
            quickSort(arr, i, high);
        }
    }
}

class cut {
    int cv;//cut value
    boolean ct;//cut type false for horizontal and true for vertical
}
