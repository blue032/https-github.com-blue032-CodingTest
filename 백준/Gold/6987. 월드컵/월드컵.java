import java.util.Scanner;

public class Main {
    static int[][] match = new int[15][2];
    static int[][] input = new int[6][3];
    static int[][] teams = new int[6][3];
    static boolean isPossible;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 6; j++) {
                match[index][0] = i;
                match[index][1] = j;
                index++;
            }
        }

        for (int t = 0; t < 4; t++) {
            int total = 0;
            for (int i = 0; i < 6; i++) {
                input[i][0] = sc.nextInt();
                input[i][1] = sc.nextInt();
                input[i][2] = sc.nextInt();
                total += input[i][0] + input[i][1] + input[i][2];
            }

            isPossible = false;

            if (total == 30) {
                dfs(0);
            }

            System.out.print(isPossible ? "1 " : "0 ");
        }
    }

    static void dfs(int depth) {
        if (isPossible) return;

        if (depth == 15) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 3; j++) {
                    if (teams[i][j] != input[i][j]) return;
                }
            }
            isPossible = true;
            return;
        }

        int t1 = match[depth][0];
        int t2 = match[depth][1];

        teams[t1][0]++;
        teams[t2][2]++;
        dfs(depth + 1);
        teams[t1][0]--;
        teams[t2][2]--;

        teams[t1][1]++;
        teams[t2][1]++;
        dfs(depth + 1);
        teams[t1][1]--;
        teams[t2][1]--;

        teams[t1][2]++;
        teams[t2][0]++;
        dfs(depth + 1);
        teams[t1][2]--;
        teams[t2][0]--;
    }
}
