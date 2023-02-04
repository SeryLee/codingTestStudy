package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level2_5 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int K = Integer.parseInt(input[2]);

        String[] secretNumber = br.readLine().split(" ");
        String[] expectNumber = br.readLine().split(" ");

        boolean check = false;
        for(int i=0; i<N; i++) {
            if(expectNumber[i].equals(secretNumber[0])) {
                if(i+M <= N) {
                    check = true;
                    for(int j=0; j<M; j++) {
                        if(!expectNumber[j+i].equals(secretNumber[j])) {
                            check = false;
                        }
                    }
                    if(check == true) break;
                }

            }
        }
        if(check == true) {
            System.out.println("secret");
        } else {
            System.out.println("normal");
        }
        br.close();
    }
}
