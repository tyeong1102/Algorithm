#include <bits/stdc++.h>
using namespace std;

string s;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    while(true) {
        stack<char> st;
        getline(cin, s);
        if(s == ".") break;
        bool check = true;

        for(int i = 0; i < s.length(); i++) {
            if(s[i] == '(' || s[i] == '[') st.push(s[i]);
            else if(s[i] == ')' || s[i] == ']') {
                if(st.empty()) {
                    check = false;
                    break;
                } else if(s[i] == ')' && st.top() != '(') {
                    check = false;
                    break;
                } else if(s[i] == ']' && st.top() != '[') {
                    check = false;
                    break;
                }
                st.pop();
            }
        }

        if(!st.empty()) check = false;

        if(check) cout << "yes" << '\n';
        else cout << "no" << '\n'; 
    }
}