import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼 리더 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 버퍼 라이터 선언
		int t = Integer.parseInt(br.readLine()); // String
		StringTokenizer tokenizer = new StringTokenizer(br.readLine());
		int[] towerHeight = new int[tokenizer.countTokens()];
		int tokenCount = 0;
		int[] laser = new int[t];
		int peekCheck = 0;
		Top[] top = new Top[t];
		Stack<Top> stack = new Stack<>();
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			towerHeight[tokenCount] = Integer.parseInt(token);
			tokenCount++;
		}
		// 실행문 작성
		for (int i = 0; i < t; i++) {
			top[i] = new Top(i + 1, towerHeight[i]);
//			if (stack.isEmpty()) {
//				stack.push(top[i]);
//				laser[i] = 0;
//			} else {
				while (true) {
					if (stack.isEmpty()) {
						stack.push(top[i]);
						laser[i] = 0;
						break;
					}
					else if (stack.peek().height > top[i].height) {
						laser[i] = stack.peek().num;
						stack.push(top[i]);
						break;
					} else {
						stack.pop();
					}
				}
//			}
		}

		for (int i : laser) {
			bw.write(i + " ");
		}

		// 버퍼 라이터 뒤처리
		bw.flush();
		bw.close();
	}

	public static class Top { // 탑에 대한 정보
		int num; // 탑의 번호
		int height; // 탑의 높이

		Top(int num, int height) {
			this.num = num;
			this.height = height;
		}
	}
}