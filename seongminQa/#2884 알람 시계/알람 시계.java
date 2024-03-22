import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 시간 입력받기
		int h = scan.nextInt() % 24;	// 24시간 표기로 값을 저장
		int m = scan.nextInt() % 60;	// 분 단위로 값을 저장
		
		if(m - 45 < 0) {	// 입력받은 m분이 45보다 작을 경우
			h = h - 1;		// 시간-1값을 다시 시간에 저장
			m = 60 - 45 + m;	// (60(1시간) - 45 + 입력받은 m분)을 m으로 다시 초기화
			if(h < 0)		// 그런데 만약 0시였더라면 23시로 돌아가야한다.
				h = 23;
		} else {		// 입력받은 m분이 45보다 클 경우
			m = m - 45;		
		}
		System.out.print(h + " " + m);	
	}
}