#include <bits/stdc++.h>
using namespace std;

const int INF = 987654321; // 최솟값을 구하는 문제일 경우 INF 설정하고 시작(문제 범위보다 크게)
int n, m, a, b, ret = INF;
int visited[34][34];

bool check() {
    for(int i = 0; i <= n; i++) {
        int start = i;

        for(int j = 1; j <= h; j++) {
            if(visited[j][start]) start++;
            else if(visited[j][start - 1]) start--;
        }

        if(start != i) return false;
    }

    return true;
}

void go(int here, int cnt) {
    if(cnt > 3 || cnt >= ret) return;
    if(check()) {
        ret = min(rec, cnt);
        return;
    }

    for(int i = here; i <= h; i++) {
        for(int j = 1; j <= n; j++) {
            if(visited[i][j] || visited[i][j - 1] || visited[i][j + 1]) continue; // 사다리가 이어지면 안되기 때문에 체크
            visited[i][j] = 1;
            go(i, cnt + 1);
            visited[i][j] = 0;
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n >> m >> h;
    
    for(int i = 0; i < m; i++) {
        cin >> a >> b;
        visited[a][b] = 1;
    }

    go(1, 0);

    cout << ((ret == INF) ? -1 : ret) << '\n';
}