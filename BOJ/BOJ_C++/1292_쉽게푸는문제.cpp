#include <iostream>
#include <vector>
#include <numeric>
using namespace std;

const int MAX = 1000;

int main(){
    int a, b;
    int sum = 0;

    vector<int> v;

    for(int i=1; i<=MAX; i++){
        for(int j=1; j<=i; j++){
            v.push_back(i);
        }
    }
    cin >> a >> b;

    sum = accumulate(v.begin()+(a-1), v.begin()+b, 0); // 범위 합

    cout << sum << '\n';
}