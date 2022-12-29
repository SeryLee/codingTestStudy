package class2;

import java.util.Scanner;

public class class2_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        while (true) {
            N = sc.nextInt();
            M = sc.nextInt();
            if(N<8 || N>50 || M<8 || M>50) {continue;}
            break;
        }
        String[] boardLine = new String[N];
        String[][] board = new String[N][M];
        for(int i=0; i<N; i++) {
            boardLine[i] = sc.next();
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                board[i] = boardLine[i].split("");
            }
        }
        String[][] checkerboard1 = {{"B","W","B","W","B","W","B","W"}, {"W","B","W","B","W","B","W","B"}, {"B","W","B","W","B","W","B","W"}, {"W","B","W","B","W","B","W","B"}, {"B","W","B","W","B","W","B","W"}, {"W","B","W","B","W","B","W","B"}, {"B","W","B","W","B","W","B","W"}, {"W","B","W","B","W","B","W","B"}};
        String[][] checkerboard2 = {{"W","B","W","B","W","B","W","B"}, {"B","W","B","W","B","W","B","W"}, {"W","B","W","B","W","B","W","B"}, {"B","W","B","W","B","W","B","W"}, {"W","B","W","B","W","B","W","B"}, {"B","W","B","W","B","W","B","W"}, {"W","B","W","B","W","B","W","B"}, {"B","W","B","W","B","W","B","W"}};
        int cb1min = 9999;
        int cb2min = 9999;
        int cb1difNum=0,cb2difNum=0;
        for(int rowStart=0, rowNum=8; rowNum<=M; rowNum++, rowStart++) {
            for(int columnStart=0, columnNum=8; columnNum<=N; columnNum++, columnStart++) {
                for (int i=columnStart, otherI=0; i<columnNum; i++, otherI++) {
                    for (int j=rowStart, otherJ=0; j<rowNum; j++, otherJ++) {
                        if(!checkerboard1[otherI][otherJ].equals(board[i][j])) {
                            cb1difNum++;
                        }
                        if(!checkerboard2[otherI][otherJ].equals(board[i][j])) {
                            cb2difNum++;
                        }
                    }
                }
                if(cb1min>cb1difNum) {cb1min = cb1difNum;}
                if(cb2min>cb2difNum) {cb2min = cb2difNum;}
                cb1difNum = 0;
                cb2difNum = 0;
            }
        }
        System.out.println(Math.min(cb1min, cb2min));
        sc.close();
    }
}
