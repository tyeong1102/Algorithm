#include <iostream>
#include <string>
using namespace std;

int main(){
    string s;
    cin >> s;

    cout << s[0];

    for(int i=0; i<s.length(); i++){
        if(s[i] != '-'){
            continue;
        } else if(s[i] == '-' && i+1 < s.length()){
            cout << s[i+1];
        }
    }
}