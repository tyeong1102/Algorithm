    #include <bits/stdc++.h>
    using namespace std;

    int N, dead, cup, ret;
    vector<pair<int, int>> v;
    priority_queue<int, vector<int>, greater<int>> pq;

    int main() {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        cout.tie(NULL);

        cin >> N;

        for(int i = 0; i < N; i++) {
            cin >> dead >> cup;
            v.push_back({dead, cup});
        }

        sort(v.begin(), v.end());

        for(int i = 0; i < N; i++) {
            pq.push(v[i].second);

            if(pq.size() > v[i].first) {
                pq.pop();
            }
        }

        while(pq.size()) {
            ret += pq.top();
            pq.pop();
        }

        cout << ret << '\n';

    }