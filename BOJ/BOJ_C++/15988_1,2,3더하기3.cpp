#include <iostream>
using namespace std;

long long d[1000001];

int main(){
    d[0] = 1;
    for(int i=0; i<=1000000; i++){
        if(i-1 >= 0){
            d[i] += d[i-1];
        }
        if(i-2 >= 0){
            d[i] += d[i-2];
        }
        if(i-3 >= 0){
            d[i] += d[i-3];
        }
        d[i] %= 1000000009;
    }

    int t;
    cin >> t;
    
    while(t--){
        int n;
        cin >> n;

        cout << d[n] << '\n';
    }
}