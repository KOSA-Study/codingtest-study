import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 두 정수 입력 받기
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		// 두 정수 대소비교
		if(a>b)		// a가 b보다 클 경우
			System.out.print(">");
		else if (a<b)		// a가 b보다 작을 경우
			System.out.print("<");
		else		// 그 이외에 실행문 (여기서는 두 정수가 같은 경우 뿐이라 조건식을 넣어주지 않음.
			System.out.print("==");
	}
}