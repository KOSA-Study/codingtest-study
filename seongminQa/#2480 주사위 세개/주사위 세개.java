import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 3개의 수를 입력받을 배열선언
		int[] number = new int[3];
		// 최댓값 저장할 변수 max
		int max=0;
		// 출력 결과 저장 변수
		int result;
		
		// 3개의 수 입력받고, 최댓값 판별
		for(int i=0; i<number.length; i++) {
			number[i] = scan.nextInt();
			if(max < number[i]) {
				max = number[i];
			}
		}

		if(number[0] == number[1] && number[0] == number[2]) {  // 수가 모두 같을 때
			result = 10000 + (number[0]*1000);
		} else if(number[0] == number[1] || number[1] == number[2]) {  // 두 수가 같을 때
			result = 1000 + (number[1]*100);
		} else if(number[0] == number[2]) {  // 두 수가 같을 때
			result = 1000 + (number[0]*100);
		} else {  // 모든 수가 서로 같지 않을 때
			result = max*100;
		}
		System.out.print(result);
	}
}