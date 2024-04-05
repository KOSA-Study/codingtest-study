

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int findStartIndex(int[] cards, int cardNum) {
		int left = 0;
		int right = cards.length;
		while (left < right) {
			int mid = (left + right) / 2;
			if (cardNum <= cards[mid]) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

	public static int findEndIndex(int[] cards, int cardNum) {
		int left = 0;
		int right = cards.length;
		while (left < right) {
			int mid = (left + right) / 2;
			if (cardNum < cards[mid]) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] cards = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		

		Arrays.sort(cards); // -10 2 3 3 6 7 10 10 10

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int cardNum = Integer.parseInt(st.nextToken());
			bw.write(findEndIndex(cards, cardNum) - findStartIndex(cards, cardNum) + " ");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
