import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] arry = new int[101][101];
		int sum = 0;

		// 사각형 갯수 입력받기
		int num = scan.nextInt();

		// 개수만큼 반복
		for (int n = 0; n < num; n++) {

			// 사각형의 좌표 입력받기
			int row = scan.nextInt();
			int col = scan.nextInt();
			
			// 사각형 1채워 넣기
			for (int i = row; i < row + 10; i++) {
				for (int j = col; j < col + 10; j++) {
					arry[i][j] = 1;
				}
			}
			
		}

		// 다시 계산해보기
		for (int i = 0; i < 100; i++) {
			
		    for (int j = 0; j < 100; j++) {
		    	
		        // 양측 변
		        if ((j == 0 && arry[i][j] == 1) || (j == 99 && arry[i][j] == 1))
		            sum++;
		        else if (arry[i][j] != arry[i][j+1])
		            sum++;

		        // 상하단 변
		        if ((i == 0 && arry[i][j] == 1) || (i == 99 && arry[i][j] == 1))
		            sum++;
		        else if (arry[i][j] != arry[i + 1][j])
		            sum++;
		    }
		}

		System.out.println(sum);
	}

}
