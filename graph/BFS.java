package graph;



	import java.util.LinkedList;
	import java.util.Queue;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;
	import java.util.*;

	
	public class BFS {	
	public static void bfTraversal(int adjMatrix[][], int s, boolean visited[]){

			Queue<Integer>pendingVertices = new LinkedList<>();
			//boolean visited[]= new boolean[adjMatrix.length];
			visited[s] = true;
			pendingVertices.add(s);

			while(!pendingVertices.isEmpty()){
				int currentVertex = pendingVertices.poll();
				System.out.print(currentVertex+ " ");

				for(int i =0; i<adjMatrix.length;i++){
					if(adjMatrix[currentVertex][i] ==1 && !visited[i]){
						pendingVertices.add(i);
						visited[i]= true;
					}
				}
			}
		}

		public static void print(int adjMatrix[][]){
			boolean visited[] = new boolean[adjMatrix.length];
			for(int i =0; i< adjMatrix.length;i++){
				if(!visited[i]){
				bfTraversal(adjMatrix,i,visited);
			}

			}
		
		}

		public static void main(String[] args) throws NumberFormatException, IOException {
	        
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int e = s.nextInt();
			int adjMatrix[][] = new int [n][n];
			
			for(int i =0; i<e;i++){
				int v1 = s.nextInt();
				int v2 = s.nextInt();
				adjMatrix[v1][v2] =1;
				adjMatrix[v2][v1] =1;
			}

			print(adjMatrix);

	       
		}

	


}
