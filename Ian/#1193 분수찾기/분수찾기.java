import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int line =1;
        while(line < X) {
            X-=line;
            line++;
        }
        int numer,demon;
        if(line%2 ==0) {
            numer=X;
            demon=line-X+1;
        } else {
            demon=X;
            numer=line-X+1;

        }
        System.out.println(numer + "/" + demon);
    }
}