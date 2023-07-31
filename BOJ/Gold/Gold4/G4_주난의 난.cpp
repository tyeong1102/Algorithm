#include <bits/stdc++.h>
using namespace std;

#define y1 aaa

int n, m, y1, x1, y2, x2;
char a[304][304];
int visited[304][304];
queue<pair<int, int>> q;

const int dy[] = {-1, 0, 1, 0};
const int dx[] = {0, 1, 0, -1};

void bfs(int y, int x) {
    visited[y][x] = 1;
    q.push({y, x});

    int cnt = 0;

    while(a[y2][x2] != '0') {
        cnt++; // 레벨 증가
        queue<pair<int, int>> temp;

        while(q.size()) {
            tie(y, x) = q.front();
            q.pop(); // q에는 아무것도 없는 상태

            for(int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if(ny < 0 || ny > n || nx < 0 || nx > m) continue;
                if(visited[ny][nx]) continue;

                visited[ny][nx] = cnt;

                if(a[ny][nx] != '0') {
                    a[ny][nx] = '0';
                    temp.push({ny, nx}); // 1일 떄는 temp에 push하고 잠시 멈춤
                } else {
                    q.push({ny, nx}); // 0일 때는 q에 push하고 계속 탐색
                }
            }
        }
        q = temp; // temp에 저장된 지점부터 다시 시작
    } 
}

int main() {
    cin >> n >> m;
    cin >> y1 >> x1 >> y2 >> x2;

    y1--, x1--, y2--, x2--;
    
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            cin >> a[i][j];
        }
    }
    
    bfs(y1, x1);

    cout << visited[y2][x2] << '\n';
}