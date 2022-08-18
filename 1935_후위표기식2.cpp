#include <iostream>
#include <stack>
#include <vector>
using namespace std;

int main(){
    int n, input;
    string s;
    vector<int> v;
    stack<double> st;
    cin >> n;
    cin >> s;

    for(int i=0; i<n; i++){
        cin >> input;
        v.push_back(input); // 대응값 설정
    }

    for(int i=0; i<s.length(); i++){
        if(s[i] >= 'A' && s[i] <= 'Z'){
            st.push(v[s[i]-'A']);
        } else{
            if(!st.empty()){
                double tmp = st.top();
                st.pop();
                if(s[i] == '+'){
                    tmp = st.top() + tmp;
                } else if(s[i] == '-'){
                    tmp = st.top() - tmp;
                } else if(s[i] == '*'){
                    tmp = st.top() * tmp;
                } else if(s[i] == '/'){
                    tmp = st.top() / tmp;
                }
                st.pop();
                st.push(tmp);
            }
        }
    }
    cout << fixed; // 소수점 아래 개수만 설정
    cout.precision(2); // 소수점 아래 2자리
    cout << st.top();
}