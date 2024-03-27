import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너를 사용하여 입력받는다.
		Scanner scan = new Scanner(System.in);
		// 자연수 9개를 저장할 정수 배열 선언
		int[] arry = new int[9];
		// 최댓값을 비교하고 저장할 변수 선언
		int maxNum = Integer.MIN_VALUE;
		// 최댓값이 몇번째에 들어있는지 저장할 변수 선언
		int index = 0;
		// for문을 이용하여 9번 입력을 받고, 최댓값과 몇번째 입력값인지 판별한다.
		for (int i = 0; i < arry.length; i++) {
			arry[i] = scan.nextInt();
			if (arry[i] > maxNum) {
				maxNum = arry[i];
				index = i + 1;
			}
		}
		System.out.println(maxNum);
		System.out.print(index);
	}
}
