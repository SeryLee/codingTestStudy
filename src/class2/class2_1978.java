package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class2_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] list = new int[1001];
        for(int i=0; i<N; i++) {
            list[Integer.parseInt(input[i])] = Integer.parseInt(input[i]);
        }
        for(int i=2; i<1001; i++) {
            if(list[i] == 0) continue;
            for(int j=i+i; j<1001; j+=i) {
                list[j] = 0;
            }
        }
        int cnt=0;
        for (int i=2; i<1001; i++) {
            if(list[i] != 0) cnt++;
        }
        System.out.println(cnt);
    }
}
