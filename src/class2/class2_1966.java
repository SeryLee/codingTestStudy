package class2;

import javax.imageio.ImageTranscoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class class2_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String[] input = br.readLine().split(" ");
            String[] print = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            Queue[] priority = new Queue[10];
            Queue<Integer> printList = new LinkedList<>();
            Queue<Integer> index = new LinkedList<>();
            List<Integer> tempList = new ArrayList<>();
            int max = 0;
            for(int j=0; j<N; j++) {
                printList.offer(Integer.parseInt(print[j]));
                index.offer(j);
                tempList.add(Integer.parseInt(print[j]));
                max = Math.max(max, Integer.parseInt(print[j]));
            }
            Set<Integer> sort = new HashSet<>(tempList);
            List<Integer> existP = new ArrayList<>(sort);
            Collections.sort(existP);
            max = existP.get(existP.size()-1);
            while (max>0) {
                Queue<Integer> tempQ = new LinkedList<>();
                while(printList.size() != 0) {
                    int nowPrint = printList.poll();
                    int nowIdx = index.poll();
                    if(nowPrint == max) {
                        if(priority[nowPrint] == null) {
                            Queue<Integer> temp = new LinkedList<>();
                            temp.offer(nowIdx);
                            priority[nowPrint] = temp;
                        } else {
                            priority[nowPrint].offer(nowIdx);
                        }
                    } else {
                        tempQ.offer(nowPrint);
                        index.offer(nowIdx);
                    }
                }
                max--;
                for (Integer integer : tempQ) {
                    printList.offer(integer);
                }
            }
            int cnt = 1;
            for(int j=9; j>=0; j--) {
                while(priority[j] != null && !priority[j].isEmpty()) {
                    int nowIdx = (int) priority[j].poll();
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
