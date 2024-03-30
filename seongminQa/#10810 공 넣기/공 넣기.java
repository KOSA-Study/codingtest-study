import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 버퍼로 입력 받음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 스트링토크나이저에 한 라인의 입력받은 문자열들을 저장
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 변수 n에 처음 입력받은 문자열을 정수로 바꾸어 대입 (바구니의 갯수)
		int n = Integer.parseInt(st.nextToken());
		// 변수 m에 그 다음으로 입력받은 문자열을 정수로 대입 (공을 넣을 횟수)
		int m = Integer.parseInt(st.nextToken());
		// 각 바구니에 어떤 공이 들어갔는지 확인하기 위하여 배열 선언 (바구니의 수만큼)
		int[] result = new int[n];
		
		// 바구니에 공을 집어넣는 반복문 시작
		// 공을 집어 넣을 횟수만큼 돌아가는 반복문
		for(int a=0; a<m; a++) {
			// 다시 한 라인으로 입력을 받고 각 변수에 대입하려 한다.
			st = new StringTokenizer(br.readLine());
			// i ~ j 바구니까지 공 번호 k를 집어넣으려고 한다. 그 정보를 입력받는 변수들
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			// i번째부터 j번째 바구니에 k번의 공을 집어넣는 반복문
			for(int b=i-1; b<j; b++) {
				result[b] = k;
			}
		}
		// 각 바구니에 들어있는 공의 번호가 무엇인지 출력하여 확인
		for(int i=0; i<n; i++) {
			System.out.print(result[i] + " ");
		}
	}
}