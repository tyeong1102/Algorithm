/*
    idx 설정 없이 s[i]로 비교하게 되면 int와 size 타입의 비교라 충돌이 일어나게 된다.
    처음에는 뭐로 구분을 해줄까 하다 flag를 사용하면 좋겠다는 것을 알았다. 앞으로 flag.
    prev변수를 만들어서 전 문자와 비교를 통해 같은 문자인지 비교를 해주면 된다.
*/

#include <bits/stdc++.h>
using namespace std;

string s;

int main() {
    while(cin >> s) {
        int vowels = 0, consonants = 0;
        bool flag = 0; // 맞았는지 틀렸는지 구분
        bool isVowel = 0; // 모음이 있는지 확인하기 위함
        int prev = -1;
        
        if(s == "end") break; // end 나오면 break

        for(int i = 0; i < s.size(); i++) {
            int idx = s[i]; // int 비교 위함

            if(idx  == 'a' || idx  == 'e' || idx  == 'i' || idx  == 'o' || idx  == 'u') {
                vowels++, consonants = 0, isVowel = 1;
            } else consonants++ , vowels = 0;

            if(i >= 1 && (prev == idx)  && (idx  != 'e' && idx  != 'o')) {
                flag = 1;
            } 

            if(vowels == 3 || consonants == 3) flag = 1;
            
            prev = idx;
        }
        if(isVowel == 0) flag = 1;

        if(flag) {
            cout << "<" << s << "> is not acceptable." << '\n';
        } else {
            cout << "<" << s << "> is acceptable." << '\n';
        }
    }
    return 0;
}