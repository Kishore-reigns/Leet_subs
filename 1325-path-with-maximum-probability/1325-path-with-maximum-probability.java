import java.util.*;

class Pair {
    double distance; 
    int node;        

    public Pair(double distance, int node) {
        this.distance = distance;
        this.node = node;
    }
}

class Solution {
    public double maxProbability(int n, int[][] edges, double[] succ, int start, int end) {

        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

      
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0], v = edges[i][1];
            graph.get(u).add(new Pair(succ[i], v));
            graph.get(v).add(new Pair(succ[i], u)); 
        }

 
        double[] dist = new double[n];
        Arrays.fill(dist, 0.0);
        dist[start] = 1.0;

        PriorityQueue<Pair> queue = new PriorityQueue<>((x, y) -> Double.compare(y.distance, x.distance));
        queue.offer(new Pair(1.0, start));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            double currentProb = current.distance;
            int currentNode = current.node;

           
            if (currentProb < dist[currentNode]) {
                continue;
            }

         
            for (Pair neighbor : graph.get(currentNode)) {
                double newProb = currentProb * neighbor.distance;
                if (newProb > dist[neighbor.node]) {
                    dist[neighbor.node] = newProb;
                    queue.offer(new Pair(newProb, neighbor.node));
                }
            }
        }

    
        return dist[end];
    }
}
