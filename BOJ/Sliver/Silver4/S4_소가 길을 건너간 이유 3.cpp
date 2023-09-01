#include <bits/stdc++.h>
using namespace std;

int N, arrive, t;
vector<pair<int, int>> v;

int main() {
    cin >> N;
    
    for (int i = 0; i < N; i++) {
        cin >> arrive >> t;
        v.push_back({arrive, t});
    }

    sort(v.begin(), v.end());

    int ret = v[0].first + v[0].second;

    for (int i = 1; i < N; i++) {
        ret = max(ret, v[i].first);
        ret += v[i].second;
    }

    cout << ret << '\n';

}