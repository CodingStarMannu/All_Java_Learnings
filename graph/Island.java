package graph;

public class Island {
	
	 private static void dfs(int[][] edges, int v1, boolean[] visited, int n) {
	        visited[v1] = true;
	        for (int i = 0; i < n; i++) {
	            if (visited[i] == false && edges[v1][i] == 1) {
	                dfs(edges, i, visited, n);
	            }
	        }
	    }
		public static int numConnected(int[][] edges, int n) {
	        boolean[] visited = new boolean[n];
	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            if (visited[i] == false) {
	                dfs(edges, i, visited, n);
	                count++;
	            }
	        }
	        return count;
		
		}
		
		/* The input to the function numConnected is a two-dimensional integer array edges, representing the adjacency matrix of the graph, and an integer n, representing the number of vertices in the graph.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
