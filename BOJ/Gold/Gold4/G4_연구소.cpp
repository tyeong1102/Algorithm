/*
    우선 무식하게 벽 3개를 세우는 방법에 대해 생각을 하고 그 다음에 효율적으로 배치할 생각을 해야한다.
    N의 범위를 보고 경우의 수를 계산하였을 때, 많게는 1억 최소 1천만 아래면 무식하게 풀 생각을 먼저 해야한다.
*/

#include <bits/stdc++.h> 
using namespace std;

int n, m, ans;
int a[10][10], visited[10][10];

vector<pair<int, int>> virus, wall;

const int dy[] = {-1, 0, 1, 0};
const int dx[] = {0, 1, 0, -1};

void dfs(int y, int x) {
    for(int i = 0; i < 4; i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];
        if(ny < 0 || nx < 0 || ny >= n || nx >= m || visited[ny][nx] || a[ny][nx] == 1) continue;
        visited[ny][nx] = 1;
        dfs(ny, nx);
    }
    return;
}

int solve() {
    // 경우의 수마다 초기화
    fill(&visited[0][0], &visited[0][0] + 10 * 10, 0);

    for(pair<int, int> b : virus) {
        visited[b.first][b.second] = 1;
        dfs(b.first, b.second);
    }

    int cnt = 0;
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            // 안전 영역이고 방분도 하지 않았다면 증가
            if(a[i][j] == 0 && !visited[i][j]) cnt++;
        }
    }
    return cnt;
}

int main() {
    cin >> n >> m;

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            cin >> a[i][j];
            if(a[i][j] == 2) virus.push_back({i, j});
            if(a[i][j] == 0) wall.push_back({i, j}); // 바이러스에 감염된 지역에는 벽을 세울 수 없기 때문에 따로 지정
        }
    }

    // Combination을 사용할 때 3중 for문까지는 함수를 만들지 말고 사용하자.
    for(int i = 0; i < wall.size(); i++) {
        for(int j = 0; j < i; j++) {
            for(int k = 0; k < j; k++) {
                // 벽을 놓을 수 있는 모든 위치에 벽 놓아보기
                a[wall[i].first][wall[i].second] = 1;
                a[wall[j].first][wall[j].second] = 1;
                a[wall[k].first][wall[k].second] = 1;

                ans = max(ans, solve());

                // 다시 원상태로 복구
                a[wall[i].first][wall[i].second] = 0;
                a[wall[j].first][wall[j].second] = 0;
                a[wall[k].first][wall[k].second] = 0;
            }
        }
    }

    cout << ans << '\n';
    return 0;
}