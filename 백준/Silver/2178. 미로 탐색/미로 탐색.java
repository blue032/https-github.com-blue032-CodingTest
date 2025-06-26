import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] maze, dist;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        dist = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++)
                maze[i][j] = line.charAt(j) - '0';
        }

        bfs(0, 0);
        System.out.println(dist[N-1][M-1]);
    }

    static void bfs(int sx, int sy) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sx, sy});
        visited[sx][sy] = true;
        dist[sx][sy] = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d], ny = y + dy[d];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (!visited[nx][ny] && maze[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    dist[nx][ny] = dist[x][y] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }
}
