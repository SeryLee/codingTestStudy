import java.util.Scanner;

public class class1_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for(int i=0; i<cnt; i++) {
            int tmpNumber = sc.nextInt();
            String tmpString = sc.next();
            String splitString[] = tmpString.split("");

            for(int g=0; g<splitString.length; g++) {
                for(int j=0; j<tmpNumber; j++) {
                    System.out.print(splitString[g]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}