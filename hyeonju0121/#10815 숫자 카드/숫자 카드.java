import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int card = sc.nextInt();
			map.put(card, map.getOrDefault(card, 0) + 1);
		}
		
		int M = sc.nextInt();
		int[] noCardArr = new int[M];
		for (int i = 0; i < M; i++) {
			int noCard = sc.nextInt();
			noCardArr[i] = noCard;
		}
		
		for (int card : noCardArr) {
			if (map.containsKey(card)) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
	}
}
