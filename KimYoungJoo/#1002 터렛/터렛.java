import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] result = new int[t];
		double[] d = new double[t]; // 두 원의 중심의 거리
		int[] sumRadius = new int[t]; // 반지름의 합
		int[] difRadius = new int[t]; // 반지름의 차
		for(int i=0; i<t; i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int r1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int r2 = scan.nextInt();
			d[i] = getDistance(x1, y1, x2, y2);
			sumRadius[i] = r1+r2;
			difRadius[i] = r1>r2 ? r1-r2 : r2-r1;
			
			if(d[i] == 0 && difRadius[i] == 0)
				result[i] = -1;
			else if(d[i] > sumRadius[i] || d[i] < difRadius[i] || d[i] == 0)
				result[i] = 0;
			else if(d[i] == sumRadius[i] || d[i] == difRadius[i])
				result[i] = 1;
			else
				result[i] = 2;
		}
		
		for(int i : result)
			System.out.println(i);

	}

	public static double getDistance(int x1, int y1, int x2, int y2) {
		double d;
		double xd, yd;
		xd = Math.pow(x1 - x2, 2);
		yd = Math.pow(y1 - y2, 2);
		d = Math.sqrt(xd + yd);
		return d;
	}
}

/* 참고 사이트 : https://turtlewhale.tistory.com/43 */