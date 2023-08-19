#include <bits/stdc++.h>
using namespace std;

int n, size, ret;
string s;
stack<int> st;

int main() {
    cin >> n;
    cin >> s;

    st.push(-1);

    for(int i = 0; i < s.size(); i++) {

        if(s[i] == '(') {
            st.push(i);
        }

        if(s[i] == ')') {
            st.pop();

            if(!st.empty()) {
                ret = max(ret, i - st.top());
            } else {
                st.push(i);
            }
        }
    }

    cout << ret << '\n';
}