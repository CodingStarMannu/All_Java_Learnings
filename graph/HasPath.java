package graph;
 import java.util.*;
public class HasPath {

    //function to check if there is a path between two vertices
    public static boolean hasPath(int v, ArrayList<ArrayList<Integer>> adjList, int source, int dest, boolean[] visited) {

        //mark the source vertex as visited
        visited[source] = true;

        //if the source and destination are the same, return true
        if (source == dest) {
            return true;
        }

        //iterate through the adjacent vertices of the source vertex
        for (int i : adjList.get(source)) {
            //if the adjacent vertex is not visited, recursively call the function with the adjacent vertex as the source
            if (!visited[i]) {
                if (hasPath(v, adjList, i, dest, visited)) {
                    return true;
                }
            }
        }

        //if no path is found, return false
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //read the number of vertices and edges
        int v = sc.nextInt();
        int e = sc.nextInt();

        //initialize the adjacency list
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(v);

        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        //read the edges and create the adjacency list
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        //read the source and destination vertices
        int source = sc.nextInt();
        int dest = sc.nextInt();

        //initialize the visited array and call the hasPath function
        boolean[] visited = new boolean[v];
        boolean result = hasPath(v, adjList, source, dest, visited);

        //print the result
        System.out.println(result);
    }
}

