
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(); 

	        int[][] paper = new int[101][101]; // 도화지 배열

	        for (int i = 0; i < n; i++) {
	            int x = sc.nextInt(); 
	            int y = sc.nextInt(); 
	            for (int j = x; j < x + 10; j++) {
	                for (int k = y; k < y + 10; k++) {
	                    paper[j][k] = 1;
	                }
	            }
	        }
	        int area = 0; 
	        for (int i = 0; i < 101; i++) {
	            for (int j = 0; j < 101; j++) {
	                if (paper[i][j] == 1) {
	                    area++;
	                }
	            }
	        }

	        System.out.println(area);
	        sc.close();
	    }
	}
