import java.util.Scanner;

class ShortestPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); sc.nextLine();

        for(int i = 0; i < s; i++){
            int n = sc.nextInt(); sc.nextLine();
            int[][] cities = new int[n][n];
            String[] nameOfCities = new String[n];
            for (int j = 0; j < n; j++){
                nameOfCities[j] = sc.nextLine();
                int p = sc.nextInt(); sc.nextLine();
                for (int k = 0; k < p; k++){
                    int neighbor = sc.nextInt();
                    int price = sc.nextInt(); sc.nextLine();
                    cities[j][neighbor - 1] = price;
                    cities[neighbor-1][j] = price;
                }
            }
            int r = sc.nextInt(); sc.nextLine();
            for (int l = 0; l < r; l++){
              int indiceorigen = 0, indicedestino = 0;
                String origen = sc.next();
                String destino = sc.next(); sc.nextLine();
                for (int m = 0; m < nameOfCities.length; m++){
                    if (nameOfCities[m].equals(origen)){
                        indiceorigen = m;
                    }
                    if (nameOfCities[m].equals(destino)){
                        indicedestino = m;
                    }
                }
                int resultado = dijkstra(cities, indiceorigen)[indicedestino];
                System.out.println(resultado);
            }
        }
    }

    private static int minDistance(int[] distancias, boolean[] sptSet) {
      final int n = distancias.length;
      int min = Integer.MAX_VALUE, min_index = -1;
      for (int v = 0; v < n; v++)
        if (sptSet[v] == false && distancias[v] <= min) {
          min = distancias[v];
          min_index = v;
        }
      return min_index;
    }

    private static int[] dijkstra(int grafo[][], int src) {
      final int n = grafo.length;
      int distancias[] = new int[n];
      boolean sptSet[] = new boolean[n];
      for (int i = 0; i < n; i++)
        distancias[i] = Integer.MAX_VALUE;
      distancias[src] = 0;

      for (int count = 0; count < n - 1; count++) {
        int u = minDistance(distancias, sptSet);
        sptSet[u] = true;
        for (int v = 0; v < n; v++)
          if (!sptSet[v] && grafo[u][v] != 0 && distancias[u] != Integer.MAX_VALUE && distancias[u] + grafo[u][v] < distancias[v])
            distancias[v] = distancias[u] + grafo[u][v];
      }
      return distancias;
    }

}
