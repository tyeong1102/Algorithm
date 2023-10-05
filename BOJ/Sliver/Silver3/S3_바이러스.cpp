#include <bits/stdc++.h>
using namespace std;

vector<int> adj[104];
int visited[104];
int cnt = 0;
int n, m, u, v;

void dfs(int x) {
    visited[x] = 1;

    for(int i = 0; i < adj[x].size(); i++) {
        int y = adj[x][i];

        if(!visited[y]) {
            dfs(y);
            cnt++;
        }
    }
}

int main() {
    cin >> n >> m;

    for(int i = 0; i < m; i++) {
        cin >> u >> v;

        adj[u].push_back(v);
        adj[v].push_back(u);
    }

    dfs(1);

    cout << cnt << '\n';
}