import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt(); //바구니 개수, 번호
    int M = sc.nextInt(); //줄
    
    int[] arr = new int[N];
    
    for(int a=0; a<M; a++) {
      int i = sc.nextInt();
      int j = sc.nextInt();
      int k = sc.nextInt();
      for(int b=i; b<j+1; b++) {
        arr[b-1] = k;
      }
    }
    
    for(int a=0; a<N; a++) {
      System.out.print(arr[a] + " ");
    }
    
    sc.close();

  }

}