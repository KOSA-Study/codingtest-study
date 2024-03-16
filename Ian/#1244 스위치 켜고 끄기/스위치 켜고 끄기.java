import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfSwitches = sc.nextInt();
        boolean[] isTurnOn = new boolean[numOfSwitches];

        // 스위치 상태 입력
        for (int i = 0; i < numOfSwitches; i++) {
            isTurnOn[i] = sc.nextInt() == 1;
        }

        int numOfStudents = sc.nextInt();

        // 학생들의 조작에 따라 스위치 상태 변경
        for (int i = 0; i < numOfStudents; i++) {
            int sex = sc.nextInt();
            int switchNum = sc.nextInt();

            if (sex == 1) { // 남학생인 경우
                for (int j = switchNum - 1; j < numOfSwitches; j += switchNum) {
                    isTurnOn[j] = !isTurnOn[j];
                }
            } else { // 여학생인 경우
                int left = switchNum - 2; // 중심 스위치의 왼쪽
                int right = switchNum; // 중심 스위치의 오른쪽

                // 중심 스위치 상태 먼저 바꾸기
                isTurnOn[switchNum - 1] = !isTurnOn[switchNum - 1];

                // 좌우 대칭인 부분의 상태 바꾸기
                while (left >= 0 && right < numOfSwitches && isTurnOn[left] == isTurnOn[right]) {
                    isTurnOn[left] = !isTurnOn[left];
                    isTurnOn[right] = !isTurnOn[right];
                    left--;
                    right++;
                }
            }
        }

        // 모든 조작이 끝난 후 스위치의 최종 상태 출력
        for (int k = 0; k < numOfSwitches; k++) {
            System.out.print(isTurnOn[k] ? "1 " : "0 ");
            if ((k + 1) % 20 == 0) {
                System.out.println(); // 20개마다 줄 바꿈
            }
        }
    }
}
