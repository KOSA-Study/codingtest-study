import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 테스트 케이스 개수 입력

        for (int i = 0; i < T; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            System.out.println(turretPositions(x1, y1, r1, x2, y2, r2));
        }
    }

    public static int turretPositions(int x1, int y1, int r1, int x2, int y2, int r2) {
        // 두 터렛 사이의 거리
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // 두 터렛이 동일한 위치일 때
        if (x1 == x2 && y1 == y2) {
            // 두 터렛이 반지름도 같을 때
            if (r1 == r2) {
                return -1; // 무한대로 위치 가능
            } else {
                return 0; // 위치 불가능
            }
        }

        // 두 터렛이 서로 접하지 않을 때
        if (distance > r1 + r2) {
            return 0; // 위치 불가능
        }

        // 한 터렛이 다른 터렛을 포함할 때
        if (distance < Math.abs(r1 - r2)) {
            return 0; // 위치 불가능
        }

        // 두 터렛이 두 점에서 만날 때
        if (distance == r1 + r2) {
            return 1; // 위치 가능
        }

        // 두 터렛이 한 점에서 만날 때
        if (distance == Math.abs(r1 - r2)) {
            return 1; // 위치 가능
        }

        // 두 터렛이 두 점에서 만나지만 내접 또는 외접하지 않을 때
        return 2; // 위치 가능
    }
}
