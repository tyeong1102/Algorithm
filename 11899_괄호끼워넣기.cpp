#include <iostream>
#include <string>
#include <stack>
using namespace std;

int main(){
    string s;
    cin >> s;

    stack<char> st;
    int cnt = 0;

    for(int i=0; i<s.size(); i++){
        if(!st.empty()){
            if(s[i] == ')' && st.top() == '('){
                st.pop();
            } else {
                st.push(s[i]);
            }
        } else { 
            if(s[i] == '('){
                st.push(s[i]);
            } else{
                cnt++;
            }
        }
    }

    if(!st.empty()){
        cnt += st.size();
    }

    cout << cnt << '\n';
}