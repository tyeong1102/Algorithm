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

    int f = 0, b = n - 1;

    while(f < b) {
        if(v[f] + v[b] == x) b--, ret++; 
        else if(v[f] + v[b] > x) b--;
        else if(v[f] + v[b] < x) f++;
    }

    cout << ret << '\n';

}