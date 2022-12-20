#include <iostream>
using namespace std;

int arr[46];

int Fibo(int n){
    if(n<=1){
        return n;
    }
    if(arr[n]>0){
        return arr[n];
    }
    arr[n] = Fibo(n-1) + Fibo(n-2);
    return arr[n];
}

int main(){
    int n;
    cin >> n;

    cout << Fibo(n) << '\n';
}