/*
	fill()로 배열의 초기화를 해주어야 한다. 그렇지 않으면 틀렸습니다 됨.
*/

#include <bits/stdc++.h>
using namespace std;

int dy[4] = {-1, 0, 1, 0};
int dx[4] = {0, 1, 0, -1};

int t, m, n, k, y, x;
int a[51][51], visited[51][51];

void dfs(int y, int x) {
	visited[y][x] = 1;
	for(int i = 0; i < 4; i++) {
		int ny = y + dy[i];
		int nx = x + dx[i];
		if(ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
		if(a[ny][nx] == 1 && !visited[ny][nx]) {
			dfs(ny, nx);
		}
	}
	return;
}

int main() {
	cin >> t;

	for(int i = 0; i < t; i++) {
		// 초기화 과정이 필요함
		fill(&a[0][0], &a[0][0] + 51 * 51, 0);
        fill(&visited[0][0], &visited[0][0] + 51 * 51, 0);

		int cnt = 0;
		cin >> m >> n >> k;

		for(int j = 0; j < k; j++) {
			cin >> x >> y;
			a[y][x] = 1;
		}

		for(int j = 0; j < n; j++) {
			for(int k = 0; k < m; k++) {
				if(a[j][k] == 1 && !visited[j][k]){ // 해당 칸이 1이고 방문하지 않았다면
					dfs(j, k); // dfs
					cnt++; // 뻗어나가는게 끝나면 +1
				}
			} // 다시 다음 시작점을 찾음 -> 반복
		}
		cout << cnt << '\n';
	}
}