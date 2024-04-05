import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stackInt = new Stack<>();
        int count = 0;
        boolean isError = false;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            for (int j = count; j < input; j++) {
                if (count < input) {
                    stackInt.push(count + 1);
                    sb.append("+\n");
                    count++;
                }
            }
            if (stackInt.peek() == input) {
                stackInt.pop();
                sb.append("-\n");
            } else {
                isError = true;
            }
        }
        if (isError) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }

    }

}