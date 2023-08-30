#include <bits/stdc++.h>
using namespace std;

int n, p, d, ret;
vector<pair<int, int>> v;
priority_queue<int, vector<int>, greater<int>> pq;

int main() {
    cin >> n;

    for(int i = 0; i < n; i++) {
        cin >> p >> d;
        v.push_back({d, p});
    }

    sort(v.begin(), v.end()); // 오름차순 정렬

    for(int i = 0; i < n; i++) {
        pq.push(v[i].second); // 기한 pq 삽입

        if(pq.size() > v[i].first) { // 기한보다 사이즈가 커지면 원래 있던거 pop()
            pq.pop();
        }
    }

    while(pq.size()) {
        ret += pq.top();
        pq.pop();
    }

    cout << ret << '\n';

}