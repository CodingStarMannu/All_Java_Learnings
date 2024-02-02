package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GetPathBFS {
	
	public static ArrayList<Integer> getPathBFS(int adjMatrix[][],int s, int e){
		
		Queue<Integer> pendingVertices = new LinkedList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		boolean visited[]= new boolean[adjMatrix.length];
		visited[s] = true;
		pendingVertices.add(s);
		map.put(s,-1);// parent of source is -1
		boolean pathFound = false;
		
		while(!pendingVertices.isEmpty()) {
			int currentVertex = pendingVertices.poll();
			for(int i =0; i < adjMatrix.length;i++) {// traversing to the all the neighbor of currentVertex 
				if(adjMatrix[currentVertex][i] ==1 && !visited[i]) {
					pendingVertices.add(i);
					visited[i] = true;
					map.put(i, currentVertex);// parent of ith vertex is currentVertex
					if(i == e) {// i is equal to destination vertex
						//Path found
						pathFound = true;
						break;
					}
				}
			}
		}
		if(pathFound) {
			ArrayList<Integer>path = new ArrayList<>();
			int endVertex = e;
			while(endVertex != -1) {
			path.add(endVertex);
			int parent = map.get(endVertex);
			endVertex = parent;
			}
			return path;
		}else {
			return null;
		}
	}

	public static void main(String[] args) {
		
		 Scanner s = new Scanner (System.in);
		 int n = s.nextInt();
		 int e =s.nextInt();
		 int adjMatrix[][] = new int[n][n];
		 for(int i =0; i< e; i++){
			 int sv = s.nextInt();
			 int ev = s.nextInt();
			 adjMatrix[sv][ev] =1;
			 adjMatrix[ev][sv] = 1;	 
		 }
		 int source = s.nextInt();
		 int destination = s.nextInt();
		 ArrayList<Integer> ansPath = getPathBFS(adjMatrix, source, destination);
		 if(ansPath != null){
			for(Integer i : ansPath){
			 System.out.print(i+" ");
		 	}	
		}

	}

}
