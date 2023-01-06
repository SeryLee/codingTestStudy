package class2;

import java.util.Scanner;

public class class2_1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        long max = 0;
        int[] line = new int[K];

        for (int i = 0; i < K; i++) {
            line[i] = sc.nextInt();
            max = Math.max(max, line[i]);
        }
        long end = max;
        long start = 1;

        while (start <= end) {
            long mid = (end + start) / 2;
            long cnt = 0;
            for (long i : line) {
                cnt += (i / mid);
            }
            if (cnt >= N) start = mid + 1;
            else end = mid - 1;
        }
        System.out.println(end);
        sc.close();
    }
}
