#include <iostream>
using namespace std;

// 유클리드 호제법 사용(Greatest Common Divisor)
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
    cin >> a >> b;

    cout << gcd(a, b) << '\n';
    cout << (a*b)/gcd(a, b) << '\n'; 
}