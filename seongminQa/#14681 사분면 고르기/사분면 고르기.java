import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 두 수 입력 받기, 0은 입력받지 않는다고 가정
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		// 사분면 출력하기
		if(x>0) {	// x가 양수라면, y값에 따라 1 or 4 사분면
			if(y>0)
				System.out.println(1);
			else
				System.out.println(4);
		} else {	// x가 음수라면, y값에 따라 2 or 3 사분면
			if(y>0)
				System.out.println(2);
			else
				System.out.println(3);
		}
	}
}