/*
    3개의 정점을 가진 그래프로 판단해야 한다.
*/

#include <bits/stdc++.h>
using namespace std;

int scv[64][64][64], a[3];
int n;

int mu[6][3] = {
    {9, 3, 1},
    {9, 1, 3},
    {3, 1, 9},
    {3, 9, 1},
    {1, 3, 9},
    {1, 9, 3}
};

struct A {
    int a, b, c;
};

queue<A> q;

int solve(int a, int b, int c) {
    scv[a][b][c] = 1;
    q.push({a, b, c});

    while(q.size()) {
        int a = q.front().a;
        int b = q.front().b;
        int c = q.front().c;

        q.pop();

        if(scv[0][0][0]) break;

        for(int i = 0; i < 6; i++) {
            // 음수를 막아주는 역할, 인덱스에는 음수가 들어갈 수 없기 때문
            int na = max(0, a - mu[i][0]);
            int nb = max(0, b - mu[i][1]);
            int nc = max(0, c - mu[i][2]);

            if(scv[na][nb][nc]) continue;

            scv[na][nb][nc] = scv[a][b][c] + 1;
            q.push({na, nb, nc});
        }
    }

    return scv[0][0][0] - 1;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n;

    for(int i = 0; i < n; i++) cin >> a[i];

    cout << solve(a[0], a[1], a[2]) << '\n';
    return 0;
}