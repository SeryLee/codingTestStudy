package class1;

import java.util.Scanner;

public class class1_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if((!(A>0 && A<10) && !(B>0 && B<10)) || (A==0 && B==0)) {
                break;
            }
            System.out.println(A+B);
        }
        sc.close();
    }
}
