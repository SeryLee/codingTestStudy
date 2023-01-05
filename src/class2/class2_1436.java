package class2;

import java.util.*;

public class class2_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int num;
        int testNum = 666;
        while(true) {
            List<Integer> splitNum = new ArrayList<>();
            num = testNum;
            while(num > 0) {
                splitNum.add(num % 10);
                num = num / 10;
            }
            for(int i=0; i<=splitNum.size()-3; i++) {
                if(Objects.equals(splitNum.get(i), 6) && Objects.equals(splitNum.get(i), splitNum.get(i + 1)) && Objects.equals(splitNum.get(i + 1), splitNum.get(i + 2))) {
                    cnt++;
                    break;
                }
            }
            if(cnt == N) break;
            testNum++;
        }
        System.out.println(testNum);
        sc.close();
    }
}
