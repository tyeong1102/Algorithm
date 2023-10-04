#include <bits/stdc++.h>
using namespace std;

int a[1004][1004];
int visited[1004];
int n, m, v;

void dfs(int v) {
    visited[v] = 1;
    cout << v << " ";

    for(int i = 1; i <= n; i++) {
        if(a[v][i] == 1 && visited[i] == 0) {
            dfs(i);
        }
        
        if(i == n) return;
    }
}

void bfs(int v) {
    queue<int> q;
    q.push(v);

    while(!q.empty()) {
        int next = q.front();
        visited[next] = 1;
        cout << next << " ";
        q.pop();

        for(int i = 1; i <= n; i++) {
            if(a[next][i] == 1 && visited[i] == 0) {
                q.push(i);
                visited[i] = 1;
            }
        }
    }
}

int main() {
    int u, r;
    cin >> n >> m >> v;

    for (int i = 0; i < m; i++)
    {
        cin >> u >> r;
        a[u][r] = 1;
        a[r][u] = 1; 
    }                  

    dfs(v); 

    cout << "\n";                        
    memset(visited, 0, sizeof(visited)); 

    bfs(v);
}