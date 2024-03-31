import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		boolean[][] check = new boolean[100][100];

		int answer = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					if (check[j][k]) {
						continue;
					} else {
						check[j][k] = true;
						answer++;
					}
				}
			}
		}
		System.out.println(answer);
	}
}