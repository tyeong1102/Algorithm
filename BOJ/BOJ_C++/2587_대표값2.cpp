#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int n;
    int sum = 0;
    vector<int> v;

    for(int i=0; i<5; i++){
        cin >> n;
        v.push_back(n);
        sum += n;
    }

    sort(v.begin(), v.end());

    cout << sum/5 << '\n';
    cout << v[2] << '\n';
}