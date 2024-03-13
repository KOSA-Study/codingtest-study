

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(minBags(N));
    }
public static int minBags(int N) {
    for (int fiveKgBag = N/5; fiveKgBag>=0; fiveKgBag--){
        int remainingWeight = N-(fiveKgBag*5);
        if(remainingWeight %3 ==0){
            int threeKgBag = remainingWeight/3;
            return threeKgBag+fiveKgBag;
        }
    }
    return -1;
}
}