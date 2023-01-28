package softeer;

import java.util.Scanner;

public class level1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A>B) System.out.println("A");
        else if (B>A) System.out.println("B");
        else System.out.println("same");
        sc.close();
    }
}
