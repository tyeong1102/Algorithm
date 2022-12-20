#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int in, out;
    int total = 0;
    vector<int> v;

    for(int i=0; i<4; i++){
        cin >> out >> in;
        total += in;
        total -= out;
        v.push_back(total); // 정류장 별 사람 수 vector에 저장
    }

    sort(v.begin(), v.end(), greater<int>()); // 내림차순으로 최대 사람 수 구함

    cout << v[0] << '\n';
}