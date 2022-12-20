#include <iostream>
#include <vector>
#include <algorithm>    
using namespace std;

/* 
처음에는 second끼리만 비교를 해서 같은 경우에 first를 어떻게 처리할지를 고려 안함.
그래서 second가 같을 경우 first가 작은 것이 먼저오게 추가함.
*/
bool compare(const pair<int, int> &a, const pair<int, int> &b){
    if(a.second == b.second){
        return a.first < b.first;
    }
    return a.second < b.second;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, x, y;
    vector<pair<int, int>> v;  // x, y
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> x >> y;
        v.push_back({x, y});
    }

    sort(v.begin(), v.end(), compare);

    for(int i=0; i<n; i++){
        cout << v[i].first << " " << v[i].second << '\n';
    }
}