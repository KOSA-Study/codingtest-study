import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      int[] heights = new int[N];
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      Stack<Integer> stack = new Stack<>();
      StringBuilder result = new StringBuilder();

      for (int i = 0; i < N; i++) {
         int currentHeight = Integer.parseInt(st.nextToken());
         heights[i] = currentHeight;

         while (!stack.isEmpty()) {
            if (heights[stack.peek()] < currentHeight) {
               stack.pop();
            } else {
               result.append((stack.peek() + 1) + " ");
               break;
            }
         }
         if (stack.isEmpty()) {
            result.append("0 ");
         }

         stack.push(i);
      }

      System.out.println(result);
   }
}