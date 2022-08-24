#include <iostream>
#include <algorithm>
using namespace std;

int d[1001];

int main(){
    int n;
    cin >> n;

    d[0] = 0;
    d[1] = 1;
    d[2] = 2;

    for(int i=3; i<=n; i++){
        d[i] = min(d[i-1] + 1, d[i-3] + 1);
    }

    if(d[n] % 2 == 1){
        cout << "SK";
    } else{
        cout << "CY";
    }
}
