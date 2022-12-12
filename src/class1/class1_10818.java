package class1;

import java.util.Scanner;

public class class1_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S[] = new int[N];
        for(int i=0; i<N; i++) {
            S[i] = sc.nextInt();
        }
        int MAX = S[0];
        int MIN = S[0];
        for(int i=0; i<S.length; i++) {
            if(MAX < S[i]) {
                MAX = S[i];
            }
            if(MIN > S[i]) {
                MIN = S[i];
            }
        }
        System.out.println(MIN);
        System.out.println(MAX);
        sc.close();
    }
}
