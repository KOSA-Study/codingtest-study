
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int findMaxMeter(int[] trees, int requiredMeter) {
		Arrays.sort(trees);
		int min = 0;
		int max = trees[trees.length - 1];

		while (min < max) {
			int mid = (min + max) / 2;
			long sum = 0;
			for (int treeHeight : trees) {
				if (treeHeight - mid > 0) {
					sum += (treeHeight - mid);
				}
			}
			if (sum < requiredMeter) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}
		return min - 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] trees = new int[N];
		for (int i = 0; i < trees.length; i++) {
			trees[i] = sc.nextInt();
		}
		System.out.println(findMaxMeter(trees, M));

	}
}
