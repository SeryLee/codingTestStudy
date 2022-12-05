package class1;

import java.util.Scanner;

public class class1_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int a[] = new int[3];
        int b[] = new int[3];
        for(int i=0; i<3; i++) {
            a[i] = A % 10;
            b[i] = B % 10;
            A = A / 10;
            B = B / 10;
        }
        A = a[0] * 100 + a[1] * 10 + a[2];
        B = b[0] * 100 + b[1] * 10 + b[2];
        if(A>B) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }
        sc.close();
    }
}
