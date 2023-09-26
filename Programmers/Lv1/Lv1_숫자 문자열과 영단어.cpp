#include <bits/stdc++.h>

using namespace std;

map<string, int> mp;

int solution(string s) {
    string answer = "";
    string tmp = "";
    
    mp["zero"] = 0;
    mp["one"] = 1;
    mp["two"] = 2;
    mp["three"] = 3;
    mp["four"] = 4;
    mp["five"] = 5;
    mp["six"] = 6;
    mp["seven"] = 7;
    mp["eight"] = 8;
    mp["nine"] = 9;
    
    for(char c : s) {
        if(isdigit(c)) answer += c;
        else tmp += c;
        
        if(mp.find(tmp) != mp.end()) {
            answer += to_string(mp[tmp]);
            tmp = "";
        }
    }
    
    return stoi(answer);
}