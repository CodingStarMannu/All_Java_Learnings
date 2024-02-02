package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();//vertex
		int e = s.nextInt();//edges

		int adjMatrix[][] = new int[v][v];
		for(int i =0; i<e; i++){
			int sv = s.nextInt();
			int ev = s.nextInt();
			adjMatrix[sv][ev] =1;
			adjMatrix[ev][sv]=1;
		}

		int source = s.nextInt();
        int dest = s.nextInt();
		boolean visited[]= new boolean[v];

		ArrayList<Integer> ans = getPathDFS(adjMatrix,visited,source,dest);

		if(ans!=null){
			for(int element : ans){
				System.out.print(element + " ");
			}
		}
	}

	public static ArrayList<Integer>getPathDFS(int adjMatrix[][],boolean visited[], int source,int dest){
		if(source == dest){

			ArrayList<Integer> ans = new ArrayList<>();
			visited[source] = true;
			ans.add(source);
			return ans;

		}
		
		visited[source]= true;
		for(int i =0; i<adjMatrix.length;i++){
			if(adjMatrix[source][i]==1 && !visited[i]){
				ArrayList<Integer> arr = getPathDFS(adjMatrix, visited, i, dest);
				if(arr != null){
					arr.add(source);
					return arr;
				}
			}
		}
		return null;
	}

}
