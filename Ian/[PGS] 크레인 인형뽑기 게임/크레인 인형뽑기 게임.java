import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {

    Stack<Integer> dollsStack = new Stack<>();
    int count = 0;

    for (int move : moves) {
      for (int i = 0; i < board.length; i++) {
        if (board[i][move - 1] != 0) {
          if (!dollsStack.empty() && dollsStack.peek() == board[i][move - 1]) {
            board[i][move - 1] = 0;
            dollsStack.pop();
            count += 2;
            break;
          }
          dollsStack.push(board[i][move - 1]);
          board[i][move - 1] = 0;
          break;
        }
      }
    }
    return count;
    }
}
  
