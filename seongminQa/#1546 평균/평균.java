import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입력받을 수단으로 BufferedReader를 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력받을 과목의 수
		int n = Integer.parseInt(br.readLine());
		// 입력받는 값의 자료형이 String이기 때문에 String 배열을 선언하여 저장
		String[] scores = br.readLine().split(" ");
		// 결과값을 저장할 변수
		double sum = 0;
		// 최댓값을 판별하려는 변수. 정수의 최소값으로 초기화
		int max = Integer.MIN_VALUE;
		
		// 최댓값을 판별하여 max에 저장 
		for(int i=0; i<n; i++) {
			if(max < Integer.parseInt(scores[i])) {
				max = Integer.parseInt(scores[i]);
			}
		}
		// max값을 활용하여 결과값을 연산
		for(int i=0; i<n; i++) {
			sum += Double.parseDouble(scores[i]) / max * 100;
		}
		// 최종 결과값 출력
		System.out.println(sum / n);
	}
}