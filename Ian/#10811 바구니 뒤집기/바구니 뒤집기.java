import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i< arr.length;i++) {
            arr[i]=i+1;
        }
        for (int i =0; i< M;i ++) {
        int firstInput = sc.nextInt()- 1; // 0
        int secondInput = sc.nextInt() - 1; // 3
    while(firstInput < secondInput){
        int temp =arr[firstInput];
        arr[firstInput++] = arr[secondInput];
        arr[secondInput--] = temp;

        }

        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}