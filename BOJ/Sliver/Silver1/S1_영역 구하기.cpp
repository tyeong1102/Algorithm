#include<bits/stdc++.h> 
using namespace std;

#define y1 aaaa // bits/stdc++.h에 y1이 이미 전역변수로 생성되어 있어서 따로 정의해야 한다.....

int m, n, k, x1, x2, y1, y2;
int a[104][104], visited[104][104];

const int dy[4] = {-1, 0, 1, 0};
const int dx[4] = {0, 1, 0, -1};
vector<int> ans; 

int dfs(int y, int x) {
    visited[y][x] = 1; 
    int ans = 1; // 시작 노드는 방문한 상태이기 떄문에 1

    for(int i = 0; i < 4; i++) {
        int ny = y + dy[i]; 
        int nx = x + dx[i]; 
        if(ny < 0 || ny >= m || nx < 0 || nx >= n || visited[ny][nx] == 1) continue; // 범위 벗어나거나 방문된 상태
		if(a[ny][nx] == 1) continue; // 이미 색칠된 구간
        ans += dfs(ny, nx);
    } 

    return ans; 
}

int main() { 
    ios_base::sync_with_stdio(false);  
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> m >> n >> k; 

    for(int i = 0; i < k; i++) {
        cin >> x1 >> y1 >> x2 >> y2; 

        for(int x = x1; x < x2; x++) {
            for(int y = y1; y < y2; y++) {
                a[y][x] = 1; // 사각형 내부 색칠
            }
        }
    }

    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(a[i][j] != 1 & visited[i][j] == 0) { 
                ans.push_back(dfs(i, j)); // 정렬을 위해 벡터에 삽입
            }
        }
    }

    sort(ans.begin(), ans.end()); // 오름차순 정렬

    cout << ans.size() << "\n";
    for(int a : ans) cout << a << " "; 

    return 0; 
}
 