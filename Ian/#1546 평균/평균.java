import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sub = sc.nextInt();
		int[] scores = new int [sub];
		double average=0,sum=0;
		double aver2=0;
		int maxNum=0;
		for (int i = 0; i < scores.length; i++) {
			scores[i]=sc.nextInt();
			sum+=scores[i];
			if(maxNum < scores[i]) {
				maxNum = scores[i];
			}
		}
		average = sum/sub;
		aver2 = average/maxNum*100;
		
		System.out.println(aver2);
		sc.close();
	}
}