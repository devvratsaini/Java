import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

class Edge {
    int v1, v2, weight;
    public Edge() {
        this.v1 = 0;
        this.v2 = 0;
        this.weight = 0;
    }
    public Edge(int v1, int v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }
}

public class Kruskals {
    public void findMST() {

    }

    public static void main(String[] args) {
        ArrayList<Edge> edges = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices: ");
        int V = sc.nextInt();
        System.out.println("Enter the number of edges: ");
        int E = sc.nextInt();

        System.out.println("Enter the edges, one by one:");
        for (int i = 0; i < E; i++) {
            System.out.println("Enter values in the syntax: <vertex1> <vertex2> <weight>");
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            edges.add(new Edge(v1, v2, weight));
        }
    }
}
