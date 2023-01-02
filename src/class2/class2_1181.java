package class2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class class2_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] words = new String[N];
        for(int i=0; i<N; i++) {
            words[i] = sc.next();
        }
        Comparator<String> comparator = (s1, s2) -> {
          if(s1.length() - s2.length()==0) {
              return s1.compareTo(s2);
          }
            return s1.length() - s2.length();
        };
        Arrays.sort(words, comparator);

        for (int i=0; i<words.length; i++) {
            if(i != N-1) {
                if(!words[i].equals(words[i+1])) {
                    System.out.println(words[i]);
                }
            } else {
                System.out.println(words[i]);
            }
        }
        sc.close();
    }
}
