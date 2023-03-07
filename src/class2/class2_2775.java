package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class2_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T>0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[] underFloor = new int[n+1];
            int[] topFloor = new int[n+1];
            for(int i=1; i<=n; i++) {
                underFloor[i] = i;
            }
            int cnt = 0;
            for(int i=0; i<k; i++) {
                for(int j=1; j<=n; j++) {
                    cnt += underFloor[j];
                    topFloor[j] = cnt;
                }
                for(int j=1; j<=n; j++) {
                    underFloor[j] = topFloor[j];
                }
                cnt = 0;
            }
            System.out.println(topFloor[n]);
            T--;
        }
    }
}
