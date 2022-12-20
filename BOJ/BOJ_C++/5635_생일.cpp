#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    
    vector<pair<pair<int, int>, pair<int, string>>> v(n);
    // pair을 통해 (연도, 월)(날짜, 이름) 묶음
    for(int i=0; i<n; i++){
        cin >> v[i].second.second >> v[i].second.first >> v[i].first.second >> v[i].first.first;
    }

    sort(v.begin(), v.end());
    // sort로 오름차순으로 정렬

    cout << v[n-1].second.second << '\n'; // 나이가 가장 많은 사람
    cout << v[0].second.second << '\n'; // 가장 어린 사람
}