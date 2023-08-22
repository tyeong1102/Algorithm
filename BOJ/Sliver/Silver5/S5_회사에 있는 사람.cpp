#include <bits/stdc++.h>
using namespace std;

string a[8] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
string s;
int idx;

int main() {
    cin >> s;

    for(int i = 0; i < 8; i++) {
        while(true) {
            idx = s.find(a[i]);
            
            if(idx == string::npos) break;
            s.replace(idx, a[i].length(), " ");
        }
    }
    cout << s.length() << '\n';
}