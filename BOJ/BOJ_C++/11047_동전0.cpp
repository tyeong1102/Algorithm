#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int n, k;
    int val;
    cin >> n >> k;

    vector<int> v;

    for(int i=0; i<n; i++){
        cin >> val;
        v.push_back(val);
    }

    sort(v.begin(), v.end(), greater<int>());

    int cnt = 0;
    for(int i=0; i<v.size(); i++){
        while(k-v[i]>=0){
            cnt++;
            k -= v[i];
        }
    }
    cout << cnt << '\n';
}