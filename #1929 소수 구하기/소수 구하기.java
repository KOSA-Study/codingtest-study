import java.util.Scanner;

public class Main {
    public boolean[] isPrimeCheck(int n) {
        boolean[] check = new boolean[n + 1];

        check[0] = true;
        check[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!check[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    check[j] = true;
                }
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean[] answer = main.isPrimeCheck(n);
        for (int i = m; i <= n; i++) {
            if (!answer[i]) {
                System.out.println(i);
            }
        }
    }
}