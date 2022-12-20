#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int rev(int n){
    string s = to_string(n);
    reverse(s.begin(), s.end());
    return atoi(s.c_str());
}

int main(){
    int x, y;
    int res = 0;
    cin >> x >> y;

    x = rev(x);
    y = rev(y);

    res = x + y;

    cout << rev(res) << '\n';
}