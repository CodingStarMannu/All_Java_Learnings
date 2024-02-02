package graph;

import java.util.*;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
	int vertex1;
	int vertex2;
	int weight;
	
	Edge(int vertex1, int vertex2, int weight){
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
		this.weight = weight;
		
	}

	@Override
	public int compareTo(Edge o) {
		
		return this.weight - o.weight;
	}
	
	}
	
public class KruskalsAlgorithm {
	
	private static int findParent(int v, int parent[]) {
		if(v == parent[v]) {
			return v;
		}
		return findParent(parent[v],parent);
		
	}
	
	public static Edge[] kruskalAlgorithm(Edge[] edges, int n) {
		
		Arrays.sort(edges);
		Edge mst[] = new Edge[n-1];
		int parent[] = new int[n];
		for(int j=0; j< n; j++) {
			parent[j]= j;
		}
		
		int count =0, i =0;
		while(count != n-1) {
			Edge currentEdge = edges[i++];
			int vertex1Parent = findParent(currentEdge.vertex1, parent);
			int vertex2Parent = findParent(currentEdge.vertex2, parent);
			
			if(vertex1Parent != vertex2Parent) {
				//Including currentEdge
				mst[count] = currentEdge;
				count++;
				parent[vertex1Parent] = vertex2Parent;
			}
			
		}
		return mst;
	}
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		
		Edge edges[] = new Edge[e];
		for(int i=0;i<e;i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int weight = s.nextInt();
			Edge edge = new Edge(v1,v2, weight);
			edges[i] = edge;
		}
		Edge mst[] = kruskalAlgorithm(edges,n);
		for(int i = 0; i< mst.length;i++) {
			if(mst[i].vertex1 < mst[i].vertex2) {
				System.out.println(mst[i].vertex1 + " " + mst[i].vertex2 + " " + mst[i].weight);
			}else {
				System.out.println(mst[i].vertex2 + " " + mst[i].vertex1 + " " + mst[i].weight);
			}
		}

	}

	

}
