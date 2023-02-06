package Grafos;

import java.util.Scanner;

public class GraphList {

    Scanner sc = new Scanner(System.in);
    private int firstNumber;
    private int secondNumber;
    public void createListOfNodes(){
        System.out.print("The number of vertices are: ");
        int numVertices = sc.nextInt();
        System.out.print("The number of relations are: ");
        int numRelations = sc.nextInt();
        for (int i = 0; i < numVertices; i++) {
            LinkedList newNode = new LinkedList();
            newNode.addNode(i+1 , i);
            System.out.println(newNode);
            connectRelations(numRelations);
            if (firstNumber == newNode.getData()){
                newNode.addNode(secondNumber,i+1);
            }

        }
    }

    public void connectRelations(int numRelation){
        while (numRelation>0){
            System.out.print("The number: ");
            firstNumber = sc.nextInt();
            System.out.print("relates with: ");
            secondNumber = sc.nextInt();
            numRelation--;
        }
    }

    public static void main(String[] args) {
        GraphList graphList = new GraphList();
        graphList.createListOfNodes();

    }
}
