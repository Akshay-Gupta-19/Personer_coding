package dijekstra;

import java.util.Arrays;
import java.util.Scanner;

class LabAssi5_7 {
    public static void main(String[] args) {
        System.out.println("Enter the size of graph");
        Scanner sc=new Scanner(System.in);
        int way;
        int maxindex=0;//setting initial intermidiate node as1
        int size=sc.nextInt();
        int weight[][]=new int[size][size];
        boolean visited[]=new boolean[size];//stores that this node is taken
        //as intermidiate or not
        visited[0]=true;
        String path[]=new String[size];//string array to store paths from 1 to all node
        //setting weight of edges
        Arrays.fill(path, "-");
        for (int i = 0; i < weight.length; i++) {
            Arrays.fill(weight[i],10000001);
        }
        System.out.println("Enter no of edges");
        int noe=sc.nextInt();
        System.out.println("Enter source destination and weight");
        for (int i = 0; i < noe; i++) {
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;
            weight[x][y]=sc.nextInt();
          
        }
      
        //setting path
        for (int i = 0; i < size; i++) {
           if(weight[0][i]<10000001)
            path[i]="1->"+(i+1);
        }
        //showig created array
        showarr(weight);
        showpath(path);
        //applying dijektras
            
        for(int k=0;k<size;k++){
        //geting index of largest weight from 1    
            for (int i = 0; i < size; i++) {
                if(weight[0][i]>weight[0][maxindex])
                    maxindex=i;
        }
                //getting the next intermidiate node
            way=maxindex;
            for (int i = 0; i < size; i++) {
                if(visited[i])
                    continue;
            if(weight[0][i]<weight[0][way])
                way=i;
            
        }
            visited[way]=true;
            //cheking old weight vs new wight
            for (int j = 0; j <size; j++) {
                if(weight[0][j]>weight[0][way]+weight[way][j]){
                    weight[0][j]=weight[0][way]+weight[way][j];
                    path[j]=path[way]+"->"+(j+1);
                }
            }
        
        }
        //printing final weight and path from 0
        System.out.println("After applying dijekstrass algo");
        for (int i = 0; i < path.length; i++) {
            System.out.print(i+1);
            System.out.print(" "+weight[0][i]);
            System.out.print(" Path:"+path[i]);
            System.out.println("");
        }
    }
  
    
    static void showarr(int arr[][]){
        System.out.print("  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1+" ");
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1+" ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
    }
    
    static void showpath(String s[]){
        System.out.println("Path to all other nodes from first node is currently");
        for (int i = 0; i < s.length; i++) {
            System.out.print(i+1);
            System.out.println(" Path:"+s[i]);
        }
    }
}