package homework;

public class Main {
    public static void main(String[] args) {
        Graph<String> graph = new AdjacencyGraph<>();
        graph.addValue("A");
        graph.addValue("B");
        graph.addValue("C");
        graph.addValue("D");
        graph.addValue("E");
        graph.addValue("F");
        graph.addValue("G");

        graph.connectDirected("D", "A");
        graph.connectDirected("B", "C");
        graph.connectUndirected("A", "B");
        graph.connectUndirected("C", "D");

        graph.connectDirected("G", "F");
        graph.connectUndirected("E", "F");
        graph.connectUndirected("E", "G");

        System.out.println("Breadth First Search A-C: " + graph.breadthFirstSearch("A", "C"));
        System.out.println("Breadth First Search A-C: " + graph.breadthFirstSearch("A", "G"));
        System.out.println("Breadth First Search A-C: " + graph.breadthFirstPath("A", "C"));
        System.out.println("Breadth First Search A-C: " + graph.breadthFirstPath("A", "G"));
    }
}
