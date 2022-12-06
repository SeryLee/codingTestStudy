package class1;

import java.util.Arrays;
import java.util.Scanner;

public class class1_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int music[] = new int[8];
        for (int i=0; i<8; i++) {
            music[i] = sc.nextInt();
        }
        int[] ascending = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] descending = new int[]{8, 7, 6, 5, 4, 3, 2, 1};

        if(Arrays.equals(music, ascending)) {
            System.out.println("ascending");
        } else if (Arrays.equals(music, descending)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
        sc.close();
    }
}
