import java.util.*;
import java.util.LinkedList;
public class bfs {
    public bfs(ArrayList<ArrayList<Integer>> adj , int start){

        boolean visited[] = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        q.add(start);
        visited[start]=true;

        while(!q.isEmpty()){
            int node =q.poll();
            ans.add(node);

            for(int neighbour : adj.get(node)){
                if(!visited[neighbour]){
                    q.add(neighbour);
                    visited[neighbour]=true;

                }
            }
        }
    }

        
        
    }

}
