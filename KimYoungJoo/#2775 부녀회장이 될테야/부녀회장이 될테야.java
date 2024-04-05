import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] answer = new int[t];

		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[][] apart = new int[k + 1][n];
			for (int j = 0; j < n; j++) {
				apart[0][j] = j + 1;
			}

			for (int f = 1; f <= k; f++) {
				for (int r = 0; r < n; r++) {
					apart[f][r] = func(apart[f - 1], r);
				}
			}

			answer[i] = apart[k][n - 1];
		}

		for (int i : answer)
			System.out.println(i);
	}

	public static int func(int[] apart, int r) {
		int sum = 0;
		for (int i = 0; i <= r; i++) {
			sum += apart[i];
		}
		return sum;
	}
}