import java.util.Scanner;

public class class1_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();

        //A-Z 까지 순회하며 알파벳 개수 구하기
        int alphabet[] = new int[26];
        for(int i=0; i<word.length(); i++) {
            int index = word.charAt(i)-65;
            alphabet[index]++;
        }
        //가장 많이 등장한 알파벳의 개수 구하기
        int max=0;
        for (int i=0; i<alphabet.length; i++) {
            if(max < alphabet[i]) {
                max = alphabet[i];
            }
        }
        //max값과 같은 알파벳 구하기
        int cnt=0;
        int maxAlphabet = 0;
        for (int i=0; i<alphabet.length; i++) {
            if(max == alphabet[i]) {
                cnt++;
                maxAlphabet = i;
            }
        }
        //max값과 같은 알파벳 한 개면 해당 알파벳 출력, 두 개 이상이면 ? 출력
        if (cnt == 1) {
            System.out.println((char) (maxAlphabet+65));
        } else {
            System.out.println("?");
        }
        sc.close();
    }
}
