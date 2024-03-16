import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		int x = 0, y = 0;
		int count = 0;
		int[] xPosition = new int[tc];
		int[] yPosition = new int[tc];
		for (int i = 0; i < tc; i++) {
			xPosition[i] = scan.nextInt();
			yPosition[i] = scan.nextInt();
			if (x < xPosition[i])
				x = xPosition[i];
			if (y < yPosition[i])
				y = yPosition[i];
		}

		int[][] whitePaper = new int[x + 10][y + 10];
		for (int i = 0; i < x + 10; i++) {
            for (int j = 0; j < y + 10; j++) {
            	whitePaper[i][j] = 0;
            }
        }
		for(int t=0; t<tc; t++) {
			for(int i=xPosition[t]; i<xPosition[t]+10; i++)
				for(int j=yPosition[t]; j<yPosition[t]+10; j++)
					whitePaper[i][j] = 1;
		}
		
		for(int i=0; i<whitePaper.length; i++) {
			for(int j=0; j<whitePaper[i].length; j++) {
				if(whitePaper[i][j] == 1)
					count++;
			}
		}
		System.out.println(count);
		
	}
}