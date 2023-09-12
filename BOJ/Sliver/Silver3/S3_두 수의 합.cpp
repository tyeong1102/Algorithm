#include <bits/stdc++.h>
using namespace std;

int n, x, ret;

int main() {
    cin >> n;
    vector<int> v(n);

    for(int i = 0; i < n; i++) {
        cin >> v[i];
    }

    cin >> x;

    sort(v.begin(), v.end());

    int s = 0, e = n - 1;

    while(s < e) {
        if(v[s] + v[e] == x) e--, ret++;
        else if(v[s] + v[e] > x) e--;
        else if(v[s] + v[e] < x) s++;
    }

    cout << ret << '\n';

}