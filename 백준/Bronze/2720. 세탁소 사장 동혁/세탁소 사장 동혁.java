import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        
        // 동전 단위 배열 (쿼터, 다임, 니켈, 페니)
        int[] coins = {25, 10, 5, 1};
        
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int c = Integer.parseInt(br.readLine().trim());
            for (int i = 0; i < coins.length; i++) {
                int cnt = c / coins[i];
                sb.append(cnt).append(' ');
                c %= coins[i];
            }
            sb.append('\n');
        }
        
        System.out.print(sb);
    }
}
