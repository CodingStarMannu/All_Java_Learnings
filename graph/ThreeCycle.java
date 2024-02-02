package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ThreeCycle {
	
	   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    public static int solve(boolean[][] graph, int n) {
	        int count = 0;

	        // Check for all possible 3-cycles in the graph
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                for (int k = 0; k < n; k++) {
	                    if (graph[i][j] && graph[j][k] && graph[k][i]) {
	                        count++;
	                    }
	                }
	            }
	        }
	        return count / 6; // Each cycle is counted 6 times, so divide by 6 to get the distinct count
	    }

	    public static boolean[][] takeInput() throws IOException {
	        String[] strNums;
	        strNums = br.readLine().split("\\s");
	        int n = Integer.parseInt(strNums[0]);
	        int m = Integer.parseInt(strNums[1]);

	        boolean[][] graphs = new boolean[n][n];
	        int firstvertex, secondvertex;

	        for (int i = 0; i < m; i++) {
	            String[] strNums1;
	            strNums1 = br.readLine().split("\\s");
	            firstvertex = Integer.parseInt(strNums1[0]);
	            secondvertex = Integer.parseInt(strNums1[1]);
	            graphs[firstvertex][secondvertex] = true;
	            graphs[secondvertex][firstvertex] = true;
	        }
	        return graphs;
	    }

	    public static void main(String[] args) throws NumberFormatException, IOException {
	        boolean[][] graphs = takeInput();

	        int ans = solve(graphs, graphs.length);
	        System.out.println(ans);
	    }
	}

	/*Here, we first check for all possible 3-cycles in the graph using three nested loops. 
	We check if there is an edge between i and j, j and k, and k and i. If all three edges exist, 
	we count it as a 3-cycle. Finally, we divide the count by 6 to get the distinct count because
	each cycle is counted 6 times (in both directions and starting from each vertex), so we need 
	 to divide by 6 to get the distinct count.*/

