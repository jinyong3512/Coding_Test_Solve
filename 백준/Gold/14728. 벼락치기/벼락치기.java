import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int[][] datas = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            datas[i][0] = Integer.parseInt(st.nextToken());
            datas[i][1] = Integer.parseInt(st.nextToken());
        }

        ///////////////////////////////////////////////////

        int[][] dp = new int[N + 1][T + 1];

        for (int i = 1; i <= N; i++) {

            for (int j = 0; j <= T; j++) {

                // 넣을 수 있다면
                if (datas[i - 1][0] <= j) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i - 1][j - datas[i - 1][0]] + datas[i - 1][1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[N][T]);

    }
}
