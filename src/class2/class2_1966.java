package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class class2_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            String[] print = br.readLine().split(" ");
            Queue[] printOrder = new Queue[10];
            Queue<Integer> nowPrintList = new LinkedList<>();
            int max = 0;
            for(int j=0; j<N; j++) {
                nowPrintList.offer(Integer.parseInt(print[j]));
                max = Math.max(max, Integer.parseInt(print[j]));
            }
            int idx = 0;
            while(!nowPrintList.isEmpty()) {
                int nowPrint = nowPrintList.poll();
                if(idx == N) idx = 0;
                if(nowPrint != max && idx <N) {
                    nowPrintList.offer(nowPrint);
                    idx++;
                } else if(nowPrint == max && idx < N) {
                    if(printOrder[nowPrint] == null) {
                        Queue<Integer> nowIndexPrint = new LinkedList<>();
                        nowIndexPrint.offer(idx);
                        printOrder[nowPrint] = nowIndexPrint;
                    } else {
                        printOrder[nowPrint].offer(idx);
                    }
                }
            }
            int cnt = 1;
            for(int j=9; j>=0; j--) {
                while(printOrder[j] != null && !printOrder[j].isEmpty()) {
                    int nowIdx = (int) printOrder[j].poll();
                    if(nowIdx == M) {
                        System.out.println(cnt);
                        break;
                    } else {
                        cnt++;
                    }
                }
            }
        }
    }
}
