import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] scores = new int[N];
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			
			scores[i] = num;

			if (max < num) {
				max = num;
			}
		}
		
		double sum = 0;
		for (int i = 0; i < scores.length; i++) {
			double temp = (double) scores[i] / max * 100;
			sum += temp;
		}
		
		double avg = sum / N;
		
		System.out.println(avg);
	}
}