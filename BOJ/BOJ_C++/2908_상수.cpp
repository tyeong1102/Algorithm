#include <iostream>
#include <string>
#include <algorithm> // reverse()를 사용하기 위해 필요
using namespace std;

int rev(int n){
    string s = to_string(n); // 문자열로 바꾼 뒤
    reverse(s.begin(), s.end()); // 뒤집기
    return atoi(s.c_str());
}

int main(){
    int n, m;
    cin >> n >> m;

    if(rev(n) >= rev(m)){
        cout << rev(n);
    } else{
        cout << rev(m);
    }
}