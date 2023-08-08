#include <bits/stdc++.h>
using namespace std;

int n, m, a, b;
vector<int> v; 

int main() {
    cin >> n >> m;

    for(int i = 1; i <= n; i++) {
        v.push_back(i);
    }

    while(m--) {
        cin >> a >> b;

        reverse(v.begin() + (a - 1), v.begin() + b);

    }
    
    for(int i = 0; i < n; i++) {
        cout << v[i] << " ";
    }
}