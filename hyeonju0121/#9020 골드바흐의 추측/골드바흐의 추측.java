import java.util.Scanner;

public class Main {
    public boolean[] isPrimeCheck() {
        boolean[] check = new boolean[10001];

        check[0] = check[1] = true;

        for (int i = 2; i <= Math.sqrt(10000); i++) {
            if (!check[i]) {
                for (int j = i * 2; j <= 10000; j += i) {
                    check[j] = true;
                }
            }
        }
        return check;
    }

    public boolean isPrime(int num) {
        boolean flag = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public int[] solution(int num, boolean[] check) {
        int[] answer = new int[2];

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= num; i++) {
            if (!check[i]) {
                int temp = num - i;
                if (isPrime(temp)) {
                    int minTemp = temp - i;
                    if (minTemp < min && (minTemp >= 0)) {
                        min = minTemp;

                        answer[0] = i;
                        answer[1] = temp;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        boolean[] isPrime = main.isPrimeCheck();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int[] answer = main.solution(num, isPrime);
            System.out.println(answer[0] + " " + answer[1]);
        }
    }
}