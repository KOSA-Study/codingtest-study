import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static StringBuilder solution(int n, String[] arr) {
		StringBuilder sb = new StringBuilder();

		Queue<Integer> queue = new LinkedList<>();

		String rules = "";
		int num = 0;
		for (String s : arr) {
			if (s.contains(" ")) {
				rules = s.substring(0, 4);
				num = Integer.parseInt(s.substring(5, s.length()));
			} else {
				rules = s;
			}
			
			switch (rules) {
				case "push": {
					queue.offer(num);
					break;
				}
				case "pop": {
					if (queue.isEmpty()) {
						sb.append(-1).append("\n");
						break;
					} else {
						sb.append(queue.peek()).append("\n");
						queue.poll();
						break;
					}
				}
				case "size": {
					sb.append(queue.size()).append("\n");
					break;
				}
				case "empty": {
					if (queue.isEmpty()) {
						sb.append(1).append("\n");
						break;
					} else {
						sb.append(0).append("\n");
						break;
					}
				}
				case "front": {
					if (queue.isEmpty()) {
						sb.append(-1).append("\n");
						break;
					} else {
						sb.append(queue.peek()).append("\n");
						break;
					}
				}
				case "back": {
					if (queue.isEmpty()) {
						sb.append(-1).append("\n");
						break;
					} else {
						Queue<Integer> queueCopy = new LinkedList<Integer>();
						for (Integer x : queue) {
							queueCopy.offer(x);
						}
	
						for (int i = 0; i < queue.size() - 1; i++) {
							queueCopy.poll();
						}
	
						sb.append(queueCopy.peek()).append("\n");
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

		int n = sc.nextInt();
		String[] arr = new String[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		System.out.println(solution(n, arr));
	}
}
