#include <iostream>
#include <string>
using namespace std;

int main(){
    string a, b, c, d;
    string sum1, sum2;
    long long res;
    cin >> a >> b >> c >> d;

    sum1 = a + b;
    sum2 = c + d;

    res = stoll(sum1) + stoll(sum2); // string을 long long 형태로 변환.

    cout << res << '\n';
}