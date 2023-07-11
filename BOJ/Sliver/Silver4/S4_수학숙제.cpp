/*
    각 줄당 100글자라는 것을 보고 string을 떠올려야 한다. int형은 10^9라 10글자까지만 커버 가능하고, long long을 써도 10^18이라 19글자만 커버가능하기 때문.
    A = 65, a = 97 아스키 코드는 외우자.
*/

#include <bits/stdc++.h>
using namespace std;

int n;
string s, ans;
vector<string> v;

void go() {
    while(true) {
        // 아무것도 없을 경우 참조 에러가 나기 때문에, 사이즈가 있는지 확인하고 앞부분이 0이라면 지워야 한다.
        if(ans.size() && ans.front() == '0') ans.erase(ans.begin());
        else break;
    }

    if(ans.size() == 0) ans = "0"; // 0000일 경우 다 사라지기 때문에 0을 할당.
    
    v.push_back(ans);
    ans = "";
}

bool cmp(string a, string b) {
    if(a.size() == b.size()) return a < b;
    return a.size() < b.size();
}

int main() {
    cin >> n;

    for(int i = 0; i < n; i++) {
        cin >> s;
        ans = "";

        for(int j = 0; j < s.size(); j++) {
            if(s[j] < 65) ans += s[j];
            else if(ans.size()) go();
        }
        if(ans.size()) go();
    }

    sort(v.begin(), v.end(), cmp);

    for(string i : v) cout << i << '\n';
    return 0;
}