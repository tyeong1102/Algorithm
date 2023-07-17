#include <bits/stdc++.h>
using namespace std;

int n, m, a, b, mx;
int arr[10004], visited[10004];
vector<int> v[10004];

int dfs(int here) {
    visited[here] = 1;
    int ans = 1;

    for(int there : v[here]) {
        if(visited[there]) continue;
        ans += dfs(there);
    }
    return ans;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n >> m;

    while(m--) {
        cin >> a >> b;
        v[b].push_back(a);
    }

    for(int i = 1; i <= n; i++) {
        memset(visited, 0, sizeof(visited));
        arr[i] = dfs(i);
        mx = max(arr[i], mx);
    }

    for(int i = 1; i <= n; i++) {
        if(mx == arr[i]) cout << i << " ";
    }
    
    return 0;
}