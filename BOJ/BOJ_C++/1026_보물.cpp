#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int n, a, b;
    int sum = 0;
    vector<int> v;
    vector<int> vv;
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> a;
        v.push_back(a);
    }
    
    for(int i=0; i<n; i++){
        cin >> b;
        vv.push_back(b);
    }

    sort(v.begin(), v.end());
    sort(vv.begin(), vv.end(), greater<>());

    for(int i=0; i<n; i++){
        sum += v[i] * vv[i];
    }

    cout << sum << '\n';

    return 0;
}