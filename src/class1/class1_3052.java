package class1;

import java.util.Scanner;

public class class1_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        for(int i=0; i<10; i++) {
            num[i] = sc.nextInt() % 42;
        }
        int num42[] = new int[42];
        for(int i=0; i<42; i++) {
            num42[i] = i;
        }
        int newNum42[] = new int[42];
        for(int i=0; i<42; i++) {
            for(int j=0; j<10; j++) {
                if(num[j] == num42[i]) {
                    newNum42[i]++;
                }
            }
        }
        int cnt = 0;
        for (int i : newNum42) {
            if(i != 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
