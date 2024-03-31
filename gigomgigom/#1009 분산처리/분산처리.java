import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int testCaseCnt = Integer.parseInt(sc.nextLine()); //테스트케이스 횟수 입력
		
		int[]dataArray = new int[testCaseCnt];//1의자리수를 담을 testCaseCnt크기를 갖는 배열생성
		
		for(int i = 0; i < dataArray.length; i++ ) { //테스트케이스 횟수만큼 반복
			StringTokenizer st = new StringTokenizer(sc.nextLine(), " "); //입력받은 두 정수의 값을 토큰으로 분리
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int tmp = 1; //임시값 1로 지정
			for(int j = 0; j < b; j++) {
				tmp = (tmp*a)%10; //제곱한 후 10을 나눈 나머지값을 구한다 즉. 1의자리숫자만 얻는다.
				//(이유: 거듭제곱양이 많아지면 long타입으로도 담을 수 없는 큰 숫자가 담기기때문에 정확하지않은 결과값이 나오게 된다.
			}
			if(tmp == 0) { //만약 10의 해가 나올경우 tmp변수에 담긴값이 0이되므로 정확하게 10으로 대입해준다.
				tmp = 10;
			}
			dataArray[i] = tmp; //i번 인덱스에 tmp값을 저장한다.
		}
		
		for(int firstDigit : dataArray) { //결과를 담은 배열 출력
			System.out.println(firstDigit);
		}
	}
}