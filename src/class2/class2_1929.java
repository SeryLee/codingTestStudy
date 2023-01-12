package class2;

import java.util.Scanner;

public class class2_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] num = new int[N+1];
        for(int i=2; i<=N; i++) {
            num[i] = i;
        }
        for(int j=2; j<=N; j++) {
            if(num[j] == 0) continue;
            for(int i=j+j; i<=N; i+=j) {
                num[i] = 0;
            }
        }
        for (int i : num) {
            if(i != 0 && i>=M) System.out.println(i);
        }
        sc.close();
    }
}
