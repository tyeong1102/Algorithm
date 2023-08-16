#include <bits/stdc++.h>
using namespace std;

int n, m, a, b;
int arr[104];

int main() {
    cin >> n >> m;

    for(int i = 1; i <= n; i++) {
        arr[i] = i;
    }

    while(m--) {
        cin >> a >> b;
        swap(arr[a], arr[b]);
    }

    for(int i = 1; i <= n; i++) {
        cout << arr[i] << " ";
    }
}