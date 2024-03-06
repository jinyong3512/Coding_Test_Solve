import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // N이 1~ 10^5

        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N + 1][3];

        dp[1][0] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;

        // dp[2][0] = dp[1][0] + dp[1][1] + dp[1][2];
        // dp[2][1] = dp[1][0] + dp[1][2];
        // dp[2][2] = dp[1][0] + dp[1][1];


        for (int i = 2; i <= N; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
        }

        System.out.println((dp[N][0] + dp[N][1] + dp[N][2]) % 9901);
    }
}