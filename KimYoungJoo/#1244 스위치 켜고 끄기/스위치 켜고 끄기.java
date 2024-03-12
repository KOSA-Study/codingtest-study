import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t_sw = scan.nextInt();
		int[] sw = new int[t_sw + 1];

		for (int i = 1; i < sw.length; i++) {
			sw[i] = scan.nextInt();
		}

		int t_st = scan.nextInt();
		int[][] st = new int[2][t_st];

		for (int j = 0; j < t_st; j++) {
			st[0][j] = scan.nextInt();
			st[1][j] = scan.nextInt();
		}

		for (int i = 0; i < t_st; i++) {
			if (st[0][i] == 1) {
				boy(sw, st[1][i]);
			} else if (st[0][i] == 2) {
				girl(sw, st[1][i]);
			}
		}

		for (int i = 1; i < sw.length; i++) {
			System.out.print(sw[i] + " ");
			if (i % 20 == 0)
				System.out.println();
		}
	}

	public static void boy(int[] sw, int num) {
		for (int i = 1; i < sw.length; i++) {
			if (i % num == 0) {
				sw[i] = swap(sw[i]);
			}
		}
	}

	public static void girl(int[] sw, int num) {
		int i = 0;
		while (true) {
			if (num - i == 0 || num + i == sw.length) {
				break;
			}
			if (i == 0) {
				sw[num] = swap(sw[num]);
			}

			if (sw[num + i] == sw[num - i]) {
				sw[num + i] = swap(sw[num + i]);
				sw[num - i] = swap(sw[num - i]);
				i++;
			} else {
				break;
			}
		}
	}

	public static int swap(int num) {
		if (num == 0)
			return 1;
		else
			return 0;
	}
}