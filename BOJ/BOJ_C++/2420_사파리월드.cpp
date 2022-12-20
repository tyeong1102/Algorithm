#include <iostream>
using namespace std;

int main(){
    long long n, m;
    cin >> n >> m;
    
    long long res = n - m;

    cout << abs(res) << '\n';
}