#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int n;
    double score;
    double nscore = 0;
    cin >> n;
    vector<double> v;

    for(int i=0; i<n; i++){
        cin >> score;
        v.push_back(score);
    }

    sort(v.begin(), v.end(), greater<>()); // 내림차순으로 정렬

    for(int i=0; i<n; i++){
        nscore += (v[i] / v[0]) * 100; // 가장 큰 수로 모든 수 나누기
    }

    cout << nscore / n << '\n'; // 새로운 평균 구하기
}