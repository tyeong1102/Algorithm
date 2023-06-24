#include <bits/stdc++.h>
using namespace std;

int N;
string s;
int cnt[26];
vector<char> v;

int main(){
    cin >> N;
    for(int i = 0; i < N; i++) {
        cin >> s;
        cnt[s[0] - 'a']++;
    }

    for(int i = 0; i < 26; i++) {
        if(cnt[i] >= 5) v.push_back(i + 'a');
    }

    if(v.empty()) cout << "PREDAJA" << '\n';
    else {
        for(int i = 0; i < v.size(); i++) {
            cout << v[i];
        }
    }
    
    return 0;
}