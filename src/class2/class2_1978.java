package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class2_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] list = new int[N];
        for(int i=0; i<N; i++) {
            list[i] = Integer.parseInt(input[i]);
        }
        int cnt=0;
        boolean isPrime = true;
        for(int i=0; i<N; i++) {
            if(list[i] == 1) continue;
            isPrime = true;
            for(int j=2; j<=Math.sqrt(list[i]); j++) {
                if(list[i]%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true) cnt++;
        }
        System.out.println(cnt);
    }
}
