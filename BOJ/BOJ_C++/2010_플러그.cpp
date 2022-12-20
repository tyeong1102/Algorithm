#include <iostream>
using namespace std;

int main(){
    int n, m;
    int sum = 0;
    int cnt = 0;
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> m;
        cnt = m-1;
        sum += cnt;
    }
    ++sum;

    cout << sum << '\n';
}