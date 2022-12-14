package class1;

import java.util.Scanner;

public class class1_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String num = sc.next();
        String splitNum[] = num.split("");
        int sum = 0;
        for(int i=0; i<N; i++) {
            sum += Integer.parseInt(splitNum[i]);
        }
        System.out.println(sum);
        sc.close();
    }
}
