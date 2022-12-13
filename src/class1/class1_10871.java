package class1;

import java.util.Scanner;

public class class1_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int num[] = new int[N];
        for(int i=0; i<N; i++) {
            num[i] = sc.nextInt();
        }
        for (int i : num) {
            if(i<X) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
