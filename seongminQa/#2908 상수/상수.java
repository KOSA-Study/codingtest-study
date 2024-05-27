import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// BufferedReader를 이용하여 수 입력받기.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 문제의 수 입력방식은 스페이스바 하나를 기준. (" ")
		// 따라서 split을 사용해준다.
		String[] val = br.readLine().split(" ");
		// 입력받은 수들을 저장할 정수형 배열 선언
		int[] resultNum = new int[val.length];
		// 입력받은 수들의 값 비교를 위하여 정수 변수 선언.
		int max = Integer.MIN_VALUE;
		
		// 입력을 받을 때 String타입으로 입력을 받았다.
		// String타입으로 받아야 수를 거꾸로 표현하기 쉽다고 생각했기 때문.
		// for 반복문을 입력받은 수의 갯수만큼 반복하여 정수형타입으로 변환하고 resultNum배열에 저장한다.
		for(int i=0; i<val.length; i++) {
			String task = "";
			for(int j=val[i].length()-1; j>=0; j--) {
				task += val[i].charAt(j);
			}
			resultNum[i] = Integer.parseInt(task);
		}
		// resultNum배열에 저장된 수들의 값을 비교하여 최대값을 골라낸다.
		for(int i=0; i<resultNum.length; i++) {
			if(max < resultNum[i]) {
				max = resultNum[i];
			}
		}
		System.out.println(max);
	}
}
