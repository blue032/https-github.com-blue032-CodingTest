import java.util.*;

public class Main {
    static int N, M;
    static int[] nums, selected;
    static boolean[] visited;
    static Set<String> result = new LinkedHashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        nums = new int[N];
        selected = new int[M];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums); // 사전 순 출력을 위해 정렬
        dfs(0);

        for (String s : result) {
            System.out.println(s);
        }
    }

    static void dfs(int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(" ");
            }
            result.add(sb.toString().trim()); // 중복 제거 위해 Set 사용
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            selected[depth] = nums[i];
            dfs(depth + 1);
            visited[i] = false;
        }
    }
}
