import java.util.Scanner;

public class ShortestPath {
    public static int nVertex;
    public static int initialVertex;
    public static int finalVertex;
    public static int [][] adjacencyMatrix;

    public static void requestInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de vértices: ");
        nVertex = sc.nextInt();
        System.out.println("Ingrese la matriz de adyacencia:\n" +
                "(Si dos vértices no son adyacentes ingrese un valor grande mucho mayor a cualquier peso de arista, se recomienda ingresar el valor 1073741824)\n");
        readMatrix();
        System.out.print("\nIngrese el vértice inicial: ");
        initialVertex = sc.nextInt();
        System.out.print("Ingrese el vértice final: ");
        finalVertex = sc.nextInt();
        sc.close();
    }

    public static void readMatrix(){
        adjacencyMatrix = new int[nVertex][nVertex];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < nVertex; i++){
            for(int j = 0; j < nVertex; j++){
                adjacencyMatrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void calculateShortestPath(){

    }

    public static void printShortestPath(){

    }

    public static void main(String[] args) {
        requestInput();
        calculateShortestPath();
        printShortestPath();
    }
}
