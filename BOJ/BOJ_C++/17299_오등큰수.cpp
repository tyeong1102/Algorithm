#include <iostream>
#include <vector>
#include <stack>
using namespace std;

int arr[1000001];

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int n;
    cin >> n;

    vector<int> v(n);
    vector<int> res(n);

    for(int i=0; i<n; i++){
        cin >> v[i];
        arr[v[i]] += 1;
    }

    stack<int> st;
    st.push(0);

    for(int i=1; i<n; i++){
        if(st.empty()){
            st.push(i);
        }

        while(!st.empty() && arr[v[st.top()]] < arr[v[i]]){
            res[st.top()] = v[i];
            st.pop();
        }

        st.push(i);
    }

    while(!st.empty()){
        res[st.top()] = -1;
        st.pop();
    }

    for(int i=0; i<n; i++){
        cout << res[i] << ' ';
    }
    cout << '\n';
}