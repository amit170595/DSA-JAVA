
class Node4 {
    int data;
    boolean visited;

    Node4(int data) {
        this.data = data;
        visited = false;
    }
}

class Graph {
    private Node4[] nodeList;
    private int adjMatrix[][];
    private int numberNode;
    private Queueclass queue;

    Graph(int size) {
        int MAX_Nodes = size;
        nodeList = new Node4[MAX_Nodes];
        adjMatrix = new int[MAX_Nodes][MAX_Nodes];
        numberNode = 0;
        queue = new Queueclass(MAX_Nodes);
    }

    void addNode(int element) {
        nodeList[numberNode++] = new Node4(element);
    }

    void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    private void printNode(int i) {
        System.out.println(nodeList[i].data);
    }

    private int getAdjUnvisitedNode(int node) {
        for (int j = 0; j < numberNode; j++) {
            if (adjMatrix[node][j] == 1 && nodeList[j].visited == false) {
                return j;
            }
        }
        return -1;
    }

    void BFS() {
        nodeList[0].visited = true;
        printNode(0);
        int node1;
        while (!queue.isEmpty()) {
            int node2 = queue.Dequeue();
            while ((node1 = getAdjUnvisitedNode(node2)) != -1) {
                nodeList[node1].visited = true;
                printNode(node1);
                queue.Enqueue(node1);
            }
        }
    }

    void DFS(int n) {
        nodeList[n].visited = true;
        printNode(n);
        int node1;
        while ((node1 = getAdjUnvisitedNode(n)) != -1) {
            DFS(node1);
        }
    }
}

public class GraphMain {
    public static void main(String[] args) {
        Graph g = new Graph(8);
        g.addNode(50);
        g.addNode(10);
        g.addNode(200);
        g.addNode(20);
        g.addNode(15);
        g.addNode(30);
        g.addNode(5);
        g.addNode(300);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 4);
        g.addEdge(1, 5);
        g.addEdge(2, 3);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.addEdge(5, 7);
        System.out.println("Visited Nodes are: ");
        g.DFS(0);
        System.out.println("Visited Nodes are: ");
        g.BFS();

    }
}
