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
                priorityQueue.offer(new Gamer(j, score));
            }

        }
    }
    public static int[] getGrade(PriorityQueue<Gamer> pq) {

        int[] grades = new int[N];
        return grades;
    }
    static class Gamer implements Comparable<Gamer>{
        int idx;
        int score;
        public Gamer(int idx, int score) {
            idx = this.idx;
            score = this.score;
        }
        @Override
        public int compareTo(Gamer o) {
            return o.score - this.score;
        }
    }
}
