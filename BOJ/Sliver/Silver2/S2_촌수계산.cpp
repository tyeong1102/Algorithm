/*
    처음에는 flower 함수에 체크해주는 코드까지 같이 넣어서 범위를 벗어나거나 겹칠 경우 return 0을 해주는 방식을 사용하였다.
    하지만 그럴 경우 3개의 씨앗이 다 피지 못해도 0으로 출력되어 최솟값에 문제가 발생하여 check 함수를 따로 구현하였다.
*/
#include <bits/stdc++.h>
using namespace std;

const int dy[] = {-1, 0, 1, 0};
const int dx[] = {0, 1, 0, -1};

int ret = 987654321;
int n, cnt;
int a[14][14], visited[14][14];

int flower(int y, int x) {
    visited[y][x] = 1;

    int price = a[y][x];

    for(int i = 0; i < 4; i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];

        visited[ny][nx] = 1;
        price += a[ny][nx];
    }

    return price;
}

bool check(int y, int x) {
    if(visited[y][x]) return 0;

    for(int i = 0; i < 4; i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];

        if(ny < 0 || ny >= n || nx < 0 || nx >= n || visited[ny][nx]) return 0;
    }

    return 1;
}

void erase(int y, int x) {
    visited[y][x] = 0;

    for(int i = 0; i < 4; i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];

        visited[ny][nx] = 0;
    }
}

void calc(int cnt, int total) {
    if(cnt == 3) {
        ret = min(ret, total);
        return;
    }

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            if(check(i, j)) {
                calc(cnt + 1, total + flower(i, j));
                erase(i, j);
            }
        }
    }
}

int main() {
    cin >> n;

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            cin >> a[i][j];
        }
    }

    calc(0, 0);

    cout << ret;
}