import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] score = new String[2][20];
		StringTokenizer st;
		Double majorScore = 0d;
		Double sumScore = 0d;
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();
			score[0][i] = st.nextToken();
			score[1][i] = st.nextToken();

			switch (score[1][i]) {
			case "A+":
				majorScore += Double.parseDouble(score[0][i]) * 4.5;
				sumScore += Double.parseDouble(score[0][i]);
				break;
			case "A0":
				majorScore += Double.parseDouble(score[0][i]) * 4.0;
				sumScore += Double.parseDouble(score[0][i]);
				break;
			case "B+":
				majorScore += Double.parseDouble(score[0][i]) * 3.5;
				sumScore += Double.parseDouble(score[0][i]);
				break;
			case "B0":
				majorScore += Double.parseDouble(score[0][i]) * 3.0;
				sumScore += Double.parseDouble(score[0][i]);
				break;
			case "C+":
				majorScore += Double.parseDouble(score[0][i]) * 2.5;
				sumScore += Double.parseDouble(score[0][i]);
				break;
			case "C0":
				majorScore += Double.parseDouble(score[0][i]) * 2.0;
				sumScore += Double.parseDouble(score[0][i]);
				break;
			case "D+":
				majorScore += Double.parseDouble(score[0][i]) * 1.5;
				sumScore += Double.parseDouble(score[0][i]);
				break;
			case "D0":
				majorScore += Double.parseDouble(score[0][i]) * 1.0;
				sumScore += Double.parseDouble(score[0][i]);
				break;
			case "F":
				majorScore += Double.parseDouble(score[0][i]) * 0.0;
				sumScore += Double.parseDouble(score[0][i]);
				break;
			default:
				break;
			}
		}
		System.out.printf("%.6f", majorScore/sumScore);
	}
}