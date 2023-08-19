#include <bits/stdc++.h>
using namespace std;

string a, b;

string add(string a, string b) {
    int sum = 0; // 올림을 처리
    string ret;

    while(a.size() || b.size() || sum) {
        if(a.size()) {
            sum += a.back() - '0';
            a.pop_back();
        }

        if(b.size()) {
            sum += b.back() - '0';
            b.pop_back();
        }

        ret += (sum % 10) + '0';
        sum /= 10;
    }
    
    reverse(ret.begin(), ret.end());
    return ret;
}

int main() {
    cin >> a >> b;

    cout << add(a, b) << '\n';
}