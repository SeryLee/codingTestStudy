package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> sortedList = new ArrayList<>();
        Arrays.asList(nums);
        Collections.sort(sortedList);
        int check = sortedList.get(0);
        answer = 1;
        for(int i=1; i<sortedList.size(); i++) {
            if(answer == nums.length / 2) break;
            if(check == sortedList.get(i)) {
                continue;
            } else if(check < sortedList.get(i)) {
                check = sortedList.get(i);
                answer++;
            }
        }
        return answer;
    }
}

