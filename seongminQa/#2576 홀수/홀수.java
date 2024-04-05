import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// 빠른 입력을 위해 BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 홀수의 총 합을 구하는 변수 선언과 초기화
		int oddSum = 0;
		// 최솟값을 받은 변수 선언과 초기화
		int minValue = Integer.MAX_VALUE;
		
		// 입력받은 수만큼 반복하여 홀수를 골라내고 합과 홀수의 최솟값을 구함
		for(int i=0; i<7; i++) {
			int data = Integer.parseInt(br.readLine());
			if(data % 2 == 1) {
				oddSum += data;
				if(minValue > data) {
					minValue = data;
				}
			}
		}
		// 홀수가 존재하지 않는다면 -1 출력
		if(oddSum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(oddSum);
			System.out.println(minValue);			
		}
	}
}