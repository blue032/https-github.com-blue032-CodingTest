import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[F + 1];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{S, 0});
        visited[S] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int floor = cur[0], cnt = cur[1];

            if (floor == G) {
                System.out.println(cnt);
                return;
            }

            int up = floor + U;
            int down = floor - D;

            if (up <= F && !visited[up]) {
                visited[up] = true;
                q.offer(new int[]{up, cnt + 1});
            }
            if (down >= 1 && !visited[down]) {
                visited[down] = true;
                q.offer(new int[]{down, cnt + 1});
            }
        }

        System.out.println("use the stairs");
    }
}
