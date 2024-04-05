import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// 버퍼를 사용하여 문자열을 입력받음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 스트링토크나이저를 이용하여 입력받은 값을 하나씩 가져옴
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 처음 입력받은 문자열을 정수로 바꾸어 변수 n에 저장 (바구니의 개수)
		int n = Integer.parseInt(st.nextToken());
		// 다음 입력받은 문자열을 정수로 바꾸어 변수 m에 저장 (바구니 안의 공을 바꿀 횟수)
		int m = Integer.parseInt(st.nextToken());
		// 바구니 안의 공의 번호 값을 저장할 배열
		int[] result = new int[n];
		// 바구니 안의 공의 번호 초기화
		for(int a=0; a<n; a++) {
			result[a] = a + 1;
		}

		// 공을 서로 바꾸어줄 반복문
		for(int b=0; b<m; b++) {
			// 한 라인을 입력받아 값들을 저장
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			// 두 변수의 값들을 서로 바꿀 때 사용하는 대입 방법 (두 수 교환하기)
			int change = result[i-1];
			result[i-1] = result[j-1];
			result[j-1] = change;
		}
		// 바구니안의 공의 번호 출력
		for(int i=0; i<n; i++) {
			System.out.print(result[i] + " ");
		}
	}
}