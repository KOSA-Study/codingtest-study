import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		int remain = 0;

		for (int i = 0; i < 10; i++) {
			arr[i] = scan.nextInt() % 42;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					arr[i] = -1;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != -1)
				remain++;
		}
		System.out.printf("%d\n", remain);
	}
}