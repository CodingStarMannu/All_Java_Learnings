package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graphs {
	
	
	// Depth First Traversal
	public static void depthFirstTraversalHelper( int adjMatrix[][], int currentVertex, boolean visited[]) {
		
		visited[currentVertex] = true;
		System.out.print(currentVertex + " ");
		for(int i =0; i< adjMatrix.length;i++) {
			if(adjMatrix[currentVertex][i] ==1 && visited[i] == false) {
				//i is neighbor of currentVertex
				depthFirstTraversalHelper(adjMatrix,i, visited);
			}
		}
	}
	
	public static void depthFirstTraversal(int adjMatrix[][]) {
		boolean visited[]= new boolean[adjMatrix.length];
		for(int i=0; i<adjMatrix.length;i++) {
			if(!visited[i]) {
				depthFirstTraversalHelper(adjMatrix, i, visited);
				System.out.println();
			}
			
		}
		
	}

	
	// Breadth First Traversal
	
	public static void bfTraversal(int adjMatrix[][]) {
		
		Queue<Integer>pendingVertices = new LinkedList<>();
		boolean visited[] = new boolean[adjMatrix.length];
		visited[0]= true;
		pendingVertices.add(0);
		
		while(!pendingVertices.isEmpty()) {
			int currentVertex = pendingVertices.poll();
			System.out.print(currentVertex+ " ");
			
			for(int i =0; i< adjMatrix.length; i++) {
				if(adjMatrix[currentVertex][i] ==1 && !visited[i]) {
					//i is unvisited neighbor of currentVertex
					pendingVertices.add(i);
					visited[i]= true;
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();//number of vertices
		int e = s.nextInt();// number of edges
		int adjMatrix[][]= new int [n][n];
		for(int i =0 ; i < e; i++) {
			int v1 = s.nextInt();//first vertex of the edge
			int v2 = s.nextInt();// second vertex of the edge
			adjMatrix [v1][v2] = 1;
			adjMatrix [v2][v1] = 1;
		}
		//printing the matrix
//		for(int i =0; i< n; i++) {
//			for(int j =0; j < n; j++) {
//				System.out.print(adjMatrix[i][j] +" ");
//			}
//			System.out.println();
//		}
		depthFirstTraversal(adjMatrix);
//		bfTraversal(adjMatrix);
		

	}

}
