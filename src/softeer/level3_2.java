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
        Integer[] temp = new Integer[N];
        mergeSort(0, N-1, sortedFirst, temp);
        initList(temp);
        mergeSort(0, N-1, sortedSecond, temp);
        initList(temp);
        mergeSort(0, N-1, sortedThird, temp);
        initList(temp);
        mergeSort(0, N-1, sortedFinal, temp);
        List<Integer> firstList = new ArrayList<>(Arrays.asList(sortedFirst));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(sortedSecond));
        List<Integer> thirdList = new ArrayList<>(Arrays.asList(sortedThird));
        List<Integer> finalList = new ArrayList<>(Arrays.asList(sortedFinal));
        printList(firstGame, firstList, N);
        printList(secondGame, secondList, N);
        printList(thirdGame, thirdList, N);
        printList(finalScore, finalList, N);
    }
    public static void mergeSort(int start, int end, Integer[] sorted, Integer[] temp) {
        if (start<end) {
            int mid = (start+end) / 2;
            mergeSort(start, mid, sorted, temp);
            mergeSort(mid+1, end, sorted, temp);

            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p<=mid || q<=end) {
                if (q>end || (p<=mid && sorted[p]>sorted[q])) {
                    temp[idx++] = sorted[p++];
                } else {
                    temp[idx++] = sorted[q++];
                }
            }
            for(int i=start; i<=end; i++) {
                sorted[i] = temp[i];
            }
        }
    }
    public static void initList(Integer[] list) {
        for(int i=0; i<list.length; i++) {
            list[i] = null;
        }
    }
    public static void printList(Integer[] list, List<Integer> List, int N) {
        for(int i=0; i<N; i++) {
            System.out.print((List.indexOf(list[i])+1) + " ");
        }
        System.out.println();
    }
}
