#include <iostream>
using namespace std;

// top-bottom 방식(재귀)

int d[1000001];

int cal(int n){
    if(n==1){
        return 0;
    }
    if(d[n] > 0){
        return d[n];
    }

    d[n] = cal(n-1) + 1;

    if(n%2 == 0){
        int temp = cal(n/2) + 1;
        if(d[n] > temp){
            d[n] = temp;
        }
    }

    if(n%3 == 0){
        int temp = cal(n/3) + 1;
        if(d[n] > temp){
            d[n] = temp;
        }
    }
    return d[n];
}

int main(){
    int n;
    cin >> n;

    cout << cal(n) << '\n';
}
