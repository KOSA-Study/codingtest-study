import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static BigInteger[] solution(String[] str) {

        ArrayList<BigInteger> list = new ArrayList<>();

        for (String s : str) {
            s = s.replaceAll("[a-z]", " ");
            String[] temp = s.trim().replaceAll("\\s+", " ").split(" ");

            if (!temp[0].equals("")) {
                for (String numStr : temp) {
                    list.add(new BigInteger(numStr));
                }
            }
        }

        BigInteger[] answer = new BigInteger[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (BigInteger i : main.solution(arr)) {
            System.out.println(i);
        }
    }
}