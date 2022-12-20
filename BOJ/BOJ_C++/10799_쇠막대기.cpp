#include <iostream>
#include <string>
#include <stack>
using namespace std;

int main(){
    string s;
    cin >> s;

    stack<int> st;
    int cnt = 0;

    for(int i=0; i<s.size(); i++){
        if(s[i] == '('){
            st.push(i);
        } else{
            if(st.top()+1 == i){  // 레이저 끝
                st.pop();
                cnt += st.size(); // 스택의 크기가 잘리는 블록이랑 같음.
            } else{
                st.pop();
                cnt += 1;
            }
        }
    }

    cout << cnt << '\n';
}