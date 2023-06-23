#include <bits/stdc++.h>
using namespace std;

string s;
string rev; 

int main(){
    cin >> s;
    rev = s;
    reverse(rev.begin(), rev.end());

    if(rev == s) cout << 1 << '\n';
    else cout << 0 << '\n';

    return 0;
}