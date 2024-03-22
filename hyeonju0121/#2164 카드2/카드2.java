import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static int solution(int n) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		boolean status = false;
		while(queue.size() != 1) {
			if (!status) {
				queue.poll();
				status = true;
			} else {
				int temp = queue.peek();
				queue.poll();
				queue.offer(temp);
				status = false;
			}
		}
		answer = queue.peek();
		
		return answer;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(solution(n));
	}
}