import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static StringBuilder solution(ArrayList<Integer> data) {
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();

		int idx = 0;
		int num = 1;
		while (data.size() != 0) {
			if (stack.isEmpty() && idx == 0) { // 초기상태
				stack.push(num);
				sb.append("+").append("\n");
				num++;
			} else if (stack.peek() > data.get(idx)) { // 수열 불가능한 경우
				sb.delete(0, sb.length());
				sb.append("NO");
				break;
			}

			if (stack.peek().equals(data.get(idx))) {
				stack.pop();
				data.remove(idx);
				sb.append("-").append("\n");
			} else {
				stack.push(num);
				sb.append("+").append("\n");
				num++;
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Integer> data = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			data.add(num);
		}
		System.out.println(solution(data));
	}
}
