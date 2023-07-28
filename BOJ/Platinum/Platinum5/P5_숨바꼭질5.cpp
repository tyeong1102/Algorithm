/*
    수빈이의 홀짝 위치 파악이 중요하였다.
    수빈이는 앞뒤로 1칸을 이동할 수 있기 때문에, 만약 한 지점이 있을 때, 수빈이는 5초에 도착하고 동생은 7초에 도착한다면
    +1후 -1을 해서 다시 돌아오면 동생을 만날 수 있다. 
*/

#include <bits/stdc++.h>
using namespace std;

const int MAX = 500000;
int n, k, over, sec = 1;
int visited[2][MAX + 4];

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n >> k;

    if(n == k) {
        cout << 0 << '\n';
        return 0;
    }

    queue<int> q;
    visited[0][n] = 1;
    q.push(n);

    while(q.size()) {
        k += sec; // 동생의 위치

        if(k > MAX) break;
        if(visited[sec % 2][k]) {
            over = true;
            break;
        }
        
        int qSize = q.size();
        for(int i = 0; i < qSize; i++) {
            int x = q.front();
            q.pop();
            
            for(int nx : {x - 1, x + 1, x * 2}) {
                if(nx < 0 || nx > MAX || visited[sec % 2][nx]) continue;
                visited[sec % 2][nx] = visited[(sec + 1) % 2][x] + 1;
                if(nx == k) {
                    over = 1;
                    break;
                }
                q.push(nx);
            }
        }
        if(over) break;
        sec++;
    }

    if(over) cout << sec << '\n';
    else cout << -1 << '\n';
    
    return 0;
}