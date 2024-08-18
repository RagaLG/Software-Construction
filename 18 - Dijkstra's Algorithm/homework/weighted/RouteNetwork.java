/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW18
The purpose of this assignment is to help us understand Dijkstra's algorithm and implement it.
*/
package homework.weighted;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RouteNetwork {

    private final WeightedAdjacencyGraph<String> airportGraph;
    /**
     * Constructs a RouteNetwork instance with the given weighted adjacency graph of airports.
     *
     * This constructor initializes a RouteNetwork object with a provided WeightedAdjacencyGraph
     * representing the network of airports and their connections.
     *
     * @param airportGraph The weighted adjacency graph representing the network of airports.
     */
    public RouteNetwork(WeightedAdjacencyGraph<String> airportGraph) {
        this.airportGraph = airportGraph;
    }
    /**
     * The main method to run the airport route network application.
     * 
     * This method initializes a weighted adjacency graph representing the network of airports,
     * adds airports, connects them with weights, prompts the user to enter source and destination
     * airport codes, calculates and prints the lowest cost path between the two airports using
     * Dijkstra's Algorithm, and displays the total cost in dollars.
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Create a graph to represent the network of airports
        WeightedAdjacencyGraph<String> airportGraph = new WeightedAdjacencyGraph<>();
        RouteNetwork routeNetwork = new RouteNetwork(airportGraph);

        // Adding airports
        routeNetwork.airportGraph.addValue("DCA");
        routeNetwork.airportGraph.addValue("ROC");
        routeNetwork.airportGraph.addValue("ORD");
        routeNetwork.airportGraph.addValue("ATL");
        routeNetwork.airportGraph.addValue("MCO");
        routeNetwork.airportGraph.addValue("PDX");
        routeNetwork.airportGraph.addValue("SFO");
        routeNetwork.airportGraph.addValue("LAX");

        // Connecting airports with weights
        routeNetwork.connectUndirected("ROC", "DCA", 10); 
        routeNetwork.connectUndirected("ROC", "ORD", 15);
        routeNetwork.connectUndirected("ROC", "ATL", 22);
        routeNetwork.connectUndirected("ROC", "MCO", 24);
        routeNetwork.connectUndirected("ORD", "PDX", 26);
        routeNetwork.connectUndirected("ORD", "SFO", 37);
        routeNetwork.connectUndirected("ORD", "LAX", 35);
        routeNetwork.connectUndirected("DCA", "SFO", 25);
        routeNetwork.connectUndirected("DCA", "LAX", 36);
        routeNetwork.connectUndirected("ATL", "LAX", 31);
        routeNetwork.connectUndirected("MCO", "LAX", 31);
        routeNetwork.connectUndirected("LAX", "SFO", 10);
        routeNetwork.connectUndirected("LAX", "PDX", 21);

        // Prompt the user to enter two airport codes
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the source airport code: ");
        String sourceAirport = scanner.next().toUpperCase();  // Assume airport codes are in uppercase
        System.out.print("Enter the destination airport code: ");
        String destinationAirport = scanner.next().toUpperCase();

        // Print the lowest cost path between the two airports using Dijkstra's Algorithm
        List<String> shortestPath = airportGraph.dijkstrasShortestPath(sourceAirport, destinationAirport);
        int totalCost = routeNetwork.calculateTotalCost(shortestPath) * 10;
        //printShortestPath(shortestPath);
        if (shortestPath == null) {
            System.out.println("No path found.");
        } else {
            // Print the lowest cost path
            System.out.print("Shortest path: ");
            for (int i = 0; i < shortestPath.size(); i++) {
                System.out.print(shortestPath.get(i));
                if (i < shortestPath.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println(", " + totalCost + " dollars.");
        }
    }
    /**
     * Connects two airports in both directions with the given weight.
     * @param airport1 The first airport to connect.
     * @param airport2 The second airport to connect.
     * @param weight The weight of the connection between the two airports.
     */
    private void connectUndirected(String airport1, String airport2, int weight) {
        // Connect two airports in both directions
        airportGraph.connect(airport1, airport2, weight);
        airportGraph.connect(airport2, airport1, weight);
    }
    /**
     * Calculates the total cost of the given path.
     * @param path The path for which to calculate the total cost.
     * @return The total cost of the given path.
     */
    private int calculateTotalCost(List<String> path) {
        int totalCost = 0;

        // Get the vertices from the graph
        Map<String, Vertex<String>> vertices = airportGraph.getVertices();

        // Iterate through the vertices in the path
        for (int i = 0; i < path.size() - 1; i++) {
            String fromVertex = path.get(i);
            String toVertex = path.get(i + 1);

            // Get the edge between the current vertex and the next vertex
            Set<Edge<String>> edges = vertices.get(fromVertex).getEdges();
            for (Edge<String> edge : edges) {
                if (edge.getTo().getValue().equals(toVertex)) {
                    // Add the weight of the edge to the total cost
                    totalCost += edge.getWeight();
                    break;
                }
            }
        }

        return totalCost;
    }

}
// end of class RouteNetwork
