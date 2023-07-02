/*
	최소 칸 수를 구하는 문제이기 때문에 바로 dfs가 떠올라야한다.
*/

#include <bits/stdc++.h>
using namespace std;

int dy[4] = {-1, 0, 1, 0};
int dx[4] = {0, 1, 0, -1};

int n, m, y, x;
int a[104][104], visited[104][104];

int main() {
	scanf("%d" "%d", &n, &m);

	for(int i = 0; i < n; i++) {
		for(int j = 0; j < m; j++) {
			scanf("%1d", &a[i][j]);
		}
	}

	queue<pair<int, int>> q; // y, x 좌표이기 때문에 pair사용
	visited[0][0] = 1; // 첫 번째 스타트 지점에서 visited 설정
	q.push({0, 0}); // 그 다음에 push

	while(q.size()) {
		tie(y, x) = q.front();
		q.pop();

		for(int i = 0; i < 4; i++) {
			// 4방향 탐색
			int ny = y + dy[i];
			int nx = x + dx[i];
			// 맵의 범위를 벗어났는지 체크, 마지막은 문제에서 0을 건널 수 없다고 했기 때문에 설정
			if(ny < 0 || ny >= n || nx < 0 || nx >= m || a[ny][nx] == 0) continue; 
			if(visited[ny][nx]) continue; // 방문 확인
			visited[ny][nx] = visited[y][x] + 1;
			q.push({ny, nx});
		}
	}

	printf("%d", visited[n - 1][m -  1]);
	return 0;
}