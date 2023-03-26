package programmers;

import java.util.*;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        Map map = new HashMap<Integer, Boolean>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], true);
        }
        int cnt = 0;
        for (Object value : map.values()) {
            if(value.equals(true)) cnt++;
        }
        if(cnt >= nums.length / 2) {
            answer = nums.length / 2;
        } else answer = cnt;
        return answer;
    }
}

