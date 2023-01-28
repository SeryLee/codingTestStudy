package softeer;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class level2_3 {
    static int blockCnt = 1;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] road = new int[N+2][N+2];
        for(int i=1; i<N+1; i++) {
            String[] temp = br.readLine().split("");
            for(int j=1; j<N+1; j++) {
                road[i][j] = Integer.parseInt(temp[j-1]);
            }
        }
        int[][] check = new int[N+2][N+2];
        List<Integer> blockList = new ArrayList<>();
        for(int i=0; i<N+2; i++) {
            for(int j=0; j<N+2; j++) {
                if(road[i][j] == 1 && check[i][j] == 0) {
                    dfs(road, check, i, j, N);
                    blockList.add(blockCnt);
                    blockCnt = 1;
                }
            }
        }
        System.out.println(blockList.size());
        Collections.sort(blockList);
        for (int i : blockList) {
            System.out.println(i);
        }
        br.close();
    }
    public static void dfs(int[][] road, int[][] check, int i, int j, int N) {
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        check[i][j] = 1;
        int x, y;
        for(int h=0; h<4; h++) {
            x = i + dx[h];
            y = j + dy[h];
            if(x>=0 && x<=N+1 && y>=0 && y<=N+1) {
                if(road[x][y] == 1 && check[x][y] == 0) {
                    blockCnt++;
                    dfs(road, check, x, y, N);
                }
            }
        }
    }
}
