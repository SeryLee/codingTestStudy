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
        int N = Integer.parseInt(br.readLine());
        List<Integer> numList = new ArrayList<>();
        List<Integer> sortedNum = new ArrayList<>();
        int sum = 0;
        int[] cntFrequent = new int[8001];
        for(int i=0; i<N; i++) {
            int nowNum = Integer.parseInt(br.readLine());
            sum += nowNum;
            numList.add(nowNum+4000);
            sortedNum.add(nowNum+4000);
            cntFrequent[nowNum+4000]++;
        }
        System.out.println((int)Math.round((double) sum / N));
        Collections.sort(sortedNum);
        int mid = numList.size() / 2;
        System.out.println(sortedNum.get(mid)-4000);

        int max = 0;
        boolean check = false;
        for(int i=0; i<8001; i++) {
            max = Math.max(max, cntFrequent[i]);
        }
        int mode = 0;
        for(int i=0; i<8001; i++) {
            if(cntFrequent[i] == max && !check) {
                mode = i - 4000;
                check = true;
            } else if(cntFrequent[i] == max && check) {
                mode = i - 4000;
                break;
            }
        }
        System.out.println(mode);
        System.out.println(sortedNum.get(sortedNum.size()-1) - sortedNum.get(0));
    }
}
