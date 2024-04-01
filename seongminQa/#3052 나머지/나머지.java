import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// for문 안에 입력을 받기위해 BufferedReader 보조 스트림을 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 처음 수를 입력받을 변수 선언
		int[] arrayNum = new int[10];
		// 입력받은 수에 42로 나눈 나머지를 저장할 변수 선언
		int[] checkNum = new int[10];
		// for문을 이용하여 10개의 입력을 받고 동시에 두 변수의 값을 대입
		for (int i = 0; i < 10; i++) {
			arrayNum[i] = Integer.parseInt(br.readLine());
			checkNum[i] = arrayNum[i] % 42;
		}
		// Arrays클래스의 메소드를 사용하여 중복값 제거
		int[] resultNum = Arrays.stream(checkNum).distinct().toArray();
		System.out.println(resultNum.length);
	}
}
