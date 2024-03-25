import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		// 버퍼로 입력을 받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// n개의 정수를 입력받는다.
		int n = Integer.parseInt(br.readLine());  // 예외처리 해주어야 함. -> throws
		// 입력받은 수들을 저장할 String 배열
		String[] storage = br.readLine().split(" ");
		// 확인할 값 입력받을 정수
		int check = Integer.parseInt(br.readLine());
		// 갯수를 세어 출력하는 변수
		int cnt = 0;
		// for 반복문을 통해 검사하여 카운트를 셈
		for(int i=0; i<n; i++) {
			if(Integer.parseInt(storage[i]) == check) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}