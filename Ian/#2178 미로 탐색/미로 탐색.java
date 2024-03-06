import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	private static int[] dx = { -1, 1, 0, 0 }; // 상하좌우 방향
	private static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt(); // 행의 개수
		int m = scanner.nextInt(); // 열의 개수
		scanner.nextLine(); // 개행 문자(\n) 읽기

		int[][] maze = new int[n][m];
		for (int i = 0; i < n; i++) {
			String line = scanner.nextLine();
			for (int j = 0; j < m; j++) {
				maze[i][j] = line.charAt(j) - '0';
			}
		}

		int result = bfs(maze, n, m);
		System.out.println(result);

		scanner.close();
	}

	private static int bfs(int[][] maze, int n, int m) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];

		queue.offer(new int[] { 0, 0 }); // 시작 위치 (0, 0) enque
		visited[0][0] = true;

		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			int x = curr[0];
			int y = curr[1];

			// 도착 지점에 도달한 경우 현재까지 지나온 칸 수를 반환
			if (x == n - 1 && y == m - 1) {
				return maze[x][y];
			}

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				// 범위를 벗어난 경우 무시
				if (nx < 0 || nx >= n || ny < 0 || ny >= m)
					continue;

				// 이동할 수 없는 칸(0)이거나 이미 방문한 칸인 경우 무시
				if (maze[nx][ny] == 0 || visited[nx][ny])
					continue;

				// 현재 칸에서 다음 칸으로 이동할 때 칸 수를 갱신하고, 다음 칸을 큐에 enque
				maze[nx][ny] = maze[x][y] + 1;
				visited[nx][ny] = true;
				queue.offer(new int[] { nx, ny });
			}
		}

		return -1; // 도착 지점에 도달하지 못한 경우
	}
}
