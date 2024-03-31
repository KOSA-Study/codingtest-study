import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static StringBuilder solution(String[] arr) {
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		String rule = "";
		int num = 0;
		for (String s : arr) {
			if (s.contains(" ")) {
				rule = s.substring(0, 4);
				num = Integer.parseInt(s.substring(5, s.length()));
			} else {
				rule = s;
			}

			switch (rule) {
			case "push": {
				stack.push(num);
				break;
			}
			case "pop": {
				if (stack.isEmpty()) {
					sb.append(-1).append("\n");
					break;
				} else {
					sb.append(stack.peek()).append("\n");
					stack.pop();
					break;
				}
			}
			case "size": {
				sb.append(stack.size()).append("\n");
				break;
			}
			case "empty": {
				if (stack.isEmpty()) {
					sb.append(1).append("\n");
					break;
				} else {
					sb.append(0).append("\n");
					break;
				}
			}
			case "top": {
				if (stack.isEmpty()) {
					sb.append(-1).append("\n");
					break;
				} else {
					sb.append(stack.peek()).append("\n");
					break;
				}
			}
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
        
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			arr[i] = s;
		}
		System.out.println(solution(arr));
	}
}
