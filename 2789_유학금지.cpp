#include <iostream>
#include <string>
using namespace std;

int main(){
    string s = "CAMBRIDGE";
    string str;
    cin >> str;

    for(int i=0; i<s.size(); i++){
        for(int j=0; j<str.size(); j++){
            if(s[i] == str[j]){
                str[j] = 0;
            }
        }
    }
    for(int i=0; i<str.size(); i++){
        if(str[i] != 0){
            cout << str[i];
        }
    }
}