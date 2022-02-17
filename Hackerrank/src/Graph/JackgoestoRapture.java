package Graph;
import java.util.Arrays;
import java.util.Scanner;

public class JackgoestoRapture {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int way;
        int maxindex=0;//setting initial intermidiate node as1
        int size=sc.nextInt();
        int weight[][]=new int[size][size];
        boolean visited[]=new boolean[size];//stores that this node is taken
        //as intermidiate or not
        visited[0]=true;
        //setting weight of edges
        for (int i = 0; i < weight.length; i++) {
            Arrays.fill(weight[i],10000001);
        }
        int noe=sc.nextInt();
        for (int i = 0; i < noe; i++) {
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;
            weight[x][y]=sc.nextInt();
          
        }
            
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
                if(weight[0][j]>weight[0][way]+pos(weight[way][j])-weight[0][way] ){
                    weight[0][j]=weight[0][way]+pos(weight[way][j]-weight[0][way]);
                }
            }
        
        }
        System.out.println(weight[0][size-1]);
    }
  static int pos(int x){
  if(x>0)
      return x;
  else 
      return 0;
  }
} 

