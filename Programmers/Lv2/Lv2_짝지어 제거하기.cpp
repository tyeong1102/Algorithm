#include <bits/stdc++.h>
using namespace std;

int solution(string s)
{
    stack<char> st;
    st.push(s[0]);
    
    for(int i = 1; i < s.size(); i++) {
        if(!st.empty() && st.top() == s[i]) st.pop();
        else st.push(s[i]);
    }
    
    if(st.empty()) return 1;
    else return 0;
}