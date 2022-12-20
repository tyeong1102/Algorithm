#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int n;
    
    vector<pair<int, int>> v(5); // 총합, 인덱스 pair

    for(int i=0; i<5; i++){
        int sum = 0;
        for(int j=0; j<4; j++){
            cin >> n;
            sum += n;
        }
        v[i].first = sum; // 총합
        v[i].second = i + 1; // 인덱스
    }

    sort(v.begin(), v.end(), greater<pair<int, int>>()); // 내림차순으로 정렬

    cout << v[0].second << " " << v[0].first << '\n';
}