#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int in, out;
    int total = 0;

    vector<int> v;
    for(int i=0; i<10; i++){
        cin >> out >> in;
        total += in;
        total -= out;
        v.push_back(total);
    }

    sort(v.begin(), v.end(), greater<int>()); // 내림차순으로 최대 사람 수 구함

    cout << v[0] << '\n';
}