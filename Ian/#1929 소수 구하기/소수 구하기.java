import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] arr = new int[M + 1];
    for (int i = 2; i < arr.length; i++) {
      arr[i] = i;
    }

    for (int i = 2; i < arr.length; i++) {
      if (arr[i] == 0)
        continue;
      for (int j = i + i; j < arr.length; j += i) {
        arr[j] = 0;
      }
    }
    for (int i = N; i < arr.length; i++) {
      if (arr[i] != 0) {
        System.out.println(arr[i]);
      }
    }
  }
}

