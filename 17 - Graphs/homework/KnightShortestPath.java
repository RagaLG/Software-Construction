/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW17
The purpose of this assignment is to help us understand the concepts of Graphs and BFS, implement BFS and 
use it to solve a problem.
*/
package homework;

import java.util.*;

public class KnightShortestPath {
    /**
     * This program finds the shortest path for a knight to move from one square to another on a chessboard.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows on the chessboard: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns on the chessboard: ");
        int columns = scanner.nextInt();

        Graph<ChessCoordinate> chessGraph = createChessGraph(rows, columns);

        String input;
        scanner.nextLine();

        do {
            System.out.print("Enter <row1> <col1> <row2> <col2> or quit: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                System.exit(0);
            }

            String[] coordinates = input.split(" ");

            if (coordinates.length != 4) {
                System.out.println("Invalid input. Please enter four coordinates.");
                continue;
            }

            int startRow = Integer.parseInt(coordinates[0]);
            int startCol = Integer.parseInt(coordinates[1]);
            int endRow = Integer.parseInt(coordinates[2]);
            int endCol = Integer.parseInt(coordinates[3]);

            ChessCoordinate startCoordinate = new ChessCoordinate(startRow, startCol);
            ChessCoordinate endCoordinate = new ChessCoordinate(endRow, endCol);

            if (!isValidCoordinate(startCoordinate, rows, columns) || !isValidCoordinate(endCoordinate, rows, columns)) {
                //System.out.println("Invalid coordinates. Please enter valid coordinates.");
                System.out.println("No path exists from " + startCoordinate + " to " + endCoordinate);
                displayChessboardWithPath(rows, columns, null);
                continue;
            }

            LinkedList<ChessCoordinate> path = chessGraph.breadthFirstPath(startCoordinate, endCoordinate);

            if (path != null) {
                displayChessboardWithPath(rows, columns, path);
            } else {
                System.out.println("No path exists from " + startCoordinate + " to " + endCoordinate);
                displayChessboardWithPath(rows, columns, null);
            }

        } while (true);
    }
    /**
     * This method creates a graph of all possible moves for a knight on a chessboard.
     * @param rows The number of rows on the chessboard
     * @param columns The number of columns on the chessboard
     * @return A graph of all possible moves for a knight on a chessboard
     */
    private static Graph<ChessCoordinate> createChessGraph(int rows, int columns) {
        Graph<ChessCoordinate> chessGraph = new AdjacencyGraph<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                ChessCoordinate coordinate = new ChessCoordinate(i, j);
                chessGraph.addValue(coordinate);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                addKnightMoves(chessGraph, new ChessCoordinate(i, j), rows, columns);
            }
        }

        return chessGraph;
    }
    /**
     * This method adds all possible moves for a knight on a chessboard to the graph.
     * @param graph The graph to add the moves to
     * @param coordinate The coordinate to add the moves for
     * @param rows The number of rows on the chessboard
     * @param columns The number of columns on the chessboard
     */
    private static void addKnightMoves(Graph<ChessCoordinate> graph, ChessCoordinate coordinate, int rows, int columns) {
        int[] rowMoves = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};

        for (int i = 0; i < rowMoves.length; i++) {
            int newRow = coordinate.getRow() + rowMoves[i];
            int newCol = coordinate.getCol() + colMoves[i];

            ChessCoordinate newCoordinate = new ChessCoordinate(newRow, newCol);

            if (isValidCoordinate(newCoordinate, rows, columns)) {
                graph.connectUndirected(coordinate, newCoordinate);
            }
        }
    }
    /**
     * This method displays a chessboard with a path from the start coordinate to the end coordinate.
     * @param rows The number of rows on the chessboard
     * @param columns The number of columns on the chessboard
     * @param path The path from the start coordinate to the end coordinate
     */
    private static void displayChessboardWithPath(int rows, int columns, LinkedList<ChessCoordinate> path) {
        if (path == null) {
            // No path exists, print an empty chessboard
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("| ");
                }
                System.out.println("|");
            }
        } else {
            // Path exists, print the chessboard with move numbers
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    ChessCoordinate currentCoordinate = new ChessCoordinate(i, j);
    
                    if (currentCoordinate.equals(path.getFirst())) {
                        System.out.print("|S ");
                    } else if (currentCoordinate.equals(path.getLast())) {
                        System.out.print("|E ");
                    } else {
                        int moveNumber = path.indexOf(currentCoordinate);
                        System.out.printf("|%2s", (moveNumber >= 0) ? moveNumber : " ");
                    }
                }
                System.out.println("|");
            }
            System.out.println();
        }
        
    }
    /**
     * This method checks if a coordinate is valid.
     * @param coordinate The coordinate to check
     * @param rows The number of rows on the chessboard
     * @param columns The number of columns on the chessboard
     * @return True if the coordinate is valid, false otherwise
     */
    private static boolean isValidCoordinate(ChessCoordinate coordinate, int rows, int columns) {
        return coordinate.getRow() >= 0 && coordinate.getRow() < rows && coordinate.getCol() >= 0 && coordinate.getCol() < columns;
    }
}
// end of class KnightShortestPath

/**
 * Represents a coordinate on a chessboard with a row and column position.
 */
class ChessCoordinate {
    private final int row;
    private final int col;
    /**
     * Constructs a new ChessCoordinate with the specified row and column.
     * @param row The row position of the chess coordinate.
     * @param col The column position of the chess coordinate.
     */
    public ChessCoordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }
    /**
     * Returns the row position of the chess coordinate.
     * @return The row position of the chess coordinate.
     */
    public int getRow() {
        return row;
    }
    /**
     * Returns the column position of the chess coordinate.
     * @return The column position of the chess coordinate.
     */
    public int getCol() {
        return col;
    }
    /**
     * Returns true if the specified object is equal to this ChessCoordinate.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ChessCoordinate that = (ChessCoordinate) obj;
        return row == that.row && col == that.col;
    }
    /**
     * Generates a hash code for this ChessCoordinate.
     * @return The hash code based on the row and column positions.
     */
    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
    /**
     * Returns a string representation of this ChessCoordinate.
     * @return A string representation in the format "(row, col)".
     */
    @Override
    public String toString() {
        return "(" + row + "," + col + ")";
    }
}
// end of class ChessCoordinate