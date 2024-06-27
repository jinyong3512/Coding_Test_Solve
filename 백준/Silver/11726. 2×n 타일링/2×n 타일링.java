import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // n: 1~1000

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            if (i == 1)
                dp[i] = 1;
            else if (i == 2)
                dp[i] = 2;
            else
                dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        System.out.println(dp[n]);
    }
}
