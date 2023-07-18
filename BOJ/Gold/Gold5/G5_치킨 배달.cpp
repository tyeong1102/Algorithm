/*
    트리는 반드시 루트노드부터 탐색.
*/

#include <bits/stdc++.h>
using namespace std;

int n, m, node, root;
vector<int> adj[54];

int dfs(int u) {
    int ans = 0;
    int cnt = 0;

    for(int v : adj[u]) {       
        if(v == node) continue; // 해당 부분 탐색 건너뜀 (삭제의 역할)
        ans += dfs(v);
        cnt++;
    }

    if(cnt == 0) return 1;
    
    return ans;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n;

    for(int i = 0; i < n; i++) {
        cin >> m;

        if(m == -1) root = i;
        else adj[m].push_back(i);
    }

    cin >> node;

    if(node == root) {
        cout << 0 << '\n';
        return 0;
    }

    cout << dfs(root) << '\n';
}