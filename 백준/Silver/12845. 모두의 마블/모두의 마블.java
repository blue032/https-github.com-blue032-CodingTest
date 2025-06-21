import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String[] parts = br.readLine().split("\\s+");
        
        long sum = 0;
        int max = 0;
        for (String s : parts) {
            int v = Integer.parseInt(s);
            sum += v;
            if (v > max) max = v;
        }

        if (N == 1) {
            // 카드 하나면 합성 없이 잇힝한 골드 없음 → 레벨이 자기 자신
            System.out.println(sum);
        } else {
            long result = sum + (long) max * (N - 2);
            System.out.println(result);
        }
    }
}
