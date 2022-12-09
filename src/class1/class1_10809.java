package class1;

import java.util.Scanner;

public class class1_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String splitS[] = S.split("");
        String alpha[] = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int alphaNum[] = new int[26];
        for(int i=0; i<alpha.length; i++) {
            for (int j=0; j<splitS.length; j++) {
                if(j==0 && alpha[i].equals(splitS[j]) && alphaNum[i] == 0) {
                    alphaNum[i] = -2;
                } else if (alpha[i].equals(splitS[j]) && alphaNum[i] == 0) {
                    alphaNum[i] = j;
                }
            }
        }
        for (int i=0; i<alphaNum.length; i++) {
            if(alphaNum[i] == -2) {
                alphaNum[i] = 0;
            } else if (alphaNum[i] == 0) {
                alphaNum[i] = -1;
            }
        }
        for (int i : alphaNum) {
            System.out.print(i);
        }
        sc.close();
    }
}
