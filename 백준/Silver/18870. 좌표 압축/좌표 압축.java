import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] original = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            original[i] = Integer.parseInt(st.nextToken());
        }

        int[] sorted = original.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, idx++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : original) {
            sb.append(map.get(num)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
