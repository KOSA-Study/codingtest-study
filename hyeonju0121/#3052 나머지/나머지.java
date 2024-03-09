import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int x = sc.nextInt();
			
			arr[i] = x % 42;
		}
		
		for (int i = 0; i < arr.length; i++) {
			int num1 = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (i == j) continue;
				
				if (num1 == arr[j]) {
					arr[j] = -1;
				}
			}
		}
		
		int answer = 0;
		for (int temp : arr) {
			if (temp != -1) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
