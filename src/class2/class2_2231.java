package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class2_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 0;
        boolean check = false;
        for(int i=1; i<N; i++) {
            int M = i;
            int sum = i;
            while(M > 0) {
                sum += M % 10;
                M = M / 10;
            }
            if(sum == N) {
                result = i;
                check = true;
                break;
            }
        }
        if(check == true) System.out.println(result);
        else System.out.println(0);
    }
}
