/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bellman.ford.algoritmo;
import java.util.*; 
import java.lang.*; 
import java.io.*; 
/**
 *
 * @author alejo
 */
public class BellmanFordAlgoritmo {

    /**
     * @param args the command line arguments
     */
    //clase para representar un grafo directo , conexo y con peso
static class Graph { 
    // clase para representar una arista con peso
    class Edge { 
        int src, dest, weight; 
        Edge() 
        { 
            src = dest = weight = 0; 
        } 
    }; 
  
    int V, E; 
    Edge edge[]; 
  
    // crea un grafo con e aristas y v vertices
    Graph(int v, int e) 
    { 
        V = v; 
        E = e; 
        edge = new Edge[e]; 
        for (int i = 0; i < e; ++i) 
            edge[i] = new Edge(); 
    } 
    
    //algoritmo BellmanFord para hallar el camino mas corto. Versión no optimizada para grafos con ciclos negativos, cuyo coste de tiempo es O(VE).
    void BellmanFord(Graph graph, int src) 
    { 
        int V = graph.V, E = graph.E; 
        int dist[] = new int[V]; 
  
        // inicializamos el grafo. Ponemos distancias a INFINITO menos el nodo origen que 
        // tiene distancia 0
        for (int i = 0; i < V; ++i) 
            dist[i] = Integer.MAX_VALUE; 
        dist[src] = 0; 
        
        // relajamos cada arista del grafo tantas veces como número de nodos -1 haya en el grafo
        for (int i = 1; i < V; ++i) { 
            for (int j = 0; j < E; ++j) { 
                int u = graph.edge[j].src; 
                int v = graph.edge[j].dest; 
                int weight = graph.edge[j].weight; 
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) 
                    dist[v] = dist[u] + weight; 
            } 
        } 
  
        // comprobamos si hay ciclos negativo 
        for (int j = 0; j < E; ++j) { 
            int u = graph.edge[j].src; 
            int v = graph.edge[j].dest; 
            int weight = graph.edge[j].weight; 
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) { 
                System.out.println("Hay ciclo negativo"); 
                return; 
            } 
        } 
        printArr(dist, V); 
    } 
  
    // A utility function used to print the solution 
    void printArr(int dist[], int V) 
    { 
        System.out.println("distancia del vertice al origen del grafo"); 
        for (int i = 0; i < V; ++i) 
            System.out.println(i + "\t\t" + dist[i]); 
    } 
}
  
    // Driver method to test above function 
    public static void main(String[] args) 
    { 
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("ingrese numero de vertices");
        int V = scan.nextInt(); // Number of vertices in graph 
        System.out.println("ingrese numero de aristas");
        int E = scan.nextInt(); // Number of edges in graph 
  
        Graph graph; 
    graph = new Graph(V, E);
        for (int i=0;i<E;i++)
        {   
            System.out.println("arista "+i);
            System.out.println("ingrese vertice de origen");
            graph.edge[i].src = scan.nextInt(); 
            System.out.println("ingrese vertice de destino");
            graph.edge[i].dest = scan.nextInt();
            System.out.println("ingrese peso de la arista");
            graph.edge[i].weight = scan.nextInt(); 
        }
        System.out.println("ingrese vertice de origen del grafo");
        int src=scan.nextInt();
        graph.BellmanFord(graph, src); 
    } 
    
}
