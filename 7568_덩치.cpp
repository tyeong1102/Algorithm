#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

/*
처음에 sort를 통해 내림차순으로 몸무게를 정렬하고 나중에 키를 비교하려고 했다.
근데 rank를 출력하는 순서가 꼬여서 순서는 그대로 놔두고 키와 몸무게가 둘 다 작을 경우에만 rank를 올렸다.
*/

int main(){
    int x, y; // 몸무게, 키
    int n;
    int rank[51];
    vector<pair<int, int>> v; // 몸무게, 키
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> x >> y;
        v.push_back({x, y});
    }

    for(int i=0; i<n; i++){
        rank[i] = 1;
    }

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
             if(v[i].second < v[j].second && v[i].first < v[j].first){
                rank[i]++;
            }
        }
        cout << rank[i] << " ";
    }
}