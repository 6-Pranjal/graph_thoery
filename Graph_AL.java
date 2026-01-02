import java.util.*;

public class Graph_AL {

    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V]; // null arraylist
        // list[arrylist=[(x,x,x) ,(y,y,y)] , arraylist[] , arraylist , arraylist]

        // graph=[
        // [(0,1,5)],
        // [(1,0,5),(1,2,1),(1,3,3)],
        // [(2,1,1),(2,3,1),(2,4,2)],
        // [(3,1,3),(3,2,1)],
        // [(4,2,2)]
        // ]

        /*
         * 
         * Graph Structure:
         * 
         * 0
         * |
         * (5)
         * |
         * 1
         * / \
         * (1) (3)
         * / \
         * 2 --(1)-- 3
         * |
         * (2)
         * |
         * 4
         * 
         */

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>(); // initializing each arraylist
        }

        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        graph[4].add(new Edge(4, 2, 2));

        // neighbors of 2
        for (int i = 0; i < graph[1].size(); i++) {
            Edge e = graph[1].get(i);
            System.out.println(e.dest);

        }

    }
}