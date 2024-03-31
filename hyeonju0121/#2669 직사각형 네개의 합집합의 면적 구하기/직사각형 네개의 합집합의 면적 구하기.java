import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[][] arr = new boolean[100][100];

		int result = 0;
		for (int i = 0; i < 4; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			for (int j = x1; j < x2; j++) {
				for (int k = y1; k < y2; k++) {
					if (arr[j][k]) {
						continue;
					} else {
						arr[j][k] = true;
						result++;
					}
				}
			}
		}
		System.out.println(result);
	}
}
