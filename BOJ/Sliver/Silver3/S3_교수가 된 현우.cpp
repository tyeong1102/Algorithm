/*
    2의 배수보다 5의 배수가 항상 더 적기 때문에, 5의 배수의 개수만 세어주면 된다.
*/

#include <bits/stdc++.h>
using namespace std;

int t, n, cnt, five;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> t;

    for(int i = 0; i < t; i++) {
        cin >> n;
        
        cnt = 0;
        five = 5;

        while(five <= n) {
            cnt += n / five;
            five *= 5;
        }

        cout << cnt << '\n';
    }
}