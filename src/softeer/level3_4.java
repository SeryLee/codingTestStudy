package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class level3_4 {
    static int N;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] busList = new int[N];
        for(int i=0; i<N; i++) {
            busList[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N; i++) {
            countCase(busList, i);
        }
        System.out.println(cnt);
        br.close();
    }
    static void countCase(int[] busList, int idx) {
        if(idx>0 && idx<N-1) {
            int nowIdx = idx;
            List<Integer> frontNum = new ArrayList<>();
            List<Integer> backNum = new ArrayList<>();
            for(int i=0; i<nowIdx; i++) {
                if(busList[i] < busList[nowIdx]) {
                    frontNum.add(i);
                }
            }
            if(frontNum.isEmpty()) return;
            for(int i=nowIdx; i<N; i++) {
                if(busList[nowIdx] > busList[i]) {
                    backNum.add(i);
                }
            }
            if(backNum.isEmpty()) return;
            for(int i : frontNum) {
                for(int j : backNum) {
                    if(busList[i] > busList[j]) cnt++;
                }
            }
        }
    }
}
