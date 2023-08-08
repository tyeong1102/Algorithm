#include <bits/stdc++.h>
using namespace std;

int n, num;

int main() {
    cin >> n;

    if(n % 4 == 0) {
        num = n / 4;
    } else {
        num = n / 4 + 1;
    }

    for(int i = 0; i < num; i++) {
        cout << "long" << " ";
    }
    cout << "int" << '\n';
}