package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level2_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double A = 2;
        for(int i=1; i<=N; i++) {
            A = A + (A-1);
        }
        System.out.println(Math.pow(A, 2));
        br.close();
    }
}
