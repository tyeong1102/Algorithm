/* 
    단순히 탐색만 하는 것이기 때문에 dfs, bfs 다 상관없다.
*/

#include <bits/stdc++.h>
using namespace std;

int dy[] = {-1, 0, 1, 0};
int dx[] = {0, 1, 0, -1};

int n, m, cnt, cnt2;
int a[104][104], visited[104][104];
vector<pair<int, int>> v;

void dfs(int y, int x) {
    visited[y][x] = 1;
    if(a[y][x] == 1) {
        v.push_back({y, x}); // 녹을 예정인 곳 저장
        return;
    }

    for(int i = 0; i < 4; i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];
        if(ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
        if(visited[ny][nx]) continue;
        dfs(ny, nx);
    }
    return;
}

int main() {
    cin >> n >> m;

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            cin >> a[i][j];
        }
    }

    while(true) {
        cnt2 = 0;
        fill(&visited[0][0], &visited[0][0] + 104 * 104, 0);
        v.clear();

        dfs(0, 0);

        for(pair<int, int> b : v) {
            cnt2++;
            a[b.first][b.second] = 0;
        }

        bool flag = 0;  

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(a[i][j] != 0) flag = 1;
            }
        }

        cnt++;
        if(!flag) break; // 더 이상 녹을 치즈가 없을 경우
    }

    cout << cnt << '\n';
    cout << cnt2 << '\n';
}