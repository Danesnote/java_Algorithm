import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int M, N, K;
	static int[][] cabbage;
	static boolean[][] visit;
	static int bugCount;
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };

	static void dfs(int x, int y) {
		//방문처리
		visit[x][y] = true;
		
		//x,y 좌표 기준 동서남북을 확인
		for (int i = 0; i < 4; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];
			
			//방문하지않았고, 배추가 있으면 해당 좌표로 dfs 재귀
			if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
				if (!visit[cx][cy] && cabbage[cx][cy] == 1) {
					dfs(cx, cy);
				}
			}

		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//테스트케이스 수
		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			//벌레 수
			bugCount = 0;
			//2번째 줄 입력 토크나이징
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			// M = 행 수, N = 열 수
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			cabbage = new int[M][N];
			visit = new boolean[M][N];

			K = Integer.parseInt(st.nextToken());
			for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int p1 = Integer.parseInt(st.nextToken());
				int p2 = Integer.parseInt(st.nextToken());
				cabbage[p1][p2] = 1;
			}
			
			//모든 좌표를 반복
			for (int x = 0; x < M; x++) {
				for (int y = 0; y < N; y++) {
					if (cabbage[x][y] == 1 && !visit[x][y]) {
						//여기서 중요한 점은
						//모든 좌표를 반복하지만, 배추가 없는 곳은 dfs 메소드를 타지 않는다.
						dfs(x, y);
						//dfs 재귀를 마치면 배추가 인접해있는 곳은 모두 방문처리되었고
						//이후 bugCount를 더해줌.
						bugCount++;
					}
				}
			}

			System.out.println(bugCount);
		}

	}

}