#include <bits/stdc++.h>
using namespace std;

int t;  
string s; 

bool check(string s){
	stack<char> st; 

	for(char c : s){
		if(c == '(')st.push(c); 
		else{
			if(!st.empty()) st.pop(); 
			else return false; 
		}
	}
	return st.empty();
}

int main() {
	cin >> t; 

	for(int i = 0; i < t; i++){
		cin >> s; 

		if(check(s)) cout << "YES\n"; 
		else cout << "NO\n";
	}  

	return 0;
} 