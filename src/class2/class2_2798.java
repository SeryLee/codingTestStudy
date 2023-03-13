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
        int searchNum = N / 2;
        int first = 0;
        int end = 0;
        int mid = 0;
        int result = 0;
        while (searchNum < N-1 && searchNum > 0) {
            first = cardList.get(searchNum - 1);
            mid = cardList.get(searchNum);
            end = cardList.get(searchNum + 1);
            if((first+mid+end) == M) {
                result = (first + mid + end);
                break;
            } else if((first+mid+end) < M) {
                result = Math.max((first + mid + end), result);
                searchNum++;
            } else {
                if(result == 0) {
                    searchNum--;
                }
            }
        }
        System.out.println(result);
    }
}
