package class2;

import java.util.Arrays;
import java.util.Scanner;

public class class2_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        for(int i=0; i<N; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        int M = sc.nextInt();
        int[] num2 = new int[M];
        for(int i=0; i<M; i++){
            num2[i] = sc.nextInt();
        }
        for (int i : num2) {
            int start = 0;
            int end = num.length - 1;
            int check = 0;
            while (start<=end) {
                int mid = (start+end)/2;
                if(i==num[mid]) {
                    check = 1;
                    break;
                } else if (i>num[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            System.out.println(check);
        }
        sc.close();
    }
}
