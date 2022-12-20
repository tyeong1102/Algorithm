#include <iostream>
#include <stack>
#include <vector>
using namespace std;

/*
굳이 수를 넣으려고 하지말고 인덱스 번호를 활용해 스택에 push하면 더 간편하다.
*/

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int n;
    cin >> n;

    vector<int> v(n); // 입력 받는 배열.
    vector<int> res(n); // 결과 배열.

    stack<int> st;

    for(int i=0; i<n; i++){
        cin >> v[i]; // 수 입력 받음.
    }

    st.push(0); // 처음에는 아무것도 없기 때문에 0 입력.

    for(int i=1; i<n; i++){
        if(st.empty()){
            st.push(i); // 비어 있으면 새로운 i 삽입.
        }
        while(!st.empty() && v[st.top()] < v[i]){ 
            res[st.top()] = v[i];
            st.pop();
        }
        st.push(i);
    }

    while(!st.empty()){
        res[st.top()] = -1; // n까지 다 돌리고 남은 수는 작은 수가 없는 것이라 -1.
        st.pop();
    }

    for(int i=0; i<n; i++){
        cout << res[i] << ' ';
    }
}