package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class level3_2 {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] totalScore = new int[N];
        for(int i=0; i<3; i++) {
            String[] game = br.readLine().split(" ");
            PriorityQueue<Gamer> priorityQueue = new PriorityQueue<>();
            for(int j=0; j<N; j++) {
                int score = Integer.parseInt(game[j]);
                totalScore[j] += score;
                priorityQueue.offer(new Gamer(j, score));
            }
            int[] grades = getGrade(priorityQueue);
            for (int grade : grades) {
                System.out.print(grade + " ");
            }
            System.out.println();
        }
        PriorityQueue<Gamer> finalQueue = new PriorityQueue<>();
        for(int i=0; i<N; i++) {
            finalQueue.offer(new Gamer(i, totalScore[i]));
        }
        int[] finalGrade = getGrade(finalQueue);
        for (int grade : finalGrade) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }
    public static int[] getGrade(PriorityQueue<Gamer> pq) {

        Gamer nowGamer = pq.poll();
        int[] grades = new int[N];
        int nowGrade = 1;

        int prevScore = nowGamer.score;
        grades[nowGamer.idx] = nowGrade;
        int gradeIdx = 1;
        while(!pq.isEmpty()) {
            nowGamer = pq.poll();
            if(prevScore == nowGamer.score) {
                grades[nowGamer.idx] = nowGrade;
                gradeIdx++;
            } else if(prevScore > nowGamer.score) {
                nowGrade = gradeIdx+1;
                grades[nowGamer.idx] = nowGrade;
                gradeIdx++;
            }
            prevScore = nowGamer.score;
        }
        return grades;
    }
    static class Gamer implements Comparable<Gamer>{
        int idx;
        int score;
        public Gamer(int idx, int score) {
            this.idx = idx;
            this.score = score;
        }
        @Override
        public int compareTo(Gamer o) {
            return o.score - this.score;
        }
    }
}