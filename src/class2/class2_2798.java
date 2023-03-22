package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class2_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        String[] card = br.readLine().split(" ");
        List<Integer> cardList = new ArrayList<>();
        for(int i=0; i<N; i++) {
            cardList.add(Integer.parseInt(card[i]));
        }
        Collections.sort(cardList);
        int result = 0;
        boolean check = false;
        for(int i=0; i<N-2; i++) {
            for(int j=i+1; j<N-1; j++) {
                for(int h=j+1; h<N; h++) {
                    int temp = cardList.get(i) + cardList.get(j) + cardList.get(h);

                    if(temp == M) {
                        result = temp;
                        check = true;
                        break;
                    } else if (temp < M && temp > result) {
                        result = temp;
                    }
                }
                if(check) break;
            }
            if(check) break;
        }
        System.out.println(result);
    }
}
