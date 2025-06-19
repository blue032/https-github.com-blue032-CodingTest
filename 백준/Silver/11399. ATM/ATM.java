import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        
        int[] P = Arrays.stream(br.readLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        
        Arrays.sort(P);
        
        int totalTime = 0;
        int cumulative = 0;
        
        for (int i = 0; i < N; i++) {
            cumulative += P[i];
            totalTime += cumulative;
        }
        
        System.out.println(totalTime);
    }
}
