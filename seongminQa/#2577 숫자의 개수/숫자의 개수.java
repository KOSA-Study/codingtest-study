import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * 세 정수 A, B, C를 사용자로부터 입력받아 곱한 값에 0~9의 숫자가 각각 몇개 들어있는지 센다. 첫째 줄에는 A×B×C의 결과에 0
		 * 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지
		 * 차례로 한 줄에 하나씩 출력한다.
		 */
		
        // 빠른 입력을 위해 버퍼를 이용하여 입력 받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 세 자연수 곱의 결과를 저장할 변수 value 선언과 동시에 초기화
		int value = 1;
		// 세 자연수를 입력받고 곱의 결과를 저장
		for(int i=0; i<3; i++) {
			value *= Integer.parseInt(br.readLine());
		}
		// 0~9의 갯수를 저장할 int배열
		int[] count = new int[10];
		// while 반복문을 이용하여 카운트
		while(value > 0) {
			count[value % 10]++;
			value /= 10;
		}
		// 결과 출력
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}
}
