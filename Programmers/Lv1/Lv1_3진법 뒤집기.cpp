#include <bits/stdc++.h>

using namespace std;

int solution(int n) {
    int answer = 0;
    vector<int> v;
    
    while(n > 0) {
        v.push_back(n % 3);
        n /= 3;
    }
    
    int idx = 0;
    
    for(int i = v.size() - 1; i >= 0; i--) {
        answer += (pow(3, i) * v[idx]);
        idx++;
    }
    
    return answer;
}