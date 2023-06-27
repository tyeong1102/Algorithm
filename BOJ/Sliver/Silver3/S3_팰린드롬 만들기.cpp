/*
	카운딩 배열 생성. 홀수가 2개 이상인 경우에는 팰린드롬을 만들 수 없다.
	그래서 odd를 만들어 홀수를 체크하고 2개 이상이 되면 만들 수 없다는 문자열을 출력하였다.
	mid 변수에 홀수 알파벳을 저장하고, 짝수 알파벳들을 앞뒤로 저장한 문자열의 중앙 인덱스에 넣어주었다.
	그리고 for문의 인덱스는 앞뒤로 저장하는 과정을 한번에 하기 때문에 인덱스가 2씩 증가한다.
*/

#include <bits/stdc++.h>
using namespace std;

int cnt[26];
int odd; 
string s, ret;
char mid;

int main(){
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
    cout.tie(NULL);

	cin >> s;
	for(char c : s){
	cnt[c - 'A']++;
}

for(int i = 25; i >= 0; i--){
	if(cnt[i] > 0) {
		if(cnt[i] % 2 == 1){
			mid = char(i + 'A');
			odd++;
			cnt[i]--;
		}

		if(odd == 2) break;
		for(int j = 0; j < cnt[i]; j += 2){
			ret = char(i + 'A') + ret;
			ret += char(i + 'A');
		}
	}
}

	if(mid){
		ret.insert(ret.begin() + ret.size() / 2, mid);
	}
	if(odd == 2) cout << "I'm Sorry Hansoo" << '\n';
	else cout << ret << '\n';

    return 0;
}