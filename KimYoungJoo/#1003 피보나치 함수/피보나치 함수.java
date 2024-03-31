import java.util.Scanner;

public class Main {
	static int[] dp = new int[100];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] zeroCount = new int[t];
		int[] oneCount = new int[t];
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			if (n == 0) {
				zeroCount[i] = 1;
				oneCount[i] = 0;
			} else if (n == 1) {
				zeroCount[i] = 0;
				oneCount[i] = 1;
			} else {
				zeroCount[i] = fibo(n - 1);
				oneCount[i] = fibo(n);
			}
		}

		for (int i = 0; i < t; i++) {
			System.out.println(zeroCount[i] + " " + oneCount[i]);
		}

	}

	public static int fibo(int num) {
		// 첫번째, 두번째 수열에 1 저장
		dp[0] = 1;
		dp[1] = 1;

		// 반복문을 돌며 3번째 수열부터 차례로 값을 채워넣는다
		for (int i = 2; i < num; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[num - 1];
	}
}