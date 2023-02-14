package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class level3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");
        String[] third = br.readLine().split(" ");
        Integer[] firstGame = new Integer[N];
        Integer[] sortedFirst = new Integer[N];
        Integer[] secondGame = new Integer[N];
        Integer[] sortedSecond = new Integer[N];
        Integer[] thirdGame = new Integer[N];
        Integer[] sortedThird = new Integer[N];
        Integer[] finalScore = new Integer[N];
        Integer[] sortedFinal = new Integer[N];
        for(int i=0; i<N; i++) {
            firstGame[i] = Integer.parseInt(first[i]);
            sortedFirst[i] = Integer.parseInt(first[i]);
            secondGame[i] = Integer.parseInt(second[i]);
            sortedSecond[i] = Integer.parseInt(second[i]);
            thirdGame[i] = Integer.parseInt(third[i]);
            sortedThird[i] = Integer.parseInt(third[i]);
            finalScore[i] = Integer.parseInt(first[i])+Integer.parseInt(second[i])+Integer.parseInt(third[i]);
            sortedFinal[i] = Integer.parseInt(first[i])+Integer.parseInt(second[i])+Integer.parseInt(third[i]);
        }
        Arrays.sort(sortedFirst, Collections.reverseOrder());
        Arrays.sort(sortedSecond, Collections.reverseOrder());
        Arrays.sort(sortedThird, Collections.reverseOrder());
        Arrays.sort(sortedFinal, Collections.reverseOrder());
        List<Integer> firstList = new ArrayList<>(Arrays.asList(sortedFirst));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(sortedSecond));
        List<Integer> thirdList = new ArrayList<>(Arrays.asList(sortedThird));
        List<Integer> finalList = new ArrayList<>(Arrays.asList(sortedFinal));
        for(int i=0; i<N; i++) {
            System.out.print((firstList.indexOf(firstGame[i])+1) + " ");
        }
        System.out.println();
        for(int i=0; i<N; i++) {
            System.out.print((secondList.indexOf(secondGame[i])+1) + " ");
        }
        System.out.println();
        for(int i=0; i<N; i++) {
            System.out.print((thirdList.indexOf(thirdGame[i])+1) + " ");
        }
        System.out.println();
        for(int i=0; i<N; i++) {
            System.out.print((finalList.indexOf(finalScore[i])+1) + " ");
        }
    }
}
