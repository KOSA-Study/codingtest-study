import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		String[] c = br.readLine().split(" ");

		int[] card = new int[n];
		for (int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(c[i]);
		}
		double numCheck = Double.MAX_VALUE;
		int blackJack = 0;

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (card[i] + card[j] + card[k] <= m) {
						if ((double) m / (card[i] + card[j] + card[k]) < numCheck) {
							numCheck = (double) m / (card[i] + card[j] + card[k]);
							blackJack = card[i] + card[j] + card[k];
						}
					}
				}
			}
		}
		System.out.println(blackJack);
	}
}