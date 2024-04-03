import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// BufferedReader로 입력 받음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// token으로 값을 넘겨줄 것이다
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 배열의 길이 초기화
		int[] N = new int[Integer.parseInt(st.nextToken())];
		// 입력 받을 수 초기화
		int M = Integer.parseInt(st.nextToken());
		// 바구니 1번~n번 배열로 세팅 
		for(int i=0; i<N.length; i++) {
			N[i] = i+1;
		}
		// 입력 받는 for문
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;  // 배열의 인덱스를 기준으로 -1 해줌
			int b = Integer.parseInt(st.nextToken()) - 1;  // 배열의 인덱스를 기준으로 -1 해줌
			// 해당 범위에 값을 교환하는 for문
			for(int j=a; j<b; j++) {
				// 값을 교환하기 위해 변하기 전의 값을 담을 변수
				int temp = N[j];
				// 시작 인덱스와 끝 인덱스의 값 교환
				N[j] = N[b];
				N[b--] = temp;
			}
		}
		// 출력
		for(int i=0; i<N.length; i++) {
			System.out.print(N[i]+" ");
		}
	}
}