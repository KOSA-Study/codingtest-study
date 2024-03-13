import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        int num = 0;
        while (count != N) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }
            num++;
        }
        System.out.println(num - 1);
    }
}
