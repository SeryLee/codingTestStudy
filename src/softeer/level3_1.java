package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class level3_1 {
    static int H;
    static int K;
    static int R;
    static worker[] tree;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        H = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        R = Integer.parseInt(input[2]);

        tree = new worker[(int) Math.pow(2, H + 1)];
        init(1, 0);
        for(int i=(int)Math.pow(2,H); i<(int)Math.pow(2,H+1); i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<K; j++) {
                tree[i].job.offer(Integer.parseInt(st.nextToken()));
            }
        }

        answer = 0;
        for(int i=1; i<=R; i++) {
            workProcess(1, i, 0);
        }

        System.out.println(answer);
    }

    static void workProcess(int idx, int r, int depth) {
        if(depth>H) return;
        worker nowWorker = tree[idx];
        if(depth == H && !nowWorker.job.isEmpty()) {
            int job = nowWorker.job.poll();
            if(idx%2==0) tree[idx / 2].left.offer(job);
            else tree[idx / 2].right.offer(job);
        } else if(depth<H && r%2==0 && !nowWorker.right.isEmpty()) {
            int job = nowWorker.right.poll();
            if(idx == 1) answer += job;
            else {
                if(idx%2 == 0) tree[idx / 2].left.offer(job);
                else tree[idx / 2].right.offer(job);
            }
        } else if(depth<H && r%2==1 && !nowWorker.left.isEmpty()) {
            int job = nowWorker.left.poll();
            if(idx == 1) answer += job;
            else {
                if(idx%2 == 0) tree[idx / 2].left.offer(job);
                else tree[idx / 2].right.offer(job);
            }
        }
        workProcess(idx*2, r, depth+1);
        workProcess(idx*2+1, r, depth+1);
    }

    static void init(int idx, int depth) {
        if(depth>H) return;
        worker newWorker = new worker(depth);
        tree[idx] = newWorker;

        init(idx * 2, depth + 1);
        init(idx * 2 + 1, depth + 1);
    }

    static class worker {
        int depth;
        Queue<Integer> left;
        Queue<Integer> right;
        Queue<Integer> job;
        public worker(int depth) {
            this.depth = depth;
            initJob();
        }
        public void initJob() {
            if(depth == H) {
                job = new LinkedList<>();
            }else {
                left = new LinkedList<>();
                right = new LinkedList<>();
            }
        }
    }
}
