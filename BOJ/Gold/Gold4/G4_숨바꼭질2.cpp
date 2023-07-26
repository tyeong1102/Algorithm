/*
    기존의 4방향 bfs와는 달리 3방향 bfs였다.
    처음에 기저 사례를 만들어주기는 했으나 return 0으로만 지정해주고 출력값을 지정하지 않아 틀렸었다.
    코드에는 10만으로 배열을 설정 하였지만 수빈이가 2배 이동을 할 수 있기 때문에 20만으로 설정해주는 것이 좋다.
*/

#include <bits/stdc++.h>
using namespace std;

int n, k;
int visited[100004];
int cnt[100004];

int main() {
    cin >> n >> k;

    if(n == k) { // 시작과 목표점이 같을 때
        cout << 0 << '\n';
        cout << 1 << '\n';
        return 0;
    }

    // 시작점 도달
    visited[n] = 1;
    cnt[n] = 1;

    queue<int> q;
    q.push(n); // 시작점 큐에 삽입

    while(!q.empty()) {
        int here = q.front();
        q.pop();

        for(int next : {here - 1, here + 1, here * 2}) { // 현재 위치에서 이동 가능한 위치 반복
            if(0 <= next && next <= 100000) { // 최소, 최대 범위 사이에 있어야함
                if(!visited[next]) {
                    q.push(next);
                    visited[next] = visited[here] + 1; // 다음 위치 도달 시간을 현재 위치 시간 + 1
                    cnt[next] += cnt[here];
                } else if(visited[next] == visited[here] + 1) { // 이미 방문한 곳이지만, 최소 시간이라면
                    cnt[next] += cnt[here]; // 다음 위치에 도달하는 방법의 수 업데이트
                }
            }
        }
    }

    cout << visited[k] - 1 << '\n';
    cout << cnt[k] << '\n';
    return 0;
}