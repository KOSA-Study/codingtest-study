import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int floor = 0;
            if (N % H != 0) {
                floor = N % H * 100;
            } else {
                floor = H * 100; 
            }

            int roomNum = N / H;
            if (N % H != 0) {
                roomNum += 1;
            }
            System.out.println(floor + roomNum);
        }
    }
}
