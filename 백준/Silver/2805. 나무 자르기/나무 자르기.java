import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); 
        int m = Integer.parseInt(st.nextToken()); 

        int[] trees = new int[n];
        st = new StringTokenizer(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if (trees[i] > max) max = trees[i]; 
        }

        int start = 0;
        int end = max;
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            long total = 0;
            for (int tree : trees) {
                if (tree > mid) {
                    total += tree - mid;
                }
            }

            if (total >= m) {
                result = mid;      
                start = mid + 1;  
            } else {
                end = mid - 1;      
            }
        }

        System.out.println(result);
    }
}
