package class2;

import java.util.Scanner;
import java.util.Stack;

public class class2_1874 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N+1];
        Stack<String> print = new Stack<>();
        int now = 1;
        for(int i=1; i<N+1; i++) {
            num[i] = sc.nextInt();
        }
        for(int i=1; i<N+1; i++) {
            stack.push(i);
            print.push("+");
            while (!stack.isEmpty() && stack.peek() == num[now]) {
                stack.pop();
                print.push("-");
                now++;
            }
        }
        if(!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            for (String s : print) {
                System.out.println(s);
            }
        }
    }
}
