#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main(){
    string s;
    bool open = false;
    getline(cin, s);

    stack<char> st;

    for(int i=0; i<s.size(); i++){
        if(s[i] == '<'){
            while(!st.empty()){
                cout << st.top();
                st.pop();
            }
            open = true;
            cout << s[i];
        } else if(s[i] == '>'){
            open = false;
            cout << s[i];
        } else if(open){
            cout << s[i];
        } else{
            if(s[i] == ' '){
                while(!st.empty()){
                    cout << st.top();
                    st.pop();
                }
                cout << s[i];
            } else{
                st.push(s[i]);
            }
        }
    }
    
    while(!st.empty()){
        cout << st.top();
        st.pop();
    }
}