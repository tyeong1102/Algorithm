#include <iostream>
#include <string>
using namespace std;

int main(){
    int n, m;
    string str;
    cin >> n;

    for(int i=0; i<n; i++){
        cin >> m >> str;
        str.erase(str.begin() + (m-1)); // 단어 지워줌
        cout << str << '\n';
    }
}