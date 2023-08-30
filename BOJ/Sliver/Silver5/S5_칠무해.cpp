#include <bits/stdc++.h>
using namespace std;

int n;
double score;
priority_queue<double> pq;
vector<double> v;

int main() {
    cin >> n;

    for(int i = 0; i < n; i++) {
        cin >> score;

        if(pq.size() == 7) {
            pq.push(score);
            pq.pop();
        } else pq.push(score);
    }

    while(pq.size()) {
        v.push_back(pq.top());
        pq.pop();
    }

    reverse(v.begin(), v.end());

    for(double i : v) {
        printf("%.3lf\n", i);
    }
}