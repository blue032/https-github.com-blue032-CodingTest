import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 여자 수
        int M = Integer.parseInt(input[1]); // 남자 수
        int K = Integer.parseInt(input[2]); // 인턴 수

        // 인턴을 제외하고 만들 수 있는 최대 팀 수
        int maxTeam = Math.min(Math.min(N / 2, M), (N + M - K) / 3);

        System.out.println(maxTeam);
    }
}
