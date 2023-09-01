/*
    문제 예시는 첫번째로 들어간 것이 가장 작은 시간이 아니여서 대체되기 때문에 똑같이 답이 4가 나온다.
    하지만 첫번쨰로 들어간 것이 가장 작은 시간이였다면 1회가 누락되었을 것이다.
    그래서 ret을 1로 시작하거나 첫번쨰 원소를 넣을 때 1증가 시켜주어야 한다.
*/

#include <bits/stdc++.h>
using namespace std;

int N, start, finish, ret;
vector<pair<int, int>> v;

int main() {
    cin >>  N;

    for(int i = 0; i < N; i++) {
        cin >> start >> finish;
        v.push_back({finish, start});
    }

    sort(v.begin(), v.end());

    start = v[0].second;
    finish = v[0].first;
    ret++;

    for(int i = 1; i < N; i++) {
        if(v[i].second < finish) continue;
        start = v[i].second;
        finish = v[i].first;
        ret++;
    }

    cout << ret << '\n';

}