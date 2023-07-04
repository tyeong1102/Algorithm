#include <bits/stdc++.h>
using namespace std;

int n;
string s;
char a[101][101];

string quard(int y, int x, int size) {
    if(size == 1) return string(1, a[y][x]); // 재귀함수는 기저사례 필수

    char b = a[y][x];
    string ans = "";

    for(int i = y; i < y + size; i++) {
        for(int j = x; j < x + size; j++) {
            if(b != a[i][j]) {
                ans += '(';
                ans += quard(y, x, size / 2);
                ans += quard(y, x + size / 2, size / 2);
                ans += quard(y + size / 2, x, size / 2);
                ans += quard(y + size / 2, x + size / 2, size / 2);
                ans += ')';
                return ans;
            }
        }
    }
    return string(1, a[y][x]);
}


int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n;
    
    for(int i = 0; i < n; i++) {
        cin >> s;
        for(int j = 0; j < n; j++) {
            a[i][j] = s[j];
        }
    }

    cout << quard(0, 0, n) << '\n';
    return 0;
}