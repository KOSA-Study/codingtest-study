import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 현재 시간 입력받기
		int h = scan.nextInt() % 24; // 24시간 표기로 값을 저장
		int m = scan.nextInt() % 60; // 분 단위로 값을 저장

		// 요리에 필요한 시간 입력받기 (분 단위)
		int waitMinute = scan.nextInt();

		// 요리에 필요한 분단위를 계산하기 용이하게 시간과 분단위로 쪼개기
		int waitH = (waitMinute / 60) % 24;
		int waitM = waitMinute % 60;

		// 현재 시간과 요리에 필요한 시간을 더하여 저장할 시간, 분 변수
		int resultH = 0;
		// 분 단위는 (현재 분 + 요리에 필요한 분)을 60으로 나눈 나머지로 바로 값 도출 가능
		int resultM = (m + waitM) % 60;
		
		// 시간 도출하기
		// 현재 분 + 요리에 필요한 분단위 시간이 1시간을 넘길 때
		if(m + waitM >= 60)
			// 현재 시간 + 요리에 필요한 시간 + (입력받은 분+요리에 필요한 분단위)를 시간화시켜 24시간 기준으로 변경
			resultH = (h + waitH + (m+waitM)/60) % 24;
		else 
			// 60분을 안넘겼을 때, 시간은 현재 시간 + 요리에 필요한 시간만 더해주고 24시간 기준으로 나타냄
			resultH = (h + waitH) % 24;

		System.out.print(resultH + " " + resultM);
	}
}
