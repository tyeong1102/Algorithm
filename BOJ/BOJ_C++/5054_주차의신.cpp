#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int t, n, x;
    int res = 0;
    cin >> t;

    for(int i=0; i<t; i++){
        cin >> n;
        vector<int> v;
        for(int j=0; j<n; j++){
            cin >> x;
            v.push_back(x);
        }

        sort(v.begin(), v.end(), greater<int>()); // 내림차순으로 정렬

        res = (v[0] - v[n-1]) * 2; // 가장 큰 값에서 작은 값 뺸 2배

        cout << res << '\n';
    }
}