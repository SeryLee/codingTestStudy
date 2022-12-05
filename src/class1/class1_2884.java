package class1;

import java.util.Scanner;

public class class1_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(45<=M && M<=59) {
            M = M - 45;
            System.out.println(H);
            System.out.println(M);
        } else {
            if(H == 0) {
                H = 23;
            } else {
                H = H - 1;
            }
            M = 60 - (45 - M);
            System.out.println(H);
            System.out.println(M);
        }
        sc.close();
    }
}
