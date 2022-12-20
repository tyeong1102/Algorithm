#include <iostream>
using namespace std;

// 유클리드 호제법
int gcd(int a, int b){
    int r;
    while(b!=0){
        r = a%b;
        a = b;
        b = r;
    }
    return a;
}

int main(){
    int a, b;
    int n;
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> a >> b;
        cout << (a*b)/gcd(a, b) << '\n';
    }
}