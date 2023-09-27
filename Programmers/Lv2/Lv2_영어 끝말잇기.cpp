#include <bits/stdc++.h>

using namespace std;

vector<int> solution(int n, vector<string> words) {
    vector<int> answer;
    
    int idx = 0;
    map<string, int> m;
    
    for(int i = 0; i < words.size() - 1; i++) {
        m[words[i]]++;
        
        if(m[words[i + 1]] > 0) { 
            idx = i + 1;
            break;
        }
        
        if(words[i][words[i].size() - 1] != words[i + 1][0]) { // 두번째 조건
            idx = i + 1;
            break;
        }
    }
    
    if(idx == 0) {
        answer.push_back(0);
        answer.push_back(0);
    } else {
        answer.push_back(idx % n + 1);
        answer.push_back(idx / n + 1);
    }
    
    return answer;
}