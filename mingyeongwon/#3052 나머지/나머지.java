import java.util.*;

public class Main {

  public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     int[] array = new int[10];
     int duplication = 0;
     
     for(int i=0; i<array.length; i++) {
    	 array[i] = sc.nextInt() % 42;
    	 for(int j=0; j<i; j++) {
    		 if(array[j] == array[i]) {
    			 duplication++;
    			 break;
    		 }
    	 }
     }
     
     System.out.println(array.length - duplication);
     
  }
}