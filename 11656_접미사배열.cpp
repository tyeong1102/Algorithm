#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;
/*
substr을 통해 하나씩 자르면서 vector에 넣었다.
*/

int main(){
    string s;
    cin >> s;

    vector<string> v;

    for(int i=0; i<s.size(); i++){
        v.push_back(s.substr(i, s.size()));
    }

    sort(v.begin(), v.end());

    for(int i=0; i<s.size(); i++){
        cout << v[i] << '\n';
    }
}