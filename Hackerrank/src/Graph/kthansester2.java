package Graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javafx.print.Collation;
public class kthansester2 {
    static HashMap<Integer, Integer> graph;
    static HashMap<Integer, ArrayList> graph2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int p = sc.nextInt();
            graph = new HashMap<>();
            graph2 = new HashMap<>();
            for (int j = 0; j < p; j++) {
                int x = sc.nextInt(), y = sc.nextInt();
                graph.put(x, y);
                graph2.put(x, new ArrayList());
            }
            Set<Integer> c2=graph.keySet();
            System.out.println(c2);
            Object arr[]=graph.keySet().toArray();
            Arrays.sort(arr);
            for (Object j:arr) {
                graph2.get(j).add(graph.get(j));
                graph2.get(j).addAll(graph2.get(j));
            }
            int q = sc.nextInt();
            for (int j = 0; j < q; j++) {
                int qn = sc.nextInt();
                switch (qn) {
                    case 0:
                        int np=sc.nextInt(),c=sc.nextInt();
                        ArrayList al=new ArrayList();
                        al.add(np);
                        al.addAll(graph2.get(np));
                        graph2.put(c, al);
                        break;
                    case 1:
                       int ctd=sc.nextInt();
                       graph2.remove(ctd);
                        break;
                    case 2:
                        int x=sc.nextInt(),k=sc.nextInt();
                        try{
                        System.out.println(graph2.get(x).get(k-1));}
                        catch(Exception ex){
                            System.out.println(0);
                        }
                        break;
                }
            }
        }
    }
    
}