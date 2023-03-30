package programmers;

import java.io.*;
import java.util.*;
public class 전화번호_목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        List<String> pList = new ArrayList<>(Arrays.asList(phone_book));
        Collections.sort(pList);
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        int maxl = 0;
        for(int i=0; i<pList.size(); i++) {
            if(pList.get(i).length() > cnt) {
                cnt = pList.get(i).length();
                map.put(cnt, i);
                maxl = Math.max(maxl, cnt);
            }
        }
        if(map.size() > 1) {
            int nextIdx = 0;
            for(int i=0; i<map.get(maxl); i++) {
                for(int h : map.keySet()) {
                    if(h>pList.get(i).length()) {
                        nextIdx = map.get(h);
                        for(int j=nextIdx; j<pList.size(); j++) {
                            if(pList.get(j).startsWith(pList.get(i))) answer = false;
                            break;
                        }
                    }
                }
                if(!answer) break;
            }
        }
        return answer;
    }
}
