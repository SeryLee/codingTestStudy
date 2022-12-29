package class2;

import java.util.Scanner;

public class class2_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, w, h;
        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();
            w = sc.nextInt();
            h = sc.nextInt();
            if ((1 > x || x > w - 1) || (1 > y || y > h - 1) || (1 > w || w > 1000) || (1 > h || h > 1000)) {
                continue;
            }
            break;
        }
        int A = h - y;
        int B = w - x;
        int[] array = new int[]{x, y, A, B};
        int min = x;
        for (int i : array) {
            if(min > i) min = i;
        }
        System.out.println(min);
        sc.close();
    }
}
