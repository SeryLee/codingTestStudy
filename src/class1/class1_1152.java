package class1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class class1_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oneLine = sc.nextLine();

        StringTokenizer st = new StringTokenizer(oneLine, " ");
        int n = st.countTokens();
        System.out.println(n);
        sc.close();
    }
}
