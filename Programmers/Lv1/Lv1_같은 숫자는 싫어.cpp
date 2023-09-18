#include <bits/stdc++.h>
using namespace std;

vector<int> solution(vector<int> arr) 
{
    stack<int> st;
    vector<int> answer;
    
    st.push(arr[0]);
    
    for(int i = 1; i < arr.size(); i++) {
        
        if(!st.empty() && st.top() == arr[i]) continue;
        else st.push(arr[i]);
    }
    
    while(!st.empty()){
        answer.push_back(st.top());
        st.pop();
    }
    
    reverse(answer.begin(), answer.end());

    return answer;
}