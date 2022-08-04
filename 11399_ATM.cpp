#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int n, p;
    int sum = 0;
    int res = 0;
    vector<int> v;
    int arr[1001];
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> p;
        v.push_back(p);
    }

    sort(v.begin(), v.end());

    for(int i=0; i<v.size(); i++){
        sum += v[i];
        arr[i] = sum;
    }

    for(int i=0; i<n; i++){
        res += arr[i];
    }

    cout << res;
}