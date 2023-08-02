#include <bits/stdc++.h>
using namespace std;

int k, visited[10];
char a[10];
vector<string> v;

bool pass(char x, char y, char oper) {
    if(x < y && oper == '<') return true;
    if(x > y && oper == '>') return true;
    return false;
}

void go(int idx, string num) {
    if(idx == k + 1) {
        v.push_back(num);
    }

    for(int i = 0; i <= 9; i++) {
        if(visited[i]) continue;
        if(idx == 0 || pass(num[idx - 1], i + '0', a[idx - 1])) {
            visited[i] = 1;
            go(idx + 1, num + to_string(i));
            visited[i] = 0;
        }
    }
    return;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> k;

    for(int i = 0; i < k; i++) {
        cin >> a[i];
    }

    go(0, "");

    sort(v.begin(), v.end());

    cout << v[v.size() - 1] << '\n';
    cout << v[0] << '\n';
}