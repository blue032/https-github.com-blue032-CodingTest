import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine().trim());
        int change = 1000 - X;

        int[] coins = {500, 100, 50, 10, 5, 1};
        int count = 0;

        for (int c : coins) {
            count += change / c;
            change %= c;
        }

        System.out.println(count);
    }
}
