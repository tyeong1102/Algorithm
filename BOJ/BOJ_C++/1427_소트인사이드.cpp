#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main(){
    long long n;
    cin >> n;

    string s = to_string(n);

    sort(s.begin(), s.end(), greater<int>());

    cout << s << '\n';
}