package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class level2_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<int[]> numberPosition = new ArrayList<>();
        numberPosition.add(new int[]{1, 1, 1, 0, 1, 1, 1});
        numberPosition.add(new int[]{0, 0, 1, 0, 0, 1, 0});
        numberPosition.add(new int[]{1, 0, 1, 1, 1, 0, 1});
        numberPosition.add(new int[]{1, 0, 1, 1, 0, 1, 1});
        numberPosition.add(new int[]{0, 1, 1, 1, 0, 1, 0});
        numberPosition.add(new int[]{1, 1, 0, 1, 0, 1, 1});
        numberPosition.add(new int[]{1, 1, 0, 1, 1, 1, 1});
        numberPosition.add(new int[]{1, 1, 1, 0, 0, 1, 0});
        numberPosition.add(new int[]{1, 1, 1, 1, 1, 1, 1});
        numberPosition.add(new int[]{1, 1, 1, 1, 0, 1, 1});
        numberPosition.add(new int[]{0, 0, 0, 0, 0, 0, 0});

        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            String[] firstNum = input[0].split("");
            String[] secondNum = input[1].split("");
            List<Integer> first = new ArrayList<>();
            List<Integer> second = new ArrayList<>();
            int MaxPosition = Math.max(firstNum.length, secondNum.length);
            if(MaxPosition == firstNum.length && firstNum.length != secondNum.length) {
                for(String s : firstNum) {
                    first.add(Integer.parseInt(s));
                }
                for(int j=0; j<firstNum.length-secondNum.length; j++) {
                    second.add(10);
                }
                for(String s : secondNum) {
                    second.add(Integer.parseInt(s));
                }
            } else if(MaxPosition == secondNum.length && firstNum.length != secondNum.length) {
                for(int j=0; j<secondNum.length-firstNum.length; j++) {
                    first.add(10);
                }
                for(String s : firstNum) {
                    first.add(Integer.parseInt(s));
                }
                for(String s : secondNum) {
                    second.add(Integer.parseInt(s));
                }
            } else if(firstNum.length == secondNum.length) {
                for(String s : firstNum) {
                    first.add(Integer.parseInt(s));
                }
                for(String s : secondNum) {
                    second.add(Integer.parseInt(s));
                }
            }
            int cnt = 0;
            for(int j=0; j<MaxPosition; j++) {
                int[] checkFirst = numberPosition.get(first.get(j));
                int[] checkSecond = numberPosition.get(second.get(j));
                for(int h=0; h<7; h++) {
                    if(checkFirst[h] != checkSecond[h]) cnt++;
                }
            }
            System.out.println(cnt);
            br.close();
        }
    }
}
