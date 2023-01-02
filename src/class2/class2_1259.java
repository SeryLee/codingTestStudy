package class2;

import java.util.Arrays;
import java.util.Scanner;

public class class2_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            if(str.equals("0")) break;
            String[] origin = str.split("");
            String[] reverse = new String[origin.length];
            for(int i = origin.length-1, j=0; i>=0 && j<origin.length; i--, j++) {
                reverse[j] = origin[i];
            };
            if(Arrays.equals(origin, reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}
