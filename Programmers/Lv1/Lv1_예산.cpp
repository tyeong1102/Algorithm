#include <bits/stdc++.h>

using namespace std;

int solution(vector<int> d, int budget) {
    int answer = 0;
    int total = 0;
    
    sort(d.begin(), d.end());
    
    for(int i = 0; i < d.size(); i++) {
        total += d[i];
        
        if(total <= budget) answer++;
        else break;
    }
    
    return answer;
}