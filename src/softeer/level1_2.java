package softeer;

import java.util.Scanner;

public class level1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for(int i=0; i<5; i++) {
            String startTime = sc.next();
            String endTime = sc.next();
            int startH = Integer.parseInt(startTime.substring(0, 2));
            int startMin = Integer.parseInt(startTime.substring(3, 5));
            int endH = Integer.parseInt(endTime.substring(0, 2));
            int endMin = Integer.parseInt(endTime.substring(3, 5));
            total += (60 - startMin) + (endH - startH - 1) * 60 + endMin;
        }
        System.out.println(total);
        sc.close();
    }
}
