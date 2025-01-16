
import java.util.*;

public class HamiltonianCycle63 {

    public boolean hamCycle(int graph[][]) {
        int N = graph.length;
        int[] path = new int[N];
        
        Arrays.fill(path, -1);
        path[0] = 0;
        
        if (!hamCycleUtil(graph, path, 1)) {
            System.out.println("No Hamiltonian Cycle");
            return false;
        }
        
        printSolution(path);
        return true;
    }

    private boolean hamCycleUtil(int graph[][], int[] path, int pos) {
        int N = graph.length;

        if (pos == N) {
            if (graph[path[pos - 1]][path[0]] == 1) {
                return true;
            }
            return false;
        }

        for (int v = 1; v < N; v++) {
            if (isSafe(v, graph, path, pos)) {
                path[pos] = v;
                if (hamCycleUtil(graph, path, pos + 1)) {
                    return true;
                }
                path[pos] = -1;
            }
        }
        return false;
    }

    private boolean isSafe(int v, int graph[][], int[] path, int pos) {
        if (graph[path[pos - 1]][v] == 0) {
            return false;
        }

        for (int i = 0; i < pos; i++) {
            if (path[i] == v) {
                return false;
            }
        }

        return true;
    }

    private void printSolution(int[] path) {
        System.out.print("Hamiltonian Cycle: ");
        for (int i = 0; i < path.length; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        HamiltonianCycle63 hamiltonian = new HamiltonianCycle63();

        int graph1[][] = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {0, 1, 1, 1, 0},
        };
        hamiltonian.hamCycle(graph1);

        int graph2[][] = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 1},
            {1, 1, 0, 0, 0},
            {0, 1, 1, 0, 0},
        };
        hamiltonian.hamCycle(graph2);
    }
}
