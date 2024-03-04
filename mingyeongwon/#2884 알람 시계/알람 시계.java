import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int H = sc.nextInt();
    int M = sc.nextInt();
    
    if(M>=45) {
      M -= 45;
    } else if(H>0){
      M += 15;
      H--;
    } else {
      M += 15;
      H = 23;
    }
   
    System.out.println(H + " " + M);
    
    sc.close();
  }

}