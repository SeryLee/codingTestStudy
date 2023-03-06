package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class2_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int max = Math.max(N, M);
        int a = 0, b = 0;
        for(int i=1; i<=max; i++) {
            if(N % i == 0 && M % i == 0) {
                a = i;
            }
        }
        boolean check = false;
        for(int i=max; i<=N*M; i++) {
            if(i % N == 0 && i % M == 0 && !check) {
                b = i;
                check = true;
            }
            else if (i % N == 0 && i % M == 0 && check) break;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
