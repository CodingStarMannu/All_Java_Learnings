package graph;

public class LargestPiece {

	
	   static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	    public static int dfs(String[] edge, int n) {
	        char[][] graph = new char[n][n];
	        boolean[][] visited = new boolean[n][n];
	        int count = 0;
	        
	        for (int i = 0; i < n; i++) {
	            graph[i] = edge[i].toCharArray();
	        }

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (graph[i][j] == '1' && !visited[i][j]) {
	                    count = Math.max(count, dfsUtil(graph, visited, i, j));
	                }
	            }
	        }
	        
	        return count;
	    }
	    
	    public static int dfsUtil(char[][] graph, boolean[][] visited, int i, int j) {
	        if (i < 0 || i >= graph.length || j < 0 || j >= graph[0].length || visited[i][j] || graph[i][j] == '0') {
	            return 0;
	        }
	        visited[i][j] = true;
	        int count = 1;
	        for (int[] d : dir) {
	            int ni = i + d[0];
	            int nj = j + d[1];
	            count += dfsUtil(graph, visited, ni, nj);
	        }
	        return count;
	    }

	/*In this code, we first convert the input String array into a 2D character array graph. We then use DFS to traverse the graph and 
	count the number of '1's in each connected component. 
	We keep track of the visited cells in a boolean array, and we
	 only visit cells that contain '1's and have not been visited before. 
	 We also use a separate dfsUtil function to perform the DFS traversal,
	  which takes the graph, visited array, and the current cell's coordinates as parameters.
	   We check if the current cell is out of bounds, already visited, or contains a '0', and if so, 
	   we return 0. Otherwise, we mark the current cell as visited, increment the count, 
	   and recursively call the dfsUtil function for all four adjacent cells. Finally, we return the 
	   count of '1's in the connected component.*/
	    
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
