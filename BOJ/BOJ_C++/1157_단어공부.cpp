#include <iostream>
#include <string>
using namespace std;

// 아스키 코드 적응
int main(){
    int arr[26] = {}; // 처음에 초기화를 해주지 않아서 오류가 남.
    int cnt = 0;
    string s;
    cin >> s;

    for(int i=0; i<s.size(); i++){
        if(s[i] < 97){
            arr[s[i]-65]++; // 대문자
        } else{
            arr[s[i]-97]++; // 소문자
        }
    }

    int max = 0;
    int maxIndex = 0;

    for(int i=0; i<26; i++){
        if(max<arr[i]){
            max = arr[i];
            maxIndex = i;
        }
    }

    for(int i=0; i<26; i++){
        if(max == arr[i]){
            cnt++;
        }
    }

    if(cnt > 1){
        cout << "?" << '\n';
    } else{
        cout << (char)(maxIndex+65) << '\n';
    }
}