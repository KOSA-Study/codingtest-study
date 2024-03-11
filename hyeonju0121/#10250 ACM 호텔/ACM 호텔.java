import java.util.Scanner;

public class Main {
	static String room(int[] arr) {
		int floor = arr[2] % arr[0];
		int no = arr[2] / arr[0];
		
		// N % H == 0인 경우, 맨 윗층 배정 & 호실 그대로
		if (floor == 0) {
			floor = arr[0];
		} else {
			no++;
		}
		
		if (no < 10) {
			return String.valueOf(floor) + "0" + String.valueOf(no);
		} else {
			return String.valueOf(floor) + String.valueOf(no);
			}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
	
		for (int i = 0; i < T; i++) {
			int[] arr = new int[3];
			for (int j = 0; j < 3; j++) {
				arr[j] = sc.nextInt();
			}
			System.out.println(room(arr));
		}
	}
}