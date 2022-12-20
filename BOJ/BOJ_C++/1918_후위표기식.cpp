#include <iostream>
#include <stack>
using namespace std;

int priority(char c){
    if(c == '(' || c == ')'){
        return 0;
    } else if(c == '+' || c == '-'){
        return 1;
    } else if(c == '*' || c == '/'){
        return 2;
    }
    return 0; // return값 설정 해주기 전에는 non-void function does not return a value in all control paths가 나왔다.
}

int main(){
    stack<char> st;
    string s;
    cin >> s;

    for(int i=0; i<s.length(); i++){
        if(s[i] >= 'A' && s[i] <= 'Z'){
            cout << s[i];
        } else if(s[i] == '('){
            st.push(s[i]);
        } else if(s[i] == ')'){
            while(st.top() != '('){
                cout << st.top();
                st.pop();
            }
            st.pop();
        } else{
            while(!st.empty() && priority(st.top()) >= priority(s[i])){
                cout << st.top();
                st.pop();
            }
            st.push(s[i]);
        }
    }

    while(!st.empty()){
        cout << st.top();
        st.pop();
    }
}