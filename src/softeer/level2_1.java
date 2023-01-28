package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] bag = br.readLine().split(" ");
        int W = Integer.parseInt(bag[0]);
        int N = Integer.parseInt(bag[1]);
        int[] weight = new int[N];
        int[] price = new int[N];
        int[] sortPrice = new int[10001];
        for(int i=0; i<N; i++) {
            String[] line = br.readLine().split(" ");
            weight[i] = Integer.parseInt(line[0]);
            price[i] = Integer.parseInt(line[1]);
            sortPrice[price[i]] = sortPrice[price[i]] + weight[i];
        }
        int totalPrice = 0;
        for(int i=10000; i>=0; i--) {
            if(sortPrice[i]>=W) {
                totalPrice += W * i;
                break;
            } else {
                totalPrice += sortPrice[i] * i;
                W -= sortPrice[i];
            }
        }
        System.out.println(totalPrice);
        br.close();
    }
}
