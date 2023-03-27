package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Boolean> map = new HashMap<>();
        for(String a : participant) {
            map.put(a, false);
        }
        for(String b : completion) {
            map.put(b, true);
        }
        List<String> result = new ArrayList<>();
        for (String s : map.keySet()) {
            if(map.get(s) == false) result.add(s);
        }
        answer = result.toString();
        return answer;
    }
}
