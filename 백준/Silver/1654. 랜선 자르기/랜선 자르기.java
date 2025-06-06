import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); 
        int N = Integer.parseInt(st.nextToken());

        int[] cables = new int[K];
        long max = 0;

        // 최댓값 저장
        for (int i = 0; i < K; i++) {
            cables[i] = Integer.parseInt(br.readLine());
            if (cables[i] > max) max = cables[i];
        }

        // 이진 탐색
        long start = 1;
        long end = max;
        long result = 0;

        while (start <= end) {
            long mid = (start + end) / 2;

            long count = 0;
            for (int cable : cables) {
                count += cable / mid;  
            }

            if (count >= N) {
                result = mid;         
                start = mid + 1;     
            } else {
                end = mid - 1;        
            }
        }

        System.out.println(result);
    }
}
