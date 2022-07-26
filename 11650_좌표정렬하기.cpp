#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){

    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, x, y;
    vector<pair<int, int>> v;  // x, y
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> x >> y;
        v.push_back({x, y});
    }

    sort(v.begin(), v.end());

    for(int i=0; i<n; i++){
        cout << v[i].first << " " << v[i].second << '\n';
    }
}