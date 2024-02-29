import java.util.Scanner;


public class Main {
    public boolean[] isPrimeCheck() {
        int num = 123456 * 2;

        boolean[] check = new boolean[num + 1];

        check[0] = true;
        check[1] = true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (!check[i]) {
                for (int j = i * 2; j <= num; j += i) {
                    check[j] = true;
                }
            }
        }
        return check;
    }

    public int solution(boolean[] check, int num) {
        int answer = 0;

        for (int i = num + 1; i <= num * 2; i++) {
            if (!check[i]) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        boolean[] check = main.isPrimeCheck();
        while(true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }

            System.out.println(main.solution(check, num));
        }
    }
}