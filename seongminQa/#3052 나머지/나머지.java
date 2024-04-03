import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		// for문 안에 입력을 받기위해 BufferedReader 보조 스트림을 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 처음 수를 입력받을 변수 선언
		int[] arrayNum = new int[42];
		// 카운트할 변수 선언
		int cnt = 0;
		// for문을 이용하여 10개의 입력을 받고 해당 인덱스에 1을 저장
		for (int i = 0; i < 10; i++) {
			arrayNum[Integer.parseInt(br.readLine()) % 42] = 1;
		}
		// 해당 인덱스에 1이 저장되어 있다면 카운트
		for(int i=0; i<arrayNum.length; i++) {
			if(arrayNum[i] != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}