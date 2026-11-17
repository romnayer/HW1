public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) { 
         int n = m.length; 
         boolean[] visited = new boolean [n];
         int[] distance =  new int [n];
         int[] queue = new int [n];
         int first = 0;
         int last = 0;
         queue[last++] = i;
         visited[i] = true;
         while(first < last) {
            int current = queue[first++];
            if (current == j) {
                return distance[current];
            }
            for (int k = 0; k < n; k++) {
                if (m[current][k] == 1 && !visited[k]) {
                    visited[k] = true;
                    distance[k] = distance[current] + 1;
                    queue[last++] = k;

                } 

                
            }
         }


        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}