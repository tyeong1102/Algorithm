#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>
using namespace std;

int main(){
    int n;
    int sum = 0;
    vector<int> v;
    for(int i=0; i<7; i++){
        cin >> n;
        if(n%2==1){ // 홀수라면 vector에 저장
            v.push_back(n);
        }
    }

    sum = accumulate(v.begin(), v.end(),0); // vector 안에 있는 요소 더하기
    sort(v.begin(), v.end()); // 정렬

    if(v.size() == 0){ // 홀수가 없으면
        cout << "-1" << '\n';
    } else{ // 홀수가 있을 때
        cout << sum << '\n';
        cout << v[0] << '\n';
    }
}