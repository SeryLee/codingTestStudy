package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class2_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());
        List<Integer> numList = new ArrayList<>();
        List<Integer> sortedNum = new ArrayList<>();
        for(int i=0; i<N; i++) {
            numList.add(Integer.parseInt(br.readLine()));
            sortedNum.add(Integer.parseInt(br.readLine()));
        }
        long sum = 0;
        for(int i : numList) {
            sum += i;
        }
        System.out.println(Math.round(sum / N));
        Collections.sort(sortedNum);
        int mid = numList.size() / 2;
        System.out.println(sortedNum.get(mid));

        int[] cntFrequentPlus = new int[4001];
        int[] cntFrequentMinus = new int[4001];
        for(int i=0; i<N; i++) {
            if(N>=0) {
                cntFrequentPlus[numList.get(i)]++;
            } else {
            }
        }
        int max = 0;
        for(int i=0; i<8001; i++) {
            max = Math.max(max, cntFrequentPlus[i]);
        }
    }
}
