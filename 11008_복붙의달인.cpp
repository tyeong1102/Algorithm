#include <iostream>
#include <string>
using namespace std;

int main(){
    int t;
    cin >> t;

    for(int i=0; i<t; i++){
        string s1, s2;
        cin >> s1 >> s2;

        int cnt = s1.size();
        int index = 0;

        while(index < s1.length() - s2.length() + 1){
            if(s1[index] == s2[0]){ // 첫문자가 같으면
                bool copy = true; // 일단 같은 문자열로 가정

                for(int i=0; i<s2.length(); i++){
                    if(s1[index+i] != s2[i]){ // 다른 단어가 발견되면 break
                        copy = false;
                        break;
                    }
                }

                if(copy){
                    index += s2.length();
                    // 처음에는 cnt를 s1.size() - (s2.size() - 1)로 설정해서 중복을 고려하지 못했다.
                    cnt -= (s2.size() - 1);
                    continue;
                }
            }

            index++;
        }
        cout << cnt << '\n';
    }
}