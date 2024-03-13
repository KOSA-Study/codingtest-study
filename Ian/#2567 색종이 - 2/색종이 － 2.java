import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] paper = new int[101][101];

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					paper[j][k] = 1;
				}
			}
		}

		int perimeter = 0;

		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if (paper[i][j] == 1) {

					if (i == 0 || i == 100 || j == 0 || j == 100) {
						perimeter++;
					}
					if (i > 0 && paper[i - 1][j] == 0) {
						perimeter++;
					}
					if (i < 100 && paper[i + 1][j] == 0) {
						perimeter++;
					}
					if (j > 0 && paper[i][j - 1] == 0) {
						perimeter++;
					}
					if (j < 100 && paper[i][j + 1] == 0) {
						perimeter++;
					}
				}
			}
		}

		System.out.println(perimeter);
		sc.close();
	}
}
