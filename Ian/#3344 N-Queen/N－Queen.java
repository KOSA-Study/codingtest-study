
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        List<Integer> numbers = new ArrayList<>();

        if (n % 6 != 2 && n % 6 != 3) {
            for (int i = 1; i <= n / 2; i++) {
                numbers.add(2 * i - 1);
            }
            if (n % 2 == 1) {
                numbers.add(n);
            }
            for (int i = 1; i <= n / 2; i++) {
                numbers.add(2 * i);
            }
        } else if (n % 6 == 2) {
            for (int i = 1; i <= n / 2; i++) {
                numbers.add(2 * i);
            }
            numbers.add(3);
            numbers.add(1);
            for (int i = n / 2 + 2; i < n - 1; i++) {
                numbers.add(2 * (i - n / 2 + 1) + 1);
            }
            numbers.add(5);
        } else if (n % 6 == 3) {
            for (int i = 2; i <= n / 2; i++) {
                numbers.add(2 * i);
            }
            numbers.add(2);

            for (int i = n / 2; i < n - 2; i++) {
                numbers.add((i - n / 2 + 2) * 2 + 1);
            }
            numbers.add(1);
            numbers.add(3);
        }

        for (int num : numbers) {
            sb.append(num).append("\n");
        }

        System.out.println(sb.toString());
    }
}





