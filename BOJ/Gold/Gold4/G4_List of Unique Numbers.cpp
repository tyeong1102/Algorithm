/*
    불의 최단거리와 지훈이의 최단거리를 비교하는 문제.
    반례를 생각하지 못해서 처음에 틀렸습니다가 나옴.
    INF를 설정하여 불의 초기값을 설정해 주어야 한다. 불이 아무것도 없을 때를 가정해야 하기 때문.
*/

#include <bits/stdc++.h> 
using namespace std;

const int INF = 987654321;
const int dy[4] = {0, -1, 0, 1};
const int dx[4] = {-1, 0, 1, 0};

char a[1004][1004];
int n, m, sx, sy, ans, y, x;
int fire_check[1004][1004], person_check[1004][1004];

bool in(int a,int b){
	return 0 <= a && a < n && 0 <= b && b < m;
}

int main(){
    ios_base::sync_with_stdio(false);
	cin.tie(0); 
    cout.tie(0); 

	queue<pair<int, int>> q;

    cin >> n >> m;  

	fill(&fire_check[0][0], &fire_check[0][0] + 1004 * 1004, INF);

    for(int i = 0; i < n; i++) { 
        for(int j = 0; j < m; j++) {
            cin >> a[i][j];

            if(a[i][j] == 'F') {
                fire_check[i][j] = 1; 
                q.push({i, j});
            } else if(a[i][j] == 'J') {
                sy = i; sx = j;
            }
        }
    } 

	while(q.size()) {
        tie(y, x) = q.front(); 
		q.pop();

		for(int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];

			if(!in(ny,nx)) continue;
			if(fire_check[ny][nx] != INF || a[ny][nx]=='#') continue;

			fire_check[ny][nx] = fire_check[y][x] + 1;
			q.push({ny, nx});
		}
	}

	person_check[sy][sx]=1;
	q.push({sy,sx});

	while(q.size()) {
		int y = q.front().first;
		int x = q.front().second;
		q.pop(); 

		if(x == m - 1 || y == n - 1 || x == 0 || y == 0) { // 벽에 닿았는지 확인
            ans = person_check[y][x];
            break;
		}

		for(int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];

			if(!in(ny,nx)) continue;
			if(person_check[ny][nx] || a[ny][nx]=='#') continue; 
			if(fire_check[ny][nx] <= person_check[y][x] + 1) continue;

            person_check[ny][nx] = person_check[y][x] + 1;
            q.push({ny, nx});
		}
	} 

    if(ans != 0) cout << ans << "\n";
	else cout << "IMPOSSIBLE \n";

	return 0;
}