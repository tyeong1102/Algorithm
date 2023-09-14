#include <bits/stdc++.h>

using namespace std;

vector<int> solution(string s) {
    vector<int> answer;
    int cnt = 0, total = 0;

    while(s != "1") {
        string temp = "";
        int zeroCnt = count(s.begin(), s.end(), '0');

        cnt += zeroCnt;
        int newSize = s.size() - zeroCnt;

        while(newSize) {
            temp += (newSize % 2) + '0';
            newSize /= 2;
        }
        
        reverse(temp.begin(), temp.end());
        s = temp;
        total++;
    }
    
    answer.push_back(total);
    answer.push_back(cnt);
    
    return answer;
}