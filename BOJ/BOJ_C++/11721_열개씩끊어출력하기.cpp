#include <iostream>
#include <string>
using namespace std;

/*
처음에는 줄만 나뉘어지면 문제가 없다고 생각했다.
10글자씩 끊어서 출력하기 떄문에 인덱스 값이 10이 아닌 9로 설정되어야한다.
*/
int main(){
    string s;
    cin >> s;

    for(int i=0; i<s.size(); i++){
        cout << s[i];

        if(i%10 == 9){
            cout << '\n';
        }
        
    }
}