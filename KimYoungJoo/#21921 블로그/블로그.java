import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);
		str = br.readLine().split(" ");
		br.close();
		int[] man = new int[n];
		for (int i = 0; i < n; i++) {
			man[i] = Integer.parseInt(str[i]);
		}
		int count = 0;
		int max = 0;
		ArrayList<Integer> sumArr = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < x; i++) {
			sum += man[i];
		}
        max = sum;
		sumArr.add(sum);
		for (int i = x; i < n; i++) {
			sum = sum + man[i] - man[i - x];
			sumArr.add(sum);
			if (max < sum) {
				max = sum;
			}
		}

		for (int i : sumArr) {
			if (max == i && max != 0)
				count++;
		}

		if (count == 0) {
			System.out.print("SAD");
		} else {
			System.out.printf("%d\n%d", max, count);
		}
	}
}
