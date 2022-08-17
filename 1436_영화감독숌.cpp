#include <iostream>
#include <string>
using namespace std;

int main(){
    int n;
    int cnt = 0;
    int title = 665; // 666이 포함되어야 해서 665부터 시작
    string temp;
    cin >> n;

    while(title++){ // 666부터 시작
        temp = to_string(title);

        if(temp.find("666") != string::npos){ // 문자열에서 666 찾기
            cnt++; // 찾으면 증가
        }

        if(cnt == n){
            cout << title << '\n';
            break;
        }
    }
    
}