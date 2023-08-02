/*
    vector의 크기를 10으로 설정 해놨어서 레벨 9까지만 저장할 수 있어서 메모리 참조에서 오류가 발생하였다,
*/

#include <bits/stdc++.h>
using namespace std;

int k;
int a[1024];
vector<int> v[14];

void go(int idx, int t, int level) {
    if(idx > t) return;
    if(idx == t) {
        v[level].push_back(a[idx]);
        return;
    }

    int mid = (idx + t) / 2;
    v[level].push_back(a[mid]);

    go(idx, mid - 1, level + 1);
    go(mid +1, t, level + 1);

    return;
}

int main() {
    cin >> k;

    int total = (int)pow(2, k) - 1;

    for(int i = 0; i < total; i++) {
        cin >> a[i];
    }

    go(0, total, 0);

    for(int i = 0; i < k; i++) {
        for(int j : v[i]) {
            cout << j << " ";
        }
        cout << '\n';
    }
}