#include <bits/stdc++.h>
using namespace std;

int n, m, j, pos, start, finish, ans;

int main() {
    cin >> n >> m >> j;

    start = 1;

    while(j--) {
        finish = start + m - 1;
        cin >> pos;

        if(pos >= start && pos <= finish) continue;
        else {
            if(pos < start) {
                ans += start - pos;
                start = pos;
            } else {
                start += pos - finish;
                ans += pos - finish;
            }
        }
    }

    cout << ans << '\n';
}