#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int n, a;
    int res;
    vector<int> v;

    cin >> n;

    for(int i=0; i<n; i++){
        cin >> a;
        v.push_back(a);
    }

    sort(v.begin(), v.end());

    res = v[0] * v[n-1];

    cout << res << '\n';
}