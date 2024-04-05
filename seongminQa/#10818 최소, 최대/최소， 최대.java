import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 버퍼리더로 입력을 받기위해 br 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 정수 n개를 입력받는다.
		int n = Integer.parseInt(br.readLine());
		// 정수 n개를 각각 String 배열로 담는다.
		String[] numbers = br.readLine().split(" ");
		// 최솟값과 최댓값 변수 선언과 동시에 초기화
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		// for 반복문을 이용하여 정수 n개 까지 돌리며, 최솟값과 최댓값을 걸러낸다.
		for(int i=0; i<n; i++) {
			if(Integer.parseInt(numbers[i]) < min) {
				min = Integer.parseInt(numbers[i]);
			}
			if(Integer.parseInt(numbers[i]) > max) {
				max = Integer.parseInt(numbers[i]);
			}
		}
		System.out.print(min + " " + max);
	}
}