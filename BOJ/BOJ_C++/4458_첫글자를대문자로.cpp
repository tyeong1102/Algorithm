#include <iostream>
#include <string>
using namespace std;

/*
끝과 끝을 포함 했어야했는데 97과 122를 포함 안해서 a와 z가 제외되어 계속 오답이 나옴.
*/

int main(){
    int n;
    string s;
    cin >> n;
    cin.ignore(); // n의 입력버퍼가 문자열로 들어가는 것을 막아줌.

    for(int i=0; i<n; i++){
        getline(cin, s);

        for(int j=0; j<s.size(); j++){
            if(s[0] >= 97 && s[0] <= 122){
                s[0] = s[0] - 32;
            }
        }
        cout << s << '\n';
    }
}