import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // D째날 K개

        // 첫날 과 그 다음날의 떳 갯수는?

        st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] dp = new int[D + 1][3];
        dp[1][1] = 1;
        dp[2][2] = 1;

        for (int i = 3; i <= D; i++) {
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
            dp[i][2] = dp[i - 1][2] + dp[i - 2][2];
        }

//        System.out.println(dp[D][1]+" "+dp[D][2]);

        for (int A = 1; A <= K; A++) {

            if ((K - dp[D][1] * A) % dp[D][2] == 0) {
                System.out.println(A);
                System.out.println((K - dp[D][1] * A) / dp[D][2]);
                break;
            }

        }


    }
}
