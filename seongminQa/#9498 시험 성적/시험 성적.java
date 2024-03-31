import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 시험 점수 입력 받기
		int score = scan.nextInt();

		// switch문 활용하기
		switch (score / 10) {	// 입력받은 정수를 10으로 나누어 case문으로 진입
		case 10:	// 100점이라면 그 다음 case문으로 진입
		case 9:		// 90점 이상이라면 score/10은 소수점을 버리고 9가되어 진입
			System.out.print("A");
			break;
		case 8:		// 80점 이상이라면 score/10은 8이되어 진입
			System.out.print("B");
			break;
		case 7:		// 위와 같은 방식
			System.out.print("C");
			break;
		case 6:
			System.out.print("D");
			break;
		default:
			System.out.print("F");
			break;
		}
	}
}