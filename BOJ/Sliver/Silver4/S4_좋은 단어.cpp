#include <bits/stdc++.h>
using namespace std;

int n, cnt;
string s;

int main(){
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
    cout.tie(NULL);

	cin >> n;
	for(int i = 0; i < n; i++){
		cin >> s;
		stack<char> st;
		
		for(char c : s){
			if(!st.empty() && st.top() == c) st.pop();
			else st.push(c);
		}

		if(st.empty()) cnt++;
	}

	cout << cnt << '\n';

    return 0;
}