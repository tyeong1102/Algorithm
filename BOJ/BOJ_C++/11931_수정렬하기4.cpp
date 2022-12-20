#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    vector<int> v;
    int n, input;
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> input;
        v.push_back(input);
    }

    sort(v.begin(), v.end(), greater<int>());

    for(int i=0; i<v.size(); i++){
        cout << v[i] << '\n';
    }
}