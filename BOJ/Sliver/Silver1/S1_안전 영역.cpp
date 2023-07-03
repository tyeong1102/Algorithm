/*
	처음에는 단순히 dfs를 사용하여 N * N 크기의 2차원 배열에서 N보다 큰 부분을 영역으로 하여 영역의 개수를 구하면 되는 줄 알았다.
	예제도 통과하여 문제가 없을 것 같았는데, 높이가 될 수 있는 경우를 모두 검토 해줬어야 했다. 
	그래서 초기 코드에는 없던 변수 d가 추가되었다.
*/
#include <bits/stdc++.h>
using namespace std;

int dy[4] = {-1, 0, 1, 0};
int dx[4] = {0, 1, 0, -1};

int n, ans = 1;
int a[101][101], visited[101][101];

void dfs(int y, int x, int d){
    visited[y][x] = 1; 

    for(int i = 0; i < 4; i++){
        int ny = y + dy[i]; 
        int nx = x + dx[i]; 
        if(ny < 0 || nx < 0 || ny >= n || nx >= n) continue; 
        if(!visited[ny][nx] && a[ny][nx] > d) dfs(ny, nx, d);
    }
    return;
} 

int main() {
	ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n; 

    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            cin >> a[i][j];
        }
    }

    for(int d = 1; d < 101; d++){
        fill(&visited[0][0], &visited[0][0] + 101 * 101, 0); // 케이스 마다 0으로 초기화
        int cnt = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(a[i][j] > d && !visited[i][j]) {
                    dfs(i, j, d);
                    cnt++;
                }
            }
        }
        ans= max(ans, cnt);
    }

    cout << ans << '\n';
    return 0; 
}