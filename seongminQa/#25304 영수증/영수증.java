import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 총 금액
		int totalPrice = scan.nextInt();
		// 종류
		int kind = scan.nextInt();
		// 종류별 금액과 갯수
		int[] a = new int[kind];
		int[] b = new int[kind];
		// 총 금액과 비교할 값
		int result=0;
		
		// 종류와 갯수를 입력받고 result에 누적 연산
		for(int i=0; i<kind; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			result += a[i]*b[i];
		}

		if(totalPrice == result)
			System.out.print("Yes");
		else
			System.out.print("No");
	}

}