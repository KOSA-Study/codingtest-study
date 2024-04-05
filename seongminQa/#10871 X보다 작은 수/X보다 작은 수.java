import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 버퍼리더로 입력을 받을 것이다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// x와 y를 입력 받는다. String 배열을 씀
		String[] xy = br.readLine().split(" ");
		// 다음 N개의 수를 입력 받는다.
		String[] number = br.readLine().split(" ");
		// for 반복문을 통하여 x보다 작은 N개의 수를 검사여 출력
		for(int i=0; i<Integer.parseInt(xy[0]); i++) {
			if(Integer.parseInt(xy[1]) > Integer.parseInt(number[i])) {
				System.out.print(Integer.parseInt(number[i]) + " ");
			}
		}
	}
}