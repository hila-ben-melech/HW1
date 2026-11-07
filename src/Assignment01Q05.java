public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }
        int[] dist = new int[m.length];
        for (int k = 0; k < m.length; k++) {
            dist[k] = -1;
        }
        
        int[] queue = new int[m.length];
        int head = 0;
        int tail = 0;

        queue[tail] = i;
        tail++;
        dist[i] = 0;

        while(head < tail){
            int curr = queue[head];
            head++;

            for (int v = 0; v < m.length; v++) {
                if (m[curr][v] == 1 && dist[v] == -1) {
                    dist[v] = dist[curr] + 1;
                    if (v==j) {
                        return dist[v];
                    }
                    queue[tail] = v;
                    tail++;
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