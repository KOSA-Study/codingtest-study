import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		int x = 0, y = 0;
		int count = 0;
		int[] xPosition = new int[tc];
		int[] yPosition = new int[tc];
		for (int i = 0; i < tc; i++) {
			xPosition[i] = scan.nextInt();
			yPosition[i] = scan.nextInt();
			if (x < xPosition[i])
				x = xPosition[i];
			if (y < yPosition[i])
				y = yPosition[i];
		}

		int[][] whitePaper = new int[100][100];
		for (int i = 0; i < whitePaper.length; i++) {
			for (int j = 0; j < whitePaper[i].length; j++) {
				whitePaper[i][j] = 0;
			}
		}
		for (int t = 0; t < tc; t++) {
			for (int i = xPosition[t]; i < xPosition[t] + 10; i++)
				for (int j = yPosition[t]; j < yPosition[t] + 10; j++)
					whitePaper[i][j] = 1;
		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++)
				if (whitePaper[i][j] == 1) {
					if (i == 0 || i == 99 || whitePaper[i - 1][j] == 0 || whitePaper[i + 1][j] == 0)
						count++;
					if (j == 0 || j == 99 || whitePaper[i][j - 1] == 0 || whitePaper[i][j + 1] == 0)
						count++;

				}
		}

		System.out.println(count);

	}
}