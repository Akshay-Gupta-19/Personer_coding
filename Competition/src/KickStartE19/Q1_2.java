package KickStartE19;

// Simple Java implementation for Kruskal's 
// algorithm 
import java.util.*; 

class GFG 
{ 
 int V; 
 int[] parent; 
 int INF = Integer.MAX_VALUE; 

    public GFG(int V) {
        this.V = V;
        parent=new int[V];
    }

// Find set of vertex i 
 int find(int i) 
{ 
	while (parent[i] != i) 
		i = parent[i]; 
	return i; 
} 

// Does union of i and j. It returns 
// false if i and j are already in same 
// set. 
 void union1(int i, int j) 
{ 
	int a = find(i); 
	int b = find(j); 
	parent[a] = b; 
} 

// Finds MST using Kruskal's algorithm 
 int kruskalMST(int cost[][]) 
{ 
	int mincost = 0; // Cost of min MST. 

	// Initialize sets of disjoint sets. 
	for (int i = 0; i < V; i++) 
		parent[i] = i; 

	// Include minimum weight edges one by one 
	int edge_count = 0; 
	while (edge_count < V - 1) 
	{ 
		int min = INF, a = -1, b = -1; 
		for (int i = 0; i < V; i++) 
		{ 
			for (int j = 0; j < V; j++) 
			{ 
				if (find(i) != find(j) && cost[i][j] < min) 
				{ 
					min = cost[i][j]; 
					a = i; 
					b = j; 
				} 
			} 
		} 

		union1(a, b); 
		//System.out.printf("Edge %d:(%d, %d) cost:%d \n", 
		//	edge_count++, a, b, min); 
		mincost += min; 
	} 
        return mincost;
} 

// Driver code 
public static void main(String[] args) 
{ 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for (int i = 1; i <= t; i++) {
        int n=sc.nextInt();
        int m=sc.nextInt();
        GFG s=new GFG(n);
        int cost[][]=new int[n][n];
        for (int j = 0; j < cost.length; j++) {
            Arrays.fill(cost[j], 2);
        }
        for (int j = 0; j < m; j++) {
            int a=sc.nextInt()-1,b=sc.nextInt()-1;
            cost[a][b]=1;
            cost[b][a]=1;
        }
        int ans=s.kruskalMST(cost); 
        System.out.println(ans);
    }
}
} 

