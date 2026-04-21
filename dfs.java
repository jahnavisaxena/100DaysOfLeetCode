import java.util.*;
public class DFS {
    static void dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean visited[]){
        visited[node]=true;
        System.out.println(node+" ,");

        for(int neighbour: adj.get(node)){
            if(!visited[neighbour]){
                dfs(adj,neighbour,visited);
            }
        }

    }
}
