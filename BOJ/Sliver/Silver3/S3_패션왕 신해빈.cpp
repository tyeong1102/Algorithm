/*
	경우의 수 문제 같은 경우 수가 커질 수 있기 때문에 long long 형으로 만들고 시작하는 것이 좋다.
	a.second에 1을 더해준 것은 안 입은 경우도 포함한 것이다. 단지 한 부위만 안입었을 수도 있기 때문에.
	마지막에 ret을 1 줄여주는 이유는 아무것도 안입는 경우를 하나 제거해준 것.
*/

#include <bits/stdc++.h>
using namespace std;

int t, n;
string s1, s2;

int main(){
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
    cout.tie(NULL);

	cin >> t;
	while(t--) {
		map<string, int> mp;
		cin >> n;
		for(int i = 0; i < n; i++) {
			cin >> s1 >> s2;
			mp[s2]++;
		}

		long long ret = 1;
		for(auto a : mp){
			ret *= ((long long)a.second + 1);
		}
		ret --;

		cout << ret << '\n';
	}

    return 0;
}