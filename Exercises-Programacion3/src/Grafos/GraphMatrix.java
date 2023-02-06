package Grafos;

import java.util.Scanner;

public class GraphMatrix {
    Scanner sc = new Scanner(System.in);
    private int sizeMatrix = sc.nextInt();
    int [][] graph = new int[sizeMatrix][sizeMatrix];

    public int [][] fill(){
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = 0;
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        return graph;
    }

    public void fillWithOne(){
        int relations = sc.nextInt();
        while (relations>0){
            System.out.print("The number: ");
            int firstNumber = sc.nextInt();
            System.out.print("relates with: ");
            int secondNumber = sc.nextInt();

            graph[firstNumber-1][secondNumber-1] = 1;

            relations--;
        }
    }

    public void printMatrix(){
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("number of vertices: ");
        GraphMatrix graphMatrix = new GraphMatrix();
        graphMatrix.fill();
        System.out.print("the number of relations are: ");
        graphMatrix.fillWithOne();
        System.out.println("The matrix is: ");
        graphMatrix.printMatrix();
    }
}
