import java.util.Scanner;

public class Dijkstras {

    public void printSolution(int[] dist) {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    public int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public void dijkstra(int[][] adjMat, int src) {
        int N = adjMat.length;
        int[] dist = new int[N];
        boolean[] visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        dist[src] = 0;

        for (int i = 0; i < N - 1; i++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < N; v++) {
                if (!visited[v] && adjMat[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + adjMat[u][v] < dist[v]) {
                    dist[v] = dist[u] + adjMat[u][v];
                }
            }
        }

        printSolution(dist);
    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the number of nodes: ");
//        int N = sc.nextInt();
//        int[][] adjMat = new int[N][N];
//        System.out.println("Enter the adjacency matrix: ");
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                adjMat[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Enter source vertex: ");
//        int src = sc.nextInt();
//        Dijkstras d = new Dijkstras();
//        d.dijkstra(adjMat, src);

        int[][] adjMat = {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        Dijkstras d = new Dijkstras();
        d.dijkstra(adjMat, 0);
    }
}
