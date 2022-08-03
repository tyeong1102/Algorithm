#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;
/*
마지막 for문에서 i와 i-1을 비교하여서 OutOfBounds가 나온 것 같다.
pair을 사용한 문제인 줄 알고 string으로 바꿔서 풀다가 발견한 오류인데 다시 pair문으로 돌아와서 적용해도 맞았다.
compare문을 잘 활용하자.
*/

bool compare(const pair<int, string> &a, const pair<int, string> &b){
    if(a.first == b.first){
        return a.second < b.second;
    }
    return a.first < b.first;
}

int main(){
    int n;
    vector<pair<int,string>> v;
    cin >> n;

    for(int i=0; i<n; i++){
        string s;
        cin >> s;
        v.push_back({s.size(), s});
    }

    sort(v.begin(), v.end(), compare);

    for(int i=0; i<n; i++){
        if(v[i].second == v[i+1].second){
            continue;
        }
        cout << v[i].second << '\n';
    }
}