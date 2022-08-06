#include <iostream>
using namespace std;

/*
자료형 범위 확인.
*/

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
    int n;
    long long a, b;
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> a >> b;
        
        cout << (a*b)/gcd(a, b) << '\n';
    }
}