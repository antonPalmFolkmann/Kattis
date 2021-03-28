package ADS;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.StdOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Harmony {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] ints = reader.readLine().split(" ");
        int V = Integer.parseInt(ints[0]);
        int E = Integer.parseInt(ints[1]);

        Graph graph = new Graph(V);

        for (int i = 0; i < E; i++) {
            String[] line = reader.readLine().split(" ");
            int u = Integer.parseInt(line[0]);
            int v = Integer.parseInt(line[1]);
            int c = Integer.parseInt(line[2]);
            if (c == 1){
                graph.addEdge(u,v);
            } else {

            }
        }

        Bipartite bipartite = new Bipartite(graph);
        if (bipartite.isBipartite()) {
            StdOut.println(1);
        } else {
            StdOut.println(0);
        }

    }

    public static class Bipartite{
        private boolean[] marked;
        private boolean[] color;
        private boolean isBipartite = true;

        public Bipartite(Graph G){
            marked = new boolean[G.V()];
            color = new boolean[G.V()];
            for (int s = 0; s < G.V(); s++) {
                if (!marked[s]) dfs(G,s);
            }
        }

        private void dfs(Graph G, int v){
            marked[v] = true;
            for (int w : G.adj(v)){
                if (!marked[w]){
                    color[w] = !color[v];
                    dfs(G,w);
                } else if (color[w] == color[v]) isBipartite = false;
            }
        }

        public boolean isBipartite(){
            return isBipartite;
        }
    }

}
