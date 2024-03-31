import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int room = scan.nextInt();
		int count = 1;
		int i = 1;
		while (true) {
			if(count >= room) {
				break;
			} else {
				for (int j = 0; j < i * 6; j++) {
					count++;
				}
				i++;
			}
		}
		System.out.println(i);
	}
}
