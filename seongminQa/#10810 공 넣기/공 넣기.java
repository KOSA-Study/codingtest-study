import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 입력받음
		Scanner scan = new Scanner(System.in);
		
		// 바구니의 갯수를 입력 받는다.
		int n = scan.nextInt();
		// 공을 집어넣을 횟수를 입력 받는다.
		int m = scan.nextInt();
		// 개행문자 때문에 넣어준다. (밑에 더 입력을 받아야 한다면 엔터를 쳤을 때 개행문자가 들어가기 때문에 넣어주어야 함)
		scan.nextLine();
		// 각 바구니에 어떤 공이 들어갔는지 확인하기 위하여 배열 선언
		int[] result = new int[n];
		
		// 바구니에 공을 집어 넣는 반복문 시작
		// 공을 집어 넣을 횟수만큼 돌아가는 반복문
		for(int a=0; a<m; a++) {
			// i ~ j 바구니까지 공 번호 k를 집어넣으려고 한다. 그 정보를 입력받는 변수들
			int i = scan.nextInt();
			int j = scan.nextInt();
			int k = scan.nextInt();
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
