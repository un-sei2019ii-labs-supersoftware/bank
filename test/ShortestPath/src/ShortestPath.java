import java.util.Scanner;

public class ShortestPath {
    public static int nVertex;
    public static int initialVertex;
    public static int finalVertex;
    public static int [][] adjacencyMatrix;
    public static int [][] pathMatrix;
    public static int [] orderedColumns;

    public static void requestInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de vértices: ");
        nVertex = sc.nextInt();
        System.out.println("Ingrese la matriz de adyacencia:\n" +
                "(Si dos vértices no son adyacentes se debe ingresar un valor mucho mayor a cualquier peso de arista. Ingrese el valor 1073741824 en su lugar)\n");
        readMatrix();
        System.out.print("\n\nIngrese el vértice inicial: ");
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
        pathMatrix = new int [nVertex][nVertex];
        orderedColumns = new int [nVertex];
        orderedColumns[0] = initialVertex - 1;

        //anular  elementos de la fila del pivote, cada elemento anulado = -1
        cancelRow(orderedColumns[0]);

         //copiar la columna inicial la cual representa el vértice inicial
        for(int i = 0; i < nVertex; i++){
            pathMatrix[i][orderedColumns[0]] = adjacencyMatrix[i][orderedColumns[0]];
        }

        //hacer los cálculos de las demás columnas
        for(int j = 1; j < nVertex; j++){
            //buscar la  columna que tiene el mismo índice del menor elemento en la columna anterior.
            orderedColumns[j] = findNextColumn(orderedColumns[j-1]);

            //hallar el pivote de la columna actual copiando el elemento de la columna anterior que se encuentra en la misma posicion-fila del pivote actual.
            pathMatrix[orderedColumns[j]][orderedColumns[j]] = pathMatrix[orderedColumns[j]][orderedColumns[j-1]];

            //hacemos los cálculos respectivos para encontrar los elementos de la columna actual
            fillColumn(orderedColumns[j-1], orderedColumns[j]);

            //anular elementos de la fila del pivote, cada elemento anulado = -1
            cancelRow(orderedColumns[j]);

            //Hacemos notable el pivote para no sea utilizado en próximas comparaciones
            pathMatrix[orderedColumns[j]][orderedColumns[j]] = pathMatrix[orderedColumns[j]][orderedColumns[j]] * - 1;
        }
    }

    public static void cancelRow(int i){
        for(int j = 0; j < nVertex; j++){
            if(pathMatrix[i][j] == 0)
                pathMatrix[i][j] = -1;
        }
    }

    public static int findNextColumn(int j){
        int min = 1073741824;
        int nextColumn = -1;
        for(int i = 0; i < nVertex; i++){
            if(pathMatrix[i][j] > 0 && pathMatrix[i][j] < min){
                min = pathMatrix[i][j];
                nextColumn = i;
            }
        }
        return nextColumn;
    }

    public static void fillColumn(int previousColumn, int currentColumn){
        int newWeight;
        int oldWeight;
        for(int i = 0; i < nVertex; i++){
            if(pathMatrix[i][currentColumn] == 0){
                newWeight = pathMatrix[currentColumn][currentColumn] + adjacencyMatrix[i][currentColumn];
                oldWeight = pathMatrix[i][previousColumn];
                if(newWeight < oldWeight)
                    pathMatrix[i][currentColumn] = newWeight;
                else
                    pathMatrix[i][currentColumn] = oldWeight;
            }
        }
    }

    public static void printShortestPath(){

    }

    public static void main(String[] args) {
        requestInput();
        calculateShortestPath();
        printShortestPath();
    }
}
