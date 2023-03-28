package programmers;

import java.util.*;

public class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> pList = new ArrayList<>(Arrays.asList(participant));
        List<String> cList = new ArrayList<>(Arrays.asList(completion));
        Collections.sort(pList);
        Collections.sort(cList);

        for(int i=0; i<completion.length; i++) {
            if(!pList.get(i).equals(cList.get(i))) {
                answer = pList.get(i);
                break;
            }
        }
        if(answer.equals("")) answer = pList.get(pList.size()-1);

        return answer;
    }
}
