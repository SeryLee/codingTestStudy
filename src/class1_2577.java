import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class class1_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = A * B * C;

        List<Integer> Result = new ArrayList<>();
        int tmp;
        while (result > 0) {
            tmp = result % 10;
            result = result / 10;
            Result.add(tmp);
        }

        int num[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int cnt[] = new int[10];

        for(int i = 0; i<Result.size(); i++) {
            for (int j=0; j<num.length; j++) {
                if(Result.get(i) == num[j]) {
                    cnt[j] += 1;
                }
            }
        }
        for (int i : cnt) {
            System.out.println(i);
        }
        sc.close();
    }
}
