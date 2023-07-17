#include <bits/stdc++.h>
using namespace std;

int n;
int a[1000004], ans[1000004];

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n;

    stack<int> st; // 인덱스 저장

    for(int i = 0; i < n; i++) {
        cin >> a[i];
    }

    st.push(0);

    for(int i = 1; i < n; i++){
        if(st.empty()) {
            st.push(i);
        }
        while(!st.empty() && a[st.top()] < a[i]) {
            ans[st.top()] = a[i];
            st.pop();
        }
        st.push(i);
    }

    while(!st.empty()) {
        ans[st.top()] = -1;
        st.pop();
    }

    for(int i = 0; i < n; i++) {
        cout << ans[i] << ' ';
    }
}