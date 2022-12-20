#include <iostream>
#include <stack>
#include <string>
#include <cstring>
using namespace std;

char c[600000];

int main(){
    cin >> c; // 초기 문자열 입력

    stack<char> s1; // 초기 문자열이 들어가있을 스택
    stack<char> s2; // 커서를 이동할 때 문자들이 들어갈 스택

    int len = strlen(c); // 문자열의 길이

    for(int i=0; i<len; i++){ // 문자열의 길이만큼 push
        s1.push(c[i]);
    }

    int m;
    cin >> m;
    
    while(m--){
        char com;
        cin >> com;

        if(com == 'L'){
            if(!s1.empty()){
                s2.push(s1.top());
                s1.pop();
            }
        }
        else if(com == 'D'){
            if(!s2.empty()){
                s1.push(s2.top());
                s2.pop();
            }
        }
        else if(com == 'B'){
            if(!s1.empty()){
                s1.pop();
            }
        }
        else if(com == 'P'){
            char input;
            cin >> input;
            s1.push(input);
        }
    }

    while(!s1.empty()){
        s2.push(s1.top());
        s1.pop();
    }

    while(!s2.empty()){
        cout << s2.top();
        s2.pop();
    }
}