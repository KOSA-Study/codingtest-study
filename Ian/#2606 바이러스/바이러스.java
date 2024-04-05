import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
static int[] visited;
static int[][] graph;
static int count, N,V;
	public static void dfs(int now) {
		visited[now] =1;
		for(int next = 1; next<= N; next++) {
			if(graph[now][next] == 1 && visited[next] ==0) {
				visited[next] =1;
				count++;
				dfs(next);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		V = Integer.parseInt(br.readLine());
		visited = new int[N+1];
		graph = new int[N+1][N+1];
		count =0;
		for (int i = 0; i < V; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x =Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x][y]=1;
			graph[y][x]=1;
		}
		dfs(1);
		
		bw.write(count+"\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
