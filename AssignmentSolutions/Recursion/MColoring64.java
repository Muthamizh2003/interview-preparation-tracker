public class MColoring64 {
        public static void main(String[] args) {
            MColoring64 colors=new MColoring64();
            int[][] graph={
                {0,1,1,1},
                {1,0,1,0},
                {1,1,0,1},
                {1,0,1,0}
            };
            int m=3;
            int v=4;
            MColoring64.graphcolor(graph,m,v);
        }
        private static boolean graphcolor(int[][] graph,int m,int v)
        {
            int[] color=new int[v];
            for(int i=0;i<v;i++)
            {
                color[i]=0;
            }
            if(!graphcoloring(graph,m,color,0,v))
            {
                System.out.println("Not found and not existing");
                return false;
            }
            printSolution(color,v);
            return true;
        }
        private static void printSolution(int[] color,int v)
        {
            System.out.println("The solution are as follows");
            for(int i=0;i<v;i++)
            {
                System.out.print(" "+color[i]+" ");
            }
            System.out.println();
        }
        private static boolean isSafe(int v,int[][] graph,int color[],int c)
        {
            for(int i=0;i<v;i++)
            {
                if(graph[v][i]==1&&c==color[i])
                {
                    return false;
                }
            }
            return true;
        }
        private static boolean graphcoloring(int[][] graph, int m, int[] color,int v,int V)
        {
            if(v==V)
            {
                return true;
            }
            for(int i=0;i<=m;i++)
            {
                if(isSafe(v,graph,color,i))
                {
                    color[v]=i;
                    if(graphcoloring(graph, m, color, v+1, V))
                    {
                        return true;
                    }
                    color[v]=0;
                }
            }
            return false;
        }
}
