#include <bits/stdc++.h>
using namespace std;

int n, m, a, b, k;
int arr[104];

int main() {
    cin >> n >> m;

    while(m--) {
        cin >> a >> b >> k;

        for(int i = a; i <= b; i++) {
            arr[i] = k;
        }
    }

    for(int i = 1; i <= n; i++) {
        cout << arr[i] << " ";
    }
}