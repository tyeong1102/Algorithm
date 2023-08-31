#include <bits/stdc++.h>
using namespace std;

string s, t, ret;
stack<char> st;

int main() {
    cin >> s >> t;

    for(char c : s) {
        st.push(c);

        if(st.size() >= t.size() && st.top() == t[t.size() - 1]) {
            string temp = "";

            for(char b : t) {
                temp += st.top();
                st.pop();
            }

            reverse(temp.begin(), temp.end());

            if(t != temp) {
                for(int i = 0; i < temp.size(); i++) {
                    st.push(temp[i]);
                }
            }
        }
    }

    if(st.size() == 0) {
        cout << "FRULA" << '\n';
    } else {
        while(st.size()) {
            ret += st.top();
            st.pop();
        }

        reverse(ret.begin(), ret.end());
        cout << ret << '\n';
    }

}