package class1;

import java.util.Scanner;

public class class1_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for(int i=0; i<cnt; i++) {
            String OX = sc.next();
            String splitString[] = OX.split("");
            int cntO = 0;
            int semiSum = 0;
            int sum = 0;
            for(int g=0; g<splitString.length; g++) {
                if(splitString[g].equals("O")) {
                    cntO++;
                    semiSum += cntO;
                } else {
                    sum += semiSum;
                    cntO = 0;
                    semiSum = 0;
                }
            }
            sum += semiSum;
            System.out.println(sum);
            cntO =0;
            semiSum = 0;
            sum = 0;
        }
        sc.close();
    }
}
