#include <bits/stdc++.h>
using namespace std;

#define prev aaa

const int MAX = 200000;

int n, k, here, ans;
int prev[MAX + 4], visited[MAX + 4];
vector<int> v;


int main() {
    cin >> n >> k;

    visited[n] = 1;
    queue<int> q;
    q.push(n);

    while(q.size()) {
        here = q.front();
        q.pop();

        if(here == k) {
            ans = visited[k];
            break;
        }
 
        for(int next : {here - 1, here + 1, here * 2}) {
            if(next >= MAX || next < 0 || visited[next]) continue; 
            visited[next] = visited[here] + 1;
            prev[next] = here;
            q.push(next);
        }
    }

    for(int i = k; i != n; i = prev[i]) {
        v.push_back(i);
    }

    v.push_back(n);

    cout << ans - 1 << '\n';

    reverse(v.begin(), v.end());

    for(int i : v) cout << i << ' ';
    return 0;
}